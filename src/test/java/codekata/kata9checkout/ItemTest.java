package codekata.kata9checkout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ItemTest {

    @Test
    public void canBeInitializedWithAPrice() {
        Item item = new Item(1);
        assertNotNull(item, "Should be initialized");
    }
}