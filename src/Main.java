public class Main {


    public static void main(String[] args) {


        Employee employeeMax = new Employee("Sidorov Oleg Olegovich", "Dantist",
                "dantist@gmail.com", "0932223344", 20);


        System.out.println("Full name: " + employeeMax.getFullName() +
                "\nPosition: " + employeeMax.getPosition() +
                "\nEmail: " + employeeMax.getEmail() +
                "\nPhone: " + employeeMax.getPhone() +
                "\nAge: " + employeeMax.getAge() +
                "\n_______________________");
    }
}
