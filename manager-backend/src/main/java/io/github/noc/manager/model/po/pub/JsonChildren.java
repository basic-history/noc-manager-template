package io.github.noc.manager.model.po.pub;

import java.util.List;

public class JsonChildren {

	private String value;
	
	private String label;
	
	private List<JsonChildren> jsonChildren;

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

	public List<JsonChildren> getJsonChildren() {
		return jsonChildren;
	}

	public void setJsonChildren(List<JsonChildren> jsonChildren) {
		this.jsonChildren = jsonChildren;
	}

}
