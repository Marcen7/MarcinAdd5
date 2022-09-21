public class LoopInLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Wartość 'i': " + i);

            for (int j = 0; j < 3; j++) {
                System.out.println(">>>>Wartość 'j': " + j);
            }
        }
        System.out.println("Koniec programu");
    }
}
