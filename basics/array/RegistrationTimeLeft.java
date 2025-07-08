package basics.array;

import java.time.LocalTime;

public class RegistrationTimeLeft {
    public static void main(String[] args) {
        LocalTime currenTime = LocalTime.now();
        LocalTime registrationEndTime = LocalTime.of(18,59,59);
        int hoursleft = registrationEndTime.getHour() - currenTime.getHour();
        int minuteleft = registrationEndTime.getMinute() - currenTime.getMinute();
        int secondsleft = registrationEndTime.getSecond() - currenTime.getSecond();
        System.out.println("you have"+ hoursleft + "hours,"
                            +minuteleft +"minutes ,+and"
                            + secondsleft + "second left to register.");
    }
    
}
 