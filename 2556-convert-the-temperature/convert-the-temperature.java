class Solution 
{
    public double[] convertTemperature(double celsius) 
    {
        double[] temp = new double[2];

        // Manually add
        double kelvin = celsius + 273.15;

        double fahrenheit = (celsius * 1.80) + 32.00;

        // Manually convert
        temp[0] = kelvin;

        temp[1] = fahrenheit;

        return temp;
        
    }
}