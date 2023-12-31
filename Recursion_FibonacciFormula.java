public class Recursion_FibonacciFormula {
    public static void main(String[] args) {
        for (int i=0; i<11 ; i++) System.out.println(fiboFormula(i));
        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n){
        //can remove this less dominating term : Math.pow((1-Math.sqrt(5))/2,n)
        //just for demo, use long instead because the number will exceed the int range.
        int ans = (int) ((Math.pow((1+Math.sqrt(5))/2,n) + Math.pow((1-Math.sqrt(5))/2,n))/Math.sqrt(5));
        return ans;
    }
}

// Output

// 0
// 0
// 1
// 1
// 3
// 4
// 8
// 12
// 21
// 33
// 55
// 2147483647
