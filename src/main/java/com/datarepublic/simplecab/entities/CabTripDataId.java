package com.datarepublic.simplecab.entities;

// Generated 15/05/2018 2:50:32 AM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * CabTripDataId generated by hbm2java
 */
public class CabTripDataId implements java.io.Serializable {

	private String medallion;
	private String hackLicense;
	private String vendorId;
	private Integer rateCode;
	private String storeAndFwdFlag;
	private Date pickupDatetime;
	private Date dropoffDatetime;
	private Integer passengerCount;
	private Integer tripTimeInSecs;
	private Double tripDistance;
	private Double pickupLongitude;
	private Double pickupLatitude;
	private Double dropoffLongitude;
	private Double dropoffLatitude;

	public CabTripDataId() {
	}

	public CabTripDataId(String medallion, String hackLicense, String vendorId,
			Integer rateCode, String storeAndFwdFlag, Date pickupDatetime,
			Date dropoffDatetime, Integer passengerCount,
			Integer tripTimeInSecs, Double tripDistance,
			Double pickupLongitude, Double pickupLatitude,
			Double dropoffLongitude, Double dropoffLatitude) {
		this.medallion = medallion;
		this.hackLicense = hackLicense;
		this.vendorId = vendorId;
		this.rateCode = rateCode;
		this.storeAndFwdFlag = storeAndFwdFlag;
		this.pickupDatetime = pickupDatetime;
		this.dropoffDatetime = dropoffDatetime;
		this.passengerCount = passengerCount;
		this.tripTimeInSecs = tripTimeInSecs;
		this.tripDistance = tripDistance;
		this.pickupLongitude = pickupLongitude;
		this.pickupLatitude = pickupLatitude;
		this.dropoffLongitude = dropoffLongitude;
		this.dropoffLatitude = dropoffLatitude;
	}

	public String getMedallion() {
		return this.medallion;
	}

	public void setMedallion(String medallion) {
		this.medallion = medallion;
	}

	public String getHackLicense() {
		return this.hackLicense;
	}

	public void setHackLicense(String hackLicense) {
		this.hackLicense = hackLicense;
	}

	public String getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public Integer getRateCode() {
		return this.rateCode;
	}

	public void setRateCode(Integer rateCode) {
		this.rateCode = rateCode;
	}

	public String getStoreAndFwdFlag() {
		return this.storeAndFwdFlag;
	}

	public void setStoreAndFwdFlag(String storeAndFwdFlag) {
		this.storeAndFwdFlag = storeAndFwdFlag;
	}

	public Date getPickupDatetime() {
		return this.pickupDatetime;
	}

	public void setPickupDatetime(Date pickupDatetime) {
		this.pickupDatetime = pickupDatetime;
	}

	public Date getDropoffDatetime() {
		return this.dropoffDatetime;
	}

	public void setDropoffDatetime(Date dropoffDatetime) {
		this.dropoffDatetime = dropoffDatetime;
	}

	public Integer getPassengerCount() {
		return this.passengerCount;
	}

	public void setPassengerCount(Integer passengerCount) {
		this.passengerCount = passengerCount;
	}

	public Integer getTripTimeInSecs() {
		return this.tripTimeInSecs;
	}

	public void setTripTimeInSecs(Integer tripTimeInSecs) {
		this.tripTimeInSecs = tripTimeInSecs;
	}

	public Double getTripDistance() {
		return this.tripDistance;
	}

	public void setTripDistance(Double tripDistance) {
		this.tripDistance = tripDistance;
	}

	public Double getPickupLongitude() {
		return this.pickupLongitude;
	}

	public void setPickupLongitude(Double pickupLongitude) {
		this.pickupLongitude = pickupLongitude;
	}

	public Double getPickupLatitude() {
		return this.pickupLatitude;
	}

	public void setPickupLatitude(Double pickupLatitude) {
		this.pickupLatitude = pickupLatitude;
	}

	public Double getDropoffLongitude() {
		return this.dropoffLongitude;
	}

	public void setDropoffLongitude(Double dropoffLongitude) {
		this.dropoffLongitude = dropoffLongitude;
	}

	public Double getDropoffLatitude() {
		return this.dropoffLatitude;
	}

	public void setDropoffLatitude(Double dropoffLatitude) {
		this.dropoffLatitude = dropoffLatitude;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CabTripDataId))
			return false;
		CabTripDataId castOther = (CabTripDataId) other;

		return ((this.getMedallion() == castOther.getMedallion()) || (this
				.getMedallion() != null && castOther.getMedallion() != null && this
				.getMedallion().equals(castOther.getMedallion())))
				&& ((this.getHackLicense() == castOther.getHackLicense()) || (this
						.getHackLicense() != null
						&& castOther.getHackLicense() != null && this
						.getHackLicense().equals(castOther.getHackLicense())))
				&& ((this.getVendorId() == castOther.getVendorId()) || (this
						.getVendorId() != null
						&& castOther.getVendorId() != null && this
						.getVendorId().equals(castOther.getVendorId())))
				&& ((this.getRateCode() == castOther.getRateCode()) || (this
						.getRateCode() != null
						&& castOther.getRateCode() != null && this
						.getRateCode().equals(castOther.getRateCode())))
				&& ((this.getStoreAndFwdFlag() == castOther
						.getStoreAndFwdFlag()) || (this.getStoreAndFwdFlag() != null
						&& castOther.getStoreAndFwdFlag() != null && this
						.getStoreAndFwdFlag().equals(
								castOther.getStoreAndFwdFlag())))
				&& ((this.getPickupDatetime() == castOther.getPickupDatetime()) || (this
						.getPickupDatetime() != null
						&& castOther.getPickupDatetime() != null && this
						.getPickupDatetime().equals(
								castOther.getPickupDatetime())))
				&& ((this.getDropoffDatetime() == castOther
						.getDropoffDatetime()) || (this.getDropoffDatetime() != null
						&& castOther.getDropoffDatetime() != null && this
						.getDropoffDatetime().equals(
								castOther.getDropoffDatetime())))
				&& ((this.getPassengerCount() == castOther.getPassengerCount()) || (this
						.getPassengerCount() != null
						&& castOther.getPassengerCount() != null && this
						.getPassengerCount().equals(
								castOther.getPassengerCount())))
				&& ((this.getTripTimeInSecs() == castOther.getTripTimeInSecs()) || (this
						.getTripTimeInSecs() != null
						&& castOther.getTripTimeInSecs() != null && this
						.getTripTimeInSecs().equals(
								castOther.getTripTimeInSecs())))
				&& ((this.getTripDistance() == castOther.getTripDistance()) || (this
						.getTripDistance() != null
						&& castOther.getTripDistance() != null && this
						.getTripDistance().equals(castOther.getTripDistance())))
				&& ((this.getPickupLongitude() == castOther
						.getPickupLongitude()) || (this.getPickupLongitude() != null
						&& castOther.getPickupLongitude() != null && this
						.getPickupLongitude().equals(
								castOther.getPickupLongitude())))
				&& ((this.getPickupLatitude() == castOther.getPickupLatitude()) || (this
						.getPickupLatitude() != null
						&& castOther.getPickupLatitude() != null && this
						.getPickupLatitude().equals(
								castOther.getPickupLatitude())))
				&& ((this.getDropoffLongitude() == castOther
						.getDropoffLongitude()) || (this.getDropoffLongitude() != null
						&& castOther.getDropoffLongitude() != null && this
						.getDropoffLongitude().equals(
								castOther.getDropoffLongitude())))
				&& ((this.getDropoffLatitude() == castOther
						.getDropoffLatitude()) || (this.getDropoffLatitude() != null
						&& castOther.getDropoffLatitude() != null && this
						.getDropoffLatitude().equals(
								castOther.getDropoffLatitude())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMedallion() == null ? 0 : this.getMedallion().hashCode());
		result = 37
				* result
				+ (getHackLicense() == null ? 0 : this.getHackLicense()
						.hashCode());
		result = 37 * result
				+ (getVendorId() == null ? 0 : this.getVendorId().hashCode());
		result = 37 * result
				+ (getRateCode() == null ? 0 : this.getRateCode().hashCode());
		result = 37
				* result
				+ (getStoreAndFwdFlag() == null ? 0 : this.getStoreAndFwdFlag()
						.hashCode());
		result = 37
				* result
				+ (getPickupDatetime() == null ? 0 : this.getPickupDatetime()
						.hashCode());
		result = 37
				* result
				+ (getDropoffDatetime() == null ? 0 : this.getDropoffDatetime()
						.hashCode());
		result = 37
				* result
				+ (getPassengerCount() == null ? 0 : this.getPassengerCount()
						.hashCode());
		result = 37
				* result
				+ (getTripTimeInSecs() == null ? 0 : this.getTripTimeInSecs()
						.hashCode());
		result = 37
				* result
				+ (getTripDistance() == null ? 0 : this.getTripDistance()
						.hashCode());
		result = 37
				* result
				+ (getPickupLongitude() == null ? 0 : this.getPickupLongitude()
						.hashCode());
		result = 37
				* result
				+ (getPickupLatitude() == null ? 0 : this.getPickupLatitude()
						.hashCode());
		result = 37
				* result
				+ (getDropoffLongitude() == null ? 0 : this
						.getDropoffLongitude().hashCode());
		result = 37
				* result
				+ (getDropoffLatitude() == null ? 0 : this.getDropoffLatitude()
						.hashCode());
		return result;
	}

}
