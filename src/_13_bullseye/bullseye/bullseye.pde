int circleWidth = 400;
int circleHeight = 400;
int circleRings = 0;

void setup(){
size(600,600);
noStroke();
}

void draw(){
  
  if( circleRings < 40){
       if (circleRings % 2 == 0 ) {
         fill(#050505);
        } 
        else {
         fill(#FA0505); 
        }
        ellipse(300,300,circleWidth -= 10,circleHeight -= 10);
        circleRings++;
  }
  
 
    
 /** 
for (int i = 1; i < 9; i++){
        if (i % 2 == 0 ) {
       fill(#050505);
      } else {
       fill(#FA0505); 
      }
    ellipse(300,300,circleWidth += 5,circleHeight += 5);
}**/
}
