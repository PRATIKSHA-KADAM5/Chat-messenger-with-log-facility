***********************************************************************************************************************************************************************
# Chat-messenger-with-log-facility
In this project  create such appplication which will communication each other.
***********************************************************************************************************************************************************************
# Description : 
•This project provides the chatting facility for pear to pear communication.

•We use java socket programming to perform the text based chatting. 

•We also maintain the log which contains all the chatting details with the periodic fashion.

•This application is platform & architecture independent.
***********************************************************************************************************************************************************************
# Prerequisites :
1.Java Development Kit (JDK)

2.An IDE, such as Eclipse or IntelliJ IDEA
***********************************************************************************************************************************************************************
# Compilation :
1.Open the project in your preferred IDE.

2.Compile and run the Server.java file.

3.In a separate terminal or console window, compile and run the Client.java file.

4.You should now be able to send messages between the client and server through the console.
***********************************************************************************************************************************************************************
# Code explanation :
* server :
The code is a server application that is listening for client requests.
The code starts by printing "Server application is running..." and then creates a ServerSocket object with port number 2100.
Next, the code accepts any incoming connection on this socket and prints "Request of client gets accepted."
Then it prints out what the user typed in as input from the keyboard to be sent to the client.
Finally, it closes all streams when done.
The main method begins by printing "Server application is running..." followed by creating a new ServerSocket object with port number 2100 which will listen for incoming connections on this socket.
Next, it waits for an incoming connection request from another computer or device connected to its network before accepting them into their own Socket object (s).
Once they are accepted into s, they can send data back and forth between each other through these two sockets until one of them disconnects or finishes sending data back and forth between each other.
The code is for a server application that listens on port 2100 and accepts connections from clients.
***********************************************************************************************************************************************************************
* Client :
The code is a Java program that creates a client application.
The code starts by printing "Client application is running..." and then it creates a Socket object called s, which connects to the server on port 2100.
It prints "Client is waiting for the server to accept the request" and waits for input from the user.
When input comes in, it sends it to the server via an OutputStream object called ps.
Then it reads lines of text from two BufferedReader objects: br1 and br2.
After reading each line of text, they are printed out on SystemOut using println().
The main loop iterates until there is no more data coming in or if there's an error (in this case, when str1 does not equal end).
The code attempts to demonstrate the use of a socket and a server.
The client will connect to the server, wait for it to accept the request, and then send messages back and forth.

# Technology : Java Programming
***********************************************************************************************************************************************************************

