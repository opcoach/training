// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 


package com.opcoach.message.impl;

public class MessageKeyGenerator
{
	/** The string separator value used in key format */
	public static final String KEY_SEPARATOR = "MES_";

	private static long _lastValue = 0L;

	// Generated the unique key id.
	public static String generateKeyId()
	{
		long value;

		synchronized (MessageKeyGenerator.class)
		{
			while ((value = System.currentTimeMillis()) == _lastValue)
			{
				// iterate
			}
			_lastValue = value;
		}

		int poidFort = (int) ((value & 0xffff0000) >> 32);
		int poidFaible = (int) (value & 0x0000fff);
		String kf = Integer.toHexString(poidFaible);
		return (poidFort == 0) ? KEY_SEPARATOR + kf : KEY_SEPARATOR + Integer.toHexString(poidFort) + kf;
	}

}
