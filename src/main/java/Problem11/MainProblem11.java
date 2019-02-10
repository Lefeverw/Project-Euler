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

    //TODO Refactor Seriously
    public static void main(String[] args) throws IOException {
        int[][] matrix = readMatrix("C:\\Users\\lefeverw\\Documents\\GitHub\\Project-Euler\\src\\main\\java\\Problem11\\matrix.csv");
        Arrays.stream(matrix).map(new getMaxOfXHorizontalNumbers(4)).mapToInt(Integer::intValue).max().getAsInt();
        int MaxHorizontalDirection = Arrays.stream(matrix).map(new getMaxOfXHorizontalNumbers(4)).mapToInt(Integer::intValue).max().getAsInt();
        int[][] matrixTransposed = transposeMatrix(matrix);
        int MaxVerticalDirection = Arrays.stream(matrixTransposed).map(new getMaxOfXHorizontalNumbers(4)).mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(IntStream.range(0, matrix.length).map(value -> {
            int[] line = getMatrixDiagonalUpperHalf(matrix, value);
            //            Arrays.stream(line).forEach(x->System.out.print(x+"\t"));
            //            System.out.println();
            if (line.length >= 4) {
                getMaxOfXHorizontalNumbers max = new getMaxOfXHorizontalNumbers(4);
                return max.apply(line);
            }
            return 0;
        }).max().getAsInt());

        System.out.println(IntStream.range(0, matrix.length).map(value -> {
            int[] line = getMatrixDiagonalLowerHalf(matrix, value);
//            Arrays.stream(line).forEach(x->System.out.print(x+"\t"));
//            System.out.println();
            if (line.length >= 4) {
                getMaxOfXHorizontalNumbers max = new getMaxOfXHorizontalNumbers(4);
                return max.apply(line);
            }
            return 0;
        }).max().getAsInt());

        System.out.println(IntStream.range(0, matrix.length).map(value -> {
            int[] line = getMatrixOverDiagonalLowerHalf(matrix, value);
//            Arrays.stream(line).forEach(x->System.out.print(x+"\t"));
//            System.out.println();
            if (line.length >= 4) {
                getMaxOfXHorizontalNumbers max = new getMaxOfXHorizontalNumbers(4);
                return max.apply(line);
            }
            return 0;
        }).max().getAsInt());

        System.out.println(IntStream.range(0, matrix.length).map(value -> {
            int[] line = getMatrixOverDiagonalUpperHalf(matrix, value);
//            Arrays.stream(line).forEach(x->System.out.print(x+"\t"));
//            System.out.println();
            if (line.length >= 4) {
                getMaxOfXHorizontalNumbers max = new getMaxOfXHorizontalNumbers(4);
                return max.apply(line);
            }
            return 0;
        }).max().getAsInt());


        System.out.printf("%s\t%s", MaxHorizontalDirection, MaxVerticalDirection);
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
