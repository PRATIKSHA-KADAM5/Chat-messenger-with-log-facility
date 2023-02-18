import java.net.*;
import java.io.*;

public class Client3
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client application is running...");

        Socket s = new Socket("localhost",2100);
        //It is socket class object which is used to connect with the server socket while creating this object we have to pass two parameters as the IP address of server 
        //and the port number of server application.
        
        System.out.println("Client is waiting for the server to accept the request");

        PrintStream ps = new PrintStream(s.getOutputStream());
        //This object is used to send the data to server application as its is used to send the data it is considerd as output stream.

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //It is used to accept the input from server (input stream)
        
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        //it is used to accept the input from keyboard

        String str1, str2;

        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            System.out.print("Enter message for server : ");
            str2 = br1.readLine();
            System.out.println("Server says : "+str2);
        }
    }
}
