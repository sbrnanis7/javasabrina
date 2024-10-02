public class OrAnd {

    public static void main(String[] args) {
        int age = 18;
        boolean hasParentalConsent = true;

        if(age>18 || hasParentalConsent && age>25){ //&& and 
            System.out.println("Roro is allowed");
        }else {
            System.out.println("ROro is not allowed");

        }
    }
    
}
