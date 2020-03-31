int y=75;
void setup(){
size(500,500);



}
void draw(){
y =75;
for (int i=0;i<3;i++){
  text("ice cream ", 250, y);
  y+=75;
  if (i==2){
  text("banana",250,y);
  }
}

}
