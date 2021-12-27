package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动核销商品详情
 *
 * @author auto create
 * @since 1.0, 2021-11-16 11:24:23
 */
public class ActivityGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 5235555888859258683L;

	/**
	 * 商品编码
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 活动单品类型。 枚举值: AVAILABLE可用单品 UNAVAILABLE不可用单品
	 */
	@ApiField("goods_use_type")
	private String goodsUseType;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsUseType() {
		return this.goodsUseType;
	}
	public void setGoodsUseType(String goodsUseType) {
		this.goodsUseType = goodsUseType;
	}

}