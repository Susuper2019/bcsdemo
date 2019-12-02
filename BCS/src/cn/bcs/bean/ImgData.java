package cn.bcs.bean;

import java.io.Serializable;

public class ImgData implements Serializable {
	private Integer id;
	private String image;
	private String mode;
	
	
	@Override
	public String toString() {
		return "img [id=" + id + ", image=" + image + ", mode=" + mode + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
}
