package seedu.eduke8.stats;

import org.junit.jupiter.api.Test;
import seedu.eduke8.Eduke8Test;
import seedu.eduke8.question.Question;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class StatsCalculatorTest extends Eduke8Test {
    StatsCalculator statsCalc = new StatsCalculator();
    StatsCalculator statsCalc1 = new StatsCalculator();

    @Test
    public void calculatePointsEarnedForQuestion_wrongAnswer_expectZero() {
        Question question = createTestQuestion("description");
        assertTrue(statsCalc.calculatePointsEarnedForQuestion(question) == 0);
    }

    @Test
    public void calculateProgressionPercentage_sixtyPercent_expectZeroPointSix() {
        assertTrue(statsCalc.calculateProgressionPercentage(60,100) == (double) 0.6);
    }

    public void calculateTotalQuestionCount_sixtyPercent_expectZeroPointSix() {
        assertTrue(statsCalc.calculateProgressionPercentage(60,100) == (double) 0.6);
    }

}
