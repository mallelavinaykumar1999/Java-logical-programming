
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


class Threadpriority{
  public static void main(String args[]){
    threadA t1=new threadA();
    t1.setPriority(10);
    threadB t2=new threadB();
    t2.setPriority(2);
    t1.start();
    t2.start();
    /*for(int i=1;i<5;i++){
      System.out.println(" its main thread");
    }*/
  }
}