public class Ainur extends People{
    public Ainur(String id, String firstName, String lastName, String email, String city, int age) {
        super(id, firstName, lastName, email, city, age);
    }

    @Override
    public void work() {
        System.out.println("Suluuluk salonunda ishteit");
    }

    @Override
    public void toRelax() {
        System.out.println("Bakta es alat");
    }

    @Override
    public void communications() {
        System.out.println("adamdar menen jakshy juloshot");

    }

    @Override
    public void timetable() {
        System.out.println("jumasyna 4 jolu 8 saatan ");
    }
}
