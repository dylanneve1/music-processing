class menuBar
{

  void show()
  {
    fill(#444442);
    //noStroke();
    rect(0, 730, 600, 100);
    line(barPos, 730, barPos, 800);
    line(barPos*2, 730, barPos*2, 800);
    line(barPos*3, 730, barPos*3, 800);
    text.show();
  }
}