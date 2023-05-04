/******************************************************************************
Write a JAVAprogram to print all ASCII character with their values.
*******************************************************************************/
public class allascii {

    public static void main(String[] args) {
        for (int i = 0; i <= 127; i++) {
            System.out.println((char) i + " : " + i);
        }
    }
}