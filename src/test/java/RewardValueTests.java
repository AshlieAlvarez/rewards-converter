import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

/*  ARRANGE(set up conditions, i.e test data)
    ACT (perform action, what is being tested)
    ASSERT (validate expected outcome by assertion)
 */

    @Test
    void convert_from_cash_to_miles() {
        //Testing the conversion of cash value to miles

        //100 dollar test condition
        double cashValue = 100;

        // Creating a RewardsValue Object with the cashValue
        RewardValue rewardValue = new RewardValue(cashValue);

        //Defining what our expected miles are by dividing the cash value by the conversion rate
        int expectedMiles = (int) Math.round(cashValue/RewardValue.MILES_TO_CASH_CONVERSION_RATE);

        //Validating expected outcome by checking if the miles value from RewardValue is the same as our expected miles.
        assertEquals(expectedMiles, rewardValue.getMilesValue());

        //If they are the same, test passes but if not, it will fail.
    }

    @Test
    void convert_from_miles_to_cash() {
        //Testing the conversion of miles to cash value

        //10,000 miles is the test condition
        int milesValue = 10000;

        //Creating a RewardsValue Object with the milesValue
        RewardValue rewardValue = new RewardValue(milesValue);

        //Defining what our expected cash is by multiplying the miles by the conversion rate
        double expectedCash = milesValue * RewardValue.MILES_TO_CASH_CONVERSION_RATE;

        //Validating expected outcome by checking if the cash value from RewardValue is the same as our expected cash.
        assertEquals(expectedCash, rewardValue.getCashValue());

        //If they are the same, test passes but if not, it will fail.

    }
}
