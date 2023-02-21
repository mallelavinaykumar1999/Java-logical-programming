/* v
   v i
   v i n
   v i n a
   v i n a y
   v i n a y k
   v i n a y k u
   v i n a y k u m
   v i n a y k u m a
   v i n a y k u m a r */





class Patternvinay{
  public static void main(String args[]){
    int i,j;
    char ch[]={'v','i','n','a','y','k','u','m','a','r'};
    for(i=0;i<ch.length;i++){
      for(j=0;j<=i;j++){
        System.out.print(" "+ch[j]);
      }
      System.out.println();
    }

  }
}