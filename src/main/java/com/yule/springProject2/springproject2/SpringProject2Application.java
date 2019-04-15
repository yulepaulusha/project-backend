package com.yule.springProject2.springproject2;

import com.yule.springProject2.springproject2.model.User;
import com.yule.springProject2.springproject2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.jws.soap.SOAPBinding;

@SpringBootApplication
public class SpringProject2Application implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringProject2Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		userRepository.save(new User("yule", "derik"));
		userRepository.save(new User("yule2", "derik2"));
		userRepository.save(new User("yule3", "derik3"));
	}
}
