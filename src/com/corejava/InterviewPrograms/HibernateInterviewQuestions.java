package com.corejava.InterviewPrograms;

public class HibernateInterviewQuestions
{
	/* 1.What is the difference between hibernate and spring JDBC template? 
	 * List any advantages and disadvantages
	 * 
	 * Spring provides hibernate DAO template and it has many advantages like 
	 * 1) It removes boiler plate code like getting connection from data source, 
	 * try/catch block for closing connection. So that developer can focus on 
	 * writing business logic rather then writing boilier plate code every where. 
	 * 2) Spring hibernateTemplate also throws RunTime exception compared to 
	 * checkd exception which allows to remove writing try/catch block in each DAO. 
	 * 3) It also gives richer template class, using which developer can write 
	 * query code easily. This template class also allows to get session explicitly, 
	 * so if developer wants to get session object and work on it, then it's possible. 
	 * 
	 * Disadvantage 
	 * 1) It doesn't support to cann stored procedure 
	 * 2) Don't have method to execute SQL query 
	 * 
	 * 
	 * 
	 */

}
