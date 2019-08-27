package io.github.noc.manager.common.extension;

import io.github.noc.manager.common.util.ApplicationContextUtils;

public class SequenceGenerator {

	public static String next(String sequenceName) {
		MysqlSequenceIncrementer incrementer = ApplicationContextUtils.getBean("pub_sequence#".concat(sequenceName),
				MysqlSequenceIncrementer.class);
		return incrementer.nextStringValue();
	}

}
