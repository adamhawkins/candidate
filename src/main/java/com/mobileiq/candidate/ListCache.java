package com.mobileiq.candidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ListCache {

	public List<String> list = new ArrayList<String>(){{
		add("Pulp Fiction");
		add("Back to the future");
		add("Snatch");
		add("Papillon");
		add("Shaun of the Dead");
		add("Ferris Bueller's Day Off");
		add("Trainspotting<script type='text/javascript'>window.alert('be careful what you inject');</script>");
	}};
	
	public String getRandom(){
		
    	if(new Random().nextInt(2) == 0){
    		throw new RuntimeException();
    	}
		
		int i = list.size();
		return list.get(new Random().nextInt(i));
	}

}
