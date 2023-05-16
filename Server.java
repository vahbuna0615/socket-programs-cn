import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
  public static void main(String q[]) throws IOException {
    System.out.println("Server started");
    
    ServerSocket ss = new ServerSocket(8001); //listening
    System.out.println("Server running");

    while(true){
      System.out.println("Server waiting for Client Request");

      Socket cs = ss.accept(); //binding
      System.out.println("Server established connection");

      // CLIENT SENDS MSG AND SERVER RETURNS ACKNOWLEDGEMENT (SET 1)

      // DataInputStream in = new DataInputStream(cs.getInputStream());
      // String msg = in.readUTF();
      // System.out.println("Message from client: " + msg);

      // DataOutputStream out = new DataOutputStream(cs.getOutputStream());
      // out.writeUTF("Hi I am Server..." + "\n");

      // LENGTH OF GIVEN STRING (SET 2)

      // DataInputStream in = new DataInputStream(cs.getInputStream());
      // String msg = in.readUTF();
      // System.out.println("Message from Client: " + msg);

      // DataOutputStream out = new DataOutputStream(cs.getOutputStream());
      // out.writeUTF("Length of received string = " + msg.length() + "\n");

      // GET DAY TIME SERVER-CLIENT (SET 3)

      // DataInputStream in = new DataInputStream(cs.getInputStream());
      // String msg = in.readUTF();
      // System.out.println(msg);

      // DataOutputStream out = new DataOutputStream(cs.getOutputStream());
      // out.writeUTF("Today's date: " + (new Date().toString()));


      // CALCULATOR IMPLEMENTATION (SET 4)

      // DataInputStream in = new DataInputStream(cs.getInputStream());
      // int num1 = in.readInt();
      // int num2 = in.readInt();
      // String oper = in.readUTF().toLowerCase();

      // int sum = num1 + num2;
      // int prod = num1 * num2;
      // int quo = num1 / num2;
      // int sub = num1 - num2; 

      // DataOutputStream out = new DataOutputStream(cs.getOutputStream());
      // if (oper.equals("sum")){
      //   out.writeUTF("Sum: " + sum);
      // }else if(oper.equals("prod")){
      //   out.writeUTF("Product: " + prod);
      // }else if(oper.equals("div")){
      //   out.writeUTF("Quotient: " + quo);
      // }else if(oper.equals("sub")){
      //   out.writeUTF("Difference: " + sub);
      // }else {
      //   out.writeUTF("Please enter a valid operation");
      // }

      // RETURN IP ADDRESS OF CLIENT (SET 5)

      // DataInputStream in = new DataInputStream(cs.getInputStream());
      // String msg = in.readUTF();
      // System.out.println(msg);

      // InetAddress ip = InetAddress.getLocalHost();

      // DataOutputStream out = new DataOutputStream(cs.getOutputStream());
      // out.writeUTF("IP address - " + ip.toString());

      // PALINDROME (SET 6)

      // DataInputStream in = new DataInputStream(cs.getInputStream());
      // String msg = in.readUTF(); // Data sent by Client stored in msg 

      // String revMsg = "";
      // for (int i = (msg.length() - 1); i >= 0; i-- ){
      //   revMsg = revMsg + msg.charAt(i);
      // }
      // System.out.println(revMsg);

      // DataOutputStream out = new DataOutputStream(cs.getOutputStream());
      // out.writeUTF(revMsg);


      // FACTORIAL OF GIVEN NUMBER (SET 7)

      // DataInputStream in = new DataInputStream(cs.getInputStream());
      // int num = in.readInt();
      // int fact = num;

      // for (int i = fact-1; i > 0; i--){
      //   fact = fact * i; 
      // }

      // DataOutputStream out = new DataOutputStream(cs.getOutputStream());
      // out.writeInt(fact);


      // CHECK IF TWO STRINGS ARE EQUAL (SET 8)

      // DataInputStream in = new DataInputStream(cs.getInputStream());
      // String txt1 = in.readUTF();
      // String txt2 = in.readUTF();

      // DataOutputStream out = new DataOutputStream(cs.getOutputStream());

      // if (txt1.toUpperCase().equals(txt2.toUpperCase())){
      //   out.writeUTF("YES");
      // }else {
      //   out.writeUTF("NO");
      // }


      // SUM OF GIVEN TWO NUMBERS (SET 9)

      // DataInputStream in = new DataInputStream(cs.getInputStream());
      // int num1 = in.readInt();
      // int num2 = in.readInt();

      // DataOutputStream out = new DataOutputStream(cs.getOutputStream());
      // out.writeInt(num1 + num2);
    }
  }
}
