class pv1
{
    int a,b;
    void input(int x,int y)
    {
        a=x;
        b=y;
    }
    void disp()
    {
        System.out.println("the values are "+a+" "+b);
    }
}
class pv2 {
    public static void main(String args[]) {
        pv1 ob = new pv1();
        pv1 ob2 = new pv1();
        ob.input(20, 40);
        ob2.input(120, 400);
        ob.disp();
        ob2.disp();
    }
}