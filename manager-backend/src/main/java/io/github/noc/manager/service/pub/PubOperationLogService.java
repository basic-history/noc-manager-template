package io.github.noc.manager.service.pub;

import io.github.noc.manager.model.dto.pub.PubOperationLogFormDTO;
import io.github.noc.manager.model.po.pub.PubOperationLogPO;
import io.github.noc.manager.model.vo.pub.PubOperationLogListVO;

public interface PubOperationLogService {
	/**
	 * 保存操作日志
	 * @param operationLog
	 */
	void save(PubOperationLogPO operationLog);
	/**
	 * 查询操作日志
	 * @param form
	 * @return
	 */
	PubOperationLogListVO query(PubOperationLogFormDTO form);
	/**
	 * 查询备注
	 * @param id
	 * @return
	 */
	String getRemark(String id);
}
