//Super Class
class Animal {
    public void sound(){
        System.out.println("Hop Hop");
    }
    
}

// sub class

class Dog extends Animal{
    @Override //library from java which says that results are same [in polymorphism must use override]
    public void sound(){
        System.out.println("Bark Bark");
    }
}

class Cat extends Animal{
    @Override //override superclass individual attribute masing2 ada sound masing2 ganti superclass whcih supposed to be default
    public void sound(){
        System.out.println("Meow Meow");
    }
}


class Cow extends Animal{
    @Override //override superclass 
    public void sound(){
        System.out.println("Moo Moo Mbek Mbek");
    }
}    

public class Polymorphism {

    public static void main(String[] args){
        Animal myAnimal = new Dog(); //guna sekali je animal myanimal sni sbb nak save time, bawah2 ni boleh guna juga sebenarnya.
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();
    }
}