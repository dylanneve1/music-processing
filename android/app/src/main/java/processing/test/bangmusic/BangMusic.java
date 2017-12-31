package processing.test.bangmusic;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class BangMusic extends PApplet {

Text text;
menuBar bar;

public void setup()
{
  
  text = new Text();
  bar = new menuBar();
}

int barPos = 500/4; 

public void draw()
{
  background(0xff222222);
  bar.show();
  text.show();
 
}
class Text
{

  public void show()
  {
    fill(0);
    rect(0, 0, 500, 50);
    textAlign(CENTER);
    fill(255);
    textSize(20);
    text("The Bang Project", 250, 30);
  }
}
class menuBar
{

  public void show()
  {
    fill(0xff444442);
    //noStroke();
    rect(0, 730, 600, 100);
    line(barPos, 730, barPos, 800);
    line(barPos*2, 730, barPos*2, 800);
    line(barPos*3, 730, barPos*3, 800);
    text.show();
  }
}
  public void settings() {  size(500, 800); }
}
