package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.promo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-16 19:25:22
 */
public class AlipayOpenAppServicePromoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2233571211798534452L;

	/** 
	 * 服务场景素材记录ID
	 */
	@ApiField("promo_record_id")
	private String promoRecordId;

	public void setPromoRecordId(String promoRecordId) {
		this.promoRecordId = promoRecordId;
	}
	public String getPromoRecordId( ) {
		return this.promoRecordId;
	}

}