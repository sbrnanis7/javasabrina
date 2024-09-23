class Animal{
    public void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Dog Woof Woof");
    }
}


public class Casting {  //default + dog / default + cat. 

    public static void main(String[] args){
        Animal myAnimal = new Dog();
        myAnimal.sound();

        if (myAnimal instanceof Dog);
            Dog myDog = (Dog) myAnimal;
            myDog.bark();
    }
}
