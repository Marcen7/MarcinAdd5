import java.util.Scanner;

public class AddNumber {

    public static void main (String[] args){
        int number;
        int sum = 0;
        Scanner nr = new Scanner(System.in);

        for ( int i = 0; i < 3; i++) {

        System.out.println("Podaj liczbę: ");
         number = nr.nextInt();
         if(number % 3 == 0) {
             sum = number + i-1;
             System.out.println("Liczba jest podzielna przez 3");
             System.out.println("Suma dotychczasowych liczb " + sum++);
         }
         else {
             System.out.println("Liczba nie jest podzielna przez 3");

        }
    }
}}
