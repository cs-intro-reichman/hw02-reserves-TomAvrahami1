/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
	String s= args[0];
        String reverse= "";
        for (int i= s.length()-1; i>=0; i-- ) {
        reverse= reverse + s.charAt( i ); 
        }
        char m= s.charAt( (s.length()-1)/2);
       System.out.println( reverse);
       System.out.println("the middle charecter is: "+m);
	}
}
