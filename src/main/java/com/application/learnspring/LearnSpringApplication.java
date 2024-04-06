package com.application.learnspring;

import com.application.learnspring.game.GameRunner;
import com.application.learnspring.game.MarioGame;
import com.application.learnspring.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LearnSpringApplication.class, args);
		MarioGame marioGame = new MarioGame();
		SuperContraGame superContraGame = new SuperContraGame();
		// GameRunner runner = new GameRunner(marioGame);
		GameRunner runner = new GameRunner(superContraGame);
		runner.run();
	}

}
