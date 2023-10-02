package ie.atu.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public Calculation calculate(@RequestParam int a, @RequestParam int b, @RequestParam String operator) {
        Calculation calc = new Calculation();
        switch (operator) {
            case "add":
                calc.setTotal(a + b);
                calc.setOperation("add");
                break;
            case "subtract":
                calc.setTotal(a - b);
                calc.setOperation("subtract");
                break;
            case "multiply":
                calc.setTotal(a * b);
                calc.setOperation("multiply");
                break;
            default:
                calc.setOperation("NULL");
                calc.setTotal(0);
                break;
        }
        return calc;
    }
}
