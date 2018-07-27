# Distributed-Computing-System
Implement the algorithms: RMI, RPC, CORBA, MPI,...
## An example application using RMI scheme for movie online ticket booking system.
The customer side can: Search, order the tickets, do the payment, perform bank transfer. Further more, they can also chat via a chat room. The RMI wrote in the java language with NetBean IDE 8.2. From my point of view, after using the InteliJ IDE to do the same project, I found that it is not flexible for interface design and the function for graphic designing is so limited.

Hence, I strongly recommend you to use the NetBean for the Java project (very powerful IDE).
Open the cmd in the windows OS.
## To start, let execute the rmiregistry, default is port 1099
C:\Users\Admin\Documents\NetBeansProjects\MovieOnline\build\classes>rmiregistry

Then, start the servers of bank and movie.
C:\Users\Admin\Documents\NetBeansProjects\MovieOnline\build\classes>java -Djava.security.policy=movieonline.policy movieonline.BankServer
#You will get the result as
Binding BankImpl object b as TestBank
C:\Users\Admin\Documents\NetBeansProjects\MovieOnline\build\classes>java -Djava.security.policy=movieonline.policy movieonline.MovieServer
#You will get the result as
Binding MovieImpl object m name as Test Movie
# And start the chat server
C:\Users\Admin\Documents\NetBeansProjects\MovieOnline\build\classes>java -Djava.security.policy=movieonline.policy chatserver.ChatServer
Starting Chat Server
Chat server started...
## Demo for client: Start the client by following command
C:\Users\Admin\Documents\NetBeansProjects\MovieOnline\build\classes>java -Djava.security.policy=movieonline.policy movieonline.RMIClient

## Demo for Seller
C:\Users\Admin\Documents\NetBeansProjects\MovieOnline\build\classes>java -Djava.security.policy=movieonline.policy movieonline.RMIMovieSeller

