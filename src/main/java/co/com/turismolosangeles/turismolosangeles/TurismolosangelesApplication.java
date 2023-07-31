package co.com.turismolosangeles.turismolosangeles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

import io.r2dbc.spi.ConnectionFactory;

@SpringBootApplication
public class TurismolosangelesApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurismolosangelesApplication.class, args);
    }

    @Bean
    public ConnectionFactoryInitializer initializeDatabase(ConnectionFactory connectionFactory) {
        ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator(new ClassPathResource("schema.sql"));
        initializer.setDatabasePopulator(populator);
        initializer.setConnectionFactory(connectionFactory);
        return initializer;
    }
}
