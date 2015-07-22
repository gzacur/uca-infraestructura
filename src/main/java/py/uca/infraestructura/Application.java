package py.uca.infraestructura;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
      String webPort = System.getenv("PORT");
      if (webPort == null || webPort.isEmpty()) {
          webPort = "8080";
      }
      System.setProperty("server.port", webPort);
      SpringApplication.run(Application.class, args);
    }

}
