package com.sidneygitteau.queensgameremake;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.sidneygitteau.queensgameremake.QueensGameRemake;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("QueensGame");
		config.setWindowedMode(QueensGameRemake.WIDTH, QueensGameRemake.HEIGHT);
		config.setTitle(QueensGameRemake.TITLE);
		new Lwjgl3Application(new QueensGameRemake(), config);
	}
}
