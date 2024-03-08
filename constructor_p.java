class constructor_p 
{
    int id;
    String name;
    constructor_p(int  i,String n)
    {
        id=i;
        name=n;
        
    } 
    void out()
    {
        System.out.println("Id="+id);
        System.out.println("Name="+name);
    }
    public static void main(String[] args) {
        constructor_p c=new constructor_p(1,"ram");
        c.out();
    }
}
