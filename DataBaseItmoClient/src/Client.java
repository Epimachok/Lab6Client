import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;


public class Client {
    /* Порт сервера, к которому собирается
  подключиться клиентский сокет */
    public final static int SERVICE_PORT = 50001;

    public static void main(String[] args) throws IOException {
        ConsoleManager cm = new ConsoleManager();
        cm.startInteractiveMode();

    }
}