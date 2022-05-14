package edu.ucr.cs.cs167.ashir025;

public class AppA
{
    //Part II
    //printing Even
    public static void printEvenNumbers(int from, int to)
    {
        int r,i;
        System.out.print("\nPrinting Even numbers in the range ["+from+", "+to+"] :\n");
        for(i=from; i<=to; i++){
            r=i%2;
            if(r==0)
                System.out.println(i);
        }

    }
    //printing Odd
    public static void printOddNumbers(int from, int to)
    {   int r,i;
        System.out.print("\nPrinting Odd numbers in the range ["+from+", "+to+"] :\n");
        for(i=from; i<=to; i++){
            r=i%2;
            if(r==1)
                System.out.println(i);
        }

    }


    public static void main( String[] args )
    {
        //check correct number of arguments
        if(args.length !=3) {
            System.err.println("Error: At least three parameters expected, from, to, and odd.");
            System.exit(-1);
        }
        int from= Integer.parseInt(args[0]);
        int to= Integer.parseInt(args[1]);
        int odd= Integer.parseInt(args[2]);

        System.out.println(odd);

        //Main for part II
        //Printing ODD
        if (odd==1){
            AppA.printOddNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        }
        //Printing Even
        else if (odd==2){
            AppA.printEvenNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        }
        else{
            System.err.println( "Error: Choice not correct! 1 for Odd or 2 for Even?"  );
            System.exit(-1);
        }


    }
}
