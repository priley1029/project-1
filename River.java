import java.util.Scanner;


public class River
{


    public static int setWidth()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how wide do you want your the river?");
        int width = scanner.nextInt();
        return width;
    }

    public static int getLength()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how long do you want the river to be?");
        int length = scanner.nextInt();
        return length;
    }

    public static int getSpeed()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how fast is your river traveling?");
        int speed = scanner.nextInt();
        return speed;
    }

    public static boolean isFish()
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

    public static void main(String[] args)
    {
        int width = setWidth();
        int length = getLength();
        int speed = getSpeed();
        boolean fishYN = isFish();
        System.out.println("the river is " + width + " feet wide, and is " + length + " miles long. The river is also traveling at " + speed + "Miles per hour and it is " + fishYN + " that there are fish in the river.");
    }
}
