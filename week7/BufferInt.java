import java.io.*;
class BufferInt{
  public static void main(String args[]) throws IOException{
    InputStreamReader in=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(in);
    int n;
    System.out.println(" enter your num");
    n=Integer.parseInt(br.readLine());
    System.out.println(" your Int value is :"+n);
  }
}