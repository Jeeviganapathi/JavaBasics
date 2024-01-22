public class Dog {
    private String name;
    private String breedName;
    private int age;

    public Dog(String name, String breedName, int age) {
        this.name = name;
        this.breedName = breedName;
        this.age = age;
    }

    public void bark(){
        System.out.println(this.name + " Dog is barking");
    }
}
