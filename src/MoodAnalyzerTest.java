import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyzerTest {

	@Test
	public void givenSadWhileAnalysisMoodShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String result = moodAnalyzer.analyseMood("I am in Sad Mood");
		Assert.assertEquals("SAD", result);
	}
	
	@Test
	public void givenHappyWhileAnalysisMoodShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String result = moodAnalyzer.analyseMood("I am in Happy Mood");
		Assert.assertEquals("HAPPY", result);
	}

}
