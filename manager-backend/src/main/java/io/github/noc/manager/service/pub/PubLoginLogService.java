package io.github.noc.manager.service.pub;

import io.github.noc.manager.model.dto.pub.PubLoginLogFormDTO;
import io.github.noc.manager.model.po.pub.PubLoginLogPO;
import io.github.noc.manager.model.vo.pub.PubLoginLogListVO;

public interface PubLoginLogService {
	
	/**
	 * 登录成功日志
	 * @param username
	 * @param log
	 */
	void success(String username, PubLoginLogPO log);
	
	/**
	 * 登录失败日志
	 * @param username
	 * @param log
	 */
	void fail(String username, PubLoginLogPO log);
	
	/**
	 * 列表查询
	 * @param form
	 * @return
	 */
	PubLoginLogListVO queryList(PubLoginLogFormDTO form);
	

	
}
