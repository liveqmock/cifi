package com.kingdee.eas.fdc.invite.designsupplier.subill;

import com.kingdee.bos.BOSException;
//import com.kingdee.bos.metadata.*;
import com.kingdee.bos.framework.*;
import com.kingdee.bos.util.*;
import com.kingdee.bos.Context;

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
import com.kingdee.eas.framework.ICoreBillBase;

public interface IDesignSupplierSelect extends ICoreBillBase
{
    public DesignSupplierSelectCollection getDesignSupplierSelectCollection() throws BOSException;
    public DesignSupplierSelectCollection getDesignSupplierSelectCollection(EntityViewInfo view) throws BOSException;
    public DesignSupplierSelectCollection getDesignSupplierSelectCollection(String oql) throws BOSException;
    public DesignSupplierSelectInfo getDesignSupplierSelectInfo(IObjectPK pk) throws BOSException, EASBizException;
    public DesignSupplierSelectInfo getDesignSupplierSelectInfo(IObjectPK pk, SelectorItemCollection selector) throws BOSException, EASBizException;
    public DesignSupplierSelectInfo getDesignSupplierSelectInfo(String oql) throws BOSException, EASBizException;
    public void audit(DesignSupplierSelectInfo model) throws BOSException;
    public void unAudit(DesignSupplierSelectInfo model) throws BOSException;
}