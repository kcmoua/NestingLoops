public class NestingLoops{
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        for(int n=1; n <= 3; n++) {
            for(char c='A'; c <= 'E'; c++) {
                System.out.println( n + " " + c );
            }
        }
        System.out.println("\n");
        // this is #2 - I'll call it "AB"
        for(int a=1; a <= 3; a++) {
            for(int b=1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");
            }
            // * You will add a line of code here.
            System.out.println(a);
        }
        System.out.println("\n");
    }
}

// Question 1: The inner loop changes faster. The outer loop doesn't change until the inner loop breaks back into the outer loop.

// Question 2: The code is changed above for CN.

// Question 3: Each print is now on a new line.

// Question 4: After the inner loop runs, variable a is printed and then the outer loop increments and runs again. The output for the incremented variable a is printed on a new line.