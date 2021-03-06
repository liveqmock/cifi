package com.kingdee.eas.fdc.invite.designsupplier.designbase;

import java.io.Serializable;
import com.kingdee.bos.dao.AbstractObjectValue;
import java.util.Locale;
import com.kingdee.util.TypeConversionUtils;
import com.kingdee.bos.util.BOSObjectType;


public class AbstractDesignAppraiseTemplateInfo extends com.kingdee.eas.framework.DataBaseInfo implements Serializable 
{
    public AbstractDesignAppraiseTemplateInfo()
    {
        this("id");
    }
    protected AbstractDesignAppraiseTemplateInfo(String pkField)
    {
        super(pkField);
        put("E1", new com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignAppraiseTemplateE1Collection());
    }
    /**
     * Object: 供应商评审模板 's 组别 property 
     */
    public com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignAppraiseTemplateTreeInfo getTreeid()
    {
        return (com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignAppraiseTemplateTreeInfo)get("treeid");
    }
    public void setTreeid(com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignAppraiseTemplateTreeInfo item)
    {
        put("treeid", item);
    }
    /**
     * Object: 供应商评审模板 's 模板类型 property 
     */
    public com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignAppraiseTemplateTreeInfo getTempType()
    {
        return (com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignAppraiseTemplateTreeInfo)get("tempType");
    }
    public void setTempType(com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignAppraiseTemplateTreeInfo item)
    {
        put("tempType", item);
    }
    /**
     * Object: 供应商评审模板 's 评审类型 property 
     */
    public com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignAccreditationTypeInfo getAccreditationType()
    {
        return (com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignAccreditationTypeInfo)get("AccreditationType");
    }
    public void setAccreditationType(com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignAccreditationTypeInfo item)
    {
        put("AccreditationType", item);
    }
    /**
     * Object:供应商评审模板's 备注property 
     */
    public String getRemake()
    {
        return getString("remake");
    }
    public void setRemake(String item)
    {
        setString("remake", item);
    }
    /**
     * Object: 供应商评审模板 's 指标分录 property 
     */
    public com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignAppraiseTemplateE1Collection getE1()
    {
        return (com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignAppraiseTemplateE1Collection)get("E1");
    }
    /**
     * Object:供应商评审模板's 是否启用property 
     */
    public boolean isIsEnable()
    {
        return getBoolean("isEnable");
    }
    public void setIsEnable(boolean item)
    {
        setBoolean("isEnable", item);
    }
    /**
     * Object:供应商评审模板's 状态property 
     */
    public com.kingdee.eas.fdc.basedata.FDCBillStateEnum getState()
    {
        return com.kingdee.eas.fdc.basedata.FDCBillStateEnum.getEnum(getString("state"));
    }
    public void setState(com.kingdee.eas.fdc.basedata.FDCBillStateEnum item)
    {
		if (item != null) {
        setString("state", item.getValue());
		}
    }
    /**
     * Object:供应商评审模板's 审批日期property 
     */
    public java.util.Date getAuditDate()
    {
        return getDate("auditDate");
    }
    public void setAuditDate(java.util.Date item)
    {
        setDate("auditDate", item);
    }
    /**
     * Object: 供应商评审模板 's 审批人 property 
     */
    public com.kingdee.eas.base.permission.UserInfo getAuditPerson()
    {
        return (com.kingdee.eas.base.permission.UserInfo)get("auditPerson");
    }
    public void setAuditPerson(com.kingdee.eas.base.permission.UserInfo item)
    {
        put("auditPerson", item);
    }
    public BOSObjectType getBOSType()
    {
        return new BOSObjectType("0DF83DA2");
    }
}