package client;

import java.awt.Graphics;

import gameModeAdvanced.Barrier;
import gameModeAdvanced.BuffEffect;
import packet.GameAdvancePacket;

public class ClientAdvancePanel extends ClientPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4286596678546631810L;
	Barrier barrier;
	Barrier barrier1;
	Barrier barrier2;
	BuffEffect effect;
	
	public ClientAdvancePanel() {
		super();	
	}
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		if(barrier!=null)
			barrier.draw(g);
		if(effect!=null)
			effect.draw(g);
		if(barrier1!=null && barrier2!=null) {
			barrier1.draw(g);
			barrier2.draw(g);
		}
		
	}
	public void updateComponents(Object packet1) {
		GameAdvancePacket packet=(GameAdvancePacket)packet1;
		paddle1.updatePaddlePositon(packet.paddle1);
		paddle2.updatePaddlePositon(packet.paddle2);
		ball.x=packet.ballx;
		ball.y=packet.bally;
		effect=packet.effect;
		if(effect!=null) {
			effect.x=packet.XYPostions[0];
			effect.y=packet.XYPostions[1];
		}
		barrier=packet.barrier;
		barrier1=packet.barrier1;
		barrier2=packet.barrier2;
		if(barrier!=null) {
			barrier.x=packet.XYPostions[2];
			barrier.y=packet.XYPostions[3];
			barrier.width=packet.XYPostions[8];
			barrier.height=packet.XYPostions[9];
		}else {
			barrier1.x=packet.XYPostions[4];
			barrier1.y=packet.XYPostions[5];
			barrier2.x=packet.XYPostions[6];
			barrier2.y=packet.XYPostions[7];
		}	
		score.player1=packet.p1Score;
		score.player2=packet.p2Score;
		checkCollision();
		repaint();
	}
	public void checkCollision() {
		super.checkCollision();
		
	}
}
