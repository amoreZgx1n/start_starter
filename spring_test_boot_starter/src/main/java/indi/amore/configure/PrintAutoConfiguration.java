package indi.amore.configure;

import indi.amore.Controller.PrintController;
import indi.amore.service.impl.PrintCounterServiceImpl;
import indi.amore.service.PrintCounterService;
import org.springframework.context.annotation.Bean;

public class PrintAutoConfiguration {

    @Bean
    public PrintCounterService printCounterService() {
        return new PrintCounterServiceImpl();
    }

    @Bean
    public PrintController printController(PrintCounterServiceImpl printCounterService) {
        return new PrintController(printCounterService);
    }
}
