class try_nul_catch{
public static void main(String args[]){
int x=12;
int y=6;
int p[]={10,4,6,2};
try 
{
int z=x/y;
System.out.println("the result is "+z);
p[17]=10;
}
catch(ArithmeticException e)
{
System.out.println("this result is infinity");
}
catch(Exception e)
{
System.out.println("the result is exception");
}
}
}
