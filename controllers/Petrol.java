public class Petrol {

    //guna private type for data for car model and petrol usage
    //encapsulation 

    private String model;
    private double petrol;

    public void setCar(String model, double petrol){
        this.model = model;
        this.petrol = petrol;
    }

    public String getModel(){
        return model;
    }

    public double getPetrol(){
        return petrol;
    }

    public static void main(String[] args) {
        Petrol car = new Petrol();

        String[][] model = {
            {"Lexus","Supra"},
            {"Aston Martin","Rolls Royce"},
        };

        double[][] petrol = {
            {90.6,74},
            {85,62.4},
        };

        for (int i=0; i < model.length; i++){
            for (int j = 0; j < model[i].length; j++){
                car.setCar(model[i][j], petrol[i][j]);

                System.out.println("The petrol used by " + car.getModel() + " is " + car.getPetrol() + "litres per 100km");
            }
        }
    
    }



}
