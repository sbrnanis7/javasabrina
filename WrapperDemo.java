public class WrapperDemo {
    
    public static void main(String[] args){
        int primitiveInt = 25; //primitive data dtype
        double primitiveDouble = 15.26;
        float primitiveFloat = 85f;
        char primitiveChar = 'P';
        boolean primitivebool = true;


        Integer wrapperInt = Integer.valueOf(primitiveInt);
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        Float wrapperFloat = Float.valueOf(primitiveFloat);
        Character wrappCharacter = Character.valueOf(primitiveChar);
        Boolean wrapperBoolean = Boolean.valueOf(primitivebool);

        System.out.println("The primitive value of int: " + primitiveInt);
        System.out.println("The primitive value of int: " + wrapperInt);





    }
}

