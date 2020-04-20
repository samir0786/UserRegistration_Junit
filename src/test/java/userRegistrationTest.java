import org.junit.Assert;
import org.junit.Test;

public class userRegistrationTest{
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean firstName = userRegistration.validInputName("Sameer");
        Assert.assertTrue(firstName);

    }

    @Test
    public void givenFirstName_WhenNotInProperFormat_ShouldReturnFalse() {
        boolean firstName = userRegistration.validInputName("sam010");
        Assert.assertFalse(firstName);
    }
}
