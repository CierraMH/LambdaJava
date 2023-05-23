package JavaLambdaExpressions;

import java.util.function.Function;
import java.util.function.Predicate;

//part2
@FunctionalInterface
interface Mine{
    String num();
}

public class App {
    private static final String nums = nums;
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
        Predicate<Mine> areTheseEqual = equal -> nums.equals(nums);
        if (nums.equals(areTheseEqual)) {
            System.out.println("The numbers are equal");
        }

        Function<Integer, Integer> times = a -> a*a;
    }
    static int printThing(Printable thing){
        return thing.print(5, 5);
    } 
}
