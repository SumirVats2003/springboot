package com.application.learnspring;

import com.application.learnspring.enterprise.example.MyWebController;
import com.application.learnspring.game.GameRunner;
import com.application.learnspring.game.GamingConsole;
import com.application.learnspring.game.MarioGame;
import com.application.learnspring.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringApplication.class, args);
		// The above line creates an application context

		// GamingConsole marioGame = new MarioGame(); // reference of a superclass = object of a subclass
		// GamingConsole superContraGame = new SuperContraGame(); // reference of a superclass = object of a subclass
		// GameRunner runner = new GameRunner(marioGame);
		// GameRunner runner = new GameRunner(superContraGame);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
