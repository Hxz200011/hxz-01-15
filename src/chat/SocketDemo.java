package chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketDemo {
    public static void main(String[] args) {
        try {
            Socket socket = null;
            ServerSocket ss = new ServerSocket(8888);
            while (true) {
                System.out.println("�ȴ����û�����......");
                socket = ss.accept();
                System.out.println("���û�����ϵͳ");
                OutputStream os = socket.getOutputStream();//���ҳ������м�������Ȼ���ڸ����������δ�ӡ�����ֵ
                OutputStreamWriter osw = new OutputStreamWriter(os);
                PrintWriter out = new PrintWriter(osw);
                out.println("��ӭ��XXX");
                out.flush();

                //��������Ϣ�߳�
                GetMessageThread getMessageThread = new GetMessageThread(socket);
                getMessageThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
