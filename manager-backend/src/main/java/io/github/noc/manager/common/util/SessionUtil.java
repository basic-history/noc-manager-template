package io.github.noc.manager.common.util;

import io.github.noc.manager.common.Const;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

public class SessionUtil {
	
	/**
	 * 获取用户名
	 */
	public static final String getUserName() {
		String username = "";
		Subject subject = SecurityUtils.getSubject();
		Object obj = subject.getSession().getAttribute(Const.SESSION_USER);
		if(obj != null) {
			username = (String) obj;
		}
		return username;
	}

}
