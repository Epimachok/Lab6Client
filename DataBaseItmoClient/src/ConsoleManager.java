import Comand.ComandDo;
import Comand.utils.ComandReader;
import Objects.*;

import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

/**
     * Класс управления консолью и регистрацией команд.
     */
    class ConsoleManager {
    public final static int SERVICE_PORT_1=50001;
    public final static int SERVICE_PORT_2=50002;

    public ConsoleManager() {
    }

    void startInteractiveMode() throws IOException {
        ComandDo CD = new ComandDo();
        ComandReader CR = new ComandReader();
        DatagramSocket clientSocket = new DatagramSocket();
        clientSocket.setSoTimeout(200);
        DatagramChannel dc = DatagramChannel.open();
        InetAddress IPAddress = InetAddress.getByName("localhost");
        SocketAddress addr = new InetSocketAddress(IPAddress, SERVICE_PORT_1);
        byte[] sendingDataBuffer;
        byte[] receivingDataBuffer;
        byte[] bytes;
        ByteBuffer buf;
        AnsObject receivedData;
        int trys = 0;
        DatagramPacket sending;
        DatagramPacket receving;
        int x = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            SendOdject so = new SendOdject();
            while (scanner.hasNextLine()) {
                so = CD.doing(CR.read(scanner.nextLine()));
                if (so.getisok()) {
                    sendingDataBuffer = new byte[65536];
                    receivingDataBuffer = new byte[65536];
                    if (x==0){
                        x=1;
                        sendingDataBuffer = "Connect".getBytes();
                    }
                    else if (so.getComand().equals("exit")){
                        sendingDataBuffer = "Disc".getBytes();
                    }
                    else{
                        sendingDataBuffer = "Request".getBytes();
                    }
                    trys = 0;
                    while (trys<10){
                        sending = new DatagramPacket(sendingDataBuffer, sendingDataBuffer.length, IPAddress, SERVICE_PORT_2);
                        clientSocket.send(sending);
                        if (so.getComand().equals("exit")){
                            System.exit(0);
                        }
                        receving = new DatagramPacket(sendingDataBuffer, sendingDataBuffer.length, IPAddress, SERVICE_PORT_2);
                        try {
                            clientSocket.receive(receving);
                            break;
                        }
                        catch (SocketTimeoutException e){
                            trys+=1;
                        }
                    }
                    if (trys<10){
                        ByteArrayOutputStream outstream = new ByteArrayOutputStream();
                        ObjectOutputStream objoutstream = new ObjectOutputStream(outstream);
                        objoutstream.writeObject(so);
                        sendingDataBuffer = outstream.toByteArray();
                        buf = ByteBuffer.wrap(sendingDataBuffer);
                        dc.send(buf, addr);
                        buf.clear();
                        receving = new DatagramPacket(sendingDataBuffer, sendingDataBuffer.length, IPAddress, SERVICE_PORT_2);
                        try {
                            clientSocket.receive(receving);
                        }
                        catch (SocketTimeoutException e){
                            System.out.println("Sorry! Server is not available now");
                            continue;
                        }
                        buf = ByteBuffer.wrap(receivingDataBuffer);
                        dc.receive(buf);
                        buf.flip();
                        bytes = new byte[buf.limit()];
                        buf.get(bytes, 0, buf.limit());
                        buf.clear();
                        ByteArrayInputStream instream = new ByteArrayInputStream(bytes);
                        ObjectInputStream objinstream = new ObjectInputStream(instream);
                        try {
                            receivedData = (AnsObject) objinstream.readObject();
                            for (String i: receivedData.getAns()){
                                System.out.println(i);
                            }
                        }
                        catch (java.lang.ClassNotFoundException e){}
                        clientSocket.close();
                        clientSocket = new DatagramSocket();

                    }
                    else {
                        System.out.println("Sorry! Server is not available now");
                        continue;
                    }
                }
            }
        }
    }
}


