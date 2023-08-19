//CODE BY :- SHUBHAM SWARNAKAR, INVERTED STAR PATTERN IN JAVA , 19-08-2023
public class InvertedStarPattern{
    public static void main(String[] args) {
        //outer loop
        for(int i=0; i<4;i++){
            //inner loop
            for(int j=4;j>i;j--){
                //what to print
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}