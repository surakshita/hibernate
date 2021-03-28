package com.xworkz.collections;

import java.util.HashMap;

public class MapCollection {
	private HashMap<String, String> movies;

	public MapCollection(HashMap<String, String> movies) {
		super();
		this.movies = movies;
	}

	public HashMap<String, String> getMovies() {
		return movies;
	}

	public void moviesName() {
		System.out.println("invoked movies names");
	}

}
