package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.taxbill.signcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-04 11:08:35
 */
public class AlipayFundTaxbillSigncodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8879396993635478692L;

	/** 
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 签约吱口令，请求成功响应时存在
	 */
	@ApiField("sign_code")
	private String signCode;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setSignCode(String signCode) {
		this.signCode = signCode;
	}
	public String getSignCode( ) {
		return this.signCode;
	}

}
