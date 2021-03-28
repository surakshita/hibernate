package com.xworkz.collections;

import java.util.Set;

public class SetCollection {
	
	private Set<String> wondersOfWorld;

	public SetCollection(Set<String> wondersOfWorld) {
		super();
		this.wondersOfWorld = wondersOfWorld;
	}

	public Set<String> getWondersOfWorld() {
		return wondersOfWorld;
	}
	
	public void wondersOfWorldList() {
		System.out.println("invoked wonders of worls list");
	}

}
