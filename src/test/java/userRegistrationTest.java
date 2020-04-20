import org.junit.Test;

public class userRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean firstName = userRegistration.validInputName("Sameer");

    }
}
