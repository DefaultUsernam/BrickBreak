//
//  Class author:  Ulises Cantor
//  Date created:  12/4/2024
//  General description: Creates a ball object that moves bounces off of the walls, bricks, and paddle on the program. 
//


import java.awt.*;

public class Ball {
	//your code here!


	//don't forget you need instance variables:
    private int y;
    private int x;
    private int radius;
    private int yVelocity;
    private int xVelocity;

	
	//constructor(s):
	public Ball(int nx, int ny, int r){
		this.x = nx;
		this.y = ny;
		this.radius = r;
	}
	//methods:
	
    public int getYpos(){
		return y;
	}
    public int getXpos(){
		return x;
	}
    public int getSize(){
		return radius;
	}
	//  Pre-condition: yVelocity is not 0
	//  Post-condition: Reverses velocity of the ball's y direction by multiplying the velocity by -1
    public void reverseY(){
		yVelocity *= -1;
	}
    public void setXVelocity(int veloX){
		xVelocity = veloX;
	}
	//  Pre-condition: xVelocity is not 0
	//  Post-condition: Reverses velocity of the ball's x direction, changes the sign from + to - or vise versa
    public void reverseX(){
		xVelocity *= -1;
	}
    public void setX(int newerX){
		x = newerX;
	}
	//  Pre-condition: Technically, the ball x and y shouldn't be off screen (unless the player loses) or inside the confines of another object, but it doesn't matter it will run regardless. 
	//  If the velocities of either x or y coordinates are 0, the ball won't move in that respective direction at all
	//  Post-condition: x and y coordinate change by their respective velocity amounts
    public void move(){
		x += xVelocity;
		y += yVelocity;
	}
    public void setY(int newerY){
		y = newerY;
	}
    public void setYVelocity(int veloY){
		yVelocity = veloY;
	}
	//  Pre-condition: Valid graphics input
	//  Post-condition: Applies a color to the ball
	public void draw(Graphics g){
		g.fillOval(x, y, radius, radius);
	}
	
	
}
