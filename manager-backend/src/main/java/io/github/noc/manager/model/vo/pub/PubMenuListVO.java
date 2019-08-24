package io.github.noc.manager.model.vo.pub;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import io.github.noc.manager.model.po.pub.PubMenuPO;
import io.github.noc.manager.model.vo.AbstractJqGridVO;

public class PubMenuListVO extends AbstractJqGridVO<PubMenuPO> {

	public PubMenuListVO(Pagination pagination) {
		super(pagination);
	}

}
