Text text;
menuBar bar;

void setup()
{
  size(500, 800);
  text = new Text();
  bar = new menuBar();
}

int barPos = 500/4; 

void draw()
{
  background(#222222);
  bar.show();
  text.show();
 
}