package zoopkg;

public class Crow extends Bird implements Flyable {


    public Crow(String name, int age, String gender, String type) {
        super(name, age, gender, type);
    }


    public void fly() {
        System.out.println(name + " can fly....");
    }
}
