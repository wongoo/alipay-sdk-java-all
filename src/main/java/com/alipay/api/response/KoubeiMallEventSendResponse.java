package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.mall.event.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-09 10:31:52
 */
public class KoubeiMallEventSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5542623981662776761L;

	/** 
	 * 事件ID
	 */
	@ApiField("event_id")
	private String eventId;

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventId( ) {
		return this.eventId;
	}

}
