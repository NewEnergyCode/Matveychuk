public class Employee {


    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int age;


    private Employee(String fullName, String position, String email, String phone, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
    static Employee employee2 = new Employee("Sidorov Oleg Olegovich", "Dantist",
            "dantist@gmail.com", "0932223344", 20);
    private Employee() {
        this.fullName = "Ivanov Ivan Ivanovich";
        this.position = "Tailor";
        this.email = "tailor@gmail.com";
        this.phone = "0677689876";
        this.age = 37;

    }

    static Employee employee = new Employee();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}