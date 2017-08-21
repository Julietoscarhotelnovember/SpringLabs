package com.dto;

public class BoardDTO {
	private String title;
	private String content;
	private int index;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	@Override
	public String toString() {
		return "BoardDTO [title=" + title + ", content=" + content + ", index=" + index + "]";
	}
	
}
