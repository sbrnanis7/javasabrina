public class Switch {
    public static void main(String[] args) {
        int dayoffweek = 3;
        String dayName;

        switch (dayoffweek){
            case 1: //or guna "Tue" as string instead of case 1 , example case "Tue":
                dayName = "Monday";
                break;

            case 2:
                dayName = "Tuesday";
                break;

            case 3:
                dayName = "Wednesday";
                break;

            case 4:
                dayName = "Thursday";
                break;

            case 5:
                dayName = "Friday";
                break;

            case 6:
                dayName = "Saturday";
                break;

            case 7:
                dayName = "Sunday";
                break;

            default:
                dayName = "Invalid value";
                break;

        }

        System.out.println(dayName);
    }
    
}
