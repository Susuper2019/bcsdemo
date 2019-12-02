package cn.bcs.bean;

import java.io.Serializable;
import java.util.List;

public class HomeData implements Serializable{
	private Integer id;
	private String title;
	private String titleTwo;
	private Double price;
	private Integer value;
	private String image;
	private List<ImgData> img;
	
	
	
	
	@Override
	public String toString() {
		return "HomeData [id=" + id + ", title=" + title + ", titleTwo=" + titleTwo + ", price=" + price + ", value="
				+ value + ", image=" + image + ", img=" + img + "]";
	}
	public List<ImgData> getImgDatas() {
		return img;
	}
	public void setImgDatas(List<ImgData> img) {
		this.img = img;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitleTwo() {
		return titleTwo;
	}
	public void setTitleTwo(String titleTwo) {
		this.titleTwo = titleTwo;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
