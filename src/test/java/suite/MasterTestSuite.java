package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {
	TestCaseA.class,
	TestCaseB.class
})
public class MasterTestSuite {

}
