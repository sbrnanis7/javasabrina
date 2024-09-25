import java.util.ArrayList;

public class ArrayListExample {
    
    public static void main(String[] args) {
        ArrayList<String>fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Strawberry");
        fruits.add("Plum");


        // System.out.println("Fruit #1: " + fruits.get(0));

        // for(String fruit: fruits){
        //     System.out.println(fruits);

        // }

        fruits.remove(1);
        // System.out.println(fruits);

        for(String fruit:fruits){
            System.out.println(fruit);
        }


    }
}
