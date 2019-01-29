package net.rcarz.jiraclient;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Test cases for stuff relating to filters.
 */
public class Example {

	@Test
	public void testGetIssue() throws JiraException {		
		JiraClient jira = new JiraClient("https://guidewirejira.atlassian.net/", null);		
		String key = "IPG-565";
	    Issue issue = jira.getIssue(key);
	    
	    assertEquals("with key " + key, key, issue.getKey());
	    System.out.println(issue.getDescription());

	}

}
