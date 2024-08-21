import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @Test
    public void testShouldReturnTrueWhenLengthAtLeast8(){
        //Given
        String password = " partisane";
        //Then

        assertTrue(Main.passwordValidationLengthCheckt("gurtenau"), password);

    }

    @Test
    public void testShouldContainDigit(){
        //Given
        String password= "fatherland214";
        //When
        boolean actual = Main.passwordDigitCheck("kurze123");
        //Then
        assertTrue(actual,password);
    }

    @Test
    public void testShoulContainLowerCaseAndUpperCaseLetter(){
        //GiVEN
        String Password = "Falaise47";

        //When
        boolean actual = Main.passwordContainUpperCaseAndLowerCaseCheck("Greenlight");
        //Then
        assertTrue(actual,Password);
    }
    @Test
    public void testPasswordContainWeakPasswords(){
        String Password = "Pass254word1";
        boolean actual = Main.passwordContainWeakPasswordsCheck("password1");
        assertTrue(actual,Password);
    }



}
