package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import bean.Statistics;
import service.StatisticsService;

public class StatisticsServiceTest {
	
	@Test
	public void testGetNewsCountForNewsAuthor() throws Exception {
		StatisticsService statisticsService= new StatisticsService();
		String condition = "lastYear";
		ArrayList<Statistics> result = statisticsService.getNewsCountForNewsAuthor(condition);
		assertNotNull(result);
	}

	@Test
	public void testGetCommentCountForUser() throws Exception {
		StatisticsService statisticsService= new StatisticsService();
		String condition = "lastYear";
		ArrayList<Statistics> result = statisticsService.getCommentCountForUser(condition);
		assertNotNull(result);
	}

	@Test
	public void testGetSumNewsStatistics() throws Exception {
		StatisticsService statisticsService= new StatisticsService();
		ArrayList<Statistics> result = statisticsService.getSumNewsStatistics();
		assertNotNull(result);
	}

	@Test
	public void testGetSumCommentStatistics() throws Exception {
		StatisticsService statisticsService= new StatisticsService();
		ArrayList<Statistics> result = statisticsService.getSumCommentStatistics();
		assertNotNull(result);
	}
}
