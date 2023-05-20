package com.avega.io.client;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		return record.getClass()+"-"+record.getMessage()+"-"+record.getLevel()+"-"+record.getMillis();
	}

}
