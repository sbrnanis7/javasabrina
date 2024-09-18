public class GPA {
    
    private String name;
    private int gpafirst;
    private int gpasecond;
    private int gpathird;
    private int gpasum= gpafirst + gpasecond + gpathird;

    public GPA(String name, int gpafirst, int gpasencond, int gpathird, int gpasum) {
        this.name = name;
        this.gpafirst = gpafirst;
        this.gpasecond = gpasencond;
        this.gpasum = gpasum;

    }
    
    public void  displayDetails() {
        System.out.println("My average GPA is: " + gpasum);
    
    }

    public static void main(String[] args) {
        int gpafirst = 3;
        int gpasecond = 5;
        int gpathird = 4;
        int gpasum = gpafirst + gpasecond + gpathird;
        System.out.println(gpasum);

    }

}

