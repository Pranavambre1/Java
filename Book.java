import java.util.Scanner;

class Book_in 
{
    Scanner sc=new Scanner(System.in);
    String author,name;
    int price;
    void input()
    {
        System.out.println("Enter the Author name=");
        author=sc.next();
        System.out.println("Enter name=");
        name=sc.next();
        System.out.println("Enter the price=");
        price=sc.nextInt();

    }
    void output()
    {
        System.out.println("Author="+author);
        System.out.println("Name="+name);
        System.out.println("Price="+price);
    }
    
    
}
class Book extends Book_in
{
   public static void main(String[] args) {
    Book_in b[]=new Book_in[3];
    int i;
    for(i=0;i<3;i++)
    {
        b[i]=new Book_in();
        b[i].input();
    } 
    for(i=0;i<3;i++)
    {
        b[i].output();
    }
   }

}
