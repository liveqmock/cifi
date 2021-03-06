package com.kingdee.eas.fdc.invite.app;

import com.kingdee.bos.BOSException;
//import com.kingdee.bos.metadata.*;
import com.kingdee.bos.framework.*;
import com.kingdee.bos.util.*;
import com.kingdee.bos.Context;

import java.lang.String;
import com.kingdee.eas.common.EASBizException;
import com.kingdee.bos.metadata.entity.EntityViewInfo;
import com.kingdee.bos.dao.IObjectPK;
import com.kingdee.eas.fdc.invite.InviteContractFrameCollection;
import com.kingdee.bos.metadata.entity.SelectorItemCollection;
import com.kingdee.eas.framework.CoreBaseCollection;
import com.kingdee.bos.util.*;
import com.kingdee.eas.fdc.basedata.app.FDCDataBaseController;
import com.kingdee.bos.BOSException;
import com.kingdee.bos.Context;
import com.kingdee.eas.framework.CoreBaseInfo;
import com.kingdee.bos.framework.*;
import com.kingdee.eas.fdc.invite.InviteContractFrameInfo;

import java.rmi.RemoteException;
import com.kingdee.bos.framework.ejb.BizController;

public interface InviteContractFrameController extends FDCDataBaseController
{
    public InviteContractFrameInfo getInviteContractFrameInfo(Context ctx, IObjectPK pk) throws BOSException, EASBizException, RemoteException;
    public InviteContractFrameInfo getInviteContractFrameInfo(Context ctx, IObjectPK pk, SelectorItemCollection selector) throws BOSException, EASBizException, RemoteException;
    public InviteContractFrameInfo getInviteContractFrameInfo(Context ctx, String oql) throws BOSException, EASBizException, RemoteException;
    public InviteContractFrameCollection getInviteContractFrameCollection(Context ctx) throws BOSException, RemoteException;
    public InviteContractFrameCollection getInviteContractFrameCollection(Context ctx, EntityViewInfo view) throws BOSException, RemoteException;
    public InviteContractFrameCollection getInviteContractFrameCollection(Context ctx, String oql) throws BOSException, RemoteException;
    public boolean updateRelateData(Context ctx, String oldID, String newID, Object[] tables) throws BOSException, RemoteException;
    public Object[] getRelateData(Context ctx, String id, String[] tables) throws BOSException, RemoteException;
}