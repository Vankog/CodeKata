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

}