package JavaLambdaExpressions;

import java.lang.foreign.Arena;
import java.util.function.Function;
import java.util.function.Predicate;

//part2
@FunctionalInterface
interface Mine{
    String num();
}

public class App {
    private static final int nums1 = 200;

    public static void main(String[] args) throws Exception {
        //part1
        Printable add = (a, b) -> a + b;
        System.out.println(printThing(add));
        Printable sub = (a, b) -> a - b;
        System.out.println(printThing(sub));
        Printable multi = (a, b) -> a * b;
        System.out.println(printThing(multi));
        Printable div = (a, b) -> a / b;
        System.out.println(printThing(div));

        
        //part 3
        Predicate<Integer> isThisLarger = (nums1) -> nums1 > 100;
        if (isThisLarger.test(nums1) ) {
            System.out.println("The number is large");
        } else {
            System.out.println("It is smaller");
        }

        Function<Integer, Integer> times = (q) -> q * 3;
        int q = 3;
        System.out.println(times.apply(q));

    }
    static int printThing(Printable thing){
        return thing.print(5, 5);
    } 
    
}
