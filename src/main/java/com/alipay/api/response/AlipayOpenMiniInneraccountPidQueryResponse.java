package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inneraccount.pid.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-09 14:05:04
 */
public class AlipayOpenMiniInneraccountPidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7213642146854659145L;

	/** 
	 * 虚拟PID
	 */
	@ApiField("pid")
	private String pid;

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

}
