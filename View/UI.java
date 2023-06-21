package View;

import java.util.Scanner;
import java.util.function.Function;

public class UI {

    Scanner in = new Scanner(System.in, "cp866");

    public Function<String, Double> inputDouble = msg -> {
        System.out.println(msg);
        return in.nextDouble();
    };

    public int getChoice() {
        System.out.println("Выберите действие: ");
        System.out.println("\t1. Сложение");
        System.out.println("\t2. Вычитание");
        System.out.println("\t3. Умножение");
        System.out.println("\t4. Деление");
        return in.nextInt();
    }
}