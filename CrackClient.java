import java.io.*;
import java.util.Scanner;

public class CrackClient {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception{
        char response;
        do {
            CrackPassword crack = null;

            String pass = "";
            User user;
            switch (menu()) {
                case 1:
                    crack = FactoryCrack.getInstance("brutForce");
                    scanner.nextLine();
                    do {
                        System.out.print("Enter your password(maximum 5 caracters): ");
                        pass = scanner.nextLine();
                    } while (pass.length() > 5 && !pass.equals(""));
                    break;
                case 2:
                    crack = FactoryCrack.getInstance("dico");
                    scanner.nextLine();
                    System.out.print("Enter your password: ");
                    pass = scanner.nextLine();
                    break;
                default:
                    System.out.println("Merci à bientôt !!!");
                    return;
            }
            
            user = new User(pass);
            crack.search(user);
            
            System.out.println("______________________________________");
            System.out.print("Voulez-vous continuez ?(O/N):  ");
            response = scanner.next().charAt(0);
        } while (response == 'o' || response == 'O');
    }

    public static int menu(){
        int choice = 0;
        System.out.println("------------------Bienvenue----------------");
        System.out.println("________Menu________");
        System.out.println("1- Methode par FORCE BRUTE");
        System.out.println("2- Methode par Dictionnaire");
        System.out.println("3- Quitter");
        System.out.print("Faites votre choix: ");

        do {
            choice = scanner.nextInt();            
        } while (choice != 3 && choice != 1 && choice != 2);
        return choice;
    }

}
