package io.github.noc.manager.model.vo.pub;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import io.github.noc.manager.model.po.pub.PubOperationLogPO;
import io.github.noc.manager.model.vo.AbstractJqGridVO;

/**
 * 操作日志列表
 * @author abeir
 *
 */
public class PubOperationLogListVO extends AbstractJqGridVO<PubOperationLogPO> {

	public PubOperationLogListVO(Pagination pagination) {
		super(pagination);
	}

}
