package userTest;

import org.junit.Test;
import org.junit.jupiter.api.Tag;
import user.User;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testCreateUser() {

        User user = new User("Staffan", "password123");


    }

    @Test
    public void testgetUserName() {

        User user = new User("Staffan", "password123");

        String expected = "Staffan";
        String actual = user.getUserName();
        assertEquals(expected,actual);
    }

    @Test
    public void testGetPassword() {

        User user = new User("Staffan", "password123");

        String expected = "password123";
        String actual = user.getPassword();
        assertEquals(expected, actual);


    }
    @Test
    public void testSetUserName(){

        User user = new User("Staffan", "password123");

        String expected = "Henry";
        user.setUserName("Henry");
        String actual = user.getUserName();
        assertEquals(expected, actual);    }
}
