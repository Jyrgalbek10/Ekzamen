public class Adyl extends People{
    public Adyl(String id, String firstName, String lastName, String email, String city, int age) {
        super(id, firstName, lastName, email, city, age);
    }

    @Override
    public void work() {
        System.out.println("Magazinde ishteit");
    }

    @Override
    public void toRelax() {
        System.out.println("Klubta es alat");
    }

    @Override
    public void communications() {
        System.out.println("adamdar menen jaksy suiloshot");

    }

    @Override
    public void timetable() {
        System.out.println("jumasyna 4 jolu 8 saatan");
    }
}
