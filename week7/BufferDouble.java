import java.io.*;
class BufferDouble{
  public static void main(String args[]) throws IOException{
    InputStreamReader in=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(in);
    double n;
    System.out.println(" enter your floating num");
    n=Double.parseDouble(br.readLine());
    System.out.println(" your Double value is :"+n);
  }
}