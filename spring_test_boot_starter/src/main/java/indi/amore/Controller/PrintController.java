package indi.amore.Controller;

import indi.amore.service.PrintCounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class PrintController {

    private final PrintCounterService printCounterService;
    public PrintController(PrintCounterService printCounterService) {
        this.printCounterService = printCounterService;
    }
    @GetMapping("/test")
    public String helloWorld() {
        return printCounterService.printText();
    }
}
