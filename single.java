import java.util.*;
class demo
{
    int id;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter the id");
        id=sc.nextInt();
    }
    void display()
    {
        System.out.println("Id="+id);

    }

}
class single extends demo
{
    String name;
    void in()
    {
        System.out.println("Enter the name=");
        name=sc.next();

    }
    void out()
    {
        System.out.println("Name="+name);

    }
    public static void main(String[] args) {
        single s=new single();
        s.input();
        s.in();
        s.display();
        s.out();
    }

}