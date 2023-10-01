package ie.atu.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public Calculation calculation(@RequestParam int a, @RequestParam int b, @RequestParam String operation) {
        Calculation calc = new Calculation();
        if (operation.equals("add")) {
            calc.setOperation("add");
            calc.setTotal(a + b);
        }

        return calc;
    }
}
