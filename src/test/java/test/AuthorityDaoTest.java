package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bean.Authority;
import dao.AuthorityDao;

public class AuthorityDaoTest {

	@Test
	public void testGetAll() throws Exception{
		AuthorityDao authorityDao=new AuthorityDao();
		List<Authority> authorities=authorityDao.getAll();
		assertNotNull(authorities);
	}

}
