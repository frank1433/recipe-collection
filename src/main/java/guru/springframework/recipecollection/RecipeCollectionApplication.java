package guru.springframework.recipecollection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class RecipeCollectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipeCollectionApplication.class, args);
        log.debug("debug in main" );
    }

}
