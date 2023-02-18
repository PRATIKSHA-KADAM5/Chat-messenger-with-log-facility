import java.net.*;
import java.io.*;

public class Server3
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server application is running...");

        ServerSocket ss = new ServerSocket(2100);
        //It is object of server socket class which is used to create the server & start the server in leasing mode
        System.out.println("Server is running at port no 2100 and waiting for client request");

        Socket s = ss.accept();
        //It is obejct of socket class which is used to accept the request which come from the client.
        System.out.println("Request of client gets accepted");

        PrintStream ps = new PrintStream(s.getOutputStream());
        //It is object of printstream class used to send the data to client application.

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //It is onject of bufferd reader used to accept the input from client.
        
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        //It is a object of buffred reader used to accpet the input from user.
        String str1, str2;

        while((str1 = br1.readLine()) != null)
        {
            System.out.println("Client says : "+str1);
            System.out.print("Enter message for client : ");
            str2 = br2.readLine();
            ps.println(str2);
        }
    }
}
