import java.awt.Color;
import java.lang.Object;
import java.util.Random;
public class TurtleWorld
{
    public static void main(String args[])throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle tortoise = new Turtle(turtleWorld);
        Turtle seaturtle = new Turtle(turtleWorld);
        Turtle salamander = new Turtle(turtleWorld);
        salamander.setPenColor(Color.ORANGE);
        turtle.setPenColor(Color.RED);
        tortoise.setPenColor(Color.BLUE);
        seaturtle.setPenColor(Color.GREEN);
        salamander.penDown();
        tortoise.penDown();
        seaturtle.penDown();
        turtle.penDown();
        int ctr1 = 1;
        int val1 = 250;
        int ctr2 = 1; 
        int val2 = 1; 
        int ctr3 = 1;
        int val3 = 10;
        while (ctr1<29)
        {       turtle.turnLeft();
            turtle.forward(val1);
            tortoise.turnRight();
            tortoise.forward(val1);
            seaturtle.forward(val1);
            seaturtle.turnRight();
            salamander.forward(val1);
            salamander.turnLeft();
            Thread.sleep(500);
            val1 -= 10;
            ctr1 += 1;
            if (ctr1==10)
            {
                turtle.setPenColor(Color.ORANGE);
                tortoise.setPenColor(Color.GREEN);
                seaturtle.setPenColor(Color.RED);
                salamander.setPenColor(Color.BLUE);
            }
            if (ctr1==18)
            {
                turtle.setPenColor(Color.GREEN);
                tortoise.setPenColor(Color.ORANGE);
                salamander.setPenColor(Color.RED);
                seaturtle.setPenColor(Color.BLUE);
            }
            
        }
        while (ctr3 == 1)
        {
            turtle.penUp();
            turtle.turnLeft();
            turtle.forward(val3);
            tortoise.penUp();
            tortoise.turnLeft();
            tortoise.forward(val3);
            salamander.penUp();
            salamander.turnLeft();
            salamander.forward(val3);
            seaturtle.penUp();
            seaturtle.turnLeft();
            seaturtle.forward(val3);
            Thread.sleep(500);
            val3 += 10;
        }
    }
}