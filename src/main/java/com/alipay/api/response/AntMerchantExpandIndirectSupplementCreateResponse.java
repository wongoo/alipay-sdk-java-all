package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.supplement.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-03 17:55:28
 */
public class AntMerchantExpandIndirectSupplementCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3722689122186413786L;

	/** 
	 * 补录是否成功，TRUE成功，不会返回FALSE，补录异常会抛错误码
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}