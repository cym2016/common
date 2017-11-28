package com.heepay.common.util;


/**
 * 用户状态
 * 
 * 
 */
public enum ImgType {
	
	/** 菜单图片 */
	CATE_IMAGE(1, "菜单图片"),
	/**富文本编辑器的图片*/
	IMAGES(3, "富文本图片");
	

	private final int value;
	private final String name;

	ImgType(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public int value() {
		return value;
	}

	public static ImgType valueOf(int value) {
		for (ImgType e : ImgType.values()) {
			if (e.value() == value) {
				return e;
			}
		}
		return null;
	}

	public String labelOf(int val) {
		if (valueOf(val) != null) {
			return valueOf(val).name;
		}
		return null;
	}

	@Override
	public String toString() {
		return this.name;
	}
	
}