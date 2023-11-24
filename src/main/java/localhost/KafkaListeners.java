package localhost;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

	
	@KafkaListener(topics = "mytopic", groupId = "groupId")
	void listenersMytopic(String data){
		System.out.println("listener: " + data + " ");
	}

	@KafkaListener(topics = "topico", groupId = "groupId")
	void listenerstopico(String data){
		System.out.println("listener: " + data + " ");
	}
}
