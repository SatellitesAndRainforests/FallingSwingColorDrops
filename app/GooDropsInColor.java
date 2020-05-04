package app;

import java.awt.Color;
import java.util.Random;

import app.Drop;
import app.GooDrops;

public class GooDropsInColor extends GooDrops {

	public GooDropsInColor(int w,int h,int nd) {
		super(w,h,nd);
	}

	public Drop makeDrop(int xpos, int ypos, int xvel, int yvel, int size){
		Random random = getRandom();
		Color color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
		return new ColorDrop(xpos,ypos,xvel,yvel,size,color);
	}

	public static void main(String [] args){
		int width = 800;
		int height = 500;
		int numDrops = 200;

		GooDrops gd = new GooDropsInColor(width,height,numDrops);
		gd.background(0);
		gd.frameRate(25);
		gd.smooth();
		gd.go();
	}
}
