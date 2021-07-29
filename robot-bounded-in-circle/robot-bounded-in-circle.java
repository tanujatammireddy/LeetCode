class Solution {
    public boolean isRobotBounded(String instructions) {
        
        // From origin North is at {0,1}
        // From origin East is at {-1,0}
        // From origin West is at {0,-1}
        // From origin South is at {1,0}
          
        int[][] directions = new int[][]{{0,1},{-1,0},{0,-1},{1,0}};
        int intial_X=0, intial_Y =0; // intial position is always origin 
        int direction = 0; // This a pointer on the directions array to choose the direction of the robot which North Intially so default value is 0
        
        for(char ch:instructions.toCharArray()){
            if(ch=='L') //usually left is the west and its position in the array is 3.
                direction= (direction+3)%4;
            else if(ch=='R') //usually right is the east and its position in the array is 1.
                direction= (direction+1)%4;
            else{ //When the robot goes straight we choose the value based on direction.
                intial_X += directions[direction][0];
                intial_Y += directions[direction][1];
            }
                
            }
       //The robot has to return orgin or the direction is not north then we can say the robot is in the circle.
        return (intial_X ==0 &&  intial_Y ==0)||(direction != 0);
    }
}