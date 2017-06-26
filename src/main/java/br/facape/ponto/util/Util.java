package br.facape.ponto.util;

import java.util.Calendar;
import java.util.Date;

public class Util {

	public static Date somenteData(Date d) {

		final Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();

	}

}
