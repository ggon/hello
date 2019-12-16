package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService greetingService;

	@RequestMapping(value="/greeting/{id}", method=RequestMethod.GET)
	public Greeting greeting(@PathVariable("id") Long id) {
		return greetingService.getGreeting(id);
	}

	@RequestMapping(value="/greeting", method=RequestMethod.POST)
	public Greeting greeting(@RequestBody Greeting greeting) {
		return greetingService.createGreeting(greeting.getContent());
	}
}
