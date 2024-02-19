package Pegas.task1;

import Pegas.services.Calculator;
import Pegas.utils.Decorator;

public class Program {
    public static void main(String[] args) {
        System.out.println(Decorator.decorate(Calculator.add(2,2)));
        System.out.println(Decorator.decorate(Calculator.sub(2,2)));
        System.out.println(Decorator.decorate(Calculator.mul(2,2)));
        System.out.println(Decorator.decorate(Calculator.div(2,2)));
    }

}
