package laba2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {
    Table testTable;

    @BeforeEach
    void setUp() {
        testTable = new Table(2, 2);
        for (int i = 0; i < testTable.rows(); i++) {
            for (int j = 0; j < testTable.cols(); j++) {
                testTable.setValue(i, j, 10 * (i + 1) + j + 1);
            }
        }
    }

    @Test
    void getValue() {
        assertEquals(11, testTable.getValue(0, 0));
        assertEquals(12, testTable.getValue(0, 1));
        assertEquals(21, testTable.getValue(1, 0));
        assertEquals(22, testTable.getValue(1, 1));
    }

    @Test
    void rows() {
        assertEquals(2, testTable.rows());
    }

    @Test
    void cols() {
        assertEquals(2, testTable.cols());
    }

    @Test
    void testToString() {
        assertEquals("11 12 \n21 22 \n", testTable.toString());
    }

    @Test
    void average() {
        assertEquals(16.5, testTable.average());
    }
}