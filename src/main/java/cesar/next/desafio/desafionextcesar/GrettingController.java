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
    @GetMapping("/projects")
    public Gretting getProjects(@RequestParam(value = "name", defaultValue = "aqui retornara os projetos") String name) {
        return new Gretting(counter.incrementAndGet(), String.format(template, name));
    }

}
