package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AuthorityDaoTest.class, AuthorityServiceTest.class, StatisticsDaoTest.class,
		StatisticsServiceTest.class })
public class AllTests {

}
