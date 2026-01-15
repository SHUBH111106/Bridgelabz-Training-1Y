public class Demo1{
static int x=50; int z =10;
public static void m2(){
int y=30;
System.out.println(y);
}
public static void m1(){
int y = 20;
System.out.println(y);
m2();
}
public static void main(String[] args){
int y=10;
System.out.println("Helloworld");
System.out.println(x);
System.out.println(y);
m1();
Demo1 obj = new Demo1();
}
}