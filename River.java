public class River
{
    
    private boolean fish;

    public River(int w, int l, double sp, boolean f)
    {
        fish = f;
        
    }

    public static void main(String[] args) 
    {
      River river1 = new River();
      river1.getLength(length);
      river1.getWidth(width);
      river1.getSpeed(speed);
      river1.isFish();
    }

    public int getWidth(int width)
    {
        System.out.print("the river is " + width + " feet wide, ");
        return width;
    }

    public int getLength(int length)
    {
        System.out.print(length + " feet long, ");
        return length;
    }

    public double getSpeed(double speed)
    {
        System.out.print("is moving at " + speed + " mph, ");
        return speed;
    }

    public String isFish()
    {
        if(fish == true)
        {
            System.out.print("and there are fish in the river");
        }
        else
        {
            System.out.print("and there are no fish in the river");
        }
        return null;
    }
}
