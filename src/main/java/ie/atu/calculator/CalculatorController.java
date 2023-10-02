package ie.atu.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public Calculation calculate(@RequestParam int a, @RequestParam int b, @RequestParam String operator) {
        Calculation calc = new Calculation();
        if (operator.equals("add")) {
            calc.setTotal(a + b);
            calc.setOperation("add");
        }
        else if (operator.equals("subtract")) {
            calc.setTotal(a - b);
            calc.setOperation("subtract");
        }
        else if (operator.equals("multiply")) {
            calc.setTotal(a * b);
            calc.setOperation("multiply");
        }
        return calc;
    }
}
