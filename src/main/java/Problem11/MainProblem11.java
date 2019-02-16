package Problem11;

import com.google.common.collect.Lists;
import com.sun.deploy.util.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class MainProblem11 {

    public static void main(String[] args) throws IOException {
        int[][] matrix = readMatrix("C:\\Users\\lefeverw\\Documents\\GitHub\\Project-Euler\\src\\main\\java\\Problem11\\matrix.csv");
        int MaxHorizontalDirection = Arrays.stream(matrix).map(new getMaxOfXHorizontalNumbers(4)).mapToInt(Integer::intValue).max().getAsInt();
        int MaxVerticalDirection = Arrays.stream(transposeMatrix(matrix)).map(new getMaxOfXHorizontalNumbers(4)).mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(IntStream.range(0, matrix.length).map(value -> new getMaxOfXHorizontalNumbers(4).apply(getMatrixDiagonalUpperHalf(matrix,value))).max().getAsInt());
        System.out.println(IntStream.range(0, matrix.length).map(value -> new getMaxOfXHorizontalNumbers(4).apply(getMatrixDiagonalLowerHalf(matrix, value))).max().getAsInt());
        System.out.println(IntStream.range(0, matrix.length).map(value -> new getMaxOfXHorizontalNumbers(4).apply(getMatrixOverDiagonalLowerHalf(matrix, value))).max().getAsInt());
        System.out.println(IntStream.range(0, matrix.length).map(value -> new getMaxOfXHorizontalNumbers(4).apply(getMatrixOverDiagonalUpperHalf(matrix, value))).max().getAsInt());
        System.out.println(MaxHorizontalDirection);
        System.out.println(MaxVerticalDirection);
    }

    private static int[] getMatrixOverDiagonalUpperHalf(int[][] matrix, int value) {
        ArrayList<Integer> list = Lists.newArrayList();
        for (int i = 0; i <= value; i++) {
            list.add(matrix[(value-i)][matrix.length-1-i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] getMatrixOverDiagonalLowerHalf(int[][] matrix, int value) {
        ArrayList<Integer> list = Lists.newArrayList();
        for (int i = 0; i <= value; i++) {
            list.add(matrix[matrix.length-1-(value-i)][i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] getMatrixDiagonalLowerHalf(int[][] matrix, int value) {
        ArrayList<Integer> list = Lists.newArrayList();
        for (int i = 0; i <= value; i++) {
            list.add(matrix[matrix.length-1-(value-i)][matrix.length-1-i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] getMatrixDiagonalUpperHalf(int[][] matrix, int value) {
        ArrayList<Integer> list = Lists.newArrayList();
        for (int i = 0; i <= value; i++) {
            list.add(matrix[value-i][i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    private static int[][] transposeMatrix(int[][] matrix) {
        int[][] temp = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                temp[j][i] = matrix[i][j];
        }
        return temp;
    }

    private static int[][] readMatrix(String filename) throws IOException {
        int[][] matrix = new int[20][20];
        ArrayList<String> lines = Lists.newArrayList();
        ReaderCSV readerCSV = new ReaderCSV(filename);
        readerCSV.readLines(lines::add);
        IntStream.range(0, 20).forEach(TransformStringToArrayIntegers(matrix, lines));
        return matrix;
    }

    private static IntConsumer TransformStringToArrayIntegers(int[][] matrix, ArrayList<String> lines) {
        return x -> {
            matrix[x] = Arrays.stream(Arrays.stream(StringUtils.splitString(lines.get(x), " ")).toArray(String[]::new)).mapToInt(Integer::parseInt).toArray();
        };
    }

}
