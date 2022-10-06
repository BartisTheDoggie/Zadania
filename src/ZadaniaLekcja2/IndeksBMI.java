package ZadaniaLekcja2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class IndeksBMI {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj wagę (w kilogramach): ");
        int waga = keyboard.nextInt();

        System.out.println("Podaj wzrost (w metrach): ");
        double wzrost = keyboard.nextDouble();

        double BMI;
        BMI = waga / (wzrost * wzrost);

        if (BMI >=18.5 && BMI<=25) {

            System.out.printf("Optymalny wskaźnik BMI\n");
        }
        else if (BMI > 25) {

            System.out.println("Masz nadwage!\n");

        }
        else {

            System.out.println("Masz niedowage!\n");

        }

        BigDecimal bd1 = new BigDecimal(BMI).setScale(1, RoundingMode.HALF_UP);
        double BMI2 = bd1.doubleValue();

        System.out.println("Twoje BMI wynosi " + BMI2);
    }
}
