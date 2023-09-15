class test1{

    {
     int area;
     void area(int x){
         area=x*x;
    System.out.println("area of the square is: "+x*x);

    }
    void area(int x,int y){
        area=x*y;
        System.out.println("area of the rectangle is: "+x*y);
    }
}
class test2{
    public static void main(String args[]){
       test1_overload ob=new test1_overload();
        ob.disp(15,20);


    }
}