package com.syedanique;


    public class Human {

        String name;
        int age;
        int height;
        String eyeColor;

        public Human(String name, int age, int height, String eyeColor) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.eyeColor = eyeColor;
        }

        public void speak() {
            System.out.println("My name is " + name);
            System.out.println("I am " + age + " yrs old");
            System.out.println("I am " + height + " inches tall");
            System.out.println("My eyecolor is " + eyeColor);
        }

        public void walk(){
            System.out.println("Walking");
        }
        public void eat(){
            System.out.println("Eating");
        }
    }