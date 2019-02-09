package utilities;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class isPalindrome implements IntPredicate {
    public int length;
    public int value;
    @Override
    public boolean test(int value) {
        length = getLength(value)-1;
        this.value = value;
        return IntStream.range(0,length/2+1).allMatch(digitEqualsOppositeDigit());

    }

    public IntPredicate digitEqualsOppositeDigit() {
        return x-> getLeftSideNumber(value, x) == getRightSideNumber(value, x);
    }


    private int getRightSideNumber(int value, int x) {
        return Integer.parseInt(Integer.toString(value).substring(length-x, length-x+1));
    }

    private int getLeftSideNumber(int value, int x) {
        return Integer.parseInt(Integer.toString(value).substring(x, x+1));
    }


    public int getLength(int value) {
        return (int) (Math.log10(value) + 1);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
