package gpse.example.web;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping("/hello-world")
    public String welcome() {
        return "Hallo aus dem Backend! " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

}
