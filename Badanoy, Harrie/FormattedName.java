// NAME: BADANOY, HARRIE
// COURSE & YEAR: DIT-1ST YEAR
// PROFESSOR: MR.FLORENZ RAMOS

package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String output = "";
        
        if (name.contains(" ")) {
            String names[] = name.split(" ");
            String formattedName = "";
            
            for (String tempName : names) {
                String fl = tempName.substring(0, 1).toUpperCase();
                String nextString = tempName.substring(1).toLowerCase();
                String wholeName = fl + nextString;
                formattedName += wholeName + " ";  
            }
            
            output = formattedName.trim();
        } else {
            String fl = name.substring(0, 1).toUpperCase();
            String nextString = name.substring(1).toLowerCase();
            output = fl + nextString;
        }
        System.out.println(output);
    }
}
