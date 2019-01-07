public class Student implements Cloneable
{
    String name;
    int age;
    Address ad = new Address("CN","NanJing");
    public Student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public Object clone()
    {
        Student a = null;
        try
        {
            a = (Student)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return a;
    }
}