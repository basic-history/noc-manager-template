package io.github.noc.manager.dao.pub;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.github.noc.manager.model.PageCondition;
import io.github.noc.manager.model.dto.pub.PubLoginLogFormDTO;
import io.github.noc.manager.model.po.pub.PubLoginLogPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PubLoginLogDao extends BaseMapper<PubLoginLogPO> {

	/**
	 * 按条件分页查询
	 * @param page
	 * @param form
	 * @return
	 */
	List<PubLoginLogPO> find(PageCondition page, @Param("form")PubLoginLogFormDTO form);
	
}
