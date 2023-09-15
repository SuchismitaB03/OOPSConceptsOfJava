class test1{
    int a,b;
    test1(int x,int y)
    {
        a=x;
        b=y;
    }
    void disp(){
        System.out.println("The values are"+a+" "+b);
    }
}
class test2{
    public static void main(String args[]){
        test1 ob1=new test1(40,50);
        ob1.disp();
    }
}