class ParkingSystem 
{
    public int big;

    public int medium;

    public int small;
    
    
    public ParkingSystem(int big, int medium, int small) 
    {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) 
    {
        // Check the car type and then check if big, medium, or small is zero aka no room left
        if (carType == 1)
        {
            if (big > 0)
            {
                big--;
                return true;
            }
        }

        if (carType == 2)
        {
            if (medium > 0)
            {
                medium--;
                return true;
            }
        }

        if (carType == 3)
        {
            if (small > 0)
            {
                small--;
                return true;
            }

        }

        return false;
        
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */