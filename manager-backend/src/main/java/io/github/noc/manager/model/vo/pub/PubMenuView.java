package io.github.noc.manager.model.vo.pub;

import io.github.noc.manager.model.po.pub.PubMenuPO;

import java.io.Serializable;
import java.util.List;

/**
 * 菜单的视图模型
 * @author LaoShu
 *
 */
public class PubMenuView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3938906170751889528L;
	
	private List<PubMenuView> children;
	
	private PubMenuPO menu;

	public List<PubMenuView> getChildren() {
		return children;
	}

	public void setChildren(List<PubMenuView> children) {
		this.children = children;
	}

	public PubMenuPO getMenu() {
		return menu;
	}

	public void setMenu(PubMenuPO menu) {
		this.menu = menu;
	}
	
}
