package com.lh.game.state;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.lh.game.main.Resources;

public class LoadState extends State {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		Resources.load();
		System.out.println("Loaded Successfully!");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		setCurrentState(new MenuState());
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub

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
