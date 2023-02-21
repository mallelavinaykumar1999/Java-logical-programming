
class threadA extends Thread{
 synchronized public void run(){
    for(int i=1;i<5;i++){
      System.out.println(" its thread A");
    }
  }
}
class threadB extends Thread{
  synchronized public void run(){
    for(int i=1;i<5;i++){
      System.out.println(" its thread B");
    }
  }
}


class ThreadwithSynchronous{
  public static void main(String args[]){
    threadA t1=new threadA();
    threadB t2=new threadB();
    t1.start();
    t2.start();
    for(int i=1;i<5;i++){
      System.out.println(" its main thread");
    }
  }
}