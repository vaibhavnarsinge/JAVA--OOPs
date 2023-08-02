class student
{
    private int rollno;
    private int id;
    private String name;

    student(int rollno, int id, String name)
    {
        this.rollno = rollno;
        this.id = id;
        this.name = name;
    }

    public void setrollNo(int rollno)
    {
        this.rollno = rollno;
    }

    
    public void setid(int id)
    {
        this.id = id;
    }

    
    public void setname(String name)
    {
        this.name = name;
    }

    public int getrollNo()
    {
        return rollno;
    }

    
    public int getid()
    {
        return id;
    }

    public String getname()
    {
        return name;
    }


    public void getdetails()
    {
        System.out.println("Roll No : "+rollno);
        System.out.println("Id : "+id);
        System.out.println("Name :"+name);
    }
}



public class Encapsul {
    public static void main(String args[])
    {
        student s = new student(12,11 ,"Vaibhav" );
        s.getdetails();
        s.setname("Rahul");
        s.setid(12);
        s.setrollNo(2312313);
        s.getdetails();

    }
}
