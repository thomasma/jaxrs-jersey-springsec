package com.aver.restful;


public interface TimeOfTheDayService {

	public abstract String getTimeOfTheDay(String name);

	public abstract Time getTimeOfTheDayInXML(String name);

	public abstract Time getTimeOfTheDayInJSON(String name);

}