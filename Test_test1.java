import java.lang.Thread;
import java.util.Scanner;
class Test_test1{
public static void main(String ob[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int sum=a+b;
try{
Thread.sleep(10000);
System.out.println("Sum of two numbers: "+sum);
}
catch(InterruptedException e)
{}
}
}

