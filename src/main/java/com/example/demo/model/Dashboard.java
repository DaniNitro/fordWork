package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dashboard")
public class Dashboard implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer modelYear;
	private String vehicleLine;
	private String region;
	private String pmt;
	private String engineeringCommodityName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getModelYear() {
		return modelYear;
	}
	public void setModelYear(Integer modelYear) {
		this.modelYear = modelYear;
	}
	public String getVehicleLine() {
		return vehicleLine;
	}
	public void setVehicleLine(String vehicleLine) {
		this.vehicleLine = vehicleLine;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPmt() {
		return pmt;
	}
	public void setPmt(String pmt) {
		this.pmt = pmt;
	}
	public String getEngineeringCommodityName() {
		return engineeringCommodityName;
	}
	public void setEngineeringCommodityName(String engineeringCommodityName) {
		this.engineeringCommodityName = engineeringCommodityName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engineeringCommodityName == null) ? 0 : engineeringCommodityName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modelYear == null) ? 0 : modelYear.hashCode());
		result = prime * result + ((pmt == null) ? 0 : pmt.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((vehicleLine == null) ? 0 : vehicleLine.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dashboard other = (Dashboard) obj;
		if (engineeringCommodityName == null) {
			if (other.engineeringCommodityName != null)
				return false;
		} else if (!engineeringCommodityName.equals(other.engineeringCommodityName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (modelYear == null) {
			if (other.modelYear != null)
				return false;
		} else if (!modelYear.equals(other.modelYear))
			return false;
		if (pmt == null) {
			if (other.pmt != null)
				return false;
		} else if (!pmt.equals(other.pmt))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (vehicleLine == null) {
			if (other.vehicleLine != null)
				return false;
		} else if (!vehicleLine.equals(other.vehicleLine))
			return false;
		return true;
	}
	
	
	
	

}
