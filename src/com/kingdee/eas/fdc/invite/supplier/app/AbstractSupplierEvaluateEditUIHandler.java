/**
 * output package name
 */
package com.kingdee.eas.fdc.invite.supplier.app;

import com.kingdee.bos.Context;
import com.kingdee.eas.framework.batchHandler.RequestContext;
import com.kingdee.eas.framework.batchHandler.ResponseContext;


/**
 * output class name
 */
public abstract class AbstractSupplierEvaluateEditUIHandler extends com.kingdee.eas.fdc.basedata.app.FDCBillEditUIHandler

{
	public void handleActionSupplierInfo(RequestContext request,ResponseContext response, Context context) throws Exception {
		_handleActionSupplierInfo(request,response,context);
	}
	protected void _handleActionSupplierInfo(RequestContext request,ResponseContext response, Context context) throws Exception {
	}
	public void handleActionModelInfo(RequestContext request,ResponseContext response, Context context) throws Exception {
		_handleActionModelInfo(request,response,context);
	}
	protected void _handleActionModelInfo(RequestContext request,ResponseContext response, Context context) throws Exception {
	}
}