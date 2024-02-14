/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
               int numTwoChild =0;
               int numThreeChild =0;
               int numFourOrMore=0;
               int sumChild=0;
               for( int i=0 ; i<T ; i++) {
                   int bCount=0 ;
                   int gCount=0;
                   while (bCount<1 || gCount<1) {
                       double rand= Math.random();
                       boolean sex= ( rand< 0.5 ) ;
                       if ( sex) {
                           bCount++;           
                     } else {
                          gCount++;
              }
           
        }     
                   if ( bCount+gCount==2)
                        numTwoChild++;
                   if ( bCount+gCount==3)
                        numThreeChild++;
                   if (bCount+gCount >= 4)
                       numFourOrMore++;
                   sumChild= sumChild + bCount + gCount ;

               }
            double avg= (sumChild / 1.0) / T ;
            System.out.println("Average: " + avg + " children to get at least one of each gender.");
            System.out.println("Number of families with 2 children: " + numTwoChild);
            System.out.println("Number of families with 3 children: " + numThreeChild);
            System.out.println("Number of families with 4 or more children: " + numFourOrMore);
	}
}