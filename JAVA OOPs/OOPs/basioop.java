
class Student{

    int roll;
    String name;
    String add;

    Student()
    {

    }
    Student(int roll, String name, String add)
    {
        this.roll = roll;
        this.name = name;
        this.add = add;
    }
    public void StdDetails()
    {
        System.out.println("Name\t:"+this.name);
        System.out.println("RollNo\t:"+this.roll);
        System.out.println("address\t:"+this.add);
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    
    
}

public class basioop {
    public static void main(String args[])
    {
        Student s = new Student(226259,"Vaibhav","Pune");

        s.setName("Rahul");
        System.out.println(s.getName());
        s.StdDetails();
        Student s1 = new Student(0, null, null);
        s1.StdDetails();

    }
}
