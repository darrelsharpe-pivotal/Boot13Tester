package org.darrel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@RequestMapping("/")
	public Quote getQuote(@RequestParam(value="foo",defaultValue="myFoo") String foo) {
		
		return new QuoteService().getQuote();
	}
}
