//Superclass

class Animal {
    public void eat(){
        System.out.println("The animal is eating.");
    }

}
//sub class

public class Dog extends Animal{
    public void bark(){
        System.out.println("The dog is barking");
    }

    public class Inheritance {

        public static void main(String[] args){
            Dog dog = new Dog();
            dog.eat();
            dog.bark();
        }
    }
}

