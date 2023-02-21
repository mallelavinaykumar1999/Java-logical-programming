import java.io.*;
class BufferChar{
  public static void main(String args[]) throws IOException{
    InputStreamReader in=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(in);
    char ch;
    System.out.println(" enter your char");
    ch=(char)br.read();
    System.out.println(" your char is :"+ch);
  }
}