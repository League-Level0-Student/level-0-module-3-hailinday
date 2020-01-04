int circleWidth = 400;
int circleHeight = 400;
int circleRings = 0;
int leftCircleX = 300;
int leftCircleY = 300;
int rightCircleX = 1200;
int rightCircleY = 300;
void setup(){
size(1500,600);
noStroke();
noFill();
}

void draw(){
  
  if( circleRings < 40){
       if (circleRings % 2 == 0 ) {
         fill(#050505);
        } 
        else {
         fill(#FA0505); 
        }
     
        ellipse(leftCircleX,leftCircleY,circleWidth -= 5,circleHeight -= 5);
        ellipse(rightCircleX,rightCircleY,circleWidth -= 5,circleHeight -= 5);
        circleRings++;
        leftCircleX++;
        rightCircleX--;
  }
}
