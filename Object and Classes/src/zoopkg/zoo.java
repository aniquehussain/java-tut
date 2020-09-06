package zoopkg;

public class zoo {
    public static void main(String[] args) {

//        animals elephant = new animals("Elephant", 10, "Male" , "Herbivore");
//
//        elephant.speak();
//
//        elephant.eat();
//
//        elephant.sleep();

        Bird eagle = new Bird("Eagle", 2,"F","Carnivore");

        eagle.speak();
        eagle.chirp();

        // Chicken is a child of Bird
        Chicken hen = new Chicken("Hen", 5, "F","Omnivore");
        hen.chirp();

        Crow kauwa = new Crow("Kauwa", 1, "M","Omnivore");
        kauwa.fly();
        kauwa.chirp();

        // Abstraction
        animals chick1 = new Chicken("cock",2,"M","Omni");
        chick1.move();



        //Polymorphism
        moveAnimals(kauwa);

        Flyable Koyal= new Crow("Koyal",2,"M","Omni");
        Koyal.fly();
    }

    public static void moveAnimals(animals Animal){
        Animal.move();
    }
}
