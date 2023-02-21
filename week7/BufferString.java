import java.io.*;
class BufferString{
  public static void main(String args[]) throws IOException{
    InputStreamReader in=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(in);
    String s;
    System.out.println(" enter your String");
    s=br.readLine();
    System.out.println(" your String is :"+s);
  }
}