import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.print("URL: ");
    String url = new Scanner(System.in).nextLine();
    String[] parsedUrl = url.split("://");
    String protocol = parsedUrl[0];
    String host = parsedUrl[1];

    int port = protocol.equals("https") ? 443 : 80;
    InetAddress inetAddress = InetAddress.getByName(host);
    Socket socket = new Socket(inetAddress, port);

    System.out.println("TCP Connection : " + inetAddress.getHostAddress());
    System.out.println(System.lineSeparator());

    PrintWriter pw = new PrintWriter(socket.getOutputStream());
    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    // Request
    pw.println("GET / HTTP/1.1");
    pw.println("Host: " + host);
    pw.println();
    pw.flush();

    // Response
    String line;
    while (!(line = br.readLine()).contains("</html>")) {
      System.out.println(line);
    }

    pw.close();
    br.close();
    socket.close();
  }
}
