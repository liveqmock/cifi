/**
 * output package name
 */
package com.kingdee.eas.fdc.invite.app;

import com.kingdee.bos.Context;
import com.kingdee.eas.framework.batchHandler.RequestContext;
import com.kingdee.eas.framework.batchHandler.ResponseContext;


/**
 * output class name
 */
public abstract class AbstractKeyItemAnalyseUIHandler extends com.kingdee.eas.framework.app.CoreUIHandler

{
	public void handleActionExportExcel(RequestContext request,ResponseContext response, Context context) throws Exception {
		_handleActionExportExcel(request,response,context);
	}
	protected void _handleActionExportExcel(RequestContext request,ResponseContext response, Context context) throws Exception {
	}
	public void handleActionPrint(RequestContext request,ResponseContext response, Context context) throws Exception {
		_handleActionPrint(request,response,context);
	}
	protected void _handleActionPrint(RequestContext request,ResponseContext response, Context context) throws Exception {
	}
	public void handleActionPrintPreview(RequestContext request,ResponseContext response, Context context) throws Exception {
		_handleActionPrintPreview(request,response,context);
	}
	protected void _handleActionPrintPreview(RequestContext request,ResponseContext response, Context context) throws Exception {
	}
	public void handleActionRefresh(RequestContext request,ResponseContext response, Context context) throws Exception {
		_handleActionRefresh(request,response,context);
	}
	protected void _handleActionRefresh(RequestContext request,ResponseContext response, Context context) throws Exception {
	}
}