package com.lh.game.state;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.lh.game.main.GameMain;
import com.lh.game.state.PlayState;
import com.lh.game.main.Resources;

public class MenuState extends State {

	private int currentSelection =0 ;
	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Entered MenuState");
	}

	@Override
	public void update(float delta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Resources.welcome, 0, 0, null);
		if(currentSelection ==0 ){
			g.drawImage(Resources.selector, 335, 241, null);
		}else{
			g.drawImage(Resources.selector, 335, 291, null);
		}
	}

	@Override
	public void onClick(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("mouse clicked!");
	}

	@Override
	public void onKeyPress(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("key Pressed!");
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_SPACE || key == KeyEvent.VK_ENTER) {
			if (currentSelection == 0) {
				setCurrentState(new PlayState());
			} else if (currentSelection == 1) {
				GameMain.sGame.exit();
			}
		} else if (key == KeyEvent.VK_UP) {
			currentSelection = 0;
		} else if (key == KeyEvent.VK_DOWN) {
			currentSelection = 1;
		}

	}

	@Override
	public void onKeyRelease(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("key Released!");
	}

}
