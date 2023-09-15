class co{
    int a,b;
    co(){
        a=20;
        b=40;
    }
    co(int x,int y){
        a=x;
        b=y;
    }
    co(int x){
        a=x;
        b=100;
    }
    void disp(){
        System.out.println("the value of a and b are"+a+" "+b);
    }
}
class Const_over{
     static public void main(String args[]){
        co ob1=new co(50);
        co ob2=new co(50,80);
        co ob3=new co();
        ob1.disp();
        ob2.disp();
        ob3.disp();
    }
}