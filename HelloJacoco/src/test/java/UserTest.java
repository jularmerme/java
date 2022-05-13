import org.junit.Test;
import org.junit.Assert;

import com.revature.User;

public class UserTest {
	
	User user = new User();
	
	// This is a positive test case
	@Test
	public void testUserWithName() {
		Assert.assertEquals("User Bob was added successfully!!!.", user.addUser("Bob"));
	}
	
	// This is the negative case
	@Test
	public void testUserWithNull() {
		Assert.assertEquals("Please provide a username", user.addUser(null));
	}
}
