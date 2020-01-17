int circleWidth = 400;
int circleRings = 0;
int leftCircleX = 300;
int leftCircleY = 300;
int rightCircleXPosition = 200;
int circleHeight = 300;
int rightCircleYPosition = 300;
int value = 5;
int circleSize = 400;

void setup(){
size(1500,600);
createRing();

}

void draw(){
 background(1);
 rightCircleXPosition += 1;
 createRing(); 
}

void createRing( ){
  
 for( int i = 0; i < 40; i++){
   ellipse(rightCircleXPosition, circleHeight, circleSize, circleSize);
   circleSize -= 10;
 }
 circleSize = 400;
   
   
}
  
