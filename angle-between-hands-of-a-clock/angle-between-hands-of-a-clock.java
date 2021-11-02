class Solution {
    public double angleClock(int hour, int minutes) {
        /*Hours hand
        60 min - 30
        1 min - 0.5 */
        
        /*Minutes hand
        60 min - 360
        1 min - 6 */
        
        double hour_angle = 0;
        double minutes_angle = 0;
        double angle = 0;
        if(hour_angle != 12)
            hour_angle = hour* 30;
        if(minutes > 0)
        {
            hour_angle = hour_angle + minutes* 0.5;
            minutes_angle = minutes* 6;
        }
        angle = Math.abs(hour_angle-minutes_angle);
        
        return Math.min(angle,360-angle);
        
         
    }
}