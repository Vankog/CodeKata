package codekata.kata9checkout;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckOutTest {

    @Test
    void newCheckoutInstanceCanBeCreated() {
        CheckOut checkout = new CheckOut();
        Assertions.assertNotNull(checkout, "We need an instance.");
    }

}