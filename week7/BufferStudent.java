/* write  a prgram to print student number and student names and 3 subject marks by taking inputs from input and output stream and calculate total and average print an report*/
import java.io.*;
class BufferStudent{
  public static void main(String args[]) throws IOException{
    int s_no,s1,s2,s3,tot;
    String s_name;
    float avg;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter student number :");
    s_no=Integer.parseInt(br.readLine());
    System.out.println("enter student  name :");
    s_name=br.readLine();
    System.out.println("enter subject1,subject2,subject3 marks :");
    s1=Integer.parseInt(br.readLine());
    s2=Integer.parseInt(br.readLine());
    s3=Integer.parseInt(br.readLine());

    tot=(s1+s2+s3);
    avg=((float)tot/3);
    
    System.out.println("your student number is "+ s_no);
    System.out.println("your student name is " + s_name);
    System.out.println("your subect1 is " + s1);
    System.out.println("your subect2 is " + s2);
    System.out.println("your subect3 is " + s3);
    System.out.println("total marks of " + s_name+ " is "+tot);
    System.out.println("average  marks of " + s_name+ " is "+avg);

  }
}