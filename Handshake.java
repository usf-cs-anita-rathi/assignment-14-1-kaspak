import java.util.Scanner;
public class Handshake
{
    static public int totalHandshakes(int n)
    {
        if (n<=1)
            return 0;
        return n-1 + totalHandshakes(n-1);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.println("How many people are in the room?: ");
        num = input.nextInt();
        System.out.println("There are are " + totalHandshakes(num) + " handshake(s) total.");

    }
}
