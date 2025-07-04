package basics.array;

import java.util.Arrays;

public class Employeeidandsalary {
    public static void main(String[] args) {
        String[][] Employee = new String[5][2];
        Employee[0][0] ="100023";
        Employee[1][0] ="pramisha";
        Employee[1][0] = "10004";
        Employee[1][1] ="dhanush";
        Employee[2][0] = "1080";
        Employee[2][1] =" rishika";
        for(String[] Employees: Employee){
            System.out.println(Arrays.toString (Employees));
        }
    }
    
}
