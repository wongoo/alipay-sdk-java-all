package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.img.upload response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-24 13:59:17
 */
public class AlipayUserCertifyImgUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8333514771636321898L;

	/** 
	 * 图片上传成功后，返回的图片地址
	 */
	@ApiField("pic_url")
	private String picUrl;

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getPicUrl( ) {
		return this.picUrl;
	}

}
