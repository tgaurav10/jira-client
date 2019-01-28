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
		ICredentials cred = new BasicCredentials("tgaurav@guidewire.com", "Dublin11");
		JiraClient jira = new JiraClient("https://jira.atlassian.com/", cred);
		String id = "IPG-751";
		Issue issue = jira.getIssue(id);

		assertNotNull(issue);
		assertEquals("with id " + id, id, issue.getId());
		final String expectedStatus = "IN PROGRESS";
		assertEquals("with status " + expectedStatus, expectedStatus, issue.getStatus());
	}

}
