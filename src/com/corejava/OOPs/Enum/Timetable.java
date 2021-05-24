package com.corejava.OOPs.Enum;

public class Timetable {
	 
	  // Returns name of Job will do
	  public static String getJob(int dayInWeek) {
	      
		  if (dayInWeek == WeekDayConstants.SATURDAY || dayInWeek == WeekDayConstants.SUNDAY) {
	          return "Nothing";
	      }
	      return "Coding";
	  }
	}
