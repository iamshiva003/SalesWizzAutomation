package automation;

import net.serenitybdd.core.Serenity;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;

public class AssertionUtils {

    public static SoftAssertions softAssertions = new SoftAssertions();

    public static boolean currentStepFailed = false;

    public static void hardAssertions(String failureMessage, Boolean condition) {
        Assertions.assertTrue(condition, failureMessage);
    }

    public static void softAssertions(String failureMessage, Boolean condition) {
        softAssertions.assertThat(condition).as("Failure Message - " + failureMessage).isTrue();

        if (softAssertions.wasSuccess()) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
            Serenity.takeScreenshot();
            currentStepFailed = true;
            Serenity.recordReportData().asEvidence().withTitle("Soft Assertion Failure: ").andContents(failureMessage);
        }
    }
}
