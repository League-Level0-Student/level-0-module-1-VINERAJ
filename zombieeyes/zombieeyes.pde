void setup(){
  size(500,500);
  PImage face = loadImage("PeppaPigFace.jpg");
  face.resize(500,500);
  image(face,0,0);
}

void draw(){
  fill(mouseX,mouseY,0);
  ellipse(154,148,50,50);
  ellipse(213,148,50,50);
  fill(#050505);
  ellipse(159,148,25,25);
  ellipse(218,148,25,25);
  
}