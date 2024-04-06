package com.application.learnspring.game;

public class GameRunner {
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
