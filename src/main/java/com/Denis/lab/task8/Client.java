package com.Denis.lab.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private BufferedReader in;
    private PrintWriter out;
    private Socket socket;

    Scanner scan = new Scanner(System.in);

    public Client() {

        try {
            socket = new Socket("localhost", 5555);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Input your name:");
            out.println(scan.nextLine());

            Send send = new Send();
            send.start();

            String str = "";
            while (!str.equals("exit")) {
                str = scan.nextLine();
                out.println(str);
            }
            send.setStop();
        } catch (Exception e) {
//			e.printStackTrace();
        } finally {
            close();
        }
    }

    private void close() {
        try {
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Threads not closed");
        }
    }

    private class Send extends Thread {

        private boolean stop;

        public void setStop() {

            stop = true;
        }

        @Override
        public void run() {
            try {
                while (!stop) {
                    String str = in.readLine();
                    System.out.println(str);
                }
            } catch (IOException e) {
                System.out.println("Read message error");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
//		Scanner in = new Scanner(System.in);
//
//		System.out.println("Запустить программу в режиме сервера или клиента? (S(erver) / C(lient))");
//		while (true) {
//			char answer = Character.toLowerCase(in.nextLine().charAt(0));
//			if (answer == 's') {
//				new Server();
//				break;
//			} else if (answer == 'c') {
//				new Client();
//				break;
//			} else {
//				System.out.println("Некорректный ввод. Повторите.");
//			}
//		}
    }

}