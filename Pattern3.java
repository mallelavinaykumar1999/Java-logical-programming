/* 1  2   3   4   5   
   1  2   3   4   5
   1  2   3   4   5
   1  2   3   4   5
   1  2   3   4   5*/



class Pattern3{
  public static void main(String args[]){
    int i,j;
    for(i=5;i>=1;i--){
      for(j=1;j<=5;j++){
        System.out.print(" "+j);
      }
      System.out.println();
    }

  }
}