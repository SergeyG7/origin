package app;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть сумму свого доходу: ");
        double income = scanner.nextDouble();
        double taxRate = 0;

        if (income <= 10000){
            taxRate = 2.5;
        } else if (income > 10000 && income <= 25000) {
            taxRate = 4.3;
        } if (income > 25000){
            taxRate = 6.7;
        }
        double taxAmount = income * (taxRate / 100);

        System.out.printf("Сумма податку складає: %.2f\n", taxAmount);


    }
}
