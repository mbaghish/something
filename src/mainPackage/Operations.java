package mainPackage;

import java.util.Objects;
import java.util.Scanner;

public class Operations {
    public void calculatorClass(String a){
        System.out.println(a);
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the first digit: ");
        int firstDigit = scan.nextInt();
        System.out.print("enter the second digit: ");
        int secondDigit = scan.nextInt();
        double result;
        if (Objects.equals(a, "+")){
            result = firstDigit + secondDigit;
            System.out.println("the result: "+result);
        }
        else if (Objects.equals(a, "-")){
            result = firstDigit - secondDigit;
            System.out.println("the result: "+result);
        }
        else if (Objects.equals(a, "/")){
            result = (double)firstDigit / (double)secondDigit;
            System.out.println("the result: "+result);
        }
        else if (Objects.equals(a, "*")){
            result = firstDigit * secondDigit;
            System.out.println("the result: "+result);
        }
    }
}
