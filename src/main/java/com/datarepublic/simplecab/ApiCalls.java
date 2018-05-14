package com.datarepublic.simplecab;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ApiCalls {
	@RequestMapping("/")
    public String index() {
        return "Welcome to cab data researcher";
    }
	
	@RequestMapping(value = "/cabs", method = RequestMethod.GET)
	@ResponseBody
	public String getBarBySimplePathWithRequestParam(
	  @RequestParam("pickup_date") String date) {
	    return "cabs pick up date is: " + date;
	}
}
