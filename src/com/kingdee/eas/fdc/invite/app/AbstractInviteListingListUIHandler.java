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
public abstract class AbstractInviteListingListUIHandler extends com.kingdee.eas.fdc.invite.app.InviteListBaseUIHandler

{
	public void handleActionAudit(RequestContext request,ResponseContext response, Context context) throws Exception {
		_handleActionAudit(request,response,context);
	}
	protected void _handleActionAudit(RequestContext request,ResponseContext response, Context context) throws Exception {
	}
	public void handleActionUnAudit(RequestContext request,ResponseContext response, Context context) throws Exception {
		_handleActionUnAudit(request,response,context);
	}
	protected void _handleActionUnAudit(RequestContext request,ResponseContext response, Context context) throws Exception {
	}
	public void handleActionSetKeyItem(RequestContext request,ResponseContext response, Context context) throws Exception {
		_handleActionSetKeyItem(request,response,context);
	}
	protected void _handleActionSetKeyItem(RequestContext request,ResponseContext response, Context context) throws Exception {
	}
	public void handleActionFilterItem(RequestContext request,ResponseContext response, Context context) throws Exception {
		_handleActionFilterItem(request,response,context);
	}
	protected void _handleActionFilterItem(RequestContext request,ResponseContext response, Context context) throws Exception {
	}
}