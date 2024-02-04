import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proszę podać imię:");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();

        System.out.println("Ile masz lat:");
        int wiek = scanner.nextInt();
        //int wiek = Integer.parseInt(scanner.nextLine());
        System.out.println("Cześć "+imie+", mam "+wiek+"!");
    }
}