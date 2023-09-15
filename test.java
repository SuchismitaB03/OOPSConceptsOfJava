

class Test1 {
    int a,b;
    int sum;

    void input()
    {
        a=10;
        b=20;
    }
    void calculate(){
        sum=a+b;
    }
    void disp()
    {
        System.out.println("the sum is: "+sum);
    }
}
class Test2{
    public static void main(String args[]){
        Test1 ob =new Test1();
        ob.input();
        ob.calculate();
        ob.disp();
    }
}