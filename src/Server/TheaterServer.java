package Server;

import java.io.IOException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TheaterServer {
	
	public static void main(String[] args) throws IOException {
		TheaterServer ts = new TheaterServer();
		ts.ServerRun();
	}
	
	public void ServerRun() throws IOException {
		ServerSocket server = null;
		int port = 9254;
		Socket socket = null;
		
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try { 
        	server = new ServerSocket(port);
        	while(true) {
        		System.out.println("서버 실행중");
        		socket = server.accept();
        		System.out.println(socket.getInetAddress() + "로부터의 연결 요청");
        		
        		is = socket.getInputStream();
        		isr = new InputStreamReader(is);
        		br = new BufferedReader(isr);
        		
        		String data = null;
        		data=br.readLine();
        		System.out.println(data);
        		
        		receiveData(data, socket);
        		System.out.println("****** 연결 완료 ******");
            }
        }catch (Exception e) {
                e.printStackTrace();
            }finally {
                try{
                    br.close();
                    isr.close();
                    is.close();
                    server.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    
    
    public void receiveData(String data, Socket socket){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        
        try{
            os = socket.getOutputStream();
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);            
            bw.write(data);           
            bw.flush();
        } catch(Exception e1){
            e1.printStackTrace();
        } finally {
            try{
                bw.close();
                osw.close();
                os.close();
                socket.close();
            } catch(Exception e1) {
                e1.printStackTrace();
            }
        }
    }    
}
