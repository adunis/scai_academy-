package corso.chuckNorrisFact;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ChuckNorrisFactTest extends TestCase {

	public ChuckNorrisFact _sut;

	public ChuckNorrisFactTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(ChuckNorrisFactTest.class);
	}

	public void testCreationChuckNorrisFact() {
		_sut = new ChuckNorrisFact();
		boolean isSameType = _sut instanceof ChuckNorrisFact;

		assertTrue(isSameType);
		assertNotNull(_sut);
	}

	public void testConcatURL() {
		_sut = new ChuckNorrisFact();
		_sut.setBaseUrl("https://www.google.com/");

		String exceptedValue = "https://www.google.com/home";
		assertEquals(exceptedValue, _sut.concatUrl("home"));
	}

	public void testGetJokefromJSON() {

		_sut = new ChuckNorrisFact();
		String jsonTest = "{ \"type\": \"success\", \"value\": { \"id\": 536, \"joke\": \"Don't worry about tests, Chuck Norris's test cases cover your code too.\", \"categories\": [\"nerdy\"] } }";
		String jokeExcepted = "Don't worry about tests, Chuck Norris's test cases cover your code too.";

		assertEquals(jokeExcepted, _sut.getJokefromJson(jsonTest));
	}

	public void testGetUrlContent() {
		_sut = new ChuckNorrisFact();
		_sut.setBaseUrl("http://api.icndb.com/jokes");
		String jsonTest = _sut.getUrlContent();
		assertNotNull(jsonTest);

	}
	
	public void testRandomId() {
		_sut = new ChuckNorrisFact();
		String result = _sut.randomId();
		System.out.println(result);
		assertNotNull(result);
	}

	public void testGetJokefromUrlContent() {
		_sut = new ChuckNorrisFact();
		_sut.setBaseUrl("http://api.icndb.com/jokes/");
		String joke = _sut.getJokefromJson(_sut.getUrlContent());
		System.out.println(joke);
		assertNotNull(joke);
		
	}
	
}
