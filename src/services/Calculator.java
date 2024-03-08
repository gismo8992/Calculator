package services;

import domen.ComplexNumber;

/**
 * Класс калькулятора для выполнения операций.
 */
class Calculator {
    private ComplexOperation operation;

    /**
     * Метод установления операции над комплексными числами.
     *
     * @param operation
     */
    public void setOperation(ComplexOperation operation) {
        this.operation = operation;
    }

    /**
     * Метод выполнения операции над комплексными числами.
     *
     * @param num1 комплексное число 1.
     * @param num2 комплексное число 2.
     */
    public void executeOperation(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = operation.operate(num1, num2);
        Logger.log("Результат операции: " + result.getReal() + " + " + result.getImaginary() + "i");
    }
}

