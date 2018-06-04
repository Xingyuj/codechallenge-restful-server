package com.ethanji.simplecab.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public interface SimpleCabRepository {
	static HashMap<String, HashMap<Date, Integer>> cache = new HashMap<String, HashMap<Date, Integer>>();

	Integer getCountByMedallionAndPickupDatetime(String medallionId,
			Date pickupDate);

	HashMap<String, Integer> getCountsByMultipleMedallionsAndPickupDatetime(
			ArrayList<String> medallionIds, Date pickupDate, boolean cached);
	
	void clearCache();
}
