import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Asan asan = new Asan("Adam","Asan","Asanov", "asan@mail.com", "osh",19);
        asan.getEmail();
//        if (asan.getEmail().contains("@")){
//            System.out.println("Tuura");
//
//        }else {
//            System.out.println("error");

        Uson uson = new Uson("A","Uson","Usonov","uson@mail","Bishkek",20);
        Adyl adyl = new Adyl("B","Adyl","Adylov","adyl@mail","Moskva",21);
        Akyl akyl = new Akyl("V","Akyl","Akylov","akyl@mail","Kyzyl",22);
        Ainur ainur = new Ainur("G","Ainur","Ainurovna","ainur@mail","London",23);

        People[] people1={
                new Asan("Adam","Asan","Asanov", "asan@mail.com", "osh",19),
                new Uson("A","Uson","Usonov","uson@mail","Bishkek",20),
                new Adyl("B","Adyl","Adylov","adyl@mail","Moskva",21),
                new Akyl("V","Akyl","Akylov","akyl@mail","Kyzyl",22),
                new Ainur("G","Ainur","Ainurovna","ainur@mail","London",23)

        };
        for (People p:people1) {
            System.out.println(p);

        }
    }

}