public class Calorie {
    public static void main(String[] args) {

        int[] day = {1,2,3,4,5,6,7};
        String dayN;
        int incalorie = 1000;
        int addcall = 100;

        for (int num: day){

            switch (num){
                case 1: //or guna "Tue" as string instead of case 1 , example case "Tue":
                    dayN = "Monday"+ incalorie;
                    break;
    
                case 2:
                    dayN = "Tuesday"+ incalorie;
                    break;
    
                case 3:
                    dayN = "Wednesday"+ incalorie +addcall;
                    break;
    
                case 4:
                    dayN = "Thursday"+ incalorie +addcall;
                    break;
    
                case 5:
                    dayN = "Friday"+ incalorie +addcall;
                    break;
    
                case 6:
                    dayN = "Saturday"+ incalorie +addcall;
                    break;
    
                case 7:
                    dayN = "Sunday"+ incalorie +addcall;
                    break;
    
                default:
                    dayN = "Invalid value";
                    break;
        }

            }
        }
    }
