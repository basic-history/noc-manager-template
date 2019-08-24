package io.github.noc.manager.controller.pub;

import io.github.noc.manager.model.dto.pub.PubLoginLogFormDTO;
import io.github.noc.manager.model.vo.pub.PubLoginLogListVO;
import io.github.noc.manager.service.pub.PubLoginLogService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 登录日志查询
 * @author cheng
 *
 */
@Controller
@RequestMapping("/pubLoginLog")
public class PubLoginLogController {
	
	@Autowired
	private PubLoginLogService loginLogService;

	/**
	 * 查询页 
	 */
	@RequiresPermissions("pubLoginLog:list")
	@RequestMapping("/list")
	public String list() {
		return "/pub/pubLoginLog/list";
	}
	
	/**
	 * 查询结果 
	 */
	@RequiresPermissions("pubLoginLog:list")
	@RequestMapping("/query")
	@ResponseBody
	public PubLoginLogListVO query(PubLoginLogFormDTO form) {
		return loginLogService.queryList(form);
	}

	
}
