import java.util.Scanner;



public class Solution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Math Expression (examples: 1+2, -200-100, 2*5.5, 10/2): ");
        String exp = input.nextLine();
        exp = exp.replaceAll(" ", "");
        double result = 0;
        int operatorLocation = -1, illegal = 0;
        char ch;
        char operation = ' ';

        // Error Handling-1 ... Töm matematik uttryck (minst 3 symboler)
        if (exp.length() < 3) {
            System.out.println(">> Error: Empty Math Expression!");
            System.exit(1);
        }

        // Hitta typen och platsen för matematik operationerationen
        for (int i = 1; i < exp.length()-1; i++) {
            ch = exp.charAt(i); // index 2 = +
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operation = ch;
                operatorLocation = i; // operatorLocation = 2
                break;
            }
        }

        // Error Handling-2 ... Det finns ingen matematik operationeration
        if (operatorLocation == -1) {
            System.out.println(">> Error: No Math operationeration (+,-,*,/)!");
            System.exit(1);
        }

        // Dela uttrycket i 2 delar (Num1 och Num2)
        String Num1 = exp.substring(0, operatorLocation);
        String Num2 = exp.substring(operatorLocation + 1);



        // Error Handling-3 ... ogiltig uttryck (innehåller icke -numeriska symboler eller fler operationerationer)
        ch = Num1.charAt(0);
        if ((ch < '0' || ch > '9') && ch != '-') illegal = 1;
        ch = Num2.charAt(0);
        if ((ch < '0' || ch > '9') && ch != '-') illegal = 1;

        for (int i = 1; i < Num1.length(); i++) {
            ch = Num1.charAt(i);
            if ((ch < '0' || ch > '9') && ch != '.') {
                illegal = 1;
                break;
            }
        }
        for (int i = 1; i < Num2.length(); i++) {
            ch = Num2.charAt(i);
            if ((ch < '0' || ch > '9') && ch != '.') {
                illegal = 1;
                break;
            }
        }

        if (illegal == 1) {
            System.out.println(">> Error: Illegal Expression!");
            System.out.println(">> Must contain only (0-9,or decimal point and one operationeration + - * /)");
            System.exit(1);
        }

        // konvertera de två delarna från String till double
        double firstNum = Double.parseDouble(Num1);
        double secondNum = Double.parseDouble(Num2);

        // Error Handling-4 ... Divistion med noll
        if (operation == '/' && secondNum == 0) {
            System.out.println(">> Error: Division by Zero!");
            System.exit(1);
        }

        // Utför Math beräkning
        switch (operation) {
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = firstNum * secondNum;
            case '/' -> result = firstNum / secondNum;
        }

        System.out.println(exp + " = " + result);
    }
}
