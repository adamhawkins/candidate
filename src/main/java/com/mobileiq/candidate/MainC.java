package com.mobileiq.candidate;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainC {

	@Autowired ListCache listCache;
	@Autowired RemoteClient remoteClient;
	
    @RequestMapping("/view")
	public String view(@RequestParam(required=false) String access){
    	if(access == null){
    		return "instructions";
    	}
		return "view";
	}
    
    @RequestMapping("/json")
    @ResponseBody
	public Map json(){  
    	try{
    		return remoteClient.fetch();
    	}catch(Throwable t){
        	return new HashMap(){{
        		put("name", listCache.getRandom());
        	}};
    	}
	}
	
}
