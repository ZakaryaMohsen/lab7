import functional_classes.Server;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;


public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        String url = "jdbc:postgresql://localhost:5432/studs";
        String user = "s343430";
        String password = "yq2BBWjkOWQrDzab";
//        String url = args[0];
//        String user = args[1];
//        String password = args[2];
        Properties properties = new Properties();
        properties.setProperty("url", url);
        properties.setProperty("user", user);
        properties.setProperty("password", password);

        Server server = new Server(properties);
        server.serverStartup();
    }
}