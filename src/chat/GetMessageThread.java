package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class GetMessageThread extends Thread {

    Socket socket;

    public GetMessageThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            while (true) {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader in = new BufferedReader(isr);
                String serverMessage = in.readLine();//����״̬
                System.out.println("�ͻ���˵��" + serverMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
