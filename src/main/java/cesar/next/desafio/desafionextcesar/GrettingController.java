package cesar.next.desafio.desafionextcesar;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GrettingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

   @GetMapping("/greeting")
    public Gretting gretting(@RequestParam(value = "name", defaultValue = "World") String name) {
       return new Gretting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("project/{id}")
    @ResponseBody
    public String getProjectById(@PathVariable Integer id){
       return "ID" + id;
    }




}
