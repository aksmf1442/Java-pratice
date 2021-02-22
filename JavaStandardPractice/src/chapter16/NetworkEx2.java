package chapter16;

import java.io.IOException;
import java.net.URL;

public class NetworkEx2 {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.codechobo.com:80/sampe/"
            + "hello.html?referer=codechobo#index1");
        System.out.println("url.getAuthority():"+url.getAuthority());
        System.out.println("url.getContent() :" + url.getContent());
    }
}
