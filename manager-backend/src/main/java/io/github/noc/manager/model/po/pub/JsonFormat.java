package io.github.noc.manager.model.po.pub;

import java.util.List;

public class JsonFormat {
	
	private String value;
	
	private String label;
	
	private List<JsonChildren> children;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<JsonChildren> getChildren() {
		return children;
	}

	public void setChildren(List<JsonChildren> children) {
		this.children = children;
	}

}
