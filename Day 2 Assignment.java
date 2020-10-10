public class Employee
{
    String name,city;
    int age;
    void display()
    {
        System.out.println("The name is : "+ this.name);
        System.out.println("The age is : "+ this.age);
        System.out.println("The city is : "+ this.city);
    }
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        e1.name= "Prantik";
        e1.age= 21;
        e1.city = "Kolkata";
        Employee e2=new Employee();
        e2.name= "Biswarup";
        e2.age= 21;
        e2.city= "Durgapur";
        e1.display();
        e2.display();
    }
}
