package codekata.kata9checkout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ItemTest {

    @Test
    void canBeInitializedWithAPrice() {
        Item item = new Item(1);
        assertNotNull(item, "Should be initialized");
    }

    @Test
    void shouldHaveTheGivenPrice() {
        Item item = new Item(1);
        assertEquals(1, item.getPrice(), "Should return price of the constructor");
    }
}