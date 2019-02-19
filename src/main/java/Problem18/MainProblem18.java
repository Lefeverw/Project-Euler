package Problem18;

import com.google.common.collect.Lists;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class MainProblem18 {
    public static void main(String[] args) throws IOException {
        AtomicInteger row = new AtomicInteger();
        ArrayList<Node> listNodes = Lists.newArrayList();
        Files.lines(Paths.get("C:\\Users\\lefeverw\\Documents\\GitHub\\Project-Euler\\src\\main\\java\\Problem18\\tree.txt"))
                .map(line -> line.split(" "))
                .forEach(rowElements -> {
                    IntStream.range(0, rowElements.length)
                            .forEach(column -> {
                                Node node =new Node(row.intValue(), column, Integer.parseInt(rowElements[column]));
                                listNodes.add(node);
                                node.calculateMaxDistance(listNodes);
                            });
                    row.getAndIncrement();
                });
        System.out.println(listNodes.stream().mapToInt(Node::getMaxDistance).max().getAsInt());
    }
}
