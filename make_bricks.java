public private void main(String[] args)
{
    public boolean makeBricks(int small, int big, int goal) {
        
        int how_many_bbricks = goal/5;
        int how_many_sbricks = goal%5;
  
        if(small + 5*big == goal)
            return true;
  
        if(how_many_bbricks <= big && small >= how_many_sbricks)
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
