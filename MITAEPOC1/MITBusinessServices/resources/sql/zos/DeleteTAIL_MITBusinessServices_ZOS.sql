
-- @SqlSnippetPriority 100
-- @SqlModuleOrdering -3

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


-- Executing this file will delete all data from the transaction audit log (TAIL) for
-- transactions defined within this project. It's only necessary to run this script
-- you're using the Rollback Metadata script to remove configuration from the
-- database. In this case, the DeleteTAIL script should be run first.

-- Notes
-- MDM_TODO: CDKWB0046I Statements are placed in the generated SQL file when user changes are required.
-- 1. Edit the following SQL files following any associated instructions.
-- 2. Connect to the database.
-- 3. Run each SQL file as shown below and in the same order.
-- 			db2 -vf DeleteTAIL_MITBusinessServices_ZOS.sql
--#SET TERMINATOR ;

DELETE FROM DB2ADMIN.INTERNALLOGTXNKEY WHERE INTERN_TX_KEY_ID >= 1000000 AND INTERN_TX_KEY_ID <= 1009999;
DELETE FROM DB2ADMIN.INTERNALLOG WHERE INTERNAL_BUS_TX_TP >= 1000000 AND INTERNAL_BUS_TX_TP <= 1009999;
DELETE FROM DB2ADMIN.EXTERNALLOGTXNKEY WHERE EXTERN_TX_KEY_ID >= 1000000 AND EXTERN_TX_KEY_ID <= 1009999;
DELETE FROM DB2ADMIN.TRANSACTIONLOGERR WHERE TX_LOG_ID IN (SELECT TX_LOG_ID FROM TRANSACTIONLOG WHERE BUSINESS_TX_TP_CD >= 1000000 AND BUSINESS_TX_TP_CD <= 1009999);
DELETE FROM DB2ADMIN.TRANSACTIONLOG WHERE BUSINESS_TX_TP_CD >= 1000000 AND BUSINESS_TX_TP_CD <= 1009999;
