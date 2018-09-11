package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bean.Authority;
import service.AuthorityService;

public class AuthorityServiceTest {

	@Test
	public void testGetAll() throws Exception{
		AuthorityService authorityService=new AuthorityService();
		List<Authority> authorities=authorityService.getAll();
		assertNotNull(authorities);
	}
}
