package io.github.noc.manager.model.dto.pub;

import io.github.noc.manager.model.dto.AbstractFormPageDTO;

/**
 * 登录日志查询form
 * @author cheng
 *
 */
public class PubLoginLogFormDTO extends AbstractFormPageDTO {
	
	private String username;
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
