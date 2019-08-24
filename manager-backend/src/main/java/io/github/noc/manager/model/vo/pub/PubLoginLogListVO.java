package io.github.noc.manager.model.vo.pub;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import io.github.noc.manager.model.po.pub.PubLoginLogPO;
import io.github.noc.manager.model.vo.AbstractJqGridVO;

public class PubLoginLogListVO extends AbstractJqGridVO<PubLoginLogPO> {

	public PubLoginLogListVO(Pagination pagination) {
		super(pagination);
	}

}
