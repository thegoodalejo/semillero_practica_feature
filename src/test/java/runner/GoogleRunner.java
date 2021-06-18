package runner;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue= {"stepdefinitions"},
		feature= {"src\\test\\resources\\feature\\google.feature"})
public class GoogleRunner {
	
}
