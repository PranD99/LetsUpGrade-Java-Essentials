import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Scanner;
public class EmployeeName
{
    public static void main(String[] args) throws ParseException
    {

        String name,month,dob;
        int year;
        double tax,msal;
        Scanner op=new Scanner(System.in);
        tax=op.nextDouble();
        System.out.println("Enter name of Employee");
        name=op.next();
        System.out.println("Enter date of birth (dd-MM-yyyy) of Employee ");
        dob = op.next();
        System.out.println("Enter birth month of Employee");
        month=op.next();
        System.out.println("Enter birth year of Employee");
        year=op.nextInt();
        System.out.println("Enter salary of Employee");
        msal=op.nextDouble();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(dob);
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();
        Period period = Period.between(givenDate, LocalDate.now());
        double sal=msal*12.0;
        if(sal>=500000)
            tax=sal*20.0/100.0;
        else if(sal<500000&&sal>=400000)
            tax=sal*15.0/100.0;
        else if(sal<400000&&sal>=300000)
            tax=sal*10.0/100.0;
        else if(sal<300000&&sal>=200000)
            tax=sal*5.0/100.0;
        else
            System.out.println("No need to pay tax");
        System.out.println("Name of Employee"+name);
        System.out.println("Age of the Employee"+period.getYears()+" years "+period.getMonths()+" and "+period.getDays()+" days");
        System.out.println("Annual Salary of the Employee"+sal);
        System.out.println("Tax amount of the Employee"+tax);
        System.out.println("Birth Month of the Employee"+month);
        System.out.println("Birth Year of the Employee"+year);
    }
}
