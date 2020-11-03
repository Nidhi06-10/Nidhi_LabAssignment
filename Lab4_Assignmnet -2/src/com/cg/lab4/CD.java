package com.cg.lab4;

public class CD extends MediaItem {
	private String artist;
	private String genre;

	public CD(String artist, String genre) {
		super();
		this.artist = artist;
		this.genre = genre;
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
		return "CD [artist=" + artist + ", genre=" + genre + ", toString()=" + super.toString() + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getCopies()=" + getCopies() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
