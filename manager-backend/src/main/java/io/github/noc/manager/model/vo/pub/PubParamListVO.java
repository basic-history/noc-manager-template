package io.github.noc.manager.model.vo.pub;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import io.github.noc.manager.model.po.pub.PubParamPO;
import io.github.noc.manager.model.vo.AbstractJqGridVO;

public class PubParamListVO extends AbstractJqGridVO<PubParamPO> {

	public PubParamListVO(Pagination pagination) {
		super(pagination);
	}

}
