package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.standardcontent.publish response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-29 11:23:56
 */
public class AlipaySocialBaseContentlibStandardcontentPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 3257819366397273729L;

	/** 
	 * 内容发布后生成的ID，请建议业务方务必保存到本地（关联查询内容详情、删除内容等其他开放接口）
	 */
	@ApiField("content_id")
	private String contentId;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

}
