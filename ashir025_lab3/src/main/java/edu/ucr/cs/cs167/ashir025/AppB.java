package edu.ucr.cs.cs167.ashir025;

import java.util.function.Function;

public class AppB
{

    //Part III
    //checking if Even or Odd
    public interface Function<Integer,Boolean>{
        public Boolean apply(Integer x);
        }
    static class IsEven implements Function<Integer, Boolean> {
        @Override
        public Boolean apply(Integer x) {
            return x % 2 == 0;
        }
    }
    static class IsOdd implements Function<Integer, Boolean> {
        @Override
        public Boolean apply(Integer x) {
            return x % 2 == 1;
        }
    }
    //Printing Numbers
    public static void printNumbers(int from, int to, Function<Integer, Boolean> filter){
        System.out.printf("Printing numbers in the range  ["+from+", "+to+"] :\n");
        for(int i=from; i<=to;i++){
            if(filter.apply(i)){
                System.out.println(i);
            }
        }
    }

    public static void main( String[] args )
    {
        //check correct number of arguments
        if(args.length !=3) {
            System.err.println("Error: At least three parameters expected, from, to, and odd.");
            System.exit(-1);
        }

        //initializing variables for arguments
        int from= Integer.parseInt(args[0]);
        int to= Integer.parseInt(args[1]);
        int odd= Integer.parseInt(args[2]);
        //System.out.println(odd);

        //Main for part III
        if (odd==1){
            printNumbers(from, to, new IsOdd());
        }
        //Printing Even
        else if (odd==2){
            printNumbers(from, to, new IsEven());
        }
        else{
            System.err.println( "Error: Choice not correct! 1 for Odd or 2 for Even?" );
            System.exit(-1);
        }



    }
}
