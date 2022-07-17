import java.net.*;
import java.io.*;
public class Server {
    ServerSocket server;
    Socket socket;
    BufferedReader br;
    PrintWriter out;
    //constructor
    public Server(){
        try {
            server=new ServerSocket(123);
            System.out.println("Sever is ready to connect");
            System.out.println("Waiting...");
            socket=server.accept();
            br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out=new PrintWriter(socket.getOutputStream());
            startReading();
            startWriting();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void startReading(){
        //thread
        Runnable r1=()->{
            System.out.println("Reader started...");
            try{
            while(true){
                    String msg=br.readLine();
                if(msg.equals("Exit")){
                    System.out.println("Client has terminated the chat");
                    socket.close();
                    break;
                }
                System.out.println("Client : "+msg);
                }
            }
            catch (Exception e) {
                System.out.println("Connection closed");
            }
        };
        new Thread(r1).start();
    } 
    public void startWriting(){
        //thread
        Runnable r2=()->{
            System.out.println("Writer started...");
            try{
            while(!socket.isClosed()){
                    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
                    String content=br1.readLine();
                    out.println(content);
                    out.flush();
                    if(content.equals("Exit")){
                        socket.close();
                        break;
                    }
                } 
            }
            catch (Exception e) {
                System.out.println("Connection closed");
            }
        };
        new Thread(r2).start();
    }
    public static void main(String[] args) {
        System.out.println("Server is starting...");
        new Server();
    }
}
