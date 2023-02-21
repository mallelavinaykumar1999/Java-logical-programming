
class threadA extends Thread{
  public void run(){
    for(int i=1;i<5;i++){
      System.out.println(" its thread A");
    }
  }
}
class threadB extends Thread{
  public void run(){
    for(int i=1;i<5;i++){
      System.out.println(" its thread B");
    }
  }
}


class Thread1{
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