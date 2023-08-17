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
 * IBM-MDMWB-1.0-[dfe95542b64f9e889c0e5545a671b2fb]
 */

package com.mit.mdm.businessServices.compositeTxn;

import com.dwl.base.DWLCommon;
import com.dwl.base.IDWLErrorMessage;
import com.dwl.base.error.DWLError;
import com.dwl.base.error.DWLStatus;
import com.dwl.base.requestHandler.DWLTransactionPersistent;
import com.dwl.base.requestHandler.DWLTxnBP;
import com.dwl.tcrm.common.TCRMResponse;
import com.dwl.tcrm.utilities.TCRMClassFactory;
import com.dwl.unifi.tx.exception.BusinessProxyException;


import com.dwl.base.DWLControl;

import com.dwl.tcrm.coreParty.component.TCRMPartyBObj;

import com.mit.mdm.businessServices.constant.MITBusinessServicesComponentID;
import com.mit.mdm.businessServices.constant.MITBusinessServicesErrorReasonCode;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * 
 * @generated
 */
public class MaintainPartyCompositeTxnBP  extends DWLTxnBP {

	/**
	 * @generated
	 **/
	private IDWLErrorMessage errHandler;
	
	/**
	  * <!-- begin-user-doc -->
	  * <!-- end-user-doc -->
	  * @generated 
	  */
	 private final static com.dwl.base.logging.IDWLLogger logger = com.dwl.base.logging.DWLLoggerManager.getLogger(MaintainPartyCompositeTxnBP.class);
	/**
	 * @generated
	 **/
    public MaintainPartyCompositeTxnBP() {
        super();
        errHandler = TCRMClassFactory.getErrorHandler();
    }
	/**
	 * @generated
	 **/
    public Object execute(Object inputObj) throws BusinessProxyException {
		logger.finest("ENTER Object execute(Object inputObj)");

        TCRMResponse outputTxnObj = null;
        DWLTransactionPersistent inputTxnObj = (DWLTransactionPersistent) inputObj;
        DWLControl control = inputTxnObj.getTxnControl();
        DWLCommon topLevelObject = (DWLCommon) inputTxnObj.getTxnTopLevelObject();
        if (!(topLevelObject instanceof TCRMPartyBObj)) {
            // MDM_TODO0: CDKWB0014I optionally use a more appropriate error code than
            // "MAINTAINPARTY_FAILED".
            DWLError error = errHandler.getErrorMessage(MITBusinessServicesComponentID.MAINTAIN_PARTY_BUSINESS_PROXY,
                                                        "INSERR",
                                                        MITBusinessServicesErrorReasonCode.MAINTAINPARTY_FAILED,
                                                        control, new String[0]);
            throw new BusinessProxyException(error.getErrorMessage());
        }
        
        TCRMPartyBObj mainInput = (TCRMPartyBObj) topLevelObject;
        
        
        // MDM_TODO: CDKWB0015I No base transactions were selected, add business logic to
        // implement the transaction here.
        
        
        // MDM_TODO: CDKWB0013I build the response Bobj.
        TCRMPartyBObj mainOutput = new TCRMPartyBObj();
        mainOutput.setControl(control);

        // Construct the response object.
        DWLStatus outputStatus = new DWLStatus();
        outputStatus.setStatus(DWLStatus.SUCCESS);
        outputTxnObj = new TCRMResponse();
        outputTxnObj.setStatus(outputStatus);
        outputTxnObj.setData(mainOutput);
		logger.finest("RETURN Object execute(Object inputObj)");
        return outputTxnObj;
    }
}


