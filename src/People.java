abstract public class People {
    private String id,firstName,lastName,email,city;
    private int age;
    public People(String id, String firstName, String lastName, String email, String city, int age) {
        this.id = id;
        this.firstName=firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.city = city;

    }
    abstract public void work();
    abstract public void toRelax();
    abstract public void communications();
    abstract public void timetable();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
