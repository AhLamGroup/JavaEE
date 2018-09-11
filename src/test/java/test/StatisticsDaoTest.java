package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import bean.Statistics;
import dao.DatabaseDao;
import dao.StatisticsDao;

public class StatisticsDaoTest {
	static protected StatisticsDao statisticsDao;
	static protected DatabaseDao databaseDao;

	@BeforeClass
	static public void beforeClass() throws Exception {
		statisticsDao = new StatisticsDao();
		databaseDao = new DatabaseDao();
	}

	@Test
	public void testGetNewsCountForNewsAuthor() throws Exception {
		String condition = "lastYear";
		ArrayList<Statistics> result = statisticsDao.getNewsCountForNewsAuthor(condition, databaseDao);
		assertNotNull(result);
	}

	@Test
	public void testGetCommentCountForUser() throws Exception {
		String condition = "lastYear";
		ArrayList<Statistics> result = statisticsDao.getCommentCountForUser(condition, databaseDao);
		assertNotNull(result);
	}

	@Test
	public void testGetSumNewsStatistics() throws Exception {
		ArrayList<Statistics> result = statisticsDao.getSumNewsStatistics(databaseDao);
		assertNotNull(result);
	}

	@Test
	public void testGetSumCommentStatistics() throws Exception {
		ArrayList<Statistics> result = statisticsDao.getSumCommentStatistics(databaseDao);
		assertNotNull(result);
	}

}
