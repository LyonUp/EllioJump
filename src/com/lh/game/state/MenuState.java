package com.lh.game.state;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.lh.game.main.Resources;

public class MenuState extends State {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Entered MenuState");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Resources.welcome, 0, 0, null);
	}

	@Override
	public void onClick(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onKeyPrewss(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onKeyRelease(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
