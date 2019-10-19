package com.example.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.example.model.TimeSeries;

public class MetaData {
	
	private List<TimeSeries> timeseries;
    public List<TimeSeries> getTimeSeries() {
		return timeseries;
	}

	public void setTimeSeries(List<TimeSeries> timeseries) {
		this.timeseries = timeseries;
	}
	@Column(name = "INFORMATION")	
      private String Information;
	
	@Column(name = "SYMBOL")	
      private String Symbol;
	
    public String getInformation() {
	 return Information;
    }
    public void setInformation(String information) {
	Information = information;
    }
    public Date getLastRefreshed() {
	 return LastRefreshed;
    }
public void setLastRefreshed(Date lastRefreshed) {
	LastRefreshed = lastRefreshed;
}
public String getOutputSize() {
	return OutputSize;
}
public void setOutputSize(String outputSize) {
	OutputSize = outputSize;
}
public String getTimeZone() {
	return TimeZone;
}
public void setTimeZone(String timeZone) {
	TimeZone = timeZone;
}

@Column(name = "LASTREFRESHED")	
private Date LastRefreshed;
@Column(name = "OUTPUTSIZE")	
private String OutputSize;
@Column(name = "TIMEZONE")	
private String TimeZone;

}
