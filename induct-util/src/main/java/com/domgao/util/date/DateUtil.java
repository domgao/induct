package com.domgao.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 日期工具类
 * @author domgao
 *
 */
public class DateUtil {

	public static final String DATE = "yyyy-MM-dd";
	
	public static final String DATE_TIME = "yyyy-MM-dd HH:mm:ss";
	
	public static final String DATETTIME = "yyyyMMdd'T'HHmmss";
	
	/**
	 * 字符串转 LocalDate
	 * @param dateStr
	 * @return
	 */
	public static LocalDate strToLocalDate(String dateStr){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE);
		LocalDate localDate = LocalDate.parse(dateStr, formatter);
		return localDate;
	}
	
	/**
	 * LocalDate 转字符串
	 * @param localDate
	 * @return
	 */
	public static String localDateToStr(LocalDate localDate){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE);
		String dateStr = localDate.format(formatter);
		return dateStr;
	}
	
	/**
	 * 字符串转 LocalDateTime
	 * @param dateStr
	 * @param pattern
	 * @return
	 */
	public static LocalDateTime strToLocalDateTime(String dateStr, String pattern){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		LocalDateTime localDateTime = LocalDateTime.parse(dateStr, formatter);
		return localDateTime;
	}
	
	/**
	 * LocalDateTime 转字符串
	 * @param localDateTime
	 * @param pattern
	 * @return
	 */
	public static String localDateTimeToStr(LocalDateTime localDateTime, String pattern){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		String dateStr = localDateTime.format(formatter);
		return dateStr;
	}
	
}
