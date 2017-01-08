/**
 * Created by ScorpionOrange on 2017/01/08.
 */
public class FibonacciDemo {
    public static void main(String[] args){
        System.out.println("Testing");
        //System.out.println("Fibonacci in normal way : " + new Fibonacci().Fibonacci(40));
        System.out.println("Fibonacci in dynamic programming : "
                           + new Fibonacci().FibonacciInDynamicProgramming(40));
    }
}
