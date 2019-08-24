package io.github.noc.manager.model.vo.pub;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import io.github.noc.manager.model.po.pub.PubRolePO;
import io.github.noc.manager.model.vo.AbstractJqGridVO;

public class PubRoleListVO extends AbstractJqGridVO<PubRolePO> {

	public PubRoleListVO(Pagination pagination) {
		super(pagination);
	}

}
