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
 * IBM-MDMWB-1.0-[03bda5cde6c4e16333a7b6944cc9834d]
 */
package com.mit.mdm.customModels.entityObject;


import com.ibm.mdm.base.db.EntityMapping;
import com.ibm.pdq.annotation.Select;


import com.dwl.tcrm.coreParty.entityObject.EObjContSummary;
import com.dwl.tcrm.coreParty.entityObject.EObjContact;
import com.dwl.tcrm.coreParty.entityObject.EObjPerson;

import com.ibm.mdm.base.db.ResultQueue3;
import com.ibm.mdm.base.db.ResultQueue4;

import java.util.Iterator;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public interface XPersonExtInquiryData {

  /**
   * MDM_TODO: CDKWB0050I The generated parameter and result lists in this file should be checked to ensure that each matches its
   * associated SQL query. Each list entry must be comma separated and identify a field within an entity object class.
   */ 
   
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */ 
   public final static String tableAliasString1 = "tableAlias (" + 
     "CONTACT => com.dwl.tcrm.coreParty.entityObject.EObjContact, " + 
     "H_CONTACT => com.dwl.tcrm.coreParty.entityObject.EObjContact, " + 
     "PERSON => com.dwl.tcrm.coreParty.entityObject.EObjPerson, " + 
     "H_PERSON => com.dwl.tcrm.coreParty.entityObject.EObjPerson, " + 
     "CONTSUMMARY => com.dwl.tcrm.coreParty.entityObject.EObjContSummary , " + 
     "PERSON => com.mit.mdm.customModels.entityObject.EObjXPersonExt , " + 
     "H_PERSON => com.mit.mdm.customModels.entityObject.EObjXPersonExt" + 
     ")";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->	
   *
   * CDKWB0060I This SQL query has been modified to return additional fields defined by entity type extension XPerson.
   *
   * @generated
   */ 
   public final static String getPersonHistorySQL = "SELECT DISTINCT C.H_CONT_ID , C.H_ACTION_CODE , C.H_CREATED_BY , C.H_CREATE_DT , C.H_END_DT , C.CONT_ID , C.ACCE_COMP_TP_CD , C.PREF_LANG_TP_CD , C.CREATED_DT , C.SINCE_DT , C.LEFT_DT , C.INACTIVATED_DT , C.CONTACT_NAME , C.PERSON_ORG_CODE , C.SOLICIT_IND , C.CONFIDENTIAL_IND , C.CLIENT_IMP_TP_CD , C.CLIENT_ST_TP_CD , C.CLIENT_POTEN_TP_CD , C.RPTING_FREQ_TP_CD , C.LAST_STATEMENT_DT , C.PROVIDED_BY_CONT , C.LAST_UPDATE_DT , C.LAST_UPDATE_USER , C.LAST_UPDATE_TX_ID , C.LAST_USED_DT , C.LAST_VERIFIED_DT , C.SOURCE_IDENT_TP_CD , C.DO_NOT_DELETE_IND , C.ALERT_IND , P.H_CONT_ID AS H_CONT_ID_PERSON, P.H_ACTION_CODE , P.H_CREATED_BY , P.H_CREATE_DT , P.H_END_DT , P.CONT_ID , P.MARITAL_ST_TP_CD , P.BIRTHPLACE_TP_CD , P.CITIZENSHIP_TP_CD , P.HIGHEST_EDU_TP_CD , P.AGE_VER_DOC_TP_CD , P.GENDER_TP_CODE , P.BIRTH_DT , P.DECEASED_DT , P.CHILDREN_CT , P.DISAB_START_DT , P.DISAB_END_DT , P.USER_IND , P.LAST_UPDATE_DT , P.LAST_UPDATE_USER , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, C.ENTITYLINK_ST_TP_CD, C.ENTITY_ID, C.ENTITY_TYPE, C.ENTITY_STATUS_TP_CD, P.XBand_Level" + 
     " FROM H_PERSON P,H_CONTACT C" + 
     " WHERE P.H_CONT_ID = ? AND P.H_CONT_ID = C.H_CONT_ID AND (( ? BETWEEN P.H_CREATE_DT AND P.H_END_DT ) OR ( ? >= P.H_CREATE_DT AND P.H_END_DT IS NULL )) AND (( ? BETWEEN C.H_CREATE_DT AND C.H_END_DT ) OR ( ? >= C.H_CREATE_DT AND C.H_END_DT IS NULL ))";
   
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getPersonHistoryParameters =
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.historyIdPK=H_CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histCreateDt=H_CREATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histCreateDt=H_CREATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histCreateDt=H_CREATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histCreateDt=H_CREATE_DT"; 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getPersonHistoryResults =
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.historyIdPK=H_CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histActionCode=H_ACTION_CODE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histCreatedBy=H_CREATED_BY," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histCreateDt=H_CREATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histEndDt=H_END_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.acceCompTpCd=ACCE_COMP_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.prefLangTpCd=PREF_LANG_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.createdDt=CREATED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.sinceDt=SINCE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.leftDt=LEFT_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.inactivatedDt=INACTIVATED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.contactName=CONTACT_NAME," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.personOrgCode=PERSON_ORG_CODE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.solicitInd=SOLICIT_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.confidentialInd=CONFIDENTIAL_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.clientImpTpCd=CLIENT_IMP_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.clientStTpCd=CLIENT_ST_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.clientPotenTpCd=CLIENT_POTEN_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.rptingFreqTpCd=RPTING_FREQ_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastStatementDt=LAST_STATEMENT_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.providedByCont=PROVIDED_BY_CONT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateDt=LAST_UPDATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateUser=LAST_UPDATE_USER," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateTxId=LAST_UPDATE_TX_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUsedDt=LAST_USED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastVerifiedDt=LAST_VERIFIED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.sourceIdentTpCd=SOURCE_IDENT_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.doNotDelInd=DO_NOT_DELETE_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.alertInd=ALERT_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.historyIdPK=H_CONT_ID_PERSON," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histActionCode=H_ACTION_CODE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histCreatedBy=H_CREATED_BY," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histCreateDt=H_CREATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histEndDt=H_END_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.maritalStTpCd=MARITAL_ST_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.birthPlaceTpCd=BIRTHPLACE_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.citizenshipTpCd=CITIZENSHIP_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.highestEduTpCd=HIGHEST_EDU_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.ageVerDocTpCd=AGE_VER_DOC_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.genderTpCd=GENDER_TP_CODE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.birthDt=BIRTH_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.deceasedDt=DECEASED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.childrenCt=CHILDREN_CT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.disabStartDt=DISAB_START_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.disabEndDt=DISAB_END_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.userInd=USER_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateDt=LAST_UPDATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateUser=LAST_UPDATE_USER," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateTxId=LAST_UPDATE_TX_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.accessTokenValue=ACCESS_TOKEN_VALUE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.pendingCDCInd=PENDING_CDC_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entitylink_st_tp_cd=ENTITYLINK_ST_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entity_id=ENTITY_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entity_type=ENTITY_TYPE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entityStatusTpCd=ENTITY_STATUS_TP_CD," + 
    "com.mit.mdm.customModels.entityObject.EObjXPersonExt.XBandLevel=XBand_Level"; 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->	
   *
   * CDKWB0060I This SQL query has been modified to return additional fields defined by entity type extension XPerson.
   *
   * @generated
   */ 
   public final static String getPersonWithIndicatorsSQL = "SELECT CONTACT.CONT_ID , CONTACT.ACCE_COMP_TP_CD , CONTACT.PREF_LANG_TP_CD , CONTACT.CREATED_DT , CONTACT.SINCE_DT , CONTACT.LEFT_DT , CONTACT.INACTIVATED_DT , CONTACT.CONTACT_NAME , CONTACT.PERSON_ORG_CODE , CONTACT.SOLICIT_IND , CONTACT.CONFIDENTIAL_IND , CONTACT.CLIENT_IMP_TP_CD , CONTACT.CLIENT_ST_TP_CD , CONTACT.CLIENT_POTEN_TP_CD , CONTACT.RPTING_FREQ_TP_CD , CONTACT.LAST_STATEMENT_DT , CONTACT.PROVIDED_BY_CONT , CONTACT.LAST_UPDATE_DT , CONTACT.LAST_UPDATE_USER , CONTACT.ALERT_IND , CONTACT.LAST_UPDATE_TX_ID , CONTACT.LAST_USED_DT , CONTACT.LAST_VERIFIED_DT , CONTACT.SOURCE_IDENT_TP_CD , CONTACT.DO_NOT_DELETE_IND , PERSON.CONT_ID , PERSON.MARITAL_ST_TP_CD , PERSON.BIRTHPLACE_TP_CD , PERSON.CITIZENSHIP_TP_CD , PERSON.HIGHEST_EDU_TP_CD , PERSON.AGE_VER_DOC_TP_CD , PERSON.GENDER_TP_CODE , PERSON.BIRTH_DT , PERSON.DECEASED_DT , PERSON.CHILDREN_CT , PERSON.DISAB_START_DT , PERSON.DISAB_END_DT , PERSON.USER_IND , PERSON.LAST_UPDATE_DT , PERSON.LAST_UPDATE_USER , PERSON.LAST_UPDATE_TX_ID , CS.CONT_ID , CS.PRIVPREF_IND , CS.MISCVALUE_IND , CS.CONTACTREL_IND , CS.BANKACCOUNT_IND , CS.CHARGECARD_IND , CS.INCOMESOURCE_IND , CS.PAYROLLDEDUCT_IND , CS.IDENTIFIER_IND , CS.ALERT_IND , CS.CONTEQUIV_IND , CS.INTERACTION_IND , CS.ADDRESSGROUP_IND , CS.CONTMETHGROUP_IND , CS.LOBREL_IND , CS.LAST_UPDATE_DT , CS.LAST_UPDATE_USER , CS.LAST_UPDATE_TX_ID , CONTACT.ACCESS_TOKEN_VALUE , CONTACT.PENDING_CDC_IND, CONTACT.ENTITYLINK_ST_TP_CD, CONTACT.ENTITY_ID, CONTACT.ENTITY_TYPE, CONTACT.ENTITY_STATUS_TP_CD, PERSON.XBand_Level" + 
     " FROM PERSON,CONTACT LEFT OUTER JOIN CONTSUMMARY CS ON CONTACT.CONT_ID = CS.CONT_ID" + 
     " WHERE PERSON.CONT_ID = CONTACT.CONT_ID AND PERSON.CONT_ID = ?";
   
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getPersonWithIndicatorsParameters =
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.contIdPK=CONT_ID"; 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getPersonWithIndicatorsResults =
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.acceCompTpCd=ACCE_COMP_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.prefLangTpCd=PREF_LANG_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.createdDt=CREATED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.sinceDt=SINCE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.leftDt=LEFT_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.inactivatedDt=INACTIVATED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.contactName=CONTACT_NAME," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.personOrgCode=PERSON_ORG_CODE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.solicitInd=SOLICIT_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.confidentialInd=CONFIDENTIAL_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.clientImpTpCd=CLIENT_IMP_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.clientStTpCd=CLIENT_ST_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.clientPotenTpCd=CLIENT_POTEN_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.rptingFreqTpCd=RPTING_FREQ_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastStatementDt=LAST_STATEMENT_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.providedByCont=PROVIDED_BY_CONT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateDt=LAST_UPDATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateUser=LAST_UPDATE_USER," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.alertInd=ALERT_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateTxId=LAST_UPDATE_TX_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUsedDt=LAST_USED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastVerifiedDt=LAST_VERIFIED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.sourceIdentTpCd=SOURCE_IDENT_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.doNotDelInd=DO_NOT_DELETE_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.maritalStTpCd=MARITAL_ST_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.birthPlaceTpCd=BIRTHPLACE_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.citizenshipTpCd=CITIZENSHIP_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.highestEduTpCd=HIGHEST_EDU_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.ageVerDocTpCd=AGE_VER_DOC_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.genderTpCd=GENDER_TP_CODE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.birthDt=BIRTH_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.deceasedDt=DECEASED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.childrenCt=CHILDREN_CT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.disabStartDt=DISAB_START_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.disabEndDt=DISAB_END_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.userInd=USER_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateDt=LAST_UPDATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateUser=LAST_UPDATE_USER," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateTxId=LAST_UPDATE_TX_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.contId=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.privPrefInd=PRIVPREF_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.miscValueInd=MISCVALUE_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.contactrelInd=CONTACTREL_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.bankAccountInd=BANKACCOUNT_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.chargeCardInd=CHARGECARD_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.incomeSourceInd=INCOMESOURCE_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.payrollDeductInd=PAYROLLDEDUCT_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.identifierInd=IDENTIFIER_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.alertInd=ALERT_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.contEquivInd=CONTEQUIV_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.interactionInd=INTERACTION_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.addressGroupInd=ADDRESSGROUP_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.contMethGroupInd=CONTMETHGROUP_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.lobRelInd=LOBREL_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.lastUpdateDt=LAST_UPDATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.lastUpdateUser=LAST_UPDATE_USER," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContSummary.lastUpdateTxId=LAST_UPDATE_TX_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.accessTokenValue=ACCESS_TOKEN_VALUE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.pendingCDCInd=PENDING_CDC_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entitylink_st_tp_cd=ENTITYLINK_ST_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entity_id=ENTITY_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entity_type=ENTITY_TYPE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entityStatusTpCd=ENTITY_STATUS_TP_CD," + 
    "com.mit.mdm.customModels.entityObject.EObjXPersonExt.XBandLevel=XBand_Level"; 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->	
   *
   * CDKWB0060I This SQL query has been modified to return additional fields defined by entity type extension XPerson.
   *
   * @generated
   */ 
   public final static String getPersonSQL = "SELECT CONTACT.CONT_ID , CONTACT.ACCE_COMP_TP_CD , CONTACT.PREF_LANG_TP_CD , CONTACT.CREATED_DT , CONTACT.SINCE_DT , CONTACT.LEFT_DT , CONTACT.INACTIVATED_DT , CONTACT.CONTACT_NAME , CONTACT.PERSON_ORG_CODE , CONTACT.SOLICIT_IND , CONTACT.CONFIDENTIAL_IND , CONTACT.CLIENT_IMP_TP_CD , CONTACT.CLIENT_ST_TP_CD , CONTACT.CLIENT_POTEN_TP_CD , CONTACT.RPTING_FREQ_TP_CD , CONTACT.LAST_STATEMENT_DT , CONTACT.PROVIDED_BY_CONT , CONTACT.LAST_UPDATE_DT , CONTACT.LAST_UPDATE_USER , CONTACT.ALERT_IND , CONTACT.LAST_UPDATE_TX_ID ,CONTACT.LAST_USED_DT , CONTACT.LAST_VERIFIED_DT , CONTACT.SOURCE_IDENT_TP_CD , CONTACT.DO_NOT_DELETE_IND , PERSON.CONT_ID , PERSON.MARITAL_ST_TP_CD , PERSON.BIRTHPLACE_TP_CD , PERSON.CITIZENSHIP_TP_CD , PERSON.HIGHEST_EDU_TP_CD , PERSON.AGE_VER_DOC_TP_CD , PERSON.GENDER_TP_CODE , PERSON.BIRTH_DT , PERSON.DECEASED_DT , PERSON.CHILDREN_CT , PERSON.DISAB_START_DT , PERSON.DISAB_END_DT , PERSON.USER_IND , PERSON.LAST_UPDATE_DT , PERSON.LAST_UPDATE_USER , PERSON.LAST_UPDATE_TX_ID ,CONTACT.ACCESS_TOKEN_VALUE , CONTACT.PENDING_CDC_IND, CONTACT.ENTITYLINK_ST_TP_CD, CONTACT.ENTITY_ID, CONTACT.ENTITY_TYPE, CONTACT.ENTITY_STATUS_TP_CD, PERSON.XBand_Level" + 
     " FROM PERSON,CONTACT" + 
     " WHERE PERSON.CONT_ID = CONTACT.CONT_ID AND PERSON.CONT_ID = ?";
   
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getPersonParameters =
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.contIdPK=CONT_ID"; 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getPersonResults =
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.acceCompTpCd=ACCE_COMP_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.prefLangTpCd=PREF_LANG_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.createdDt=CREATED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.sinceDt=SINCE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.leftDt=LEFT_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.inactivatedDt=INACTIVATED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.contactName=CONTACT_NAME," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.personOrgCode=PERSON_ORG_CODE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.solicitInd=SOLICIT_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.confidentialInd=CONFIDENTIAL_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.clientImpTpCd=CLIENT_IMP_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.clientStTpCd=CLIENT_ST_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.clientPotenTpCd=CLIENT_POTEN_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.rptingFreqTpCd=RPTING_FREQ_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastStatementDt=LAST_STATEMENT_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.providedByCont=PROVIDED_BY_CONT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateDt=LAST_UPDATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateUser=LAST_UPDATE_USER," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.alertInd=ALERT_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateTxId=LAST_UPDATE_TX_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUsedDt=LAST_USED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastVerifiedDt=LAST_VERIFIED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.sourceIdentTpCd=SOURCE_IDENT_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.doNotDelInd=DO_NOT_DELETE_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.maritalStTpCd=MARITAL_ST_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.birthPlaceTpCd=BIRTHPLACE_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.citizenshipTpCd=CITIZENSHIP_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.highestEduTpCd=HIGHEST_EDU_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.ageVerDocTpCd=AGE_VER_DOC_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.genderTpCd=GENDER_TP_CODE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.birthDt=BIRTH_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.deceasedDt=DECEASED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.childrenCt=CHILDREN_CT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.disabStartDt=DISAB_START_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.disabEndDt=DISAB_END_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.userInd=USER_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateDt=LAST_UPDATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateUser=LAST_UPDATE_USER," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateTxId=LAST_UPDATE_TX_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.accessTokenValue=ACCESS_TOKEN_VALUE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.pendingCDCInd=PENDING_CDC_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entitylink_st_tp_cd=ENTITYLINK_ST_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entity_id=ENTITY_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entity_type=ENTITY_TYPE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entityStatusTpCd=ENTITY_STATUS_TP_CD," + 
    "com.mit.mdm.customModels.entityObject.EObjXPersonExt.XBandLevel=XBand_Level"; 
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */ 
   public final static String resultSetMapping1 = "<rsm>" + 
     "<col number='1' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='historyIdPK'></col>" + 
     "<col number='2' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='histActionCode'></col>" + 
     "<col number='3' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='histCreatedBy'></col>" + 
     "<col number='4' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='histCreateDt'></col>" + 
     "<col number='5' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='histEndDt'></col>" + 
     "<col number='6' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='contIdPK'></col>" + 
     "<col number='7' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='acceCompTpCd'></col>" + 
     "<col number='8' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='prefLangTpCd'></col>" + 
     "<col number='9' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='createdDt'></col>" + 
     "<col number='10' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='sinceDt'></col>" + 
     "<col number='11' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='leftDt'></col>" + 
     "<col number='12' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='inactivatedDt'></col>" + 
     "<col number='13' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='contactName'></col>" + 
     "<col number='14' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='personOrgCode'></col>" + 
     "<col number='15' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='solicitInd'></col>" + 
     "<col number='16' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='confidentialInd'></col>" + 
     "<col number='17' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='clientImpTpCd'></col>" + 
     "<col number='18' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='clientStTpCd'></col>" + 
     "<col number='19' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='clientPotenTpCd'></col>" + 
     "<col number='20' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='rptingFreqTpCd'></col>" + 
     "<col number='21' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastStatementDt'></col>" + 
     "<col number='22' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='providedByCont'></col>" + 
     "<col number='23' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastUpdateDt'></col>" + 
     "<col number='24' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastUpdateUser'></col>" + 
     "<col number='25' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastUpdateTxId'></col>" + 
     "<col number='26' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastUsedDt'></col>" + 
     "<col number='27' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastVerifiedDt'></col>" + 
     "<col number='28' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='sourceIdentTpCd'></col>" + 
     "<col number='29' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='doNotDelInd'></col>" + 
     "<col number='30' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='alertInd'></col>" + 
     "<col number='31' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='historyIdPK'></col>" + 
     "<col number='32' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='histActionCode'></col>" + 
     "<col number='33' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='histCreatedBy'></col>" + 
     "<col number='34' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='histCreateDt'></col>" + 
     "<col number='35' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='histEndDt'></col>" + 
     "<col number='36' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='contIdPK'></col>" + 
     "<col number='37' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='maritalStTpCd'></col>" + 
     "<col number='38' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='birthPlaceTpCd'></col>" + 
     "<col number='39' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='citizenshipTpCd'></col>" + 
     "<col number='40' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='highestEduTpCd'></col>" + 
     "<col number='41' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='ageVerDocTpCd'></col>" + 
     "<col number='42' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='genderTpCd'></col>" + 
     "<col number='43' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='birthDt'></col>" + 
     "<col number='44' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='deceasedDt'></col>" + 
     "<col number='45' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='childrenCt'></col>" + 
     "<col number='46' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='disabStartDt'></col>" + 
     "<col number='47' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='disabEndDt'></col>" + 
     "<col number='48' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='userInd'></col>" + 
     "<col number='49' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='lastUpdateDt'></col>" + 
     "<col number='50' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='lastUpdateUser'></col>" + 
     "<col number='51' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='lastUpdateTxId'></col>" + 
     "<col number='52' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='accessTokenValue'></col>" + 
     "<col number='53' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='pendingCDCInd'></col>" + 
     "<col number='54' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='entitylink_st_tp_cd'></col>" + 
     "<col number='55' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='entity_id'></col>" + 
     "<col number='56' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='entity_type'></col>" + 
     "<col number='57' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='entityStatusTpCd'></col>" + 
     "<col number='58' bean='com.mit.mdm.customModels.entityObject.EObjXPersonExt' property='XBandLevel'></col>" + 
     "</rsm>";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->	
   *
   * CDKWB0060I This SQL query has been modified to return additional fields defined by entity type extension XPerson.
   *
   * @generated
   */ 
   public final static String getPersonImagesSQL = "SELECT DISTINCT C.H_CONT_ID , C.H_ACTION_CODE , C.H_CREATED_BY , C.H_CREATE_DT , C.H_END_DT , C.CONT_ID , C.ACCE_COMP_TP_CD , C.PREF_LANG_TP_CD , C.CREATED_DT , C.SINCE_DT , C.LEFT_DT , C.INACTIVATED_DT , C.CONTACT_NAME , C.PERSON_ORG_CODE , C.SOLICIT_IND , C.CONFIDENTIAL_IND , C.CLIENT_IMP_TP_CD , C.CLIENT_ST_TP_CD , C.CLIENT_POTEN_TP_CD , C.RPTING_FREQ_TP_CD , C.LAST_STATEMENT_DT , C.PROVIDED_BY_CONT , C.LAST_UPDATE_DT , C.LAST_UPDATE_USER , C.LAST_UPDATE_TX_ID , C.LAST_USED_DT , C.LAST_VERIFIED_DT , C.SOURCE_IDENT_TP_CD , C.DO_NOT_DELETE_IND , C.ALERT_IND , P.H_CONT_ID AS H_CONT_ID_PERSON, P.H_ACTION_CODE , P.H_CREATED_BY , P.H_CREATE_DT , P.H_END_DT , P.CONT_ID , P.MARITAL_ST_TP_CD , P.BIRTHPLACE_TP_CD , P.CITIZENSHIP_TP_CD , P.HIGHEST_EDU_TP_CD , P.AGE_VER_DOC_TP_CD , P.GENDER_TP_CODE , P.BIRTH_DT , P.DECEASED_DT , P.CHILDREN_CT , P.DISAB_START_DT , P.DISAB_END_DT , P.USER_IND , P.LAST_UPDATE_DT , P.LAST_UPDATE_USER , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, C.ENTITYLINK_ST_TP_CD, C.ENTITY_ID, C.ENTITY_TYPE, C.ENTITY_STATUS_TP_CD, P.XBand_Level" + 
     " FROM H_CONTACT C LEFT JOIN H_PERSON P ON P.CONT_ID = C.CONT_ID AND P.LAST_UPDATE_TX_ID = C.LAST_UPDATE_TX_ID" + 
     " WHERE C.CONT_ID = ? AND ( C.H_CREATE_DT BETWEEN ? AND ? )" + 
     " UNION SELECT DISTINCT C.H_CONT_ID , C.H_ACTION_CODE , C.H_CREATED_BY , C.H_CREATE_DT , C.H_END_DT , C.CONT_ID , C.ACCE_COMP_TP_CD , C.PREF_LANG_TP_CD , C.CREATED_DT , C.SINCE_DT , C.LEFT_DT , C.INACTIVATED_DT , C.CONTACT_NAME , C.PERSON_ORG_CODE , C.SOLICIT_IND , C.CONFIDENTIAL_IND , C.CLIENT_IMP_TP_CD , C.CLIENT_ST_TP_CD , C.CLIENT_POTEN_TP_CD , C.RPTING_FREQ_TP_CD , C.LAST_STATEMENT_DT , C.PROVIDED_BY_CONT , C.LAST_UPDATE_DT , C.LAST_UPDATE_USER , C.LAST_UPDATE_TX_ID , C.LAST_USED_DT , C.LAST_VERIFIED_DT , C.SOURCE_IDENT_TP_CD , C.DO_NOT_DELETE_IND , C.ALERT_IND , P.H_CONT_ID AS H_CONT_ID_PERSON, P.H_ACTION_CODE , P.H_CREATED_BY , P.H_CREATE_DT , P.H_END_DT , P.CONT_ID , P.MARITAL_ST_TP_CD , P.BIRTHPLACE_TP_CD , P.CITIZENSHIP_TP_CD , P.HIGHEST_EDU_TP_CD , P.AGE_VER_DOC_TP_CD , P.GENDER_TP_CODE , P.BIRTH_DT , P.DECEASED_DT , P.CHILDREN_CT , P.DISAB_START_DT , P.DISAB_END_DT , P.USER_IND , P.LAST_UPDATE_DT , P.LAST_UPDATE_USER , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, C.ENTITYLINK_ST_TP_CD, C.ENTITY_ID, C.ENTITY_TYPE, C.ENTITY_STATUS_TP_CD, P.XBand_Level" + 
     " FROM H_PERSON P LEFT JOIN H_CONTACT C ON P.CONT_ID = C.CONT_ID AND P.LAST_UPDATE_TX_ID = C.LAST_UPDATE_TX_ID" + 
     " WHERE P.CONT_ID = ? AND ( P.H_CREATE_DT BETWEEN ? AND ? )";
   
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getPersonImagesParameters =
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histCreateDt=H_CREATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histCreateDt=H_CREATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histCreateDt=H_CREATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histCreateDt=H_CREATE_DT"; 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getPersonImagesResults =
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.historyIdPK=H_CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histActionCode=H_ACTION_CODE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histCreatedBy=H_CREATED_BY," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histCreateDt=H_CREATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histEndDt=H_END_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.acceCompTpCd=ACCE_COMP_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.prefLangTpCd=PREF_LANG_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.createdDt=CREATED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.sinceDt=SINCE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.leftDt=LEFT_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.inactivatedDt=INACTIVATED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.contactName=CONTACT_NAME," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.personOrgCode=PERSON_ORG_CODE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.solicitInd=SOLICIT_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.confidentialInd=CONFIDENTIAL_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.clientImpTpCd=CLIENT_IMP_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.clientStTpCd=CLIENT_ST_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.clientPotenTpCd=CLIENT_POTEN_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.rptingFreqTpCd=RPTING_FREQ_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastStatementDt=LAST_STATEMENT_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.providedByCont=PROVIDED_BY_CONT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateDt=LAST_UPDATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateUser=LAST_UPDATE_USER," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateTxId=LAST_UPDATE_TX_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUsedDt=LAST_USED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastVerifiedDt=LAST_VERIFIED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.sourceIdentTpCd=SOURCE_IDENT_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.doNotDelInd=DO_NOT_DELETE_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.alertInd=ALERT_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.historyIdPK=H_CONT_ID_PERSON," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histActionCode=H_ACTION_CODE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histCreatedBy=H_CREATED_BY," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histCreateDt=H_CREATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histEndDt=H_END_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.maritalStTpCd=MARITAL_ST_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.birthPlaceTpCd=BIRTHPLACE_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.citizenshipTpCd=CITIZENSHIP_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.highestEduTpCd=HIGHEST_EDU_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.ageVerDocTpCd=AGE_VER_DOC_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.genderTpCd=GENDER_TP_CODE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.birthDt=BIRTH_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.deceasedDt=DECEASED_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.childrenCt=CHILDREN_CT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.disabStartDt=DISAB_START_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.disabEndDt=DISAB_END_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.userInd=USER_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateDt=LAST_UPDATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateUser=LAST_UPDATE_USER," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateTxId=LAST_UPDATE_TX_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.accessTokenValue=ACCESS_TOKEN_VALUE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.pendingCDCInd=PENDING_CDC_IND," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entitylink_st_tp_cd=ENTITYLINK_ST_TP_CD," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entity_id=ENTITY_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entity_type=ENTITY_TYPE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.entityStatusTpCd=ENTITY_STATUS_TP_CD," + 
    "com.mit.mdm.customModels.entityObject.EObjXPersonExt.XBandLevel=XBand_Level"; 
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */ 
   public final static String resultSetMapping2 = "<rsm>" + 
     "<col number='1' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='contIdPK'></col>" + 
     "<col number='2' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastUpdateDt'></col>" + 
     "<col number='3' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastUpdateTxId'></col>" + 
     "<col number='4' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='contIdPK'></col>" + 
     "<col number='5' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='lastUpdateDt'></col>" + 
     "<col number='6' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='lastUpdateTxId'></col>" + 
     "<col number='7' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='accessTokenValue'></col>" + 
     "<col number='8' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='pendingCDCInd'></col>" + 
     "<col number='9' bean='com.mit.mdm.customModels.entityObject.EObjXPersonExt' property='XBandLevel'></col>" + 
     "</rsm>";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->	
   *
   * CDKWB0060I This SQL query has been modified to return additional fields defined by entity type extension XPerson.
   *
   * @generated
   */ 
   public final static String getPersonsLightImagesSQL = "SELECT DISTINCT C.CONT_ID , C.LAST_UPDATE_DT , C.LAST_UPDATE_TX_ID , P.CONT_ID , P.LAST_UPDATE_DT , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, P.XBand_Level" + 
     " FROM H_CONTACT C LEFT JOIN H_PERSON P ON P.CONT_ID = C.CONT_ID AND P.LAST_UPDATE_TX_ID = C.LAST_UPDATE_TX_ID" + 
     " WHERE C.CONT_ID = ? AND (C.H_CREATE_DT BETWEEN ? AND ? )" + 
     " UNION SELECT DISTINCT C.CONT_ID , C.LAST_UPDATE_DT , C.LAST_UPDATE_TX_ID , P.CONT_ID , P.LAST_UPDATE_DT , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, P.XBand_Level" + 
     " FROM H_PERSON P LEFT JOIN H_CONTACT C ON P.CONT_ID = C.CONT_ID AND P.LAST_UPDATE_TX_ID = C.LAST_UPDATE_TX_ID" + 
     " WHERE P.CONT_ID = ? AND ( P.H_CREATE_DT BETWEEN ? AND ? )";
   
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getPersonsLightImagesParameters =
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histCreateDt=H_CREATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.histCreateDt=H_CREATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histCreateDt=H_CREATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.histCreateDt=H_CREATE_DT"; 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getPersonsLightImagesResults =
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateDt=LAST_UPDATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.lastUpdateTxId=LAST_UPDATE_TX_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.contIdPK=CONT_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateDt=LAST_UPDATE_DT," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateTxId=LAST_UPDATE_TX_ID," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.accessTokenValue=ACCESS_TOKEN_VALUE," + 
    "com.dwl.tcrm.coreParty.entityObject.EObjContact.pendingCDCInd=PENDING_CDC_IND," + 
    "com.mit.mdm.customModels.entityObject.EObjXPersonExt.XBandLevel=XBand_Level"; 


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   **/ 
  @Select(sql=getPersonHistorySQL , pattern=tableAliasString1)
  @EntityMapping(parameters=getPersonHistoryParameters, results=getPersonHistoryResults)
  		Iterator<ResultQueue3<EObjContact, EObjPerson, EObjXPersonExt>> getPersonHistory(Object[] parameters);
 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   **/ 
  @Select(sql=getPersonWithIndicatorsSQL , pattern=tableAliasString1)
  @EntityMapping(parameters=getPersonWithIndicatorsParameters, results=getPersonWithIndicatorsResults)
  		Iterator<ResultQueue4<EObjContact, EObjPerson, EObjContSummary, EObjXPersonExt>> getPersonWithIndicators(Object[] parameters);
 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   **/ 
  @Select(sql=getPersonSQL , pattern=tableAliasString1)
  @EntityMapping(parameters=getPersonParameters, results=getPersonResults)
  		Iterator<ResultQueue3<EObjContact, EObjPerson, EObjXPersonExt>> getPerson(Object[] parameters);
 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   **/ 
  @Select(sql=getPersonImagesSQL , pattern=resultSetMapping1)
  @EntityMapping(parameters=getPersonImagesParameters, results=getPersonImagesResults)
  		Iterator<ResultQueue3<EObjContact, EObjPerson, EObjXPersonExt>> getPersonImages(Object[] parameters);
 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   **/ 
  @Select(sql=getPersonsLightImagesSQL , pattern=resultSetMapping2)
  @EntityMapping(parameters=getPersonsLightImagesParameters, results=getPersonsLightImagesResults)
  		Iterator<ResultQueue3<EObjContact, EObjPerson, EObjXPersonExt>> getPersonsLightImages(Object[] parameters);
 
}


