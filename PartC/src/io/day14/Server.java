package io.day14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

// socket.png 그림참고 : 클라이언트와 서버 각각 실행하는 메소드가 다릅니다.
//                       서버와 클라이언트 연결 과정이 다르기 때문.
//              프로그램 실행은 서버가 먼저 실행하기
public class Server {

    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        try {
            // 서버 소켓 생성
             server = new ServerSocket();
            // 서버 연결 정보 ip 와 port설정
            server.bind(new InetSocketAddress("192.168.30.5",5050));
            System.out.println("[서버프로그램 시작] : 연결 요청을 기다리는 중입니다.");
            // 클라이언트 연결 요청(connect)에 대한 수락.
            socket = server.accept();  // 입출력 스트림을 만들 소켓
            System.out.println("__연결을 수락합니다.");       // accept 정상 완료되면 실행         
            
            // 서버가 클라이어트에게 데이터 보내기 : 출력 스트림
            // 클라이언트와 서버가 연결된 소켓으로 출력 스트림 생성
            OutputStream os = socket.getOutputStream();
            // 정수, 실수, 문자열 보내는 스트림
            DataOutputStream dos = new DataOutputStream(os);    // 보조 스트림
            dos.writeUTF("\tFrom 서버 >> 다시 돌아가세요.my name is Hoon"); 

            // 클라이언트가 보낸 인사말 받기
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String message = dis.readUTF();
            System.out.println("\t 서버 >> 메시지를 남겨주세요." + message);


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 자원해제.close 처리
            try {server.close() ; socket.close();} catch (IOException e) {}
    
        }
    }







}

