package laba2;

import java.util.Collections;
import java.util.List;

public class Bell {
    private final String[] soundArr = {"Ding", "Dong"};
    private int index = 0;

    public static void main(String[] args) {
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
    }

    public void sound() {
        System.out.println(soundArr[this.index]);
        this.index = this.index ^ 1; // ^ это Xor если index = 1  index^1 даст 0, если index = 0 index^1 = 1
    }
}
