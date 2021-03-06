package external.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Value("${ec2.public.url:not set}")
    private String publicUrl;

    @Value("${DB_URL:not set}")
    private String dbUrl;

    @Value("${api.key}")
    private String apiKey;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Public url: " + publicUrl);
        System.out.println("Db url: " + dbUrl);
        System.out.println("Api key: " + apiKey);
    }
}
