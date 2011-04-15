import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Lab7task7 extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.rose-hulman.edu/");
		selenium.start();
	}

	@Test
	public void testLab7task7() throws Exception {
		selenium.open("/");
		selenium.click("link=Current Students");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=td > p:nth(2) > a[title=Registrar]");
		selenium.waitForPageToLoad("30000");
		selenium.click("//li[6]/a/span");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=h2 > a");
		selenium.waitForPageToLoad("30000");
		selenium.type("id1", "baroba");
		selenium.click("bt1");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("CSSE376"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
