package com.kingdee.eas.fdc.invite.DirectNegotiationApproval.basedata.app;

import org.apache.log4j.Logger;
import javax.ejb.*;
import java.rmi.RemoteException;
import com.kingdee.bos.*;
import com.kingdee.bos.util.BOSObjectType;
import com.kingdee.bos.metadata.IMetaDataPK;
import com.kingdee.bos.metadata.rule.RuleExecutor;
import com.kingdee.bos.metadata.MetaDataPK;
//import com.kingdee.bos.metadata.entity.EntityViewInfo;
import com.kingdee.bos.framework.ejb.AbstractEntityControllerBean;
import com.kingdee.bos.framework.ejb.AbstractBizControllerBean;
//import com.kingdee.bos.dao.IObjectPK;
import com.kingdee.bos.dao.IObjectValue;
import com.kingdee.bos.dao.IObjectCollection;
import com.kingdee.bos.service.ServiceContext;
import com.kingdee.bos.service.IServiceContext;

import java.lang.String;
import com.kingdee.eas.common.EASBizException;
import com.kingdee.bos.metadata.entity.EntityViewInfo;
import com.kingdee.bos.dao.IObjectPK;
import com.kingdee.eas.framework.CoreBaseInfo;
import com.kingdee.eas.fdc.invite.DirectNegotiationApproval.basedata.EstimatedAmtCollection;
import com.kingdee.eas.framework.ObjectBaseCollection;
import com.kingdee.eas.framework.app.DataBaseControllerBean;
import com.kingdee.bos.metadata.entity.SelectorItemCollection;
import com.kingdee.eas.framework.CoreBaseCollection;
import com.kingdee.eas.framework.DataBaseCollection;
import com.kingdee.eas.fdc.invite.DirectNegotiationApproval.basedata.EstimatedAmtInfo;

public class EstimatedAmtControllerBean extends AbstractEstimatedAmtControllerBean
{
    private static Logger logger =
        Logger.getLogger("com.kingdee.eas.fdc.invite.DirectNegotiationApproval.basedata.app.EstimatedAmtControllerBean");
    
    protected void _cancelCancel(Context ctx, IObjectPK pk, IObjectValue model)
    		throws BOSException, EASBizException {
    	EstimatedAmtInfo info = getEstimatedAmtInfo(ctx, pk);
    	info.setUse(true);
    	update(ctx, pk, info);
    }
    
    protected void _cancel(Context ctx, IObjectPK pk, IObjectValue model)
    		throws BOSException, EASBizException {
    	EstimatedAmtInfo info = getEstimatedAmtInfo(ctx, pk);
    	info.setUse(false);
    	update(ctx, pk, info);
    }
}