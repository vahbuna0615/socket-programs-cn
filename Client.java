import java.io.*;
import java.net.*;

public class Client {
  public static void main(String q[]) throws IOException {
    Socket sc = new Socket("localhost", 8001);

    // CLIENT SENDS MSG AND SERVER RETURNS ACKNOWLEDGEMENT(SET 1) 

    // DataOutputStream out = new DataOutputStream(sc.getOutputStream());
    // out.writeUTF("Hi, I am client..." + "\n");

    // DataInputStream in = new DataInputStream(sc.getInputStream());
    // String msg = in.readUTF();
    // System.out.println("Message from server: " + msg);


    // LENGTH OF GIVEN STRING (SET 2)

    // DataOutputStream out = new DataOutputStream(sc.getOutputStream());
    // String msg = "Hello world";
    // out.writeUTF("String: " + msg.toUpperCase() + "\n");

    // DataInputStream in = new DataInputStream(sc.getInputStream());
    // String msgServer = in.readUTF();
    // System.out.println("Message from Server: " + msgServer);

    // GET DAY TIME SERVER-CLIENT (SET 3)

    // DataOutputStream out = new DataOutputStream(sc.getOutputStream());
    // out.writeUTF("What is Today's date? ");

    // DataInputStream in = new DataInputStream(sc.getInputStream());
    // String msg = in.readUTF();
    // System.out.println(msg);

    // CALCULATOR IMPLEMENTATION (SET 4)

    // DataOutputStream out = new DataOutputStream(sc.getOutputStream());
    // int num1 = 10, num2 = 5;
    // String oper = "none";
    // out.writeInt(num1);
    // out.writeInt(num2);
    // out.writeUTF(oper);

    // DataInputStream in = new DataInputStream(sc.getInputStream());
    // String result = in.readUTF();
    // System.out.println("Result - " + result);

    // RETURN IP ADDRESS OF CLIENT (SET 5)

    // DataOutputStream out = new DataOutputStream(sc.getOutputStream());
    // out.writeUTF("Return IP Address");

    // DataInputStream in = new DataInputStream(sc.getInputStream());
    // String msgServer = in.readUTF();
    // System.out.println(msgServer);

    // PALINDROME (SET 6)

    // DataOutputStream out = new DataOutputStream(sc.getOutputStream());
    // String msg = "dad";
    // out.writeUTF(msg);

    // DataInputStream in = new DataInputStream(sc.getInputStream());
    // String msgServer = in.readUTF();
    // if (msgServer.equals(msg)){
    //   System.out.println("palindrome");
    // }else {
    //   System.out.println("not a palindrome");
    // }

    // Check if two strings are equal or not


    // FACTORIAL OF GIVEN NUMBER (SET 7)

    // DataOutputStream out = new DataOutputStream(sc.getOutputStream());
    // int num = 5;
    // out.writeInt(num);

    // DataInputStream in = new DataInputStream(sc.getInputStream());
    // int fact = in.readInt();
    // System.out.println("Factorial of " + num + " is: " + fact);


    // CHECK IF TWO STRINGS ARE EQUAL (SET 8)

    // DataOutputStream out = new DataOutputStream(sc.getOutputStream());
    // String txt1 = "hello", txt2 = "hello";
    // out.writeUTF(txt1);
    // out.writeUTF(txt2);

    // DataInputStream in = new DataInputStream(sc.getInputStream());
    // String msgServer = in.readUTF();

    // if (msgServer.equals("YES")){
    //   System.out.println("YES");
    // }else {
    //   System.out.println("NO");
    // }


    // SUM OF GIVEN TWO NUMBERS (SET 9)

    // DataOutputStream out = new DataOutputStream(sc.getOutputStream());
    // int num1 = 10, num2 =5;
    // out.writeInt(num1);
    // out.writeInt(num2);

    // DataInputStream in = new DataInputStream(sc.getInputStream());
    // int sum = in.readInt();
    // System.out.println("Sum is: " + sum);

    sc.close();
  }
}
