package com.kingdee.eas.fdc.invite.DirectNegotiationApproval.basedata;

import com.kingdee.bos.framework.ejb.EJBRemoteException;
import com.kingdee.bos.util.BOSObjectType;
import java.rmi.RemoteException;
import com.kingdee.bos.framework.AbstractBizCtrl;
import com.kingdee.bos.orm.template.ORMObject;

import java.lang.String;
import com.kingdee.bos.metadata.entity.EntityViewInfo;
import com.kingdee.eas.common.EASBizException;
import com.kingdee.bos.dao.IObjectPK;
import com.kingdee.eas.fdc.invite.DirectNegotiationApproval.basedata.app.*;
import com.kingdee.eas.framework.ITreeBase;
import com.kingdee.bos.metadata.entity.SelectorItemCollection;
import com.kingdee.eas.framework.CoreBaseCollection;
import com.kingdee.bos.util.*;
import com.kingdee.bos.BOSException;
import com.kingdee.bos.Context;
import com.kingdee.eas.framework.CoreBaseInfo;
import com.kingdee.bos.framework.*;
import com.kingdee.eas.framework.TreeBase;

public class EstimatedAmtTree extends TreeBase implements IEstimatedAmtTree
{
    public EstimatedAmtTree()
    {
        super();
        registerInterface(IEstimatedAmtTree.class, this);
    }
    public EstimatedAmtTree(Context ctx)
    {
        super(ctx);
        registerInterface(IEstimatedAmtTree.class, this);
    }
    public BOSObjectType getType()
    {
        return new BOSObjectType("12E21DA0");
    }
    private EstimatedAmtTreeController getController() throws BOSException
    {
        return (EstimatedAmtTreeController)getBizController();
    }
    /**
     *ȡֵ-System defined method
     *@param pk ȡֵ
     *@return
     */
    public EstimatedAmtTreeInfo getEstimatedAmtTreeInfo(IObjectPK pk) throws BOSException, EASBizException
    {
        try {
            return getController().getEstimatedAmtTreeInfo(getContext(), pk);
        }
        catch(RemoteException err) {
            throw new EJBRemoteException(err);
        }
    }
    /**
     *ȡֵ-System defined method
     *@param pk ȡֵ
     *@param selector ȡֵ
     *@return
     */
    public EstimatedAmtTreeInfo getEstimatedAmtTreeInfo(IObjectPK pk, SelectorItemCollection selector) throws BOSException, EASBizException
    {
        try {
            return getController().getEstimatedAmtTreeInfo(getContext(), pk, selector);
        }
        catch(RemoteException err) {
            throw new EJBRemoteException(err);
        }
    }
    /**
     *ȡֵ-System defined method
     *@param oql ȡֵ
     *@return
     */
    public EstimatedAmtTreeInfo getEstimatedAmtTreeInfo(String oql) throws BOSException, EASBizException
    {
        try {
            return getController().getEstimatedAmtTreeInfo(getContext(), oql);
        }
        catch(RemoteException err) {
            throw new EJBRemoteException(err);
        }
    }
    /**
     *ȡ����-System defined method
     *@return
     */
    public EstimatedAmtTreeCollection getEstimatedAmtTreeCollection() throws BOSException
    {
        try {
            return getController().getEstimatedAmtTreeCollection(getContext());
        }
        catch(RemoteException err) {
            throw new EJBRemoteException(err);
        }
    }
    /**
     *ȡ����-System defined method
     *@param view ȡ����
     *@return
     */
    public EstimatedAmtTreeCollection getEstimatedAmtTreeCollection(EntityViewInfo view) throws BOSException
    {
        try {
            return getController().getEstimatedAmtTreeCollection(getContext(), view);
        }
        catch(RemoteException err) {
            throw new EJBRemoteException(err);
        }
    }
    /**
     *ȡ����-System defined method
     *@param oql ȡ����
     *@return
     */
    public EstimatedAmtTreeCollection getEstimatedAmtTreeCollection(String oql) throws BOSException
    {
        try {
            return getController().getEstimatedAmtTreeCollection(getContext(), oql);
        }
        catch(RemoteException err) {
            throw new EJBRemoteException(err);
        }
    }
}