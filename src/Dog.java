public class Dog extends Animal{
    private String name;
    private String breedName;
    private int age;

    public Dog(String name, String breedName, int age) {
        this.name = name;
        this.breedName = breedName;
        this.age = age;
    }

    // It is called Method overriding.
    public void makeNoise(){
        System.out.println(" Dog is barking");
    }
}
