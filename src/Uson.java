public class Uson extends People{
    public Uson(String id, String firstName, String lastName, String email, String city, int age) {
        super(id, firstName, lastName, email, city, age);
    }

    @Override
    public void work() {
        System.out.println("Ohpiste ishteit");
    }

    @Override
    public void toRelax() {
        System.out.println("Koldo es alat");
    }

    @Override
    public void communications() {
        System.out.println("adamdar menen jakshy suiloshot");
    }

    @Override
    public void timetable() {
        System.out.println("jumasyna 4 jolu 8 saatan");

    }
}
