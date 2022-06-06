import java.util.Scanner;


public class River
{
    private int pollutionLevel = 0;
    private int population = 0;
    private int swimability = 0;

    public int setWidth()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how wide do you want your the river?");
        int width = scanner.nextInt();
        return width;
    }

    public int getLength()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how long do you want the river to be?");
        int length = scanner.nextInt();
        return length;
    }

    public int getSpeed()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how fast is your river traveling?");
        int speed = scanner.nextInt();
        return speed;
    }

    public boolean isFish()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are there fish in your river, type yes or no");
        String answer = scanner.nextLine();
        boolean fishYN = false;
        if(answer.equalsIgnoreCase("yes"))
        {
            fishYN = true;
        }

        if(answer.equalsIgnoreCase("no"))
        {
            fishYN = false;
        }

        return fishYN;
    }

    public int population()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many thousand people ive in the area of your river?");
        population = scanner.nextInt();
        return population;
        
    }

    public void swimability()
    {
      for(int i = 0; i < population; i++)
      {
          swimability++;
      }
    }

    public void checkPollution()
    {
        if(swimability >= 10)
        {
            for(int i = pollutionLevel; i > 0; i--) //The shark uses all of its energy to attack different humans
            {
            System.out.println("this river is not safe to swim in");
            }
        }
        else
        {
            System.out.println("This river is safe enough to swim in");
        }
    }

    public static void main(String[] args)
    {
        River coloradoRiver = new River();
        int width = coloradoRiver.setWidth();
        int length = coloradoRiver.getLength();
        int speed = coloradoRiver.getSpeed();
        int population = coloradoRiver.population();
        boolean fishYN = coloradoRiver.isFish();
        System.out.println("the river is " + width + " feet wide, and is " + length + " miles long. The river is also traveling at " + speed + "Miles per hour and it is " + fishYN + " that there are fish in the river. Also there are " + population + "thousand people that live near the river.");
        coloradoRiver.checkPollution();
    }
}
