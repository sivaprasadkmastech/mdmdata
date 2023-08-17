
-- @SqlSnippetPriority 100
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

-- Notes
-- MDM_TODO: CDKWB0046I Statements are placed in the generated SQL file when user changes are required.
-- 1. Edit the following SQL files following any associated instructions.
-- 2. Connect to the database.
-- 3. Run each SQL file as shown below and in the same order.
-- 			db2 -vf MITCustomModel_SETUP_DB2.sql
-- 			db2 -vf MITCustomModel_TRIGGERS_DB2.sql
-- 			db2 -vf MITCustomModel_CONSTRAINTS_DB2.sql
--			db2 -vf MITCustomModel_ERRORS_100_DB2.sql
-- 			db2 -vf MITCustomModel_MetaData_DB2.sql
-- 			db2 -vf CONFIG_XMLSERVICES_RESPONSE_DB2.sql
-- 			db2 -vf MITCustomModel_CODETABLES_DB2.sql

--#SET TERMINATOR ;

ALTER TABLE DB2ADMIN.PERSON
    ADD COLUMN XBand_Level VARCHAR(250) ;
ALTER TABLE DB2ADMIN.H_PERSON
    ADD COLUMN XBand_Level VARCHAR(250) ;

-- @SqlSnippetPriority 200
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

-- Notes
-- MDM_TODO: CDKWB0046I Statements are placed in the generated SQL file when user changes are required.
-- 1. Edit the following SQL files following any associated instructions.
-- 2. Connect to the database.
-- 3. Run each SQL file as shown below and in the same order.
-- 			db2 -vf MITCustomModel_SETUP_DB2.sql
-- 			db2 -vf MITCustomModel_TRIGGERS_DB2.sql
-- 			db2 -vf MITCustomModel_CONSTRAINTS_DB2.sql
--			db2 -vf MITCustomModel_ERRORS_100_DB2.sql
-- 			db2 -vf MITCustomModel_MetaData_DB2.sql
-- 			db2 -vf CONFIG_XMLSERVICES_RESPONSE_DB2.sql
-- 			db2 -vf MITCustomModel_CODETABLES_DB2.sql

--#SET TERMINATOR @



-- @SqlSnippetPriority 300
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

-- Notes
-- MDM_TODO: CDKWB0046I Statements are placed in the generated SQL file when user changes are required.
-- 1. Edit the following SQL files following any associated instructions.
-- 2. Connect to the database.
-- 3. Run each SQL file as shown below and in the same order.
-- 			db2 -vf MITCustomModel_SETUP_DB2.sql
-- 			db2 -vf MITCustomModel_TRIGGERS_DB2.sql
-- 			db2 -vf MITCustomModel_CONSTRAINTS_DB2.sql
--			db2 -vf MITCustomModel_ERRORS_100_DB2.sql
-- 			db2 -vf MITCustomModel_MetaData_DB2.sql
-- 			db2 -vf CONFIG_XMLSERVICES_RESPONSE_DB2.sql
-- 			db2 -vf MITCustomModel_CODETABLES_DB2.sql

--#SET TERMINATOR ;



-- @SqlSnippetPriority 350
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



-- Notes
-- MDM_TODO: CDKWB0046I Statements are placed in the generated SQL file when user changes are required.
-- 1. Edit the following SQL files following any associated instructions.
-- 2. Connect to the database.
-- 3. Run each SQL file as shown below and in the same order.
-- 			db2 -vf MITBusinessServices_SETUP_DB2.sql
-- 			db2 -vf MITBusinessServices_TRIGGERS_DB2.sql
-- 			db2 -vf MITBusinessServices_CONSTRAINTS_DB2.sql
--			db2 -vf MITBusinessServices_ERRORS_100_DB2.sql
-- 			db2 -vf MITBusinessServices_MetaData_DB2.sql
-- 			db2 -vf CONFIG_XMLSERVICES_RESPONSE_DB2.sql
-- 			db2 -vf MITBusinessServices_CODETABLES_DB2.sql
	
--#SET TERMINATOR ;


-- For locale: 100 / default
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000019, 'The following transaction failed: maintainParty.', 'The transaction maintainParty failed.', CURRENT_TIMESTAMP);

-- @SqlSnippetPriority 350
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



-- Notes
-- MDM_TODO: CDKWB0046I Statements are placed in the generated SQL file when user changes are required.
-- 1. Edit the following SQL files following any associated instructions.
-- 2. Connect to the database.
-- 3. Run each SQL file as shown below and in the same order.
-- 			db2 -vf MITCustomModel_SETUP_DB2.sql
-- 			db2 -vf MITCustomModel_TRIGGERS_DB2.sql
-- 			db2 -vf MITCustomModel_CONSTRAINTS_DB2.sql
--			db2 -vf MITCustomModel_ERRORS_100_DB2.sql
-- 			db2 -vf MITCustomModel_MetaData_DB2.sql
-- 			db2 -vf CONFIG_XMLSERVICES_RESPONSE_DB2.sql
-- 			db2 -vf MITCustomModel_CODETABLES_DB2.sql
	
--#SET TERMINATOR ;


-- For locale: 100 / default
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 2000037, 'Insert of the following failed: XPerson.', 'XPerson insert failed.', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 2000041, 'Delete of the following failed: XPerson.', 'XPerson delete failed.', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 2000045, 'Read of the following failed: XPerson.', 'XPerson read failed.', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 2000049, 'Update of the following failed: XPerson.', 'XPerson update failed.', CURRENT_TIMESTAMP);

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
-- 			db2 -vf MITBusinessServices_SETUP_DB2.sql
-- 			db2 -vf MITBusinessServices_TRIGGERS_DB2.sql
-- 			db2 -vf MITBusinessServices_CONSTRAINTS_DB2.sql
--			db2 -vf MITBusinessServices_ERRORS_100_DB2.sql
-- 			db2 -vf MITBusinessServices_MetaData_DB2.sql
-- 			db2 -vf CONFIG_XMLSERVICES_RESPONSE_DB2.sql
-- 			db2 -vf MITBusinessServices_CODETABLES_DB2.sql
	
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
-- 			db2 -vf MITCustomModel_SETUP_DB2.sql
-- 			db2 -vf MITCustomModel_TRIGGERS_DB2.sql
-- 			db2 -vf MITCustomModel_CONSTRAINTS_DB2.sql
--			db2 -vf MITCustomModel_ERRORS_100_DB2.sql
-- 			db2 -vf MITCustomModel_MetaData_DB2.sql
-- 			db2 -vf CONFIG_XMLSERVICES_RESPONSE_DB2.sql
-- 			db2 -vf MITCustomModel_CODETABLES_DB2.sql
	
	--#SET TERMINATOR ;
	


----------------------------------------------
-- Component type
----------------------------------------------

INSERT INTO DB2ADMIN.COMPONENTTYPE (COMPONENT_TYPE_ID, DWL_PROD_TP_CD, COMPON_TYPE_VALUE, COMPON_LONG_DESC, LAST_UPDATE_DT, COMPONENT_CLASS ) 
   VALUES ( 2000013, 1, 'XPersonBObjExt', null, CURRENT_TIMESTAMP, null);

----------------------------------------------
-- Error messages
----------------------------------------------

   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (2000015, 2000013, 'FVERR', 20, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (2000038, 2000013, 'INSERR', 2000037, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (2000042, 2000013, 'DELERR', 2000041, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (2000046, 2000013, 'READERR', 2000045, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (2000050, 2000013, 'UPDERR', 2000049, CURRENT_TIMESTAMP);

---------------------------------------------
-- Metadata setup
---------------------------------------------

----------------------------------------------
-- Add records for the table columns for XPerson
----------------------------------------------


INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE, JDBC_TYPE)
VALUES (2000059, (SELECT t.DWLTABLE_TP_CD FROM DB2ADMIN.CDDWLTABLETP t WHERE t.TABLE_NAME = 'PERSON'), 'XBand_Level', null, CURRENT_TIMESTAMP, null, 'N', 'VARCHAR');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE, JDBC_TYPE)
VALUES (2000060, (SELECT t.DWLTABLE_TP_CD FROM DB2ADMIN.CDDWLTABLETP t WHERE t.TABLE_NAME = 'H_PERSON'), 'XBand_Level', null, CURRENT_TIMESTAMP, null, 'N', 'VARCHAR');

----------------------------------------------
-- V_GROUP
----------------------------------------------

INSERT INTO DB2ADMIN.V_GROUP (GROUP_NAME, APPLICATION, OBJECT_NAME, LAST_UPDATE_DT, SORTBY, ALIAS_NAME, PARENT_GRP_NAME ) 
  VALUES ('XPersonBObjExt', 'TCRM', 'com.mit.mdm.customModels.component.XPersonBObjExt', CURRENT_TIMESTAMP, 'LAST_UPDATE_DT', 'PERSON', null);

CREATE SEQUENCE DB2ADMIN.GROUPDWLTABLE_ID_SEQ AS BIGINT START WITH 2000000 INCREMENT BY 1 MINVALUE 2000000 MAXVALUE 2009999 CACHE 10;

----------------------------------------------
-- Add attributes for entity type XPerson to V_ELEMENT table
----------------------------------------------

INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('XBandLevel', 'XPersonBObjExt', 'TCRM', 'XBandLevel', CURRENT_TIMESTAMP, 10, null,  null, 2000059, 1);
-- This SQL statement copies any meta data configuration from the entity type
-- being extended into the extension.  If no such meta data exists, this will
-- cause a warning which can be ignored when running the SQL.
INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, APPLICATION, GROUP_NAME, ATTRIBUTE_NAME, COLUMN_NAME, FIELD_NAME, XML_TAG_NAME, EXPIRY_DT, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD)
 	SELECT E.ELEMENT_NAME, 'TCRM', 'XPersonBObjExt', E.ATTRIBUTE_NAME, E.COLUMN_NAME, E.FIELD_NAME, E.XML_TAG_NAME, E.EXPIRY_DT, CURRENT_TIMESTAMP, E.RESPONSE_ORDER, E.ELEMENTAPPNAME, E.ELEMENTGROUPNAME, E.DWLCOLUMN_TP_CD, E.CARDINALITY_TP_CD
 	FROM DB2ADMIN.V_ELEMENT E
 	LEFT JOIN DB2ADMIN.V_GROUP G
 		ON E.GROUP_NAME = G.GROUP_NAME
 	WHERE G.OBJECT_NAME = 'com.dwl.tcrm.coreParty.component.TCRMPersonBObj';
 	
INSERT INTO DB2ADMIN.GROUPDWLTABLE (GROUP_DWLTABLE_ID, APPLICATION, GROUP_NAME, DWLTABLE_TP_CD, LAST_UPDATE_DT)
	SELECT NEXTVAL FOR DB2ADMIN.GROUPDWLTABLE_ID_SEQ, 'TCRM', 'XPersonBObjExt', T.DWLTABLE_TP_CD, CURRENT_TIMESTAMP
	FROM DB2ADMIN.GROUPDWLTABLE T
	JOIN DB2ADMIN.V_GROUP G
		ON T.GROUP_NAME = G.GROUP_NAME
	WHERE G.OBJECT_NAME = 'com.dwl.tcrm.coreParty.component.TCRMPersonBObj';

DROP SEQUENCE DB2ADMIN.GROUPDWLTABLE_ID_SEQ RESTRICT;

----------------------------------------------
-- V_ELEMENTATTRIBUTE
----------------------------------------------


CREATE SEQUENCE DB2ADMIN.V_ELATTR_ID_SEQ AS BIGINT START WITH 2000000 INCREMENT BY 1 MINVALUE 2000000 MAXVALUE 2009999 CACHE 10;

-- This SQL statement copies any meta data configuration from the entity type
-- being extended into the extension.  If no such meta data exists, this will
-- cause a warning which can be ignored when running the SQL.
INSERT INTO DB2ADMIN.V_ELEMENTATTRIBUTE (V_ELEMENT_ATTRB_ID, ATTRIBUTE_TP_CD, APPLICATION, GROUP_NAME, ELEMENT_NAME, EXPIRY_DT, LAST_UPDATE_DT)
   SELECT NEXTVAL FOR DB2ADMIN.V_ELATTR_ID_SEQ, A.ATTRIBUTE_TP_CD, 'TCRM', 'XPersonBObjExt', A.ELEMENT_NAME, A.EXPIRY_DT, CURRENT_TIMESTAMP
   FROM DB2ADMIN.V_ELEMENTATTRIBUTE A
   LEFT JOIN DB2ADMIN.V_GROUP G
   		ON A.GROUP_NAME = G.GROUP_NAME
   WHERE G.OBJECT_NAME = 'com.dwl.tcrm.coreParty.component.TCRMPersonBObj' ;
DROP SEQUENCE DB2ADMIN.V_ELATTR_ID_SEQ RESTRICT;

----------------------------------------------
-- Transactions
----------------------------------------------


----------------------------------------------
-- CDBUSINESSTXTP
----------------------------------------------


----------------------------------------------
-- CDINTERNALTXNTP
----------------------------------------------




----------------------------------------------
-- BUSINTERNALTXN
----------------------------------------------



----------------------------------------------
-- BUSINESSTXREQRESP
----------------------------------------------



----------------------------------------------
-- INTERNALTXREQRESP
----------------------------------------------


----------------------------------------------
-- GROUPTXMAP
----------------------------------------------



----------------------------------------------
-- TAIL setup
----------------------------------------------




-- @SqlSnippetPriority 600

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




-- Notes
-- MDM_TODO: CDKWB0046I Statements are placed in the generated SQL file when user changes are required.
-- 1. Edit the following SQL files following any associated instructions.
-- 2. Connect to the database.
-- 3. Run each SQL file as shown below and in the same order.
-- 			db2 -vf MITBusinessServices_SETUP_DB2.sql
-- 			db2 -vf MITBusinessServices_TRIGGERS_DB2.sql
-- 			db2 -vf MITBusinessServices_CONSTRAINTS_DB2.sql
--			db2 -vf MITBusinessServices_ERRORS_100_DB2.sql
-- 			db2 -vf MITBusinessServices_MetaData_DB2.sql
-- 			db2 -vf CONFIG_XMLSERVICES_RESPONSE_DB2.sql
-- 			db2 -vf MITBusinessServices_CODETABLES_DB2.sql

--#SET TERMINATOR ;




-- @SqlSnippetPriority 600

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




-- Notes
-- MDM_TODO: CDKWB0046I Statements are placed in the generated SQL file when user changes are required.
-- 1. Edit the following SQL files following any associated instructions.
-- 2. Connect to the database.
-- 3. Run each SQL file as shown below and in the same order.
-- 			db2 -vf MITCustomModel_SETUP_DB2.sql
-- 			db2 -vf MITCustomModel_TRIGGERS_DB2.sql
-- 			db2 -vf MITCustomModel_CONSTRAINTS_DB2.sql
--			db2 -vf MITCustomModel_ERRORS_100_DB2.sql
-- 			db2 -vf MITCustomModel_MetaData_DB2.sql
-- 			db2 -vf CONFIG_XMLSERVICES_RESPONSE_DB2.sql
-- 			db2 -vf MITCustomModel_CODETABLES_DB2.sql

--#SET TERMINATOR ;



