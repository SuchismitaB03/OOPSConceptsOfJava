// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

class pv1
{
    int a,b,c;
    int sum;
    int average;
    void input(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;

    }
    void calculate(){

         sum=a+b+c;
         average=sum/3;
}
    void disp()
    {
        System.out.println("sum is: "+sum);
        System.out.println("average is: "+average);
    }
}
class pv2 {
    public static void main(String args[]) {
        pv1 ob = new pv1();

        ob.input(20, 40,60);

        ob.calculate();

        ob.disp();
        
    }
}