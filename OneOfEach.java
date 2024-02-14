
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
        int bCount=0;
        int gCount=0;
        while (bCount<1 || gCount<1) {
            boolean sex= ( Math.random() < 0.5 ) ;
            if ( sex) {
                System.out.print( "b ");
                bCount++;           
              } else {
                System.out.print ("g ");
                gCount++;
              }
        }
         System.out.println( "You made it... " + "and you now have " + (bCount+gCount) +" childrens");
	}
}
