public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println( grade + "   " +  "Mukemmel : Geçtiniz");
                break;

            case 'B':
                System.out.println( grade + "   " +  "Mukemmel : Geçtiniz");
            case 'C':

                System.out.println("Iyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Degil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
        }
    }
}