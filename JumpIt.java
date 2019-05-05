import java.util.Arrays;
import java.util.Random;

public class JumpIt
{
    static int minJumps(int[] arr)
    {
        return (minJumps(arr, 0));
    }

    static int minJumps(int[] arr, int i)
    {
        if(i>=arr.length)
            return 0;

        return arr[i] + Math.min(minJumps(arr, i+1), minJumps(arr, i+2));
    }

    public static void main(String[] args)
    {
        Random rand = new Random();

        int[] jumpIt = new int[6];
        jumpIt[0] = 0;

        for(int i=1; i<jumpIt.length; i++)
            jumpIt[i] = rand.nextInt(10);

        System.out.println(Arrays.toString(jumpIt));
        System.out.println("Total cost is: " + minJumps(jumpIt));
    }

}
