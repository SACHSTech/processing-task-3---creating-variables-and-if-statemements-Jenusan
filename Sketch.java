import processing.core.PApplet;

/**
 * a program Sketch.java that randomizes where a flower shows up on a screen, and changes the color of its petals and the backroound color 
 * based on the location of the flower 
 * @author: Jenusan Yogarajah 
 */

public class Sketch extends PApplet {
  // Initializing variables
  float fltPistalX;
  float fltPistalY;
  int intHours;
  int intMins;
  int intTwelveHour;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // Setting size of screen
    size(1000, 1000);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // Randomize placement of flower
    fltPistalX = random(0, width);
    fltPistalY = random(0, height);

    // Change color of backround to green if flower is in any of the corners, if anywhere else make backround blue
    if ((fltPistalX < (width / 3) && fltPistalY < (height / 3)) || (width * 2 / 3 < fltPistalX && height / 3 > fltPistalY) || (fltPistalX < width / 3 && fltPistalY > height * 2 / 3) || (width * 2 / 3 < fltPistalX && fltPistalY > height * 2 / 3)){
      background(144, 238, 144);
    }
    else{
      background(51, 204, 255);
    }
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // convert time from military time to 12 hour time 
    intHours = hour();
    intMins = minute();
    if (intHours > 12){
      intTwelveHour = intHours - 12;
    }
    else{
      intTwelveHour = intHours;
    }
      
    // separate boxes on screeen 
    line(width / 3, 0, width / 3, height);
    line(width * 2 / 3, 0, width * 2 / 3, height);
    line(0, height / 3, width, height / 3);
    line(0, height * 2 / 3, width, height * 2 / 3);

    if (fltPistalX < (width / 3) && fltPistalY < (height / 3)){
      //if pistal is placed in 1st box, flower will be red
      fill(255, 0, 0);
      ellipse(fltPistalX, fltPistalY, width / 4 , width / 10);
      fill(255, 0, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 4);
      fill(255, 255, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 10);

    } else if(width / 3 < fltPistalX && (fltPistalX < width * 2 / 3) && fltPistalY < (height / 3)){
      //if pistal is placed in 2nd box, flower will be orange 
      fill(255, 153, 0);
      ellipse(fltPistalX, fltPistalY, width / 4 , width / 10);
      fill(255, 153, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 4);
      fill(255, 255, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 10);

    } else if(width * 2 / 3 < fltPistalX && height / 3 > fltPistalY){
      // if pistal is placed in 3rd box flower will be Purple
      fill(102, 0, 153);
      ellipse(fltPistalX, fltPistalY, width / 4 , width / 10);
      fill(102, 0, 153);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 4);
      fill(255, 255, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 10);

    } else if (fltPistalX < width / 3 && fltPistalY > height / 3 && fltPistalY < height * 2 / 3){
      // if pistal is placed in 4th box flower will be light blue
      fill(51, 153, 255);
      ellipse(fltPistalX, fltPistalY, width / 4 , width / 10);
      fill(51, 153, 255);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 4);
      fill(255, 255, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 10);

    } else if(width / 3 < fltPistalX && (fltPistalX < width * 2 / 3) && fltPistalY > (height / 3) && fltPistalY < height * 2 / 3){
      // if pistal is placed in 5th box flower will be brown
      fill(153, 102, 0);
      ellipse(fltPistalX, fltPistalY, width / 4 , width / 10);
      fill(153, 102, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 4);
      fill(255, 255, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 10);

    } else if(width * 2 / 3 < fltPistalX && height / 3 < fltPistalY && fltPistalY < height * 2 / 3){
      // if pistal is placed in 6th box flower will be green
      fill(0, 204, 0);
      ellipse(fltPistalX, fltPistalY, width / 4 , width / 10);
      fill(0, 204, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 4);
      fill(255, 255, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 10);

    } else if(fltPistalX < width / 3 && fltPistalY > height * 2 / 3){
      // if pistal is placed in 7th box flower will be white
      fill(255, 255, 204);
      ellipse(fltPistalX, fltPistalY, width / 4 , width / 10);
      fill(255, 255, 204);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 4);
      fill(255, 255, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 10);

    } else if(width / 3 < fltPistalX && (fltPistalX < width * 2 / 3) && fltPistalY > height * 2 / 3){
      // if pistal is placed in 8th box flower will be Dark red
      fill(153, 0, 0);
      ellipse(fltPistalX, fltPistalY, width / 4 , width / 10);
      fill(153, 0, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 4);
      fill(255, 255, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 10);

    } else if(width * 2 / 3 < fltPistalX && fltPistalY > height * 2 / 3){
      // if pistal is placed in 9th box flower will be grey
      fill(153, 153, 153);
      ellipse(fltPistalX, fltPistalY, width / 4 , width / 10);
      fill(153, 153, 153);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 4);
      fill(255, 255, 0);
      ellipse(fltPistalX, fltPistalY, width / 10 , width / 10);
    }

    // Cast time into a string, check if its refering to AM or PM time, and print it on the middle of the flower 
    String strMins = str(intMins);
    if (!(intHours > 12)){
      fill(0,0,0);
      text((intTwelveHour + ":" + strMins + " AM"), fltPistalX, fltPistalY);
    }
    else{
      fill(0,0,0);
      text((intTwelveHour + ":" +  strMins + " PM"), fltPistalX, fltPistalY);
    }
    }
  }