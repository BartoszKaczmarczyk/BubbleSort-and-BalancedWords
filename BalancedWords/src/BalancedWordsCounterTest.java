import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordsCounterTest {

    @Test
    void balancedWordsCount1() {
        int actual = BalancedWordsCounter.BalancedWordsCount("aabbabcccba");
        assertEquals(28, actual);
    }

    @Test
    void balancedWordsCount2() {
        int actual = BalancedWordsCounter.BalancedWordsCount("");
        assertEquals(0, actual);
    }

    @Test
    void balancedWordsCount3() {
        assertThrows(RuntimeException.class, () ->
                BalancedWordsCounter.BalancedWordsCount("abababa1"));
    }
    @Test
    void balancedWordsCount4() {
        assertThrows(RuntimeException.class, () ->
                BalancedWordsCounter.BalancedWordsCount(null));
    }
}