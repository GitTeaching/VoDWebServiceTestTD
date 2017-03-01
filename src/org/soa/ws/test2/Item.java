package org.soa.ws.test2;


public class Item {
	
	private String title;
	private String category;
	private Realisator realisator;
	private double runningTime;
	
	public Item (String title, String category, Realisator realisator, double runningTime) {
		this.title = title;
		this.category = category;
		this.realisator = realisator;
		this.runningTime = runningTime;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Realisator getRealisator() {
		return realisator;
	}
	
	public void setRealisator(Realisator realisator) {
		this.realisator = realisator;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(double runningTime) {
		this.runningTime = runningTime;
	}

}
