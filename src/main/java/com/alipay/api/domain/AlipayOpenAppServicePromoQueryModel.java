package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务推广查询
 *
 * @author auto create
 * @since 1.0, 2021-10-22 14:22:19
 */
public class AlipayOpenAppServicePromoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5172219513466643293L;

	/**
	 * 服务场景素材记录ID
	 */
	@ApiField("promo_record_id")
	private String promoRecordId;

	public String getPromoRecordId() {
		return this.promoRecordId;
	}
	public void setPromoRecordId(String promoRecordId) {
		this.promoRecordId = promoRecordId;
	}

}
