package junitTutorial;


import junitassertions.UserValidator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class junitTutorial {
    private String value;
    private Boolean expectedValue;

    public junitTutorial(String email, Boolean expectedValue) {
        this.value = email;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {".abc@.com.my", false},
                {"abc123@gmail.a", false},
                {".abc123@.com", false},
                {"abc()*@gmail.com", false},
                {"7abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com..", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false},

        });
    }

    @Test
    public void givenEmail_WhenValid_ReturnTrue() {
        UserValidator valid = new UserValidator();
        boolean result = valid.validateEmail(this.value);
        Assert.assertEquals(this.expectedValue, result);
    }

}
