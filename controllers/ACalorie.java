public class ACalorie {
    public static void main(String[] args) {
        int cal = 1000;
        int newcal;

        for (int day = 1; day <= 7; day++) {
            if (day == 1) {
                newcal = cal;
            } else {
                newcal = cal + (100 * (day - 1));
            }
            System.out.println("Day " + day + ": " + newcal + " calories");
        }
    }
}
