interface demo12
{
    void output();
}
class interfaceex implements demo12{
    public void output()
    {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        interfaceex i=new interfaceex();
        i.output();
    }
}