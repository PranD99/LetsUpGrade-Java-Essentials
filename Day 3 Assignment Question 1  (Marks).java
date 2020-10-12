import java.util.Scanner;
public class Marks
{
    public static void main (String[] args)
    {
        float eng,math,phy,chem,cs;
        double p , avg , total;
        char grade='\0';
        Scanner op= new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects");
        System.out.println("Enter English Marks");
        eng=op.nextFloat();
        System.out.println("Enter Mathematics Marks");
        math=op.nextFloat();
        System.out.println("Enter Physics Marks");
        phy=op.nextFloat();
        System.out.println("Enter Chemistry Marks");
        chem=op.nextFloat();
        System.out.println("Enter Computer Science Marks");
        cs=op.nextFloat();
        total=eng+math+phy+chem+cs;
        p=(total/500.0)*100.0;
        avg= total/5.0;
        if(p>=90)
            grade='O';
        else if(p<90&&p>=80)
            grade='E';
        else if(p<80&&p>=70)
            grade='A';
        else if(p<70&&p>=60)
            grade='B';
        else if(p<60&&p>=50)
            grade='C';
        else if(p<50&&p>=40)
            grade='D';
        else if(p<40)
            grade='E';
        else
            System.out.println("Enter correct values");
        System.out.println("Average Marks"+avg);
        System.out.println("Percentage"+p);
        System.out.println("Grade"+grade);
    }
}
