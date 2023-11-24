package localhost;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaExm1Application {

	public static void main(String[] args) {
		SpringApplication.run(KafkaExm1Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, Object> kafkaTemplate){
		return args -> {
			kafkaTemplate.send("mytopic", " facebook mensaje de prueba para el topico ");
			kafkaTemplate.send("topico", " facebook youtube netflix instagram x twitch twitter kick link linkedin ");
		};
	}

/*
cd /opt/github/ooleon/kafka

bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties

//bin/kafka-console-consumer.sh --topic mytopic --from-beginning --bootstrap-server localhost:9092
 
POST:// localhost:8080/api/v1/messages 
{
    "message": "massage"
}

*/

}
