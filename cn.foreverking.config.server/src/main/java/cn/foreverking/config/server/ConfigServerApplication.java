package cn.foreverking.config.server;

import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@SpringCloudApplication
@EnableConfigServer
public class ConfigServerApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
