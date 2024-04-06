package com.application.learnspring;

import com.application.learnspring.game.GameRunner;
import com.application.learnspring.game.MarioGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LearnSpringApplication.class, args);
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
