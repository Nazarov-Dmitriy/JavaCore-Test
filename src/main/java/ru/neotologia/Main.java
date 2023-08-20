package ru.neotologia;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // Деление на ноль запрещено, необходимо сделать проверку что a или b больше нуля
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}