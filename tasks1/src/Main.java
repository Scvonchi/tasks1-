import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = 0,b = 0;

        System.out.println("Task 1| "+ reminder(7,4));
        //a = in.nextInt();
        //b = in.nextInt();
        System.out.println("Task 2| " + triarea(7,4));
        System.out.println("Task 3| " + animals(2,3,5));
        System.out.println("Task 4| " + profittablegamble(0.2,50,9));
        System.out.println("Task 5| " + operation(24,15,9));
        System.out.println("Task 6| " + ctoa('A'));
        System.out.println("Task 7| " + addUpTo(7));
        System.out.println("Task 8| " + nextEdge(8,10));
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 9;
        System.out.println("Task 9| " + sumofCubes(arr));
        System.out.println("Task 10| " + abcmath(1,2,3));
    }
    public static int reminder(int a, int b)
    {
        return a%b;
    }
    public static double triarea(int a, int b)
    {
        return (a*b)/2;
    }
    public static int animals(int a, int b, int c)
    {
        return (a*2)+(b*4)+(c*4);
    }
    public static boolean profittablegamble(double prob, double prize, double pay)
    {
        if(prob*prize > pay)
            return true;
        else
            return false;
    }
    public static String operation( int n, int a, int b)
    {
        String s = "";
        if(a+b == n)
            s = "added";
        else if(a-b == n)
            s = "vichteni";
        else if(a*b == n)
            s = "umnozheni";
        else if(a/b == n)
            s = "razdeleni";
        else s = "none";
        return s;
    }
    public static int ctoa(char a)
    {
        return (int)a;
    }
    public static int addUpTo(int a)
    {
        int rez = 0;
        for(int i=1; i <= a; i++)
            rez+=i;
        return rez;
    }
    public static int nextEdge(int a, int b)
    {
        return a+b-1;
    }
    public static int sumofCubes(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i <= arr.length-1; i++)
            sum += pow(arr[i],3);
        return sum;
    }
    public static boolean abcmath(int a,int b,int c)
    {
        for(int i = 0; i<=b; i++)
        {
            a+=a;
        }
        if(a%c == 0)
            return true;
        else
            return false;
    }
}