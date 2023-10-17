package mainPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Oprations op = new Oprations();
        System.out.println("welcome to java calculator(enter):");
        scan.nextLine();
        System.out.println("please enter an Operation(+,-,/,*):");
        String input = scan.nextLine();
        switch (input)
        {
            case "+":
                System.out.println("+ pressed");
                op.plusClass();
                break;
            case "-":
                System.out.println("- pressed");
                break;
            case "/":
                System.out.println("/ pressed");
                break;
            case "*":
                System.out.println("* pressed");
                break;
            default:
                System.out.println("wrong input!!!");

        }
    }
}
