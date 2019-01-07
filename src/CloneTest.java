public class CloneTest
{
    public static void main(String[] args)
    {
        Student a = new Student("zhangsan",23);
        Student b = (Student)a.clone();
        System.out.println(b.name + "," + b.age + ","+ b.ad.toString());
        b.name = "wangwu";
        b.ad.setCity("ShangHai");
        System.out.println(a.name + "," + a.age + ","+ a.ad.toString());
        System.out.println(b.name + "," + b.age + ","+ b.ad.toString());
    }
}