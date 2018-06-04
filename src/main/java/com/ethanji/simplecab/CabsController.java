package com.ethanji.simplecab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ethanji.simplecab.repository.SimpleCabRepositoryDao;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@RestController
public class CabsController {
	private SimpleCabRepositoryDao capRepo = SimpleCabRepositoryDao.getSharedInstance();

	@RequestMapping("/")
	public String index() {
		return "Welcome to cab data researcher";
	}

	@RequestMapping(value = "/clearcache", method = RequestMethod.GET)
	@ResponseBody
	public String clearCache(HttpServletResponse httpResponse) {
		Gson gson = new Gson();
		String response = "";
		try {
			capRepo.clearCache();
			JsonObject msg = new JsonObject();
			msg.addProperty("Code", "200");
			msg.addProperty("Msg", "Clear Cache Done");
			response = gson.toJson(msg);
		} catch (Exception e) {
			e.printStackTrace();
			JsonObject exceptionMsg = new JsonObject();
			exceptionMsg.addProperty("Error Code", "500");
			exceptionMsg.addProperty("Error Message", "SC_INTERNAL_SERVER_ERROR, Cache Clear Fail");
			httpResponse.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response = gson.toJson(exceptionMsg);
		}
		return response;
	}

	@RequestMapping(value = "/cabs", method = RequestMethod.GET)
	@ResponseBody
	public String getBarBySimplePathWithRequestParam(
			@RequestParam(value = "medallions", required = true) String[] medallions,
			@RequestParam(value = "pickup_date", required = true) String pickupDate,
			@RequestParam(value = "cached", required = false, defaultValue = "true") boolean cached,
			HttpServletResponse httpResponse) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		Gson gson = new Gson();
		String response = gson.toJson(result);
		try {
			result = capRepo.getCountsByMultipleMedallionsAndPickupDatetime(
					new ArrayList<String>(Arrays.asList(medallions)),
					formatter.parse(pickupDate), cached);
			response = gson.toJson(result);
		} catch (ParseException e) {
			JsonObject exceptionMsg = new JsonObject();
			exceptionMsg.addProperty("Error Code", "400");
			exceptionMsg
					.addProperty("Error Message",
							"Bad Request, Parse parameter error, please check date format");
			response = gson.toJson(exceptionMsg);
			httpResponse.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			e.printStackTrace();
		}
		return response;
	}
}
