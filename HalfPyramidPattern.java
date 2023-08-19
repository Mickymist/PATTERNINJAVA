//CODE BY :- SHUBHAM SWARNAKAR, INVERTED STAR PATTERN IN JAVA , 19-08-2023
public class HalfPyramidPattern{
    public static void main(String[] args) {
        int n = 4;
        //outer loop
        for(int line = 1; line<=n; line++){
            //inner loop
            for(int number=1; number<=line;number++){
                //what to print
                System.out.print(number+" ");
            }
            System.out.println();
        }
        
    }
}