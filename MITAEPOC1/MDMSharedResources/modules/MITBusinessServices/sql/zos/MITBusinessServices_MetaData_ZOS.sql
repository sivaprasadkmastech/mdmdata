
-- @SqlSnippetPriority 400
-- @SqlModuleOrdering 3

-- The following source code ("Code") may only be used in accordance with the terms
-- and conditions of the license agreement you have with IBM Corporation. The Code 
-- is provided to you on an "AS IS" basis, without warranty of any kind.  
-- SUBJECT TO ANY STATUTORY WARRANTIES WHICH CAN NOT BE EXCLUDED, IBM MAKES NO 
-- WARRANTIES OR CONDITIONS EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED 
-- TO, THE IMPLIED WARRANTIES OR CONDITIONS OF MERCHANTABILITY, FITNESS FOR A 
-- PARTICULAR PURPOSE, AND NON-INFRINGEMENT, REGARDING THE CODE. IN NO EVENT WILL 
-- IBM BE LIABLE TO YOU OR ANY PARTY FOR ANY DIRECT, INDIRECT, SPECIAL OR OTHER 
-- CONSEQUENTIAL DAMAGES FOR ANY USE OF THE CODE, INCLUDING, WITHOUT LIMITATION, 
-- LOSS OF, OR DAMAGE TO, DATA, OR LOST PROFITS, BUSINESS, REVENUE, GOODWILL, OR 
-- ANTICIPATED SAVINGS, EVEN IF IBM HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH 
-- DAMAGES. SOME JURISDICTIONS DO NOT ALLOW THE EXCLUSION OR LIMITATION OF 
-- INCIDENTAL OR CONSEQUENTIAL DAMAGES, SO THE ABOVE LIMITATION OR EXCLUSION MAY 
-- NOT APPLY TO YOU.



-- MDM_TODO: CDKWB0044I Review CDDWLCOLUMNTP LOCALE_SENSITIVE settings
-- MDM_TODO: CDKWB0043I You may need to add entries to the INTERNALTXNKEY table for any new transactions


-- Notes
-- MDM_TODO: CDKWB0046I Statements are placed in the generated SQL file when user changes are required.
-- 1. Edit the following SQL files following any associated instructions.
-- 2. Connect to the database.
-- 3. Run each SQL file as shown below and in the same order.
-- 			db2 -vf MITBusinessServices_SETUP_ZOS.sql
-- 			db2 -vf MITBusinessServices_TRIGGERS_ZOS.sql
-- 			db2 -vf MITBusinessServices_CONSTRAINTS_ZOS.sql
--			db2 -vf MITBusinessServices_ERRORS_100_DB2.sql
-- 			db2 -vf MITBusinessServices_MetaData_ZOS.sql
-- 			db2 -vf CONFIG_XMLSERVICES_RESPONSE_ZOS.sql
-- 			db2 -vf MITBusinessServices_CODETABLES_ZOS.sql
--#SET TERMINATOR ;



----------------------------------------------
-- Component type
----------------------------------------------

INSERT INTO DB2ADMIN.COMPONENTTYPE (COMPONENT_TYPE_ID, DWL_PROD_TP_CD, COMPON_TYPE_VALUE, COMPON_LONG_DESC, LAST_UPDATE_DT, COMPONENT_CLASS ) 
   VALUES ( 1000018, 1, 'MaintainPartyBusinessProxy', null, CURRENT_TIMESTAMP, null);

----------------------------------------------
-- Error messages
----------------------------------------------

   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000021, 1000018, 'INSERR', 1000019, CURRENT_TIMESTAMP);

---------------------------------------------
-- Metadata setup
---------------------------------------------


----------------------------------------------
-- V_GROUP
----------------------------------------------


CREATE SEQUENCE DB2ADMIN.GROUPDWLTABLE_ID_SEQ AS BIGINT START WITH 1000000 INCREMENT BY 1 MINVALUE 1000000 MAXVALUE 1009999 CACHE 10;


DROP SEQUENCE DB2ADMIN.GROUPDWLTABLE_ID_SEQ RESTRICT;

----------------------------------------------
-- V_ELEMENTATTRIBUTE
----------------------------------------------


CREATE SEQUENCE DB2ADMIN.V_ELATTR_ID_SEQ AS BIGINT START WITH 1000000 INCREMENT BY 1 MINVALUE 1000000 MAXVALUE 1009999 CACHE 10;

DROP SEQUENCE DB2ADMIN.V_ELATTR_ID_SEQ RESTRICT;

----------------------------------------------
-- Transactions
----------------------------------------------


----------------------------------------------
-- CDBUSINESSTXTP
----------------------------------------------


INSERT INTO DB2ADMIN.CDBUSINESSTXTP (BUSINESS_TX_TP_CD, NAME, DESCRIPTION, EXPIRY_DT, LAST_UPDATE_DT, TX_LOG_IND, TX_OBJECT_TP, DEPRECATED_SINCE, DWL_PROD_TP_CD, PARENT_BUSINESS_TX_TP_CD) 
   VALUES (1000009, 'maintainParty', null, null, CURRENT_TIMESTAMP, 'N', 'P', null, 1, null);

INSERT INTO DB2ADMIN.EXTERNALTXNKEY (EXTERN_TX_KEY_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_USER, LAST_UPDATE_DT)
   VALUES (1000010, 1000009, 'TCRM', (select GROUP_NAME from DB2ADMIN.V_GROUP where OBJECT_NAME ='com.dwl.tcrm.coreParty.component.TCRMPartyBObj'), 'PartyId', null, CURRENT_TIMESTAMP);


----------------------------------------------
-- CDINTERNALTXNTP
----------------------------------------------




----------------------------------------------
-- BUSINTERNALTXN
----------------------------------------------



----------------------------------------------
-- BUSINESSTXREQRESP
----------------------------------------------


  
INSERT INTO DB2ADMIN.BUSINESSTXREQRESP (BUSTX_REQRESP_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000014, 1000009, 'TCRM', (select GROUP_NAME from DB2ADMIN.V_GROUP where OBJECT_NAME ='com.dwl.tcrm.coreParty.component.TCRMPartyBObj'), 'I', null, null, 1, 'cusadmin', CURRENT_TIMESTAMP, null);

INSERT INTO DB2ADMIN.BUSINESSTXREQRESP (BUSTX_REQRESP_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000015, 1000009, 'TCRM', (select GROUP_NAME from DB2ADMIN.V_GROUP where OBJECT_NAME ='com.dwl.tcrm.coreParty.component.TCRMPartyBObj'), 'O', null, null, null, 'cusadmin', CURRENT_TIMESTAMP, 'N');
	    


----------------------------------------------
-- INTERNALTXREQRESP
----------------------------------------------


----------------------------------------------
-- GROUPTXMAP
----------------------------------------------



----------------------------------------------
-- TAIL setup
----------------------------------------------



INSERT INTO DB2ADMIN.ASIDEFINITION (ASI_DEFINITION_ID, ASI_NAME, TRANSFORM_TP_CD, MAPPING_DEFN, ADAPTER_NAME, DESCRIPTION, START_DT, LAST_UPDATE_DT)
	VALUES (1000004, 'http://businessServices.mdm.mit.com/MITBusinessServices/port', 1, 'com.ibm.mdm.asi.transformation.MDMDefaultWSReqTransformation', 'com.ibm.mdm.asi.MDMOperationalServicesRequestAdapter', 'WS request transform for MITBusinessServices', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
	
INSERT INTO DB2ADMIN.ASIDEFINITION (ASI_DEFINITION_ID, ASI_NAME, TRANSFORM_TP_CD, MAPPING_DEFN, ADAPTER_NAME, DESCRIPTION, START_DT, LAST_UPDATE_DT)
	VALUES (1000005, 'http://businessServices.mdm.mit.com/MITBusinessServices/port', 2, 'com.ibm.mdm.asi.transformation.MDMDefaultWSRespTransformation', 'com.ibm.mdm.asi.MDMDefaultResponseAdapter', 'WS response transform for MITBusinessServices', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
	
