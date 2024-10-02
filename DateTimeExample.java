import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class DateTimeExample {
    
    public static void main(String[] args) {
        LocalDateTime nowDT = LocalDateTime.now();
        LocalDate nowD = LocalDate.now();
        LocalTime nowT = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
        String formattedDT = formatter.format(nowDT);

        LocalDate birthDate = LocalDate.of(1998, 11, 21);
        Period myAge = Period.between(nowD, birthDate);

        System.out.println(nowDT);
        System.out.println(nowD);
        System.out.println(nowT);
        System.out.println(formattedDT);
        System.out.println(myAge);

    }
}
