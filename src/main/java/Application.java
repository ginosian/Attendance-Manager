import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Marta Ginosyan
 * Date: 10/31/17
 */

@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan("com.attendance_manager")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
