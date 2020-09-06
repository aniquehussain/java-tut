package zoopkg;

public class Bird extends animals{

    public Bird(String name, int age, String gender, String type) {
        super(name, age, gender, type);
    }


    public void move() {
        System.out.println("Flapping wings");
    }


//    public void fly(){
//        System.out.println(name + " is flying");
//    }

    public void chirp(){
        System.out.println(name + " is chirping");
    }

}
