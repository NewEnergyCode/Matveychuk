package HomeWork7;

public class Main {


    public static void main(String[] args) {

        Animal catVasia = new Cat();
        catVasia.running("Vasia", 50);

        Animal catLapsik = new Cat();
        catLapsik.running("Lapsik", 250);
        catLapsik.swimming("Lapsik", 250);

        Animal catDodik = new Cat();
        catDodik.swimming("Dodik", 250);

        Animal dogSharik = new Dog();
        dogSharik.running("Sharik", 400);

        Animal dogSerik = new Dog();
        dogSharik.swimming("Serik", 100);

        Animal dogBob = new Dog();
        dogBob.swimming("Bob", 10);
        dogBob.running("Bob", 550);

        System.out.println("You creat " + Animal.getCount() + " animals: " + Cat.getCount()
                + " cats and " + Dog.getCount() + " dogs.");


    }
}
