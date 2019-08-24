package io.github.noc.manager.model.dto.pub;

import io.github.noc.manager.model.dto.AbstractFormPageDTO;

/**
 * 用户查询form
 * @author LaoShu
 *
 */
public class PubUserFormDTO extends AbstractFormPageDTO {

	private String username;
	
	private String loginUserName;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLoginUserName() {
		return loginUserName;
	}

	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
	}

}
