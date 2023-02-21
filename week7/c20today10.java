/*
Counting the frequency of elements in an array:
*/



class c20today10{
  public static void main(String args[]){
  int a[]={32, 43, 53, 54, 32, 65, 63, 98, 43, 23};
   int a1[]={32, 43, 53, 54, 32, 65, 63, 98, 43, 23};
      
    int j = 0;
    int count=0;
    int t;
    for(int i=0;i<a.length-1;i++){
      for(int m=0;m<a.length-1-i;m++){
             if(a[m]>a[m+1]){
               t=a[m];
               a[m]=a[m+1];
               a[m+1]=t;
             }   
      }
    }
    for (int i = 0; i < a.length; i++) {   
      if (a[i] != a[j]) {
                              
        a[++j] = a[i];
      }
    }
    for(int i=0;i<=j;i++){
      for(int k=0;k<a1.length;k++){
        if(a[i]==a1[k]){
          count++;
        }  
      }
      if(count>1)
      System.out.println("Counting the frequency of "+a[i]+" is "+count);
      count=0;
    }
    
    
  }
}