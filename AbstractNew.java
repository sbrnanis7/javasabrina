abstract class Animal { //abstract diff from super class and similar with inheritance
    public abstract void sound();

    public void sleep(){
        System.out.println("The animal is sleeping");
    }


}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("bark bark bark");
    }
}
public class AbstractNew{

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();
    }
    
}

//ex: for login.  abstract have kind of a dependency to the sub class?
