package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家安心充配置操作流水查询
 *
 * @author auto create
 * @since 1.0, 2021-11-18 14:10:32
 */
public class AntMerchantExpandMembercardOperationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4576323336697876944L;

	/**
	 * 安心充配置操作的流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
