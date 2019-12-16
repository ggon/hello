package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting getGreeting(Long id){
        Optional<Greeting> greeting = greetingRepository.findById(id);
        return greeting.get();
    }

    public Greeting createGreeting(String content){
        return greetingRepository.save(new Greeting(content));
    }

}
