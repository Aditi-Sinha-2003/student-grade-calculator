import java.util.*;

public class gradeCalci {

    public static void marks() {
        int total = 0;
        float avgPercent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of subjects :\n ");
        int sub = sc.nextInt();
        int sub_stud[] = new int[sub];
        System.out.println("Enter the marks for each subject out of 100 :\n");
            for(int j=0; j<sub; j++) {
                System.out.println("Subject " + (j+1) + ":\n");
                sub_stud[j] = sc.nextInt();
        }
            for(int j=0; j<sub; j++) {
                total += sub_stud[j];
            }
                 avgPercent = (total / sub);
                 System.out.println("Total Marks = " + total);
                 System.out.println("Average Percentage = " + avgPercent);

                if(avgPercent >= 95 && avgPercent <= 100) {
                    System.out.println("Grade A++\n");
                } else if (avgPercent >= 90 && avgPercent < 95) {
                    System.out.println("Grade A+\n");
                } else if (avgPercent >= 85 && avgPercent < 90) {
                    System.out.println("Grade A\n");
                } else if (avgPercent >= 80 && avgPercent < 85) {
                    System.out.println("Grade B+\n");
                } else if (avgPercent >= 70 && avgPercent < 80) {
                    System.out.println("Grade B\n");
                } else if (avgPercent >= 60 && avgPercent < 70) {
                    System.out.println("Grade C+\n");
                } else if (avgPercent >= 50 && avgPercent < 60) {
                    System.out.println("Grade C\n");
                } else if (avgPercent >= 40 && avgPercent < 50) {
                    System.out.println("Grade D\n");
                } else if (avgPercent >= 30 && avgPercent < 40) {
                    System.out.println("Grade E\n");
                } else {
                    System.out.println(" Grade F\n");
                }

                
           
                    
        }

     
     public static void main(String[] args) {
        marks();
     }
 
}
    