class overriding1
{
  void out()
  {
    System.out.println("Hello world");
  }
}
class overriding extends overriding1
{
    void out()
    {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        overriding o=new overriding();
        o.out();
        
    }
}
