package Problem17;

import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class MainProblem17 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1 , 1000).map(x -> countLetters(x)).sum());
    }

    private static int countLetters(int x) {
        if(x==1000)
            return 11;
        if (x < 10)
            return getDigitLetters(x);
        if(x<20){
            return getLettersNumberUnder20(x);
        }
        if(x<100)
            return getTenLetters(x)+getDigitLetters(x%10);
        if(x%100==0){
            return getDigitLetters(x/100)+"hunderd".length();
        }
        return getDigitLetters(x/100)+"hunderdand".length()+countLetters(x%100);
    }

    private static int getTenLetters(int x) {
        switch ((int)x/10) {
            case 1:
                return 3;
            case 2:
            case 3:
            case 8:
            case 9:
                return 6;
            case 4:
            case 5:
            case 6:
                return 5;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    private static int getLettersNumberUnder20(int x) {
        switch (x) {
            case 10:
                return 3;
            case 11:
            case 12:
                return 6;
            case 16:
            case 15:
                return 7;
            case 14:
            case 13:
            case 18:
            case 19:
                return 8;
            case 17:
                return 9;
            default:
                return 0;
        }
    }

    private static int getDigitLetters(int i) {
        switch (i) {
            case 1:
            case 2:
            case 6:
                return 3;
            case 3:
            case 7:
            case 8:
                return 5;
            case 4:
            case 5:
            case 9:
                return 4;
            default:
                return 0;
        }
    }
}
