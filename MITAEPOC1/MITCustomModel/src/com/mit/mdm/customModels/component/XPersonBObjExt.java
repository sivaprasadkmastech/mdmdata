
/*
 * The following source code ("Code") may only be used in accordance with the terms
 * and conditions of the license agreement you have with IBM Corporation. The Code 
 * is provided to you on an "AS IS" basis, without warranty of any kind.  
 * SUBJECT TO ANY STATUTORY WARRANTIES WHICH CAN NOT BE EXCLUDED, IBM MAKES NO 
 * WARRANTIES OR CONDITIONS EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED 
 * TO, THE IMPLIED WARRANTIES OR CONDITIONS OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE, AND NON-INFRINGEMENT, REGARDING THE CODE. IN NO EVENT WILL 
 * IBM BE LIABLE TO YOU OR ANY PARTY FOR ANY DIRECT, INDIRECT, SPECIAL OR OTHER 
 * CONSEQUENTIAL DAMAGES FOR ANY USE OF THE CODE, INCLUDING, WITHOUT LIMITATION, 
 * LOSS OF, OR DAMAGE TO, DATA, OR LOST PROFITS, BUSINESS, REVENUE, GOODWILL, OR 
 * ANTICIPATED SAVINGS, EVEN IF IBM HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH 
 * DAMAGES. SOME JURISDICTIONS DO NOT ALLOW THE EXCLUSION OR LIMITATION OF 
 * INCIDENTAL OR CONSEQUENTIAL DAMAGES, SO THE ABOVE LIMITATION OR EXCLUSION MAY 
 * NOT APPLY TO YOU.
 */

/*
 * IBM-MDMWB-1.0-[cd060f631a4f06b51aa370fac585bd9d]
 */

package com.mit.mdm.customModels.component;

import com.dwl.base.util.DWLClassFactory;
import com.dwl.tcrm.exception.TCRMReadException;



import com.dwl.base.DWLControl;
import com.dwl.base.IDWLErrorMessage;

import com.dwl.base.error.DWLError;
import com.dwl.base.error.DWLErrorCode;
import com.dwl.base.error.DWLStatus;

import com.dwl.base.exception.DWLBaseException;

import com.dwl.base.util.DWLExceptionUtils;
import com.dwl.base.util.DWLFunctionUtils;

import com.dwl.tcrm.common.IExtension;
import com.dwl.tcrm.common.ITCRMValidation;
import com.dwl.tcrm.common.TCRMErrorCode;

import com.dwl.tcrm.coreParty.component.TCRMPersonBObj;

import com.mit.mdm.customModels.constant.MITCustomModelComponentID;
import com.mit.mdm.customModels.constant.MITCustomModelErrorReasonCode;

import com.mit.mdm.customModels.entityObject.EObjXPersonExt;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * This class provides the implementation of the business object
 * <code>XPersonBObjExt</code>.
 * 
 * @see com.dwl.tcrm.common.TCRMCommon
 * @generated
 */
 

@SuppressWarnings("serial")
public class XPersonBObjExt extends TCRMPersonBObj implements IExtension {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EObjXPersonExt eObjXPersonExt;
	/**
	  * <!-- begin-user-doc -->
	  * <!-- end-user-doc -->
	  * @generated 
	  */
	 private final static com.dwl.base.logging.IDWLLogger logger = com.dwl.base.logging.DWLLoggerManager.getLogger(XPersonBObjExt.class);
		
 


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */     
    public XPersonBObjExt() {
        super();
        init();
        eObjXPersonExt = new EObjXPersonExt(getEObjPerson());
        setComponentID(MITCustomModelComponentID.XPERSON_BOBJ_EXT);
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Initializes the fields required to populate the metaDataMap. Each key is
     * an element-level field of the business object.
     *
     * @generated
     */
    private void init() {
        metaDataMap.put("XBandLevel", null);
        metaDataMap.put("XPersonHistActionCode", null);
        metaDataMap.put("XPersonHistCreateDate", null);
        metaDataMap.put("XPersonHistCreatedBy", null);
        metaDataMap.put("XPersonHistEndDate", null);
        metaDataMap.put("XPersonHistoryIdPK", null);
        metaDataMap.put("XPersonLastUpdateDate", null);
        metaDataMap.put("XPersonLastUpdateTxId", null);
        metaDataMap.put("XPersonLastUpdateUser", null);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Refreshes all the attributes this business object supports.
     *
     * @see com.dwl.base.DWLCommon#refreshMap()
     * @generated
     */
    public void refreshMap() {

        if (bRequireMapRefresh) {
            super.refreshMap();
            metaDataMap.put("XBandLevel", getXBandLevel());
            metaDataMap.put("XPersonHistActionCode", getXPersonHistActionCode());
            metaDataMap.put("XPersonHistCreateDate", getXPersonHistCreateDate());
            metaDataMap.put("XPersonHistCreatedBy", getXPersonHistCreatedBy());
            metaDataMap.put("XPersonHistEndDate", getXPersonHistEndDate());
            metaDataMap.put("XPersonHistoryIdPK", getXPersonHistoryIdPK());
            metaDataMap.put("XPersonLastUpdateDate", getXPersonLastUpdateDate());
            metaDataMap.put("XPersonLastUpdateTxId", getXPersonLastUpdateTxId());
            metaDataMap.put("XPersonLastUpdateUser", getXPersonLastUpdateUser());
            bRequireMapRefresh = false;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the control object on this business object.
     *
     * @see com.dwl.base.DWLCommon#setControl(DWLControl)
     * @generated
     */
    public void setControl(DWLControl newDWLControl) {
        super.setControl(newDWLControl);

        if (eObjXPersonExt != null) {
            eObjXPersonExt.setControl(newDWLControl);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the entity object associated with this business object.
     *
     * @generated
     */
    public EObjXPersonExt getEObjXPersonExt() {
        bRequireMapRefresh = true;
        return eObjXPersonExt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the entity object associated with this business object.
     *
     * @param eObjXPersonExt
     *            The eObjXPersonExt to set.
     * @generated
     */
    public void setEObjXPersonExt(EObjXPersonExt eObjXPersonExt) {
        bRequireMapRefresh = true;
        this.eObjXPersonExt = eObjXPersonExt;
        this.eObjXPersonExt.setBaseEntity(getEObjPerson());
        if (this.eObjXPersonExt != null && this.eObjXPersonExt.getControl() == null) {
            DWLControl control = this.getControl();
            if (control != null) {
                this.eObjXPersonExt.setControl(control);
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the xBandLevel attribute.
     * 
     * @generated
     */
    public String getXBandLevel (){
   
        return eObjXPersonExt.getXBandLevel();
    }
    

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the xBandLevel attribute.
     * 
     * @param newXBandLevel
     *     The new value of xBandLevel.
     * @generated
     */
    public void setXBandLevel( String newXBandLevel ) throws Exception {
        metaDataMap.put("XBandLevel", newXBandLevel);

        if (newXBandLevel == null || newXBandLevel.equals("")) {
            newXBandLevel = null;


        }
        eObjXPersonExt.setXBandLevel( newXBandLevel );
     }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the LastUpdateTxId attribute.
     *
     * @generated
     */
    public String getXPersonLastUpdateTxId() {
        return DWLFunctionUtils.getStringFromLong(eObjXPersonExt.getLastUpdateTxId());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the LastUpdateUser attribute.
     *
     * @generated
     */
    public String getXPersonLastUpdateUser() {
        return eObjXPersonExt.getLastUpdateUser();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the LastUpdateDt attribute.
     *
     * @generated
     */
    public String getXPersonLastUpdateDate() {
        return DWLFunctionUtils.getStringFromTimestamp(eObjXPersonExt.getLastUpdateDt());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the LastUpdateTxId attribute.
     *
     * @param newLastUpdateTxId
     *     The new value of LastUpdateTxId.
     * @generated
     */
    public void setXPersonLastUpdateTxId(String newLastUpdateTxId) {
        metaDataMap.put("XPersonLastUpdateTxId", newLastUpdateTxId);

        if ((newLastUpdateTxId == null) || newLastUpdateTxId.equals("")) {
            newLastUpdateTxId = null;
        }
        eObjXPersonExt.setLastUpdateTxId(DWLFunctionUtils.getLongFromString(newLastUpdateTxId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the LastUpdateUser attribute.
     *
     * @param newLastUpdateUser
     *     The new value of LastUpdateUser.
     * @generated
     */
    public void setXPersonLastUpdateUser(String newLastUpdateUser) {
        metaDataMap.put("XPersonLastUpdateUser", newLastUpdateUser);

        if ((newLastUpdateUser == null) || newLastUpdateUser.equals("")) {
            newLastUpdateUser = null;
        }
        eObjXPersonExt.setLastUpdateUser(newLastUpdateUser);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the LastUpdateDt attribute.
     *
     * @param newLastUpdateDt
     *     The new value of LastUpdateDt.
     * @throws Exception
     * @generated
     */
    public void setXPersonLastUpdateDate(String newLastUpdateDt) throws Exception {
        metaDataMap.put("XPersonLastUpdateDate", newLastUpdateDt);

        if ((newLastUpdateDt == null) || newLastUpdateDt.equals("")) {
            newLastUpdateDt = null;
        }

        eObjXPersonExt.setLastUpdateDt(DWLFunctionUtils.getTimestampFromTimestampString(newLastUpdateDt));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the XPersonHistActionCode history attribute.
     *
     * @generated
     */
    public String getXPersonHistActionCode() {
        return eObjXPersonExt.getHistActionCode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the XPersonHistActionCode history attribute.
     *
     * @param aXPersonHistActionCode
     *     The new value of XPersonHistActionCode.
     * @generated
     */
    public void setXPersonHistActionCode(String aXPersonHistActionCode) {
        metaDataMap.put("XPersonHistActionCode", aXPersonHistActionCode);

        if ((aXPersonHistActionCode == null) || aXPersonHistActionCode.equals("")) {
            aXPersonHistActionCode = null;
        }
        eObjXPersonExt.setHistActionCode(aXPersonHistActionCode);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the XPersonHistCreateDate history attribute.
     *
     * @generated
     */
    public String getXPersonHistCreateDate() {
        return DWLFunctionUtils.getStringFromTimestamp(eObjXPersonExt.getHistCreateDt());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the XPersonHistCreateDate history attribute.
     *
     * @param aXPersonHistCreateDate
     *     The new value of XPersonHistCreateDate.
     * @generated
     */
    public void setXPersonHistCreateDate(String aXPersonHistCreateDate) throws Exception{
        metaDataMap.put("XPersonHistCreateDate", aXPersonHistCreateDate);

        if ((aXPersonHistCreateDate == null) || aXPersonHistCreateDate.equals("")) {
            aXPersonHistCreateDate = null;
        }

        eObjXPersonExt.setHistCreateDt(DWLFunctionUtils.getTimestampFromTimestampString(aXPersonHistCreateDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the XPersonHistCreatedBy history attribute.
     *
     * @generated
     */
    public String getXPersonHistCreatedBy() {
        return eObjXPersonExt.getHistCreatedBy();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the XPersonHistCreatedBy history attribute.
     *
     * @param aXPersonHistCreatedBy
     *     The new value of XPersonHistCreatedBy.
     * @generated
     */
    public void setXPersonHistCreatedBy(String aXPersonHistCreatedBy) {
        metaDataMap.put("XPersonHistCreatedBy", aXPersonHistCreatedBy);

        if ((aXPersonHistCreatedBy == null) || aXPersonHistCreatedBy.equals("")) {
            aXPersonHistCreatedBy = null;
        }

        eObjXPersonExt.setHistCreatedBy(aXPersonHistCreatedBy);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the XPersonHistEndDate history attribute.
     *
     * @generated
     */
    public String getXPersonHistEndDate() {
        return DWLFunctionUtils.getStringFromTimestamp(eObjXPersonExt.getHistEndDt());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the XPersonHistEndDate history attribute.
     *
     * @param aXPersonHistEndDate
     *     The new value of XPersonHistEndDate.
     * @generated
     */
    public void setXPersonHistEndDate(String aXPersonHistEndDate) throws Exception{
        metaDataMap.put("XPersonHistEndDate", aXPersonHistEndDate);

        if ((aXPersonHistEndDate == null) || aXPersonHistEndDate.equals("")) {
            aXPersonHistEndDate = null;
        }
        eObjXPersonExt.setHistEndDt(DWLFunctionUtils.getTimestampFromTimestampString(aXPersonHistEndDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the XPersonHistoryIdPK history attribute.
     *
     * @generated
     */
    public String getXPersonHistoryIdPK() {
        return DWLFunctionUtils.getStringFromLong(eObjXPersonExt.getHistoryIdPK());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the XPersonHistoryIdPK history attribute.
     *
     * @param aXPersonHistoryIdPK
     *     The new value of XPersonHistoryIdPK.
     * @generated
     */
    public void setXPersonHistoryIdPK(String aXPersonHistoryIdPK) {
        metaDataMap.put("XPersonHistoryIdPK", aXPersonHistoryIdPK);

        if ((aXPersonHistoryIdPK == null) || aXPersonHistoryIdPK.equals("")) {
            aXPersonHistoryIdPK = null;
        }
        eObjXPersonExt.setHistoryIdPK(DWLFunctionUtils.getLongFromString(aXPersonHistoryIdPK));
    }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Perform validation during an add transaction.
     *
     * @generated
     */
    public DWLStatus validateAdd(int level, DWLStatus status) throws Exception {

        status = super.validateAdd(level, status);
        if (level == ITCRMValidation.CONTROLLER_LEVEL_VALIDATION) {
            // MDM_TODO0: CDKWB0038I Add any controller-level custom validation logic to be
            // executed for this object during an "add" transaction

        }

        if (level == ITCRMValidation.COMPONENT_LEVEL_VALIDATION){
            // MDM_TODO0: CDKWB0039I Add any component-level custom validation logic to be
            // executed for this object during an "add" transaction
        }
        status = getValidationStatus(level, status);
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Perform validation during an update transaction.
     *
     * @generated
     */
    public DWLStatus validateUpdate(int level, DWLStatus status) throws Exception {
		logger.finest("ENTER validateUpdate(int level, DWLStatus status)");

        status = super.validateUpdate(level, status);
        if (level == ITCRMValidation.CONTROLLER_LEVEL_VALIDATION) {
            // MDM_TODO0: CDKWB0040I Add any controller-level custom validation logic to be
            // executed for this object during an "update" transaction

        }

        if (level == ITCRMValidation.COMPONENT_LEVEL_VALIDATION){
            assignBeforeImageValues(metaDataMap);
            
            // MDM_TODO0: CDKWB0041I Add any component-level custom validation logic to be
            // executed for this object during an "update" transaction
        }
        status = getValidationStatus(level, status);
		if (logger.isFinestEnabled()) {
        	String returnValue = status.toString();
			logger.finest("RETURN validateUpdate(int level, DWLStatus status) " + returnValue);
		}
        return status;
    }



    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Perform validation common to both add and update transactions.
     *
     * @generated
     */
     
    private DWLStatus getValidationStatus(int level, DWLStatus status) throws Exception {
		logger.finest("ENTER getValidationStatus(int level, DWLStatus status)");

        if (level == ITCRMValidation.CONTROLLER_LEVEL_VALIDATION) {
            // MDM_TODO0: CDKWB0034I Add any common controller-level custom validation
            // logic to be executed for this object during either "add" or
            // "update" transactions
    	}

        if (level == ITCRMValidation.COMPONENT_LEVEL_VALIDATION){
            // MDM_TODO0: CDKWB0035I Add any common component-level custom validation logic
            // to be executed for this object during either "add" or "update"
            // transactions
        }
        
        if (logger.isFinestEnabled()) {
            String returnValue = status.toString();
			logger.finest("RETURN getValidationStatus(int level, DWLStatus status) " + returnValue);
        }
		
        return status;
    }

    private DWLError createDWLError(String entityName, String propertyName,String reasonCode){	
		DWLError err = new DWLError();
		err.setComponentType(new Long(MITCustomModelComponentID.XPERSON_BOBJ_EXT).longValue());
		err.setReasonCode(new Long(reasonCode).longValue());
		err.setErrorType(DWLErrorCode.FIELD_VALIDATION_ERROR);
        if (logger.isFinestEnabled()) {
			String infoForLogging="Error: Validation error occured. Property " + propertyName + " is null, in entity " + entityName + ", component type " +err.getComponentType() + " ReasonCode " +err.getReasonCode() + "  ";
			logger.finest("createDWLError " + infoForLogging);
		}
		return err;
    }
    






	 /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets a record from the extension table.
     *
     * @throws DWLBaseException
     * @generated
     */
    public void getRecord() throws DWLBaseException {
		logger.finest("ENTER getRecord()");
		
		try {
         			
         }
         catch (Exception e) {
            DWLExceptionUtils.log(e);
            
            if (logger.isFinestEnabled()) {
        		String infoForLogging="Error: Error reading record " + e.getMessage(); 
			logger.finest("getRecord() " + infoForLogging);
			}
            status = new DWLStatus();

            TCRMReadException readEx = new TCRMReadException();
            IDWLErrorMessage  errHandler = DWLClassFactory.getErrorHandler();
            DWLError          error = errHandler.getErrorMessage(MITCustomModelComponentID.XPERSON_BOBJ_EXT,
                                                                 TCRMErrorCode.READ_RECORD_ERROR,
                                                                 MITCustomModelErrorReasonCode.READ_EXTENSION_XPERSON_FAILED,
                                                                 getControl(), new String[0]);
            error.setThrowable(e);
            status.addError(error);
            status.setStatus(DWLStatus.FATAL);
            readEx.setStatus(status);
            throw readEx;
        }	    		
		logger.finest("RETURN getRecord()");
	}


}

