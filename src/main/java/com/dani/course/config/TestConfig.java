package com.dani.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dani.course.entities.User;
import com.dani.course.repositories.UserRepository;

@Configuration
@Profile("test") //tem que ser o mesmo nome dado no spring.profiles.active=test do application.properties
public class TestConfig implements CommandLineRunner{

	/* uso do @Autowired :
	 * o proprio Spring na hora que estiver rodando a aplicação 
	 * vai resolver essa dependencia e associar uma instacia de
	 * UserRepository dentro do userRepository
	 */
	@Autowired 
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		//salvando os dados no banco de dados
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
