package laba2;

public class Table {
    private final int rows;
    private final int cols;
    private final int[][] value;

    public Table(int rows, int cols) {
        if (rows < 1 || cols < 1) {
            throw new IllegalArgumentException("rows and cols must be greater than 0");
        }
        this.rows = rows;
        this.cols = cols;
        value = new int[rows][cols];
    }


    public void setValue(int row, int col, int value) {
        this.value[row][col] = value;
    }

    public int getValue(int row, int col) {
        return this.value[row][col];
    }

    public int rows() {
        return this.rows;
    }

    public int cols() {
        return this.cols;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                output += value[i][j] + " ";
            }
            output += "\n";
        }
        return output;
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += value[i][j];
            }
        }
        return (double) sum / (rows*cols);
    }
}
