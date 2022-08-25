public class Asan extends People{

    public Asan(String id, String firstName, String lastName, String email, String city, int age) {
        super(id, firstName, lastName, email, city, age);
    }


    @Override
    public void work() {
        System.out.println("Shahtada ishteit");
    }

    @Override
    public void toRelax() {
        System.out.println("Parkta es alat");
    }

    @Override
    public void communications() {
        System.out.println("Adamdar menen jakshy suilosot");

    }

    @Override
    public void timetable() {
        System.out.println("jumasyna 4 jolu 8 saatan");

    }
}
