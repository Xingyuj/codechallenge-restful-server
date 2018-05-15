package com.datarepublic.simplecab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.datarepublic.simplecab.repository.SimpleCabRepositoryDao;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@RestController
public class CabsController {
	@RequestMapping("/")
	public String index() {
		return "Welcome to cab data researcher";
	}

	@RequestMapping(value = "/cabs", method = RequestMethod.GET)
	@ResponseBody
	public String getBarBySimplePathWithRequestParam(
			@RequestParam(value = "medallions", required = true) String[] medallions,
			@RequestParam(value = "pickup_date", required = true) String pickupDate,
			@RequestParam(value = "cached", required = false, defaultValue = "false") boolean ignoreCache) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		SimpleCabRepositoryDao capRepo = new SimpleCabRepositoryDao();
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		Gson gson = new Gson();
		String response = gson.toJson(result);
		try {
			result = capRepo.getCountsByMultipleMedallionsAndPickupDatetime(new ArrayList<String>(Arrays.asList(medallions)), formatter.parse(pickupDate), !ignoreCache);
			response = gson.toJson(result);
		} catch (ParseException e) {
			JsonObject exceptionMsg = new JsonObject();
			exceptionMsg.addProperty("Error Code", "400");
			exceptionMsg.addProperty("Error Message", "Bad Request, Parse parameter error, please check date format");
			response = gson.toJson(exceptionMsg);
			e.printStackTrace();
		}
		return response;
	}
}
