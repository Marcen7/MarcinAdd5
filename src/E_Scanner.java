import java.util.Scanner;


public class E_Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj swoje imie");
        String name = sc.nextLine();
        System.out.println("Witaj " + name);

        System.out.println("Ile masz lat " + name + "?");
        int wiek = sc.nextInt();
        if (wiek > 18){
        System.out.println("Oooo to 18-sta już była");}
        if (wiek == 18){
            System.out.println("Nie ma to jak balować ;)");
        }
        else {
                System.out.println("To 18-stka przed Tobą ;)");
            }
        System.out.println("End");
    }
}
