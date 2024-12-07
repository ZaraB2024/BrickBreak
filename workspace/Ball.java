//Author: Zara Bagai
//Date created: 12/4/24
//Overview: This class controls the properties and actions of the ball in the game (ball object).
//(This class also controls things such as the ball's position and velocity)

import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:

	private int xPos;
	private int yPos;
	private int size;
	private int xVelocity;
	private int yVelocity;

	//constructor(s):

	Ball(int xPos, int yPos, int size){

     xVelocity = 1;
	 yVelocity = 1;
	 this.xPos = xPos;
	 this.yPos = yPos;
	 this.size = size;

	}

	//methods:

	//getters and setters:

	public int getYpos(){

		return yPos;
	}

	public int getXpos(){

		return xPos;

	}

	public int getSize(){

		return size;

	}

	public void setXVelocity(int xvel){ 

		xVelocity = xvel;
		 
		
	}

	public void setYVelocity(int yvel){

		yVelocity = yvel;

	}


	public void setX(int xval) {

		xPos = xval;


	}

	public void setY(int yval){

		yPos = yval;

	}

//other methods:



//Pre-condition: The horizontal (x) velocity is not equal to 0
//Post-condition: The horizontal velocity will be the opposite sign (+ or -), causing the ball to move in the opposite X direction 
//when it collides with the wall/bricks

public void reverseX(){

	xVelocity= -1*(xVelocity); 

}

//Pre-condition: The vertical (y) velocity is not equal to 0
//Post-condition: The vertical velocity will be the opposite sign (+ or -), causing the ball to move in the opposite Y direction
//when it collides with the wall/bricks
public void reverseY(){

	yVelocity = -1*(yVelocity);

}

//Pre-condition: the xVelocity and yVelocity should not be equal to 0
//Post-condition: The ball's position will be changed by adding the value of the x or y velocities
//to the xPos and yPos respectively - (this causes the ball to move)

public void move(){

	
	xPos+=xVelocity;
	yPos+=yVelocity;

}

//Pre-condition: The input (Graphics) g cannot be null
//Post-condition: This method creates and draws the ball by setting its color and drawing an oval with the appropriate size
// (at the coordinates designated by the constructor values)

public void draw(Graphics g){

g.setColor(Color.blue);
g.fillOval(xPos,yPos, size, size);
	

}



}
