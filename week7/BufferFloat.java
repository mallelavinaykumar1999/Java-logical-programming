import java.io.*;
class BufferFloat{
  public static void main(String args[]) throws IOException{
    InputStreamReader in=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(in);
    float n;
    System.out.println(" enter your floating num");
    n=Float.parseFloat(br.readLine());
    System.out.println(" your Float value is :"+n);
  }
}