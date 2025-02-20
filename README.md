# MULTITHREADED-CHAT-APPLICATION:
*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: ISHA TANTAK

*INTERN ID*:CODHC109

*DOMAIN*:JAVA DEVELOPEMENT

*DURATION*:4 WEEKS

*MENTOR*:NEELA SANTOSH
Client-Server Chat Application
This is a simple Java-based Client-Server Chat Application using Sockets and Multithreading. It allows multiple clients to connect to a server and communicate with each other in real-time. The server handles multiple client connections and broadcasts messages sent by any client to all other connected clients.

Features
Real-time chat with multiple clients.
Messages from one client are broadcasted to all other clients.
Each client runs on a separate thread, allowing simultaneous communication with the server.
Clients can disconnect gracefully using the "exit" command.
Technologies Used
Java Sockets for communication.
Multithreading to handle multiple clients concurrently.
Prerequisites
JDK 8 or higher should be installed on your machine to run the application.
Setup Instructions
1. Clone the repository
First, clone the repository to your local machine:git clone https://github.com/your-username/chat-application.git
cd chat-application
2. Compile the Java files
To compile the server and client Java files, use the following commands:javac Server.java
javac Client.java
3. Start the Server
To start the server, open a terminal window and run the Server.java file:java Server
4. Start the Clients
Open multiple terminal windows to simulate multiple clients. For each client, run the Client.java file:java Client
5. Sending Messages
Once connected, clients can type messages and press Enter to send them to the server. The server will broadcast the message to all connected clients. Messages will be displayed in real-time on all clients.

6. Disconnecting Clients
To disconnect from the server, simply type exit in the chat. The server will acknowledge the disconnection and remove the client from the list of active users.

Example Usage
Server Terminal Output:Server started...
Client 1 (Alice) Terminal Output:Enter your username:
Alice
Client 2 (Bob) Terminal Output:Enter your username:
Bob
Client 1 (Alice) sends a message:Hello, everyone!
Server Output:Alice: Hello, everyone!
Clients (Bob and Alice) see:Alice: Hello, everyone!
Dependencies
This project does not have any external dependencies, as it uses standard Java libraries (Java Sockets and Multithreading).
