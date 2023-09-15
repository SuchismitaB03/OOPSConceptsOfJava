class Thread1 implements
Runnable{
Threrad(){
Thread t=new Thread(this);
t.start();
}
public void run(){
for(int i=0;i<10;i++){
System.out.println("Thread 1's i="+i);
}
}
}
class Thread2{
public static void maion(String args[]){
new Thread1();
for(int i=0;i<=20;i++){
System.out.println("Main i="+i);
}
}
}

