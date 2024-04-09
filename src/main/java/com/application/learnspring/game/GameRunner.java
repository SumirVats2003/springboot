package com.application.learnspring.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game; // reference of a superclass = object of a subclass
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
