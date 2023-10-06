public private void main(String[] args)
{
    public boolean makeBricks(int small, int big, int goal) {
        
        int howManyBigBricks = goal/5;
        int howManySmallBricks = goal%5;
  
        if(small + 5*big == goal)
            return true;
  
        if(howManyBigBricks <= big && small >= howManySmallBricks)
            return true;
  
        if(Math.abs(goal-5*big) < small)
        {
            if(5*big > goal)
                return false;
            
            return true;
        }
        
        return false;

    }
}
