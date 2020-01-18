int circleWidth = 400;
int circleRings = 0;
int leftCircleXPosition = 1300;
int leftCircleYPosition = 300;
int rightCircleXPosition = 200;
int circleHeight = 300;
int rightCircleYPosition = 300;
int value1 = 5;
int value2 = -5;
int circleSize = 400;

void setup() {
  size(1500, 600);
  createRing();
  createRing2();
}

void draw() {
  background(#FFFFFF);
  
  // Moving Circles
  rightCircleXPosition += value1;
  createRing(); 
  leftCircleXPosition += value2;
  createRing2();
  
  // Checking right circle
  if (rightCircleXPosition == 1500) {
    value1 = -5;
  } else if (rightCircleXPosition == 0) {
    value1 = 5;
  }
  
  // Checking left Circle
  if (leftCircleXPosition == 0) {
    value2 = 5;
  } else if (leftCircleXPosition == 1500) {
    value2 = -5;
  }
  
}

void createRing( ) {

  for ( int i = 0; i < 40; i++) {
    noFill();
    ellipse(rightCircleXPosition, circleHeight, circleSize, circleSize);
    circleSize -= 10;
  }
  circleSize = 400;
}

void createRing2( ) {

  for ( int i = 0; i < 40; i++) {
    noFill();
    ellipse(leftCircleXPosition, circleHeight, circleSize, circleSize);
    circleSize -= 10;
  }
  circleSize = 400;
}
