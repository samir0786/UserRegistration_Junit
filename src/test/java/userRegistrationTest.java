import org.junit.Assert;
import org.junit.Test;

public class userRegistrationTest {

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

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean emailId = userRegistration.validEmailId("sam@gmail.com");
        Assert.assertTrue(emailId);
    }

    @Test
    public void givenEmailId_WhenNotInProperFormat_ShouldReturnFalse() {
        boolean emailId = userRegistration.validEmailId("ABCgmail.com");
        Assert.assertFalse(emailId);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean mobileNumber = userRegistration.validMobileNumber("01 7860079263");
        Assert.assertTrue(mobileNumber);
    }

    @Test
    public void givenMobileNumber_WhenNotInProperFormat_ShouldReturnFalse() {
        boolean mobileNumber = userRegistration.validMobileNumber("01 007926");
        Assert.assertFalse(mobileNumber);
    }

    @Test
    public void givenPassword_MinimumEightCharacters_WhenProper_ShouldReturnTrue() {
        boolean password = userRegistration.validatePassword("Samirsayed");
        Assert.assertTrue(password);
    }

    @Test
    public void givenPassword_MinimumEightCharacters_WhenNotProper_ShouldReturnFalse() {
        boolean password = userRegistration.validatePassword("sam");
        Assert.assertFalse(password);
    }

    @Test
    public void givenPassword_Atleast1UpperCase_WhenProper_ShouldReturnTrue() {
        boolean password = userRegistration.validatePasswordForUpperCase("Samirsayed");
        Assert.assertTrue(password);
    }

    @Test
    public void givenPassword_Atleast1UpperCase_WhenNotProper_ShouldReturnFalse() {
        boolean password = userRegistration.validatePasswordForUpperCase("samirsayed");
        Assert.assertFalse(password);
    }

    @Test
    public void givenPassword_Atleast1Number_WhenProper_ShouldReturnTrue() {
        boolean password = userRegistration.validatePasswordForNumber("Sameer12345");
        Assert.assertTrue(password);
    }

    @Test
    public void givenPassword_Atleast1Number_WhenNotProper_ShouldReturnFalse() {
        boolean password = userRegistration.validatePasswordForNumber("sameer");
        Assert.assertFalse(password);
    }

    @Test
    public void givenPassword_Exactly1SpecialCharacter_WhenProper_ShouldReturnTrue() {
        boolean password = userRegistration.validatePasswordForSpecialCharacter("Sameersayed@123");
        Assert.assertTrue(password);
    }

    @Test
    public void givenPassword_Exactly1SpecialCharacter_WhenNotProper_ShouldReturnFalse() {
        boolean password = userRegistration.validatePasswordForSpecialCharacter("Sameersayed@");
        Assert.assertFalse(password);
    }
}
