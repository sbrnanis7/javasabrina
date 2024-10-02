import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "java123";

        String enteredPassword;

        do {
            System.out.println("Enter your password");
            enteredPassword = scanner.nextLine();
            if (!enteredPassword.equals(correctPassword)){
                System.out.println("Please try again");
            }

        }while(!enteredPassword.equals(correctPassword));
        System.out.println("True Password");
    }
}
