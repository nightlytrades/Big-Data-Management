package edu.ucr.cs.cs167.ashir025;

import java.util.function.Function;

public class AppC
{


    //Part IV
    Function<Integer, Boolean> divisibleByFive = new Function<Integer, Boolean>() {
        @Override
        public Boolean apply(Integer x) {
            return x % 5 == 0;
        }
    };

    //Part V
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
        final int from= Integer.parseInt(args[0]);
        final int to= Integer.parseInt(args[1]);
        final int base= Integer.parseInt(args[2]);
        assert base !=0;

        Function<Integer, Boolean> divisibleByBase = x -> x % base == 0;
        printNumbers(from,to, divisibleByBase);




    }
}
