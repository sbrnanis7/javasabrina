/*public class Calorie {
    public static void main(String[] args) {

        String dayN;
        int incalorie = 1800;

        for (int i=1; i<=7; i++){

            switch (i){
                case 1: //or guna "Tue" as string instead of case 1 , example case "Tue":
                    dayN = "Monday";
                    incalorie = incalorie + 0;
                    break;
    
                case 2:
                    dayN = "Tuesday";
                    incalorie = incalorie + 0;
                    break;
    
                case 3:
                    dayN = "Wednesday";
                    incalorie = incalorie + 100;
                    break;
    
                case 4:
                    dayN = "Thursday";
                    incalorie = incalorie + 100;
                    break;
    
                case 5:
                    dayN = "Friday";
                    incalorie = incalorie + 100;
                    break;
    
                case 6:
                    dayN = "Saturday";
                    incalorie = incalorie + 100;
                    break;
    
                case 7:
                    dayN = "Sunday";
                    incalorie = incalorie + 100;
                    break;
    
                default:
                    dayN = "Invalid value";
                    break;
            }

            System.out.println(dayN + "'s calorie is: " + incalorie);
        }

            }
} */
    


public class Calorie {

    public static void main(String[] args) {
        String dayName;
        int calorie=1500;
        int totalcalorie;

        for(int i=1; i<=7; i++) {

            switch (i) {
                case 1:
                    dayName = "Monday";
                    totalcalorie = calorie + 0;
                    break;

                case 2:
                    dayName = "Tuesday";
                    totalcalorie = calorie + 0;
                    break;

                case 3:
                    dayName = "Wednesday";
                    totalcalorie = calorie + 100;
                    break;

                case 4:
                    dayName = "Thursday";
                    totalcalorie = calorie + 100;
                    break;

                case 5:
                    dayName = "Friday";
                    totalcalorie = calorie + 100;
                    break;

                case 6:
                    dayName = "Saturday";
                    totalcalorie = calorie + 100;
                    break;

                case 7:
                    dayName = "Sunday";
                    totalcalorie = calorie + 100;
                    break;
            
                default:
                    dayName = "Invalid";
                    totalcalorie = calorie;
                    break;
            }

            System.out.println(dayName + " calorie is " + totalcalorie);
        }

    }
}