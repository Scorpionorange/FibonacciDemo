/**
 * Created by ScorpionOrange on 2017/01/08.
 */
public class Fibonacci {
    /**
     * Compute Fibonacci numbers as described in normal way.
     */
    public long Fibonacci(int n){
        if(n <= 1){
            return 1;
        }
        else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    /**
     * Compute Fibonacci numbers in dynamic programming.
     */
    public long FibonacciInDynamicProgramming(int n){
        if(n <= 1){
            return 1;
        }

        int last = 1;
        int nextToLast = 1;
        int answer = 1;

        for(int i = 2; i <= n; i++){
            answer = last + nextToLast;
            nextToLast = last;
            last = answer;
        }
        return answer;
    }
}
