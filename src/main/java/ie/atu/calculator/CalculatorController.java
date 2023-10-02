package ie.atu.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate/{operator}/{a}/{b}")
    public Calculation calculate(@PathVariable String operator, @PathVariable int a, @PathVariable int b) {
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
            case "divide":
                calc.setTotal(a / b);
                calc.setOperation("divide");
                break;
            default:
                calc.setOperation("NULL");
                calc.setTotal(0);
                break;
        }
        return calc;
    }
}
