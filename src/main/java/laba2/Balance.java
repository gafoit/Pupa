package laba2;


public class Balance {
    private int Left, Right;

    public static void main(String[] args) {
        Balance test_obj = new Balance();
        test_obj.addLeft(5);
        test_obj.addRight(5);
        test_obj.result();
    }

    public Balance() {
        Left = 0;
        Right = 0;
    }

    public void addRight(int deltaRight) {
        this.Right += deltaRight;
    }

    public void addLeft(int deltaLeft) {
        this.Left += deltaLeft;
    }

    public void result() {
        if (this.Left == this.Right) {
            System.out.println("=");
        } else if (this.Left > this.Right) {
            System.out.println("L");
        }
        else {
            System.out.println("R");
        }
    }
}
