package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BusinessRelationShopDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.shopdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-04 14:25:22
 */
public class AlipayBusinessRelationShopdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4134921998267624988L;

	/** 
	 * 门店详情信息
	 */
	@ApiField("shop_info")
	private BusinessRelationShopDetailInfo shopInfo;

	public void setShopInfo(BusinessRelationShopDetailInfo shopInfo) {
		this.shopInfo = shopInfo;
	}
	public BusinessRelationShopDetailInfo getShopInfo( ) {
		return this.shopInfo;
	}

}