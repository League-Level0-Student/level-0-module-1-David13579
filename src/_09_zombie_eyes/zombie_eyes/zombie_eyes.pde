
void setup() {
  size(600,450);
}
void draw() {
  PImage face = loadImage("610356-gettyimages-1018078858.jpg");
  face.resize(600, 450);
  image(face, 0, 0);
  fill(mouseX,mouseY,255);
  ellipse(255,181,30,40);
  ellipse(369,181,30,40);
  fill(#000000);
  ellipse(255,181,10,35);
  ellipse(369,181,10,35);
  

}
