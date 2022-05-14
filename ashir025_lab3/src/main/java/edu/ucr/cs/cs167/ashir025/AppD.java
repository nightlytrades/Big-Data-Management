package edu.ucr.cs.cs167.ashir025;

import java.util.function.Function;


public class AppD
{
    public static void printNumbers(int from, int to, Function<Integer, Boolean> filter){
        System.out.printf("Printing numbers in the range  ["+from+", "+to+"] :\n");
        for(int i=from; i<=to;i++){
            if(filter.apply(i)){
                System.out.println(i);
            }
        }
    }

    @SafeVarargs
    public static Function<Integer, Boolean> combineWithAnd(
            Function<Integer, Boolean> ... filters)
    {
        return x -> {
            for(Function<Integer,Boolean> f : filters){
                if (!f.apply(x)) {
                    return false;
                }
            }
            return true;
        };
    }
    @SafeVarargs
    public static Function<Integer, Boolean> combineWithOr(Function<Integer, Boolean> ... filters)
    {
        return x -> {
            for(Function<Integer,Boolean> f : filters){
                if (f.apply(x)) {
                    return true;
                }
            }
            return false;
        };
    }
    public static void main( String[] args )
    {
        //check correct number of arguments
        if(args.length !=3) {
            System.err.println("Error: At least three parameters expected, from, to, and odd.");
            System.exit(-1);
        }

        //initializing argument variables
        final int from= Integer.parseInt(args[0]);
        final int to= Integer.parseInt(args[1]);
        boolean and=args[2].contains("^");

        //stuck on this part
        String[] bases = args[2].split(and ? "\\^" : "v");
        Function<Integer,Boolean>[] filters = new Function[bases.length];
        int i;
        //final bug
        for (i=0;i<bases.length;i++){
            int base= Integer.parseInt(bases[i]);
            assert base !=0;
            filters[i] = x -> x % base == 0;
        }


        Function<Integer, Boolean> filter = and ?
                combineWithAnd(filters) : combineWithOr(filters);
//        Function<Integer, Boolean> filter = combineWithAnd(filters);
        printNumbers(from,to, filter);




    }
}
