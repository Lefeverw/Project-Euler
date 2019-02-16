package Problem14;

/**
 * @author lefeverw
 */
public class CollatzSequence {
    int x;
    private int lengthOfCollatzSequence=1;
    public CollatzSequence(int x) {
        this.x=x;
        calculateLength(x);
    }

    private void calculateLength(long x) {
        while(x!=1){
//            System.out.println(x);
            x=x%2==0?x/2:3*x+1;
            lengthOfCollatzSequence++;
        }
    }

    public int getLengthOfCollatzSequence() {
        return lengthOfCollatzSequence;
    }
}
