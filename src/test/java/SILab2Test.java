import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void EveryStatement(){
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null,""));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        Item one = new Item(null,2,301,0);
        Item two = new Item("mleko",3,10,0.5);
        List<Item> items = Arrays.asList(one,two);

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items,""));
        assertTrue(ex.getMessage().contains("Invalid item!"));

        one.setName("leb");
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items,null));
        assertTrue(ex.getMessage().contains("Invalid card number!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items,"12345678b1234567"));
        assertTrue(ex.getMessage().contains("Invalid character in card number!"));

        assertEquals(557d, SILab2.checkCart(items,"1234567812345678"));


    }

    @Test
    void MulitpleCondition(){
        Item item = new Item("mleko",2,301,0);
        List<Item> items = Arrays.asList(item);
        // T || X || X
        assertEquals(572d, SILab2.checkCart(items,"1234567812345678"));

        // F || T || X
        item.setPrice(100);
        item.setDiscount(0.1);
        assertEquals(150d, SILab2.checkCart(items,"1234567812345678"));

        //F || F || T
        item.setDiscount(0);
        item.setQuantity(11);
        assertEquals(1070d, SILab2.checkCart(items,"1234567812345678"));

        //F || F || F
        item.setQuantity(5);
        assertEquals(500d, SILab2.checkCart(items,"1234567812345678"));

    }
}