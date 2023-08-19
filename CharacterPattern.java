//CODE BY :- SHUBHAM SWARNAKAR, INVERTED STAR PATTERN IN JAVA , 19-08-2023
public class CharacterPattern {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        //outer loop
        for(int line = 0; line<n;line++){
            //inner loop
            for(int chars = 0; chars<=line;chars++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
