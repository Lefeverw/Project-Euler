package Problem67;

import java.util.ArrayList;

/**
 * @author lefeverw
 */
public class Node {
    int row;
    int column;
    int number;
    int maxDistance;
    public Node(int row, int column, int number) {
        this.row = row;
        this.number=number;
        this.column = column;
    }


    public void calculateMaxDistance(ArrayList<Node> listNodes) {
        if(row==0)
            maxDistance=number;
        else{
            maxDistance=listNodes.stream()
                    .filter(node -> node.getRow()==row-1 && (node.getColumn()==column||node.getColumn()==column-1))
                    .mapToInt(node->node.getMaxDistance()+number)
                    .max()
                    .getAsInt();
        }

    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
