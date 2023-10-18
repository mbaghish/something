package mainPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Operations op = new Operations();
        System.out.println("welcome to java calculator(enter):");
        scan.nextLine();
        System.out.println("please enter an Operation(+,-,/,*):");
        String input = scan.nextLine();
        switch (input) {
            case "+" -> {
                System.out.println("+ pressed");
                op.calculatorClass(input);
            }
            case "-" -> {
                System.out.println("- pressed");
                op.calculatorClass(input);
            }
            case "/" -> {
                System.out.println("/ pressed");
                op.calculatorClass(input);
            }
            case "*" -> {
                System.out.println("* pressed");
                op.calculatorClass(input);
            }
            default -> System.out.println("wrong input!!!");
        }
    }
}
