import java.io.*;
class Thread1 extends Thread
{
  public int sum1=0; 
  public void run()
 {
  for(int i=0;i<=100;i++)
  sum1=sum1+i;
  System.out.println("Sum of 1-100 is: "+sum1);
 }
}
class Thread2 extends Thread
{
  public int sum2=0;
  public void run()
 {
  for(int i=101;i<=200;i++)
  sum2=sum2+i;
  System.out.println("Sum of 101-200 is: "+sum2);
 }
}
class Thread3 extends Thread
{
  public int sum3=0;
  public void run()
 {
  for(int i=201;i<=300;i++)
  sum3=sum3+i;
  System.out.println("Sum of 201-300 is: "+sum3);
 }
}
class Multithreading
{
 public static void main(String args[])
 {
  Thread1 t1=new Thread1();
  t1.start();
  Thread2 t2=new Thread2();
  t2.start();
  Thread3 t3=new Thread3();
  t3.start();

  try
  {
    t1.join();
    t2.join();
    t3.join();

    int mainsum=0;
    mainsum = t1.sum1+t2.sum2+t3.sum3;
    System.out.println("Main Sum="+mainsum);
  }
  catch(InterruptedException IntExp)
  {
  }
 }
}
