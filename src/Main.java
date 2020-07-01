@SuppressWarnings("ConstantConditions")
public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.stringAnimal();
        System.out.println(dog instanceof Animal && dog instanceof Dog);
        System.out.println(dog instanceof Cat); //Because dog does not extend Cat
        System.out.println();

        Dog dog1 = (Dog) dog;
        dog1.stringDog();
        dog1.stringAnimal();

        GermanShepherd germanShepherd = new GermanShepherd();
        germanShepherd.stringGermanShepherd();
        germanShepherd.stringAnimal();
        System.out.println(germanShepherd instanceof Animal); // Animal is a Base Class
        System.out.println(germanShepherd instanceof Dog); // Dog extends the Base Class (Animal)
        System.out.println(germanShepherd instanceof GermanShepherd);  // German Shepherd extends Dog that extend Animal

        System.out.println(germanShepherd.equals(dog));
        System.out.println();


        Animal cat = new Cat();
        cat.stringAnimal();
        System.out.println(cat instanceof Animal && cat instanceof Cat);
        System.out.println(cat instanceof Dog); //Because dog does not extend Cat
        System.out.println();

        Cat cat1 = (Cat) cat;
        cat1.stringCat();
        cat1.stringAnimal();

        Tiger tiger = new Tiger();
        tiger.stringAnimal();
        System.out.println(tiger instanceof Animal); // Animal is a Base Class
        System.out.println(tiger instanceof Cat); // Cat extends the Base Class (Animal)
        System.out.println(tiger instanceof Tiger);  // Tiger extends Dog that extend Animal

    }
}
