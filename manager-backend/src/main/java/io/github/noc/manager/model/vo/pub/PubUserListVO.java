package io.github.noc.manager.model.vo.pub;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import io.github.noc.manager.model.po.pub.PubUserPO;
import io.github.noc.manager.model.vo.AbstractJqGridVO;

public class PubUserListVO extends AbstractJqGridVO<PubUserPO> {

	public PubUserListVO(Pagination pagination) {
		super(pagination);
	}

}
