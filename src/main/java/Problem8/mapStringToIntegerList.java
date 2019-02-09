package Problem8;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class mapStringToIntegerList implements IntFunction<ArrayList> {
    String text;
    int index;
    public mapStringToIntegerList(String text, int index) {
        this.text=text;
        this.index=index;
    }

    @Override
    public ArrayList apply(int value) {
        String specificText = text.substring(value,value+index);
        ArrayList<BigDecimal> listIntegers = Lists.newArrayList();
        IntStream.range(0,index).forEach(x->listIntegers.add(BigDecimal.valueOf(Integer.parseInt(specificText.substring(x,x+1)))));
        return listIntegers;
    }
}
