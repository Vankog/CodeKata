package codekata.kata9checkout;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CheckOutTest {

    CheckOut checkout;

    @BeforeEach
    void setUp() {
        checkout = new CheckOut();
    }

    @Test
    void newCheckoutInstanceCanBeCreated() {
        assertNotNull(checkout, "We need an instance.");
    }

    @Test
    void emptyBasketShouldReturnTotalOf_0() {
        assertEquals(0, checkout.getTotal(), "Should return zero for empty basket");
    }

    @Test
    void scanShouldIncreaseTotalPrice() {
        checkout.scan(new Item(1));
        assertEquals(1, checkout.getTotal(), "Should return scanned price");
        checkout.scan(new Item(2));
        assertEquals(3, checkout.getTotal(), "Should return total of all scanned prices");
        checkout.scan(new Item(0));
        assertEquals(3, checkout.getTotal(), "Should return total of all scanned prices");
        checkout.scan(new Item(99));
        assertEquals(102, checkout.getTotal(), "Should return total of all scanned prices");
    }
}