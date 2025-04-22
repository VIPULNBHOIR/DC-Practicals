import java.io.*;
import java.net.*;
import java.util.Scanner;


public class MyClient {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        try {
            Socket s = new Socket("localhost", 6666);

            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            System.out.print("Enter your message: ");
            String input = sc.nextLine();

            dout.writeUTF(input);
            dout.flush();

            dout.close();
            sc.close();
            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
}