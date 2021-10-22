package cesar.next.desafio.desafionextcesar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GrettingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

   @GetMapping("/greeting")
    public Gretting gretting(@RequestParam(value = "name", defaultValue = "World") String name) {
       return new Gretting(counter.incrementAndGet(), String.format(template, name));
    }
    
    @GetMapping("/users")
    public Gretting users(@RequestParam(value = "name", defaultValue = "Cesar") String name) {
       return new Gretting(counter.incrementAndGet(), String.format(template, name));
    }
    




}
