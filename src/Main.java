import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Login jazynyz");
        String login = scan.nextLine();

        System.out.println("Paroldu jazynyz");
        String password = scan.nextLine();

        System.out.println("Paroldu kaitalap jazynyz");
        String confirmPassword = scan.nextLine();

        Login.loginMethod(login, password, confirmPassword);

    }
}