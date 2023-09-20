package pro.Sky.Skypro.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    int divide(int num1, int num2) {
        return num1 / num2;
    }
}
