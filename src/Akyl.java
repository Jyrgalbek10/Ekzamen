public class Akyl extends People{
    public Akyl(String id, String firstName, String lastName, String email, String city, int age) {
        super(id, firstName, lastName, email, city, age);
    }

    @Override
    public void work() {
        System.out.println("Taksist bolup ishteit");
    }

    @Override
    public void toRelax() {
        System.out.println("Klubta es alat");
    }

    @Override
    public void communications() {
        System.out.println("adamdar menen jakshy jyloshot");

    }

    @Override
    public void timetable() {
        System.out.println("jumasyna 4 jolu 8 saatan ");

    }
}
