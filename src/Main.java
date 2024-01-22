public class Main {

    public static void main(String[] args) {
        Dog petDog = new Dog("Tommy", "pug", 5);
        Cat cat = new Cat();

        System.out.println("Hello and welcome!");
        petDog.makeNoise();
        cat.makeNoise();
    }
}