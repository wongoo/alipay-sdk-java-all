package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育缴费账单更新
 *
 * @author auto create
 * @since 1.0, 2021-08-27 17:11:39
 */
public class AlipayCommerceEducateBillServiceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5627646564739512456L;

	/**
	 * 支付宝外部交易号
	 */
	@ApiField("isv_order_no")
	private String isvOrderNo;

	/**
	 * 交易单状态：
4-已退款
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 退款信息，交易单状态为4-已退款，退款信息不能为空
	 */
	@ApiField("refund_info")
	private EduRefundInfo refundInfo;

	/**
	 * 缴费平台的账单来源
1-ISV发送；
2-钉钉同步
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 实际付款人编号
	 */
	@ApiField("user_id")
	private String userId;

	public String getIsvOrderNo() {
		return this.isvOrderNo;
	}
	public void setIsvOrderNo(String isvOrderNo) {
		this.isvOrderNo = isvOrderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public EduRefundInfo getRefundInfo() {
		return this.refundInfo;
	}
	public void setRefundInfo(EduRefundInfo refundInfo) {
		this.refundInfo = refundInfo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}