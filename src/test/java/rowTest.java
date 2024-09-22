import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class rowTest {

    @Test
    void ryad() {
        assertEquals("Сумма ряда: 0.6101111104444433\tКол-во слагаемых: 1000\t Последнее слагаемое: 9.99002995010979E-7",row.ryad());
    }
}