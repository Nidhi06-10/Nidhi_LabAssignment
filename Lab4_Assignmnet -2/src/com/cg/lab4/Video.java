package com.cg.lab4;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int yearReleased;

	public Video(String director, String genre, int yearReleased) {
		super();
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}

	public Video(int id, String title, int copies, int runtime) {
		super(id, title, copies, runtime);

	}

	public Video() {
		super();
	}

	@Override
	public void print() {
	}

	@Override
	public void checkIn() {
	}

	@Override
	public void checkOut() {
	}

	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased + ", toString()="
				+ super.toString() + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getCopies()="
				+ getCopies() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
