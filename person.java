class person 
{
  int ano,pno;
  String name;
  person(int ano,int pno,String name)
  {
    this.ano=ano;
    this.pno=pno;
    this.name=name;

  }
  person(int ano,int pno)
  {
    ano=5;
    pno=3;
  }   
  void out()
  {
    System.out.println("Adharnumber is="+ano);
    System.out.println("Pannumber="+pno);
    System.out.println("Name="+name);
  }
  public static void main(String[] args) {
    person p1=new person(1,2,"pranav");
    person p2=new person(1,2,"pranav");
    person p3=new person(1,2,"pranav");
    person p4=new person(1,2,"pranav");
    person p5=new person(1,2,"pranav");
    p1.out();
    p2.out();
    p3.out();
    p4.out();
    p5.out();
  }
}

