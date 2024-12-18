//Author: Zara Bagai
//Date created: 12/4/24
//Overview: This class controls the properties (i.e. color, position) and actions of the paddle/paddle object in the game.
//This class also controls the paddle's velocity and ability to move



import java.awt.*;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	
	private int xPosition;
	private int yPosition;
	private int width;
	private int height;
	private int velocity;
	
	//constructor(s):
	
	Paddle(int xPos, int yPos, int w , int h){


		xPosition = xPos;
		yPosition = yPos;
		width = w;
		height = h;
		velocity = 1;

	}


	//methods:

	//getters and setters:

	public int getX(){

		return xPosition;

	}
	
	public int getY(){

	return yPosition;

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
	
	public void setX(int xpos){

		xPosition = xpos;

	}

	public void setVelocity(int velo){

		velocity = velo;

	}

	//other methods:


	//Pre-condition: none (however, for the ball's velocity to change, add should not be 0)
	//Post-condition: This method will increase or decrease the value of the velocity

	public void addVelocity(int add){

		velocity+= add;
	}


//Pre-condition: the value of velocity should not be equal to 0
//Post-condition: The paddle's velocity will be changed, which changes its position (causes the paddle to move)

	public void move(){

		
		if((xPosition<600)&&(xPosition>0)){//this line makes it so that the paddle can't move past the white border
			
			
			if(velocity>6){

				velocity-=1;
				xPosition+=velocity;


			}
			else if((velocity<0)){

				velocity+=1;
				xPosition+=velocity;
			}

		}
		else{//if the paddle reaches the border/boundary, it should move in the opposite direction
			velocity=velocity*-1;
			xPosition+=velocity;
		}
			

		

		

	}

	//Pre-condition: The input (Graphics) g cannot be null
	//Post-condition: This method draws the paddle and ensures that it appears on the correct spot and has the correct size
	//(based on the values set in the constructor)
	public void draw(Graphics g){

		g.setColor(Color.yellow);
		g.fillRect(xPosition,yPosition, width, height);
	

	}
	
}
