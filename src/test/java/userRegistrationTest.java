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

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean lastName = userRegistration.validInputName("Sayed");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenNotInProperFormat_ShouldReturnFalse() {
        boolean lastName = userRegistration.validInputName("Sayed001");
        Assert.assertFalse(lastName);
    }
}
