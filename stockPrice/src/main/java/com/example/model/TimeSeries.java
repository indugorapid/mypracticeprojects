package com.example.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class TimeSeries {

	@Id
	@GeneratedValue
	@Column(name = "ID")	
    private int id;
	
	@Column(name = "HIGH")
	private int high;
	
	@Column(name = "LOW")
	private int low;
	
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getClose() {
		return close;
	}
	
	public void setClose(int close) {
		this.close = close;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	@Column(name = "CLOSE")
	private int close;
	
	@Column(name = "VOLUME")
	private int volume;
	
   public int getId() {
	return id;
   }
    public void setId(int id) {
	this.id = id;
   }
   public double getOpen() {
	return open;
   }
   public void setOpen(double open) { 
	this.open = open;
   }
  @Column(name = "OPEN")
    private double open;

}
