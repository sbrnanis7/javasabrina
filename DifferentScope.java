public class DifferentScope {
    int instanceVariable = 10;
    double instanceVariableDouble = 10.8;
    String instanceVariableString = "This is string";

    static int instanceVariableStatic = 20;

    public void showLocalvariable() {
        String localStringVariable = "Finish!";
        int localVariable = 30;
        System.out.println("My local variable is:" + localVariable + " " + localStringVariable);
    }
    
    public static void main(String[] args){
        DifferentScope example = new DifferentScope();
        example.showLocalvariable();
        System.out.println("My local variable is: " + example.instanceVariable + " " +example.instanceVariableString);

    }
    
}
