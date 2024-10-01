package laba2;

public class Button {
    private int clickCount;

    public static void main(String[] args) {
        Button test_obj = new Button();
        test_obj.click();
        test_obj.click();
        test_obj.click();
        test_obj.click();
        test_obj.click();
    }

    public Button() {
        clickCount = 0;
    }

    public void click() {
        this.clickCount++;
        System.out.println("This button was clicked: " + this.clickCount + " times");
    }
}
