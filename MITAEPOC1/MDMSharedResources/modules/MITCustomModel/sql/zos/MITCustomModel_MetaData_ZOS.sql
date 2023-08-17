
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
-- 			db2 -vf MITCustomModel_SETUP_ZOS.sql
-- 			db2 -vf MITCustomModel_TRIGGERS_ZOS.sql
-- 			db2 -vf MITCustomModel_CONSTRAINTS_ZOS.sql
--			db2 -vf MITCustomModel_ERRORS_100_DB2.sql
-- 			db2 -vf MITCustomModel_MetaData_ZOS.sql
-- 			db2 -vf CONFIG_XMLSERVICES_RESPONSE_ZOS.sql
-- 			db2 -vf MITCustomModel_CODETABLES_ZOS.sql
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



