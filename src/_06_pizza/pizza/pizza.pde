PImage pepperoni;
import ddf.minim.*;
Minim minim;
AudioPlayer sound;
void setup() {
  size(500, 500);
  pepperoni = loadImage("Pepperoni_Slice.jpg");
  pepperoni.resize(25, 25);
  minim = new Minim(this);
  sound = minim.loadFile("500546_waxsocks_heavy-leaser-cannon.wav");
}
void draw() {
  fill(#FADD7E);
  ellipse(75, 75, 100, 100);
  fill(#F5200C);
  ellipse(75, 75, 90, 90);
  fill(#FACB2D);
  ellipse(75, 75, 80, 80);
  image(pepperoni, 45, 45);
  image(pepperoni, 75, 75);
  if(mousePressed){
    image(pepperoni, mouseX,mouseY);
    sound.play();
    sound.rewind();
  }
}
