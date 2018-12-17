package Client;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import program_screen.LoginFrame;
 
public class Client {
 
    public static void main(String[] args) throws IOException{
        
        Client cm = new Client();
        cm.ClientRun("클라이언트가 정상 접속");
 
    }
    

 public void ClientRun(String data){
        
        Socket socket = null;
        OutputStream os = null;
        OutputStreamWriter osw =null;
        BufferedWriter bw = null;
        
        InputStream is =null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        
        try{
            socket = new Socket("192.168.0.87", 9254); // 테스트를 위해 주소 자신의 IP로 바꿔주세여
            if (socket.isConnected()) {
            os = socket.getOutputStream();
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);            
        
            is = socket.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);        
            
            bw.write(data);
            bw.newLine();
            bw.flush();
            
            String receiveData = "";
            receiveData = br.readLine();
            System.out.println(receiveData); 
            LoginFrame frame = new LoginFrame();
    		frame.setVisible(true);
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }    
        
    }
    
}