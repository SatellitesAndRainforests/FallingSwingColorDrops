package app;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Drop {
	int xpos,ypos,xvel,yvel,size;
	Random r;

	public Drop(int x,int y,int vx, int vy,int sz) {
		xpos = x;
		ypos = y;
		xvel = vx;
		yvel = vy;
		size = sz;
		r = new Random();
	}

	public void move(int width, int height){
		xpos = xpos + xvel;
		ypos = ypos + yvel;

		if (ypos > height) {
			ypos = 0;
			xpos = r.nextInt(width);
		}
	}

	public void draw(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillOval(xpos, ypos, size, size);
	}
}
