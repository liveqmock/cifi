/**
 * output package name
 */
package com.kingdee.eas.fdc.invite.designsupplier.designbase.client;

import java.awt.event.*;

import org.apache.log4j.Logger;
import com.kingdee.bos.ui.face.CoreUIObject;
import com.kingdee.bos.ctrl.extendcontrols.KDBizMultiLangBox;
import com.kingdee.bos.ctrl.swing.KDTextField;
import com.kingdee.bos.dao.IObjectValue;
import com.kingdee.eas.fdc.basedata.FDCDataBaseInfo;
import com.kingdee.eas.fdc.basedata.client.FDCClientVerifyHelper;
import com.kingdee.eas.framework.*;

/**
 * output class name
 */
public class DesignLevelSetUpEditUI extends AbstractDesignLevelSetUpEditUI
{
    private static final Logger logger = CoreUIObject.getLogger(DesignLevelSetUpEditUI.class);
    
    /**
     * output class constructor
     */
    public DesignLevelSetUpEditUI() throws Exception
    {
        super();
    }
    /**
     * output loadFields method
     */
    public void loadFields()
    {
        super.loadFields();
    }

    /**
     * output storeFields method
     */
    public void storeFields()
    {
        super.storeFields();
    }

    /**
     * output getBizInterface method
     */
    protected com.kingdee.eas.framework.ICoreBase getBizInterface() throws Exception
    {
        return com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignLevelSetUpFactory.getRemoteInstance();
    }

    /**
     * output createNewData method
     */
    protected com.kingdee.bos.dao.IObjectValue createNewData()
    {
        com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignLevelSetUpInfo objectValue = new com.kingdee.eas.fdc.invite.designsupplier.designbase.DesignLevelSetUpInfo();
        objectValue.setCreator((com.kingdee.eas.base.permission.UserInfo)(com.kingdee.eas.common.client.SysContext.getSysContext().getCurrentUser()));
		
        return objectValue;
    }
    protected FDCDataBaseInfo getEditData() {
		return this.editData;
	}
	protected KDBizMultiLangBox getNameCtrl() {
		return this.txtName;
	}
	protected KDTextField getNumberCtrl() {
		return this.txtNumber;
	}
	protected void verifyInput(ActionEvent e) throws Exception {
		FDCClientVerifyHelper.verifyEmpty(this, this.txtNumber);
		FDCClientVerifyHelper.verifyEmpty(this, this.txtName);
		super.verifyInput(e);
	}
	public void onLoad() throws Exception {
		super.onLoad();
		this.txtDescription.setMaxLength(255);
		this.txtNumber.setRequired(true);
		this.txtName.setRequired(true);
		this.setUITitle("ְҵ����");
	}

}