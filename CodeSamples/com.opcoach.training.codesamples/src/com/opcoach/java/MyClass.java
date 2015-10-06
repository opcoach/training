package com.opcoach.java;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MyClass
{
	public static final String DEFAULT_DATE = "defaultDate";
	private static Map<String, Object> _cache;

	static
	{
		_cache = new HashMap<String, Object>();
		_cache.put(DEFAULT_DATE, new Date());
	}
}