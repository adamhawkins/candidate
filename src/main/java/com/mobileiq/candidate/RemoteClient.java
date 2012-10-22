package com.mobileiq.candidate;

import java.io.IOException;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RemoteClient {

	@Autowired(required=false) String url = null;
	
	Map fetch() throws IOException{
		
		if(url == null) throw new RuntimeException();
		
		System.out.println(url);
		
        HttpClient httpclient = new DefaultHttpClient();
        try {
            HttpGet get = new HttpGet(url);

            // Create a response handler
            ResponseHandler<String> responseHandler = new BasicResponseHandler(){
            	public String handleResponse(HttpResponse response) throws HttpResponseException, IOException {
            		if(response.getStatusLine().getStatusCode() == 500) throw new RuntimeException("Failed to fetch");
            		return super.handleResponse(response);
            	}
            };
            String responseBody = httpclient.execute(get, responseHandler);
            
            System.out.println(responseBody);
            
            return new ObjectMapper().readValue(responseBody, Map.class);
        } finally {
            // When HttpClient instance is no longer needed,
            // shut down the connection manager to ensure
            // immediate deallocation of all system resources
            httpclient.getConnectionManager().shutdown();
        }
		
		
	}
	
	
}
