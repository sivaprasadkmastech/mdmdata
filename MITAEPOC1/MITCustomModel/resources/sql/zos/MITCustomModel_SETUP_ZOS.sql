
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

-- MDM_TODO2: CDKWB0055I Replace <DBNAME> with the database name.
-- MDM_TODO2: CDKWB0058I Replace <TABLESPACENAME> with the table space name.
-- MDM_TODO2: CDKWB0056I Replace <H_DBNAME> with the history database name.
-- MDM_TODO2: CDKWB0057I Replace <H_TABLESPACENAME> with the history table space name.

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

ALTER TABLE DB2ADMIN.PERSON
	ADD COLUMN XBand_Level VARCHAR(250) ;
ALTER TABLE DB2ADMIN.H_PERSON
    ADD COLUMN XBand_Level VARCHAR(250) ;


