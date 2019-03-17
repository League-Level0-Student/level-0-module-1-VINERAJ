import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch
void setup(){
  minim = new Minim(this);      //in the setup method
sound = minim.loadFile("pizzasound.wav");      //in the setup method
size(500,500);
fill(#AA8383);
ellipse(250,250,450,450);
}
void draw(){
  PImage pepperoni = loadImage("pepperoni.jpeg");
  pepperoni.resize(50,50);
  PImage olives = loadImage("olives.jpg");
  olives.resize(50,50);
  if(mousePressed){
    image(olives,mouseX,mouseY);
    image(pepperoni,mouseX,mouseY);
    fill(255,0,0);
ellipse(mouseX,mouseY,50,50);
fill(255,255,0);
ellipse(mouseX,mouseY,50,50);
sound.play();
sound.rewind();
  }
}