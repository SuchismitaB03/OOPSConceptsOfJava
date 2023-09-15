class Parent{
    void display(){
        System.out.println("This is the parent class method");
    }
}
class Child1 extends Parent{
    void display(){
        System.out.println("this is the child class method");
    }
}
class Child2 extends Parent{
    void display(){
        System.out.println(" This is the child2 class method");
    }
}
class DMD{
    public static void main(String args[]){
        Parent p=new Parent();
        p.display();
        Child1 ob1=new Child1();
        Child2 ob2=new Child2();
        ob1.display();
        ob2.display();
        p=ob1;
        p.display();
        p=ob2;
        p.display();
    }
}