import java.util.Scanner;

public class SwichBrowser {
    public static void main(String[] args) {
        System.out.println("Podaj nazwę przeglądarki jaką używasz");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.nextLine();

        switch (browser) {
            case "Chrome":
                System.out.println("Używasz Chrome - spoko !!");
                break;
            case "Fire fox":
                System.out.println("Korzystasz z Lisa - ok!!");
                break;
            case  "Edge":
                System.out.println("Edge ..... poważnie");
                break;
        }
        System.out.println("Koniec programu !!!");
    }
}
