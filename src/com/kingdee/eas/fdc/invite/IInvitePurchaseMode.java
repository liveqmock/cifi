package com.kingdee.eas.fdc.invite;

import com.kingdee.bos.BOSException;
//import com.kingdee.bos.metadata.*;
import com.kingdee.bos.framework.*;
import com.kingdee.bos.util.*;
import com.kingdee.bos.Context;

import com.kingdee.eas.fdc.basedata.IFDCDataBase;
import java.lang.String;
import com.kingdee.bos.util.*;
import com.kingdee.eas.common.EASBizException;
import com.kingdee.bos.metadata.entity.EntityViewInfo;
import com.kingdee.bos.dao.IObjectPK;
import com.kingdee.bos.Context;
import com.kingdee.bos.BOSException;
import com.kingdee.eas.framework.CoreBaseInfo;
import com.kingdee.bos.framework.*;
import com.kingdee.bos.metadata.entity.SelectorItemCollection;
import com.kingdee.eas.framework.CoreBaseCollection;

public interface IInvitePurchaseMode extends IFDCDataBase
{
    public InvitePurchaseModeInfo getInvitePurchaseModeInfo(IObjectPK pk) throws BOSException, EASBizException;
    public InvitePurchaseModeInfo getInvitePurchaseModeInfo(IObjectPK pk, SelectorItemCollection selector) throws BOSException, EASBizException;
    public InvitePurchaseModeInfo getInvitePurchaseModeInfo(String oql) throws BOSException, EASBizException;
    public InvitePurchaseModeCollection getInvitePurchaseModeCollection() throws BOSException;
    public InvitePurchaseModeCollection getInvitePurchaseModeCollection(EntityViewInfo view) throws BOSException;
    public InvitePurchaseModeCollection getInvitePurchaseModeCollection(String oql) throws BOSException;
    public boolean updateRelateData(String oldID, String newID, Object[] tables) throws BOSException;
    public Object[] getRelateData(String id, String[] tables) throws BOSException;
}