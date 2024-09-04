package server;

import com.sun.net.httpserver.SimpleFileServer;

import java.net.InetSocketAddress;
import java.nio.file.Path;
import java.util.Objects;

public class ServerMain {

    public static void main(String[] args) {
//        var server = SimpleFileServer.createFileServer(new InetSocketAddress(8080),
//                Path.of("").toAbsolutePath(),
//                SimpleFileServer.OutputLevel.INFO);
//        server.start();

        System.out.println(Objects.toIdentityString("hello"));

    }
}
