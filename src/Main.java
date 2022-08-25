import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            People[] people1 = {
                    new Asan("Adam", "Asan", "Asanov", "asan@mail.com", "osh", 19),
                    new Uson("A", "Uson", "Usonov", "uson@mail", "Bishkek", 20),
                    new Adyl("B", "Adyl", "Adylov", "adyl@mail", "Moskva", 21),
                    new Akyl("V", "Akyl", "Akylov", "akyl@mail", "Kyzyl", 22),
                    new Ainur("G", "Ainur", "Ainurovna", "ainur@mail", "London", 23)

            };
        for (int i = 0; i < 5; i++) {
            
        }

            for (People p : people1) {
                System.out.println(p);
                if (p.getEmail().contains("@")) {
                    System.out.println("Tuura");
                } else {
                    System.out.println("error");
                }
        }

    }
}