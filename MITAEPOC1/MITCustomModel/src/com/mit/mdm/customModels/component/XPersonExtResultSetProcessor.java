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
 * IBM-MDMWB-1.0-[682390fcad4760ea610adcfb1c9a3f83]
 */

package com.mit.mdm.customModels.component;

import java.sql.ResultSet;
import java.util.Vector;
import java.util.Queue;


import com.dwl.tcrm.coreParty.component.TCRMPersonResultSetProcessor;

import com.mit.mdm.customModels.component.XPersonBObjExt;

import com.mit.mdm.customModels.entityObject.EObjXPersonExt;


/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * This class provides a concrete implementation of the interface
 * <code>IResultSetProcessor</code>.
 *
 * @see com.mit.mdm.customModels.bobj.query.XPersonBObjExtQuery
 *
 * @generated
 */

public class XPersonExtResultSetProcessor extends TCRMPersonResultSetProcessor {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Default constructor.
     *
     * @generated
     */
    public XPersonExtResultSetProcessor() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Creates business objects from the supplied result set.
     *
     * @generated
     */
    @SuppressWarnings("rawtypes")
    public Vector getObjectFromResultSet(ResultSet rs) throws Exception {
        return super.getObjectFromResultSet(rs);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
	 * @generated
	 **/
    public Object createObject(Object eObjs) throws Exception {
        XPersonBObjExt theBObj = (XPersonBObjExt) super.createObject(eObjs);
        Queue<?> eobjQueue = (Queue<?>) eObjs;
        if( !eobjQueue.isEmpty() )
        {
        	EObjXPersonExt theEObj = (EObjXPersonExt)  eobjQueue.remove();
	        theBObj.setEObjXPersonExt( theEObj );
        }
        return theBObj;
    }

}


