class constructor1 {
    int a, b;

    constructor1()
    {
        a=10;b=20;
    }
    void Display()
    {
        System.out.println(a+" "+b);
    }
}
class Main_Num
{
    public static void main(String args[])
    {
constructor1 ob=new constructor1();
ob.Display();
}
}