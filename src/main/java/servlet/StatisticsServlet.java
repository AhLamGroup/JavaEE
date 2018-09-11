package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Statistics;
import service.StatisticsService;

public class StatisticsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StatisticsService statisticsService = new StatisticsService();
		String condition = request.getParameter("condition");
		if ("eachMonthOfLastYear".equals(condition)) {//查询最近一年每个月用户和作者的数据
			ArrayList<Statistics> sumNewsStatistics = statisticsService.getSumNewsStatistics();
			ArrayList<Statistics> sumCommentStatistics = statisticsService.getSumCommentStatistics();
			request.setAttribute("sumNewsStatistics", sumNewsStatistics);
			request.setAttribute("sumCommentStatistics", sumCommentStatistics);
		} else {//分别显示每个用户和作者在指定时间内的数据
			ArrayList<Statistics> newsAuthorResult = statisticsService.getNewsCountForNewsAuthor(condition);
			ArrayList<Statistics> userResult = statisticsService.getCommentCountForUser(condition);
			request.setAttribute("newsAuthorResult", newsAuthorResult);
			request.setAttribute("userResult", userResult);
		}

		request.setAttribute("condition", condition);
		getServletContext().getRequestDispatcher("/statisticsFunction.jsp").forward(request, response);
	}

}
