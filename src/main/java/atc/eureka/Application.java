package atc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Start the Eureka service registry.
 */
@SpringBootApplication
@EnableEurekaServer
public class Application
{
    public static void main ( final String[] args )
    {
        SpringApplication.run( Application.class, args );
    }
}
