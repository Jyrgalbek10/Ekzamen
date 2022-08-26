import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Asan asan = new Asan("Adam", "Asan", "Asanov", "asan@mail.com", "osh", 19);
        asan.work();
        asan.toRelax();
        asan.communications();
        asan.timetable();
        Uson uson = new Uson("A", "Uson", "Usonov", "uson@mail", "Bishkek", 20);
        uson.work();
        uson.toRelax();
        uson.communications();
        uson.timetable();
        Adyl adyl = new Adyl("B", "Adyl", "Adylov", "adyl@mail", "Moskva", 21);
        adyl.work();
        adyl.toRelax();
        adyl.communications();
        adyl.timetable();
        Akyl akyl = new Akyl("V", "Akyl", "Akylov", "akyl@mail", "Kyzyl", 22);
        akyl.work();
        akyl.toRelax();
        akyl.communications();
        akyl.timetable();
        Ainur ainur = new Ainur("G", "Ainur", "Ainurovna", "ainur@mail", "London", 23);
        ainur.work();
        ainur.toRelax();
        ainur.communications();
        ainur.timetable();
        People[] people1 = {
                new Asan("Adam", "Asan", "Asanov", "asanmail.com", "osh", 122),
                new Uson("A", "Uson", "Usonov", "uson@mail", "Bishkek", 0),
                new Adyl("B", "Adyl", "Adylov", "adyl@mail", "Moskva", 120),
                new Akyl("V", "Akyl", "Akylov", "akyl@mail", "Kyzyl", 0),
                new Ainur("G", "Ainur", "Ainurovna", "ainur@mail", "London", 0)
        };
        for (People p : people1) {
            System.out.println(p);
            if (p.getEmail().contains("@")) {
                System.out.println("Tuura");
            } else {
                System.out.println("ERROR");
                for (People p1: people1) {
                boolean b = p1.getAge() < 0;
                if (p1.getAge() >= 120) {
                    System.out.println("Jashy tuura emes");
                } else if (b) {
                    System.out.println("tuura");
                } else {
                    System.out.println("tuura emes");
                }
                }
            }
        }
    }
}