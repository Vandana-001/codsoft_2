import java.util.*;
public class StudentGradeCalc {
    public static void main(String ar[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number of subjects:");
       int nsub=sc.nextInt(); //for storing number of subjects

       double marks[]=new double[nsub];
       System.out.println("Enter marks for each subject.");
       for(int i=0;i<nsub;i++)
       {
        System.out.print((i+1)+"th subject:");
        marks[i]=sc.nextDouble();
       }

       double total=calcTotal(marks);
       double average=total/nsub;
       char grade=gradeCalc(average);
       
       System.out.println("Total:\t\t"+total);
       System.out.println("Percentage:\t"+average+"%");
       System.out.println("Grade:\t\t"+grade);

    }
    public static double calcTotal(double[] marks)
    {   double sum=0;
        for(int i=0;i<marks.length;i++)
        {
            sum+=marks[i];
        }
        return sum;
    }
    public static char gradeCalc(double avg)
    {
        if(avg>=90){
            return 'A';
        }
        else if(avg>=80)
        {
            return 'B';
        }
        else if(avg>=70)
        {
            return 'C';
        }
        else if(avg>=60)
        {
            return 'D';
        }
        else if(avg>=50)
        {
            return 'E';
        }
        else
        {
            return 'F';
        }
    }


}
