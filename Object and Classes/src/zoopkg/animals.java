package zoopkg;

public abstract class animals {

    String name;
    int age;
    String gender;
    String type;

    public animals(String name, int age, String gender , String type){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.type = type;
    }

    public void speak(){
        System.out.println("I am " + name);
        System.out.println("My age is " + age);
        System.out.println("My gender is " + gender);
        System.out.println("My type is "+ type);
    }

    public void sleep(){
        System.out.println(name + " is sleeping...");
    }

    public void eat(){
        System.out.println(name + " is eating...");
    }

    // This will add move method to all child of animals.
    public abstract void move();
}
