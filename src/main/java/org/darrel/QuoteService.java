package org.darrel;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {
	private RestTemplate restTemplate;
	private static final String HTTP_URL = "http://gturnquist-quoters.cfapps.io/api/random";
	
	public QuoteService(){
		restTemplate = new RestTemplate();
		
	}
	
	public Quote getQuote() {
		
		Quote quote = restTemplate.getForObject(HTTP_URL, Quote.class);
		return quote;
	}
}
