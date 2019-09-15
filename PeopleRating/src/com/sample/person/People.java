package com.sample.person;

public class People {
	private String area;
	private int rating;
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public People(String area, int rating) {
		super();
		this.area = area;
		this.rating = rating;
	}
	public People() {
		super();
	}
	@Override
	public String toString() {
		return "People [area=" + area + ", rating=" + rating + "]";
	}
	
	
}
