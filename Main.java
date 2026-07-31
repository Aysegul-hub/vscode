import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        /* Bu kod parçası hesap makinesi olarak kullanır.*/
         
        System.out.println("CALCULATOR");

        while ( true) {

        System.out.println("Please enter the number : ");
            try (Scanner scan = new Scanner(System.in)) {
                double number = scan.nextDouble();
                System.out.println("Please select the operation you want to perform : (+,-,*,/,=) ");
                String operation = scan.next();
                System.out.println("If you stop the program , please enter (.) ");
                
                if (operation.equals(".")) {
                    break;
                }
                
                if (!operation.equals("+")) if (operation.equals("-")) {
                    System.out.println("Please enter the second number : ");
                    double number2 = scan.nextDouble();
                    System.out.println("The result of the operation is : " + (number - number2));
                } else if (operation.equals("*")) {
                    System.out.println("Please enter the second number : ");
                    double number2 = scan.nextDouble();
                    System.out.println("The result of the operation is : " + (number * number2));
                } else if (operation.equals("/")) {
                    System.out.println("Please enter the second number : ");
                    double number2 = scan.nextDouble();
                    if (number2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("The result of the operation is : " + (number / number2));
                    }
                } else if (operation.equals("=")) {
                    System.out.println("The result of the operation is : " + number);
                } else {
                    System.out.println("Invalid operation. Please try again.");
                    
                } else {
                    System.out.println("Please enter the second number : ");
                    double number2 = scan.nextDouble();
                    System.out.println("The result of the operation is : " + (number + number2));
            }   }

    }
    
}
}

