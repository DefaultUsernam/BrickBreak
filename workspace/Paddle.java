//
//  Class author:  Ulises Cantor
//  Date created:  12/4/2024
//  General description: Creates a paddle object that represents the player, which reflects the ball sprite upon collision and can be moved left and right.
//


import java.awt.Graphics;
import java.awt.*;

public class Paddle {

	

	//your code here!
	
	//don't forget you need instance variables:
	private int width;
    private int height;
    private int x;
    private int y;
    private int velocity;

	//constructor(s):
	public Paddle(int nx, int ny, int w, int h) {
		this.width = w;
		this.height = h;
		this.x = nx;
		this.y = ny;
	}

	//methods:

    public int getY(){
		return y;
	}
    public int getX(){
		return x;
	}
    public int getWidth(){
		return width;
	}
    public int getHeight(){
		return height;
	}
    public int getVelocity(){
		return velocity;
	}
	//  Pre-condition: Will run no matter what, just won't do anything if velocity is 0.
	//  Post-condition: Shifts the x coordinate of the paddle in intervals of the velocity amount
    public void move(){
		x += velocity;
	}
	//  Pre-condition: Not null (or 0 because that wouldn't change anything)
	//  Post-condition: Changes the velocity amount by the input integer
    public void addVelocity(int plusVelo){
	
		velocity += plusVelo;
		if (velocity>20){
			velocity = 20;
		}
		else if (velocity < -20){
			velocity = -20;
		}

	}
	public void setX(int newestX){
		x = newestX;
	}
	public void setVelocity(int newestVelo){
		velocity = newestVelo;
	}
	//  Pre-condition: Valid graphics input
	//  Post-condition: Applies a color to the ball
    public void draw(Graphics g){
		g.fillRect(x, y, width, height);
	}

	
	
}
