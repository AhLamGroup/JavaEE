package service;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Statistics;
import dao.DatabaseDao;
import dao.StatisticsDao;

public class StatisticsService {
	public ArrayList<Statistics> getNewsCountForNewsAuthor(String condition) {
		ArrayList<Statistics> result = new ArrayList<Statistics>();
		try {
			DatabaseDao databaseDao = new DatabaseDao();
			StatisticsDao statisticsDao = new StatisticsDao();
			return statisticsDao.getNewsCountForNewsAuthor(condition, databaseDao);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public ArrayList<Statistics> getCommentCountForUser(String condition) {
		ArrayList<Statistics> result = new ArrayList<Statistics>();
		try {
			DatabaseDao databaseDao = new DatabaseDao();
			StatisticsDao statisticsDao = new StatisticsDao();
			return statisticsDao.getCommentCountForUser(condition, databaseDao);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public ArrayList<Statistics> getSumNewsStatistics() {
		ArrayList<Statistics> result = new ArrayList<Statistics>();
		try {
			DatabaseDao databaseDao = new DatabaseDao();
			StatisticsDao statisticsDao = new StatisticsDao();
			return statisticsDao.getSumNewsStatistics(databaseDao);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public ArrayList<Statistics> getSumCommentStatistics() {
		ArrayList<Statistics> result = new ArrayList<Statistics>();
		try {
			DatabaseDao databaseDao = new DatabaseDao();
			StatisticsDao statisticsDao = new StatisticsDao();
			return statisticsDao.getSumNewsStatistics(databaseDao);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
