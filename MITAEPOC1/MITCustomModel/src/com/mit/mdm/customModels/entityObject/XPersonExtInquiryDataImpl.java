package com.mit.mdm.customModels.entityObject;

import com.ibm.pdq.runtime.generator.BaseParameterHandler;
import java.util.Iterator;
import com.dwl.tcrm.coreParty.entityObject.EObjContact;
import java.sql.PreparedStatement;
import com.ibm.pdq.runtime.statement.StatementDescriptor;
import com.ibm.pdq.runtime.generator.BaseData;
import java.sql.SQLException;
import com.ibm.pdq.annotation.Metadata;
import com.ibm.mdm.base.db.ResultQueue4;
import com.dwl.tcrm.coreParty.entityObject.EObjContSummary;
import com.ibm.mdm.base.db.ResultQueue3;
import com.mit.mdm.customModels.entityObject.EObjXPersonExt;
import com.ibm.pdq.runtime.generator.BaseRowHandler;
import com.dwl.tcrm.coreParty.entityObject.EObjPerson;
import com.ibm.pdq.runtime.statement.SqlStatementType;
import java.sql.Types;


@SuppressWarnings("unchecked")

/**
 * <!-- begin-user-doc -->
 * 
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class XPersonExtInquiryDataImpl  extends BaseData implements XPersonExtInquiryData
{

  /**
   * @generated
   */
  public static final String generatorVersion = "3.200.75";

  /**
   * @generated
   */
  public static final String identifier = "XPersonExtInquiryData";

  /**
   * @generated
   */
  public static final long generationTime = 0x0000018924d648a1L;

  /**
   * @generated
   */
  public static final String collection = "NULLID";

  /**
   * @generated
   */
  public static final String packageVersion = null;

  /**
   * @generated
   */
  public static final boolean forceSingleBindIsolation = false;

  /**
   * @generated
   */
  public XPersonExtInquiryDataImpl()
  {
    super();
  } 

  /**
   * @generated
   */
  public String getGeneratorVersion()
  {
    return generatorVersion;
  }

  /**
   * @Select( sql="SELECT DISTINCT C.H_CONT_ID , C.H_ACTION_CODE , C.H_CREATED_BY , C.H_CREATE_DT , C.H_END_DT , C.CONT_ID , C.ACCE_COMP_TP_CD , C.PREF_LANG_TP_CD , C.CREATED_DT , C.SINCE_DT , C.LEFT_DT , C.INACTIVATED_DT , C.CONTACT_NAME , C.PERSON_ORG_CODE , C.SOLICIT_IND , C.CONFIDENTIAL_IND , C.CLIENT_IMP_TP_CD , C.CLIENT_ST_TP_CD , C.CLIENT_POTEN_TP_CD , C.RPTING_FREQ_TP_CD , C.LAST_STATEMENT_DT , C.PROVIDED_BY_CONT , C.LAST_UPDATE_DT , C.LAST_UPDATE_USER , C.LAST_UPDATE_TX_ID , C.LAST_USED_DT , C.LAST_VERIFIED_DT , C.SOURCE_IDENT_TP_CD , C.DO_NOT_DELETE_IND , C.ALERT_IND , P.H_CONT_ID AS H_CONT_ID_PERSON, P.H_ACTION_CODE , P.H_CREATED_BY , P.H_CREATE_DT , P.H_END_DT , P.CONT_ID , P.MARITAL_ST_TP_CD , P.BIRTHPLACE_TP_CD , P.CITIZENSHIP_TP_CD , P.HIGHEST_EDU_TP_CD , P.AGE_VER_DOC_TP_CD , P.GENDER_TP_CODE , P.BIRTH_DT , P.DECEASED_DT , P.CHILDREN_CT , P.DISAB_START_DT , P.DISAB_END_DT , P.USER_IND , P.LAST_UPDATE_DT , P.LAST_UPDATE_USER , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, C.ENTITYLINK_ST_TP_CD, C.ENTITY_ID, C.ENTITY_TYPE, C.ENTITY_STATUS_TP_CD, P.XBand_Level FROM H_PERSON P,H_CONTACT C WHERE P.H_CONT_ID = ? AND P.H_CONT_ID = C.H_CONT_ID AND (( ? BETWEEN P.H_CREATE_DT AND P.H_END_DT ) OR ( ? >= P.H_CREATE_DT AND P.H_END_DT IS NULL )) AND (( ? BETWEEN C.H_CREATE_DT AND C.H_END_DT ) OR ( ? >= C.H_CREATE_DT AND C.H_END_DT IS NULL ))", pattern="tableAlias (CONTACT => com.dwl.tcrm.coreParty.entityObject.EObjContact, H_CONTACT => com.dwl.tcrm.coreParty.entityObject.EObjContact, PERSON => com.dwl.tcrm.coreParty.entityObject.EObjPerson, H_PERSON => com.dwl.tcrm.coreParty.entityObject.EObjPerson, CONTSUMMARY => com.dwl.tcrm.coreParty.entityObject.EObjContSummary , PERSON => com.mit.mdm.customModels.entityObject.EObjXPersonExt , H_PERSON => com.mit.mdm.customModels.entityObject.EObjXPersonExt)" )
   * 
   * @generated
   */
  public Iterator<ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt>> getPersonHistory (Object[] parameters)
  {
    return queryIterator (getPersonHistoryStatementDescriptor, parameters);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor getPersonHistoryStatementDescriptor = createStatementDescriptor (
    "getPersonHistory(Object[])",
    "SELECT DISTINCT C.H_CONT_ID , C.H_ACTION_CODE , C.H_CREATED_BY , C.H_CREATE_DT , C.H_END_DT , C.CONT_ID , C.ACCE_COMP_TP_CD , C.PREF_LANG_TP_CD , C.CREATED_DT , C.SINCE_DT , C.LEFT_DT , C.INACTIVATED_DT , C.CONTACT_NAME , C.PERSON_ORG_CODE , C.SOLICIT_IND , C.CONFIDENTIAL_IND , C.CLIENT_IMP_TP_CD , C.CLIENT_ST_TP_CD , C.CLIENT_POTEN_TP_CD , C.RPTING_FREQ_TP_CD , C.LAST_STATEMENT_DT , C.PROVIDED_BY_CONT , C.LAST_UPDATE_DT , C.LAST_UPDATE_USER , C.LAST_UPDATE_TX_ID , C.LAST_USED_DT , C.LAST_VERIFIED_DT , C.SOURCE_IDENT_TP_CD , C.DO_NOT_DELETE_IND , C.ALERT_IND , P.H_CONT_ID AS H_CONT_ID_PERSON, P.H_ACTION_CODE , P.H_CREATED_BY , P.H_CREATE_DT , P.H_END_DT , P.CONT_ID , P.MARITAL_ST_TP_CD , P.BIRTHPLACE_TP_CD , P.CITIZENSHIP_TP_CD , P.HIGHEST_EDU_TP_CD , P.AGE_VER_DOC_TP_CD , P.GENDER_TP_CODE , P.BIRTH_DT , P.DECEASED_DT , P.CHILDREN_CT , P.DISAB_START_DT , P.DISAB_END_DT , P.USER_IND , P.LAST_UPDATE_DT , P.LAST_UPDATE_USER , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, C.ENTITYLINK_ST_TP_CD, C.ENTITY_ID, C.ENTITY_TYPE, C.ENTITY_STATUS_TP_CD, P.XBand_Level FROM H_PERSON P,H_CONTACT C WHERE P.H_CONT_ID = ? AND P.H_CONT_ID = C.H_CONT_ID AND (( ? BETWEEN P.H_CREATE_DT AND P.H_END_DT ) OR ( ? >= P.H_CREATE_DT AND P.H_END_DT IS NULL )) AND (( ? BETWEEN C.H_CREATE_DT AND C.H_END_DT ) OR ( ? >= C.H_CREATE_DT AND C.H_END_DT IS NULL ))",
    new int[] {SINGLE_ROW_PARAMETERS, MULTI_ROW_RESULT, java.sql.ResultSet.CONCUR_READ_ONLY, java.sql.ResultSet.CLOSE_CURSORS_AT_COMMIT, java.sql.ResultSet.TYPE_FORWARD_ONLY, DISALLOW_STATIC_ROWSET_CURSORS},
    SqlStatementType.QUERY,
    new String[]{"h_cont_id", "h_action_code", "h_created_by", "h_create_dt", "h_end_dt", "cont_id", "acce_comp_tp_cd", "pref_lang_tp_cd", "created_dt", "since_dt", "left_dt", "inactivated_dt", "contact_name", "person_org_code", "solicit_ind", "confidential_ind", "client_imp_tp_cd", "client_st_tp_cd", "client_poten_tp_cd", "rpting_freq_tp_cd", "last_statement_dt", "provided_by_cont", "last_update_dt", "last_update_user", "last_update_tx_id", "last_used_dt", "last_verified_dt", "source_ident_tp_cd", "do_not_delete_ind", "alert_ind", "h_cont_id_person", "h_action_code", "h_created_by", "h_create_dt", "h_end_dt", "cont_id", "marital_st_tp_cd", "birthplace_tp_cd", "citizenship_tp_cd", "highest_edu_tp_cd", "age_ver_doc_tp_cd", "gender_tp_code", "birth_dt", "deceased_dt", "children_ct", "disab_start_dt", "disab_end_dt", "user_ind", "last_update_dt", "last_update_user", "last_update_tx_id", "access_token_value", "pending_cdc_ind", "entitylink_st_tp_cd", "entity_id", "entity_type", "entity_status_tp_cd", "xband_level"},
    new GetPersonHistoryParameterHandler (),
    new int[][]{{Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP}, {19, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {1, 1, 1, 1, 1}},
    null,
    new GetPersonHistoryRowHandler (),
    new int[][]{ {Types.BIGINT, Types.CHAR, Types.VARCHAR, Types.TIMESTAMP, Types.TIMESTAMP, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP, Types.VARCHAR, Types.CHAR, Types.CHAR, Types.CHAR, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.TIMESTAMP, Types.BIGINT, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.BIGINT, Types.CHAR, Types.CHAR, Types.BIGINT, Types.CHAR, Types.VARCHAR, Types.TIMESTAMP, Types.TIMESTAMP, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.CHAR, Types.TIMESTAMP, Types.TIMESTAMP, Types.SMALLINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.CHAR, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT, Types.VARCHAR, Types.CHAR, Types.BIGINT, Types.BIGINT, Types.VARCHAR, Types.BIGINT, Types.VARCHAR}, {19, 1, 20, 0, 0, 19, 19, 19, 0, 0, 0, 0, 255, 1, 1, 1, 19, 19, 19, 19, 0, 19, 0, 20, 19, 0, 0, 19, 1, 1, 19, 1, 20, 0, 0, 19, 19, 19, 19, 19, 19, 1, 0, 0, 10, 0, 0, 1, 0, 20, 19, 50, 1, 19, 19, 25, 19, 250}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}},
    null,
    identifier,
    generationTime,
    collection,
    forceSingleBindIsolation,
    null,
    1);

  /**
   * @generated
   */
  public static class GetPersonHistoryParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      setObject (stmt, 1, Types.BIGINT, parameters[0], 0);
      setObject (stmt, 2, Types.TIMESTAMP, parameters[1], 0);
      setObject (stmt, 3, Types.TIMESTAMP, parameters[2], 0);
      setObject (stmt, 4, Types.TIMESTAMP, parameters[3], 0);
      setObject (stmt, 5, Types.TIMESTAMP, parameters[4], 0);
    }
  }

  /**
   * @generated
   */
  public static class GetPersonHistoryRowHandler extends BaseRowHandler<ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt>>
  {
    /**
     * @generated
     */
    public ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt> handle (java.sql.ResultSet rs, ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt> returnObject) throws java.sql.SQLException
    {
      returnObject = new ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt> ();

      EObjContact returnObject1 = new EObjContact ();
      returnObject1.setHistoryIdPK(getLongObject (rs, 1)); 
      returnObject1.setHistActionCode(getString (rs, 2)); 
      returnObject1.setHistCreatedBy(getString (rs, 3)); 
      returnObject1.setHistCreateDt(getTimestamp (rs, 4)); 
      returnObject1.setHistEndDt(getTimestamp (rs, 5)); 
      returnObject1.setContIdPK(getLongObject (rs, 6)); 
      returnObject1.setAcceCompTpCd(getLongObject (rs, 7)); 
      returnObject1.setPrefLangTpCd(getLongObject (rs, 8)); 
      returnObject1.setCreatedDt(getTimestamp (rs, 9)); 
      returnObject1.setSinceDt(getTimestamp (rs, 10)); 
      returnObject1.setLeftDt(getTimestamp (rs, 11)); 
      returnObject1.setInactivatedDt(getTimestamp (rs, 12)); 
      returnObject1.setContactName(getString (rs, 13)); 
      returnObject1.setPersonOrgCode(getString (rs, 14)); 
      returnObject1.setSolicitInd(getString (rs, 15)); 
      returnObject1.setConfidentialInd(getString (rs, 16)); 
      returnObject1.setClientImpTpCd(getLongObject (rs, 17)); 
      returnObject1.setClientStTpCd(getLongObject (rs, 18)); 
      returnObject1.setClientPotenTpCd(getLongObject (rs, 19)); 
      returnObject1.setRptingFreqTpCd(getLongObject (rs, 20)); 
      returnObject1.setLastStatementDt(getTimestamp (rs, 21)); 
      returnObject1.setProvidedByCont(getLongObject (rs, 22)); 
      returnObject1.setLastUpdateDt(getTimestamp (rs, 23)); 
      returnObject1.setLastUpdateUser(getString (rs, 24)); 
      returnObject1.setLastUpdateTxId(getLongObject (rs, 25)); 
      returnObject1.setLastUsedDt(getTimestamp (rs, 26)); 
      returnObject1.setLastVerifiedDt(getTimestamp (rs, 27)); 
      returnObject1.setSourceIdentTpCd(getLongObject (rs, 28)); 
      returnObject1.setDoNotDelInd(getString (rs, 29)); 
      returnObject1.setAlertInd(getString (rs, 30)); 
      returnObject1.setAccessTokenValue(getString (rs, 52)); 
      returnObject1.setPendingCDCInd(getString (rs, 53)); 
      returnObject1.setEntitylink_st_tp_cd(getLongObject (rs, 54)); 
      returnObject1.setEntity_id(getLongObject (rs, 55)); 
      returnObject1.setEntity_type(getString (rs, 56)); 
      returnObject1.setEntityStatusTpCd(getLongObject (rs, 57)); 
      returnObject.add (returnObject1);

      EObjPerson returnObject2 = new EObjPerson ();
      returnObject2.setHistoryIdPK(getLongObject (rs, 31)); 
      returnObject2.setHistActionCode(getString (rs, 32)); 
      returnObject2.setHistCreatedBy(getString (rs, 33)); 
      returnObject2.setHistCreateDt(getTimestamp (rs, 34)); 
      returnObject2.setHistEndDt(getTimestamp (rs, 35)); 
      returnObject2.setContIdPK(getLongObject (rs, 36)); 
      returnObject2.setMaritalStTpCd(getLongObject (rs, 37)); 
      returnObject2.setBirthPlaceTpCd(getLongObject (rs, 38)); 
      returnObject2.setCitizenshipTpCd(getLongObject (rs, 39)); 
      returnObject2.setHighestEduTpCd(getLongObject (rs, 40)); 
      returnObject2.setAgeVerDocTpCd(getLongObject (rs, 41)); 
      returnObject2.setGenderTpCd(getString (rs, 42)); 
      returnObject2.setBirthDt(getTimestamp (rs, 43)); 
      returnObject2.setDeceasedDt(getTimestamp (rs, 44)); 
      returnObject2.setChildrenCt(getIntObject (rs, 45)); 
      returnObject2.setDisabStartDt(getTimestamp (rs, 46)); 
      returnObject2.setDisabEndDt(getTimestamp (rs, 47)); 
      returnObject2.setUserInd(getString (rs, 48)); 
      returnObject2.setLastUpdateDt(getTimestamp (rs, 49)); 
      returnObject2.setLastUpdateUser(getString (rs, 50)); 
      returnObject2.setLastUpdateTxId(getLongObject (rs, 51)); 
      returnObject.add (returnObject2);

      EObjXPersonExt returnObject3 = new EObjXPersonExt ();
      returnObject3.setHistActionCode(getString (rs, 32)); 
      returnObject3.setHistCreatedBy(getString (rs, 33)); 
      returnObject3.setHistCreateDt(getTimestamp (rs, 34)); 
      returnObject3.setHistEndDt(getTimestamp (rs, 35)); 
      returnObject3.setLastUpdateDt(getTimestamp (rs, 49)); 
      returnObject3.setLastUpdateUser(getString (rs, 50)); 
      returnObject3.setLastUpdateTxId(getLongObject (rs, 51)); 
      returnObject3.setXBandLevel(getString (rs, 58)); 
      returnObject.add (returnObject3);

    
      return returnObject;
    }
  }

  /**
   * @Select( sql="SELECT CONTACT.CONT_ID , CONTACT.ACCE_COMP_TP_CD , CONTACT.PREF_LANG_TP_CD , CONTACT.CREATED_DT , CONTACT.SINCE_DT , CONTACT.LEFT_DT , CONTACT.INACTIVATED_DT , CONTACT.CONTACT_NAME , CONTACT.PERSON_ORG_CODE , CONTACT.SOLICIT_IND , CONTACT.CONFIDENTIAL_IND , CONTACT.CLIENT_IMP_TP_CD , CONTACT.CLIENT_ST_TP_CD , CONTACT.CLIENT_POTEN_TP_CD , CONTACT.RPTING_FREQ_TP_CD , CONTACT.LAST_STATEMENT_DT , CONTACT.PROVIDED_BY_CONT , CONTACT.LAST_UPDATE_DT , CONTACT.LAST_UPDATE_USER , CONTACT.ALERT_IND , CONTACT.LAST_UPDATE_TX_ID , CONTACT.LAST_USED_DT , CONTACT.LAST_VERIFIED_DT , CONTACT.SOURCE_IDENT_TP_CD , CONTACT.DO_NOT_DELETE_IND , PERSON.CONT_ID , PERSON.MARITAL_ST_TP_CD , PERSON.BIRTHPLACE_TP_CD , PERSON.CITIZENSHIP_TP_CD , PERSON.HIGHEST_EDU_TP_CD , PERSON.AGE_VER_DOC_TP_CD , PERSON.GENDER_TP_CODE , PERSON.BIRTH_DT , PERSON.DECEASED_DT , PERSON.CHILDREN_CT , PERSON.DISAB_START_DT , PERSON.DISAB_END_DT , PERSON.USER_IND , PERSON.LAST_UPDATE_DT , PERSON.LAST_UPDATE_USER , PERSON.LAST_UPDATE_TX_ID , CS.CONT_ID , CS.PRIVPREF_IND , CS.MISCVALUE_IND , CS.CONTACTREL_IND , CS.BANKACCOUNT_IND , CS.CHARGECARD_IND , CS.INCOMESOURCE_IND , CS.PAYROLLDEDUCT_IND , CS.IDENTIFIER_IND , CS.ALERT_IND , CS.CONTEQUIV_IND , CS.INTERACTION_IND , CS.ADDRESSGROUP_IND , CS.CONTMETHGROUP_IND , CS.LOBREL_IND , CS.LAST_UPDATE_DT , CS.LAST_UPDATE_USER , CS.LAST_UPDATE_TX_ID , CONTACT.ACCESS_TOKEN_VALUE , CONTACT.PENDING_CDC_IND, CONTACT.ENTITYLINK_ST_TP_CD, CONTACT.ENTITY_ID, CONTACT.ENTITY_TYPE, CONTACT.ENTITY_STATUS_TP_CD, PERSON.XBand_Level FROM PERSON,CONTACT LEFT OUTER JOIN CONTSUMMARY CS ON CONTACT.CONT_ID = CS.CONT_ID WHERE PERSON.CONT_ID = CONTACT.CONT_ID AND PERSON.CONT_ID = ?", pattern="tableAlias (CONTACT => com.dwl.tcrm.coreParty.entityObject.EObjContact, H_CONTACT => com.dwl.tcrm.coreParty.entityObject.EObjContact, PERSON => com.dwl.tcrm.coreParty.entityObject.EObjPerson, H_PERSON => com.dwl.tcrm.coreParty.entityObject.EObjPerson, CONTSUMMARY => com.dwl.tcrm.coreParty.entityObject.EObjContSummary , PERSON => com.mit.mdm.customModels.entityObject.EObjXPersonExt , H_PERSON => com.mit.mdm.customModels.entityObject.EObjXPersonExt)" )
   * 
   * @generated
   */
  public Iterator<ResultQueue4<EObjContact,EObjPerson,EObjContSummary,EObjXPersonExt>> getPersonWithIndicators (Object[] parameters)
  {
    return queryIterator (getPersonWithIndicatorsStatementDescriptor, parameters);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor getPersonWithIndicatorsStatementDescriptor = createStatementDescriptor (
    "getPersonWithIndicators(Object[])",
    "SELECT CONTACT.CONT_ID , CONTACT.ACCE_COMP_TP_CD , CONTACT.PREF_LANG_TP_CD , CONTACT.CREATED_DT , CONTACT.SINCE_DT , CONTACT.LEFT_DT , CONTACT.INACTIVATED_DT , CONTACT.CONTACT_NAME , CONTACT.PERSON_ORG_CODE , CONTACT.SOLICIT_IND , CONTACT.CONFIDENTIAL_IND , CONTACT.CLIENT_IMP_TP_CD , CONTACT.CLIENT_ST_TP_CD , CONTACT.CLIENT_POTEN_TP_CD , CONTACT.RPTING_FREQ_TP_CD , CONTACT.LAST_STATEMENT_DT , CONTACT.PROVIDED_BY_CONT , CONTACT.LAST_UPDATE_DT , CONTACT.LAST_UPDATE_USER , CONTACT.ALERT_IND , CONTACT.LAST_UPDATE_TX_ID , CONTACT.LAST_USED_DT , CONTACT.LAST_VERIFIED_DT , CONTACT.SOURCE_IDENT_TP_CD , CONTACT.DO_NOT_DELETE_IND , PERSON.CONT_ID , PERSON.MARITAL_ST_TP_CD , PERSON.BIRTHPLACE_TP_CD , PERSON.CITIZENSHIP_TP_CD , PERSON.HIGHEST_EDU_TP_CD , PERSON.AGE_VER_DOC_TP_CD , PERSON.GENDER_TP_CODE , PERSON.BIRTH_DT , PERSON.DECEASED_DT , PERSON.CHILDREN_CT , PERSON.DISAB_START_DT , PERSON.DISAB_END_DT , PERSON.USER_IND , PERSON.LAST_UPDATE_DT , PERSON.LAST_UPDATE_USER , PERSON.LAST_UPDATE_TX_ID , CS.CONT_ID , CS.PRIVPREF_IND , CS.MISCVALUE_IND , CS.CONTACTREL_IND , CS.BANKACCOUNT_IND , CS.CHARGECARD_IND , CS.INCOMESOURCE_IND , CS.PAYROLLDEDUCT_IND , CS.IDENTIFIER_IND , CS.ALERT_IND , CS.CONTEQUIV_IND , CS.INTERACTION_IND , CS.ADDRESSGROUP_IND , CS.CONTMETHGROUP_IND , CS.LOBREL_IND , CS.LAST_UPDATE_DT , CS.LAST_UPDATE_USER , CS.LAST_UPDATE_TX_ID , CONTACT.ACCESS_TOKEN_VALUE , CONTACT.PENDING_CDC_IND, CONTACT.ENTITYLINK_ST_TP_CD, CONTACT.ENTITY_ID, CONTACT.ENTITY_TYPE, CONTACT.ENTITY_STATUS_TP_CD, PERSON.XBand_Level FROM PERSON,CONTACT LEFT OUTER JOIN CONTSUMMARY CS ON CONTACT.CONT_ID = CS.CONT_ID WHERE PERSON.CONT_ID = CONTACT.CONT_ID AND PERSON.CONT_ID = ?",
    new int[] {SINGLE_ROW_PARAMETERS, MULTI_ROW_RESULT, java.sql.ResultSet.CONCUR_READ_ONLY, java.sql.ResultSet.CLOSE_CURSORS_AT_COMMIT, java.sql.ResultSet.TYPE_FORWARD_ONLY, DISALLOW_STATIC_ROWSET_CURSORS},
    SqlStatementType.QUERY,
    new String[]{"cont_id", "acce_comp_tp_cd", "pref_lang_tp_cd", "created_dt", "since_dt", "left_dt", "inactivated_dt", "contact_name", "person_org_code", "solicit_ind", "confidential_ind", "client_imp_tp_cd", "client_st_tp_cd", "client_poten_tp_cd", "rpting_freq_tp_cd", "last_statement_dt", "provided_by_cont", "last_update_dt", "last_update_user", "alert_ind", "last_update_tx_id", "last_used_dt", "last_verified_dt", "source_ident_tp_cd", "do_not_delete_ind", "cont_id", "marital_st_tp_cd", "birthplace_tp_cd", "citizenship_tp_cd", "highest_edu_tp_cd", "age_ver_doc_tp_cd", "gender_tp_code", "birth_dt", "deceased_dt", "children_ct", "disab_start_dt", "disab_end_dt", "user_ind", "last_update_dt", "last_update_user", "last_update_tx_id", "cont_id", "privpref_ind", "miscvalue_ind", "contactrel_ind", "bankaccount_ind", "chargecard_ind", "incomesource_ind", "payrolldeduct_ind", "identifier_ind", "alert_ind", "contequiv_ind", "interaction_ind", "addressgroup_ind", "contmethgroup_ind", "lobrel_ind", "last_update_dt", "last_update_user", "last_update_tx_id", "access_token_value", "pending_cdc_ind", "entitylink_st_tp_cd", "entity_id", "entity_type", "entity_status_tp_cd", "xband_level"},
    new GetPersonWithIndicatorsParameterHandler (),
    new int[][]{{Types.BIGINT}, {19}, {0}, {1}},
    null,
    new GetPersonWithIndicatorsRowHandler (),
    new int[][]{ {Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP, Types.VARCHAR, Types.CHAR, Types.CHAR, Types.CHAR, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.TIMESTAMP, Types.BIGINT, Types.TIMESTAMP, Types.VARCHAR, Types.CHAR, Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.BIGINT, Types.CHAR, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.CHAR, Types.TIMESTAMP, Types.TIMESTAMP, Types.SMALLINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.CHAR, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT, Types.BIGINT, Types.SMALLINT, Types.SMALLINT, Types.SMALLINT, Types.SMALLINT, Types.SMALLINT, Types.SMALLINT, Types.SMALLINT, Types.SMALLINT, Types.SMALLINT, Types.SMALLINT, Types.SMALLINT, Types.SMALLINT, Types.SMALLINT, Types.SMALLINT, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT, Types.VARCHAR, Types.CHAR, Types.BIGINT, Types.BIGINT, Types.VARCHAR, Types.BIGINT, Types.VARCHAR}, {19, 19, 19, 0, 0, 0, 0, 255, 1, 1, 1, 19, 19, 19, 19, 0, 19, 0, 20, 1, 19, 0, 0, 19, 1, 19, 19, 19, 19, 19, 19, 1, 0, 0, 10, 0, 0, 1, 0, 20, 19, 19, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 20, 19, 50, 1, 19, 19, 25, 19, 250}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}},
    null,
    identifier,
    generationTime,
    collection,
    forceSingleBindIsolation,
    null,
    2);

  /**
   * @generated
   */
  public static class GetPersonWithIndicatorsParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      setObject (stmt, 1, Types.BIGINT, parameters[0], 0);
    }
  }

  /**
   * @generated
   */
  public static class GetPersonWithIndicatorsRowHandler extends BaseRowHandler<ResultQueue4<EObjContact,EObjPerson,EObjContSummary,EObjXPersonExt>>
  {
    /**
     * @generated
     */
    public ResultQueue4<EObjContact,EObjPerson,EObjContSummary,EObjXPersonExt> handle (java.sql.ResultSet rs, ResultQueue4<EObjContact,EObjPerson,EObjContSummary,EObjXPersonExt> returnObject) throws java.sql.SQLException
    {
      returnObject = new ResultQueue4<EObjContact,EObjPerson,EObjContSummary,EObjXPersonExt> ();

      EObjContact returnObject1 = new EObjContact ();
      returnObject1.setContIdPK(getLongObject (rs, 1)); 
      returnObject1.setAcceCompTpCd(getLongObject (rs, 2)); 
      returnObject1.setPrefLangTpCd(getLongObject (rs, 3)); 
      returnObject1.setCreatedDt(getTimestamp (rs, 4)); 
      returnObject1.setSinceDt(getTimestamp (rs, 5)); 
      returnObject1.setLeftDt(getTimestamp (rs, 6)); 
      returnObject1.setInactivatedDt(getTimestamp (rs, 7)); 
      returnObject1.setContactName(getString (rs, 8)); 
      returnObject1.setPersonOrgCode(getString (rs, 9)); 
      returnObject1.setSolicitInd(getString (rs, 10)); 
      returnObject1.setConfidentialInd(getString (rs, 11)); 
      returnObject1.setClientImpTpCd(getLongObject (rs, 12)); 
      returnObject1.setClientStTpCd(getLongObject (rs, 13)); 
      returnObject1.setClientPotenTpCd(getLongObject (rs, 14)); 
      returnObject1.setRptingFreqTpCd(getLongObject (rs, 15)); 
      returnObject1.setLastStatementDt(getTimestamp (rs, 16)); 
      returnObject1.setProvidedByCont(getLongObject (rs, 17)); 
      returnObject1.setLastUpdateDt(getTimestamp (rs, 18)); 
      returnObject1.setLastUpdateUser(getString (rs, 19)); 
      returnObject1.setAlertInd(getString (rs, 20)); 
      returnObject1.setLastUpdateTxId(getLongObject (rs, 21)); 
      returnObject1.setLastUsedDt(getTimestamp (rs, 22)); 
      returnObject1.setLastVerifiedDt(getTimestamp (rs, 23)); 
      returnObject1.setSourceIdentTpCd(getLongObject (rs, 24)); 
      returnObject1.setDoNotDelInd(getString (rs, 25)); 
      returnObject1.setAccessTokenValue(getString (rs, 60)); 
      returnObject1.setPendingCDCInd(getString (rs, 61)); 
      returnObject1.setEntitylink_st_tp_cd(getLongObject (rs, 62)); 
      returnObject1.setEntity_id(getLongObject (rs, 63)); 
      returnObject1.setEntity_type(getString (rs, 64)); 
      returnObject1.setEntityStatusTpCd(getLongObject (rs, 65)); 
      returnObject.add (returnObject1);

      EObjPerson returnObject2 = new EObjPerson ();
      returnObject2.setContIdPK(getLongObject (rs, 26)); 
      returnObject2.setMaritalStTpCd(getLongObject (rs, 27)); 
      returnObject2.setBirthPlaceTpCd(getLongObject (rs, 28)); 
      returnObject2.setCitizenshipTpCd(getLongObject (rs, 29)); 
      returnObject2.setHighestEduTpCd(getLongObject (rs, 30)); 
      returnObject2.setAgeVerDocTpCd(getLongObject (rs, 31)); 
      returnObject2.setGenderTpCd(getString (rs, 32)); 
      returnObject2.setBirthDt(getTimestamp (rs, 33)); 
      returnObject2.setDeceasedDt(getTimestamp (rs, 34)); 
      returnObject2.setChildrenCt(getIntObject (rs, 35)); 
      returnObject2.setDisabStartDt(getTimestamp (rs, 36)); 
      returnObject2.setDisabEndDt(getTimestamp (rs, 37)); 
      returnObject2.setUserInd(getString (rs, 38)); 
      returnObject2.setLastUpdateDt(getTimestamp (rs, 39)); 
      returnObject2.setLastUpdateUser(getString (rs, 40)); 
      returnObject2.setLastUpdateTxId(getLongObject (rs, 41)); 
      returnObject.add (returnObject2);

      EObjContSummary returnObject3 = new EObjContSummary ();
      returnObject3.setContId(getLongObject (rs, 42)); 
      returnObject3.setPrivPrefInd(getShortObject (rs,43)); 
      returnObject3.setMiscValueInd(getShortObject (rs,44)); 
      returnObject3.setBankAccountInd(getShortObject (rs,46)); 
      returnObject3.setChargeCardInd(getShortObject (rs,47)); 
      returnObject3.setIncomeSourceInd(getShortObject (rs,48)); 
      returnObject3.setPayrollDeductInd(getShortObject (rs,49)); 
      returnObject3.setIdentifierInd(getShortObject (rs,50)); 
      returnObject3.setAlertInd(getShortObject (rs,51)); 
      returnObject3.setContEquivInd(getShortObject (rs,52)); 
      returnObject3.setInteractionInd(getShortObject (rs,53)); 
      returnObject3.setAddressGroupInd(getShortObject (rs,54)); 
      returnObject3.setContMethGroupInd(getShortObject (rs,55)); 
      returnObject3.setLobRelInd(getShortObject (rs,56)); 
      returnObject3.setLastUpdateDt(getTimestamp (rs, 57)); 
      returnObject3.setLastUpdateUser(getString (rs, 58)); 
      returnObject3.setLastUpdateTxId(getLongObject (rs, 59)); 
      returnObject.add (returnObject3);

      EObjXPersonExt returnObject4 = new EObjXPersonExt ();
      returnObject4.setLastUpdateDt(getTimestamp (rs, 39)); 
      returnObject4.setLastUpdateUser(getString (rs, 40)); 
      returnObject4.setLastUpdateTxId(getLongObject (rs, 41)); 
      returnObject4.setXBandLevel(getString (rs, 66)); 
      returnObject.add (returnObject4);

    
      return returnObject;
    }
  }

  /**
   * @Select( sql="SELECT CONTACT.CONT_ID , CONTACT.ACCE_COMP_TP_CD , CONTACT.PREF_LANG_TP_CD , CONTACT.CREATED_DT , CONTACT.SINCE_DT , CONTACT.LEFT_DT , CONTACT.INACTIVATED_DT , CONTACT.CONTACT_NAME , CONTACT.PERSON_ORG_CODE , CONTACT.SOLICIT_IND , CONTACT.CONFIDENTIAL_IND , CONTACT.CLIENT_IMP_TP_CD , CONTACT.CLIENT_ST_TP_CD , CONTACT.CLIENT_POTEN_TP_CD , CONTACT.RPTING_FREQ_TP_CD , CONTACT.LAST_STATEMENT_DT , CONTACT.PROVIDED_BY_CONT , CONTACT.LAST_UPDATE_DT , CONTACT.LAST_UPDATE_USER , CONTACT.ALERT_IND , CONTACT.LAST_UPDATE_TX_ID ,CONTACT.LAST_USED_DT , CONTACT.LAST_VERIFIED_DT , CONTACT.SOURCE_IDENT_TP_CD , CONTACT.DO_NOT_DELETE_IND , PERSON.CONT_ID , PERSON.MARITAL_ST_TP_CD , PERSON.BIRTHPLACE_TP_CD , PERSON.CITIZENSHIP_TP_CD , PERSON.HIGHEST_EDU_TP_CD , PERSON.AGE_VER_DOC_TP_CD , PERSON.GENDER_TP_CODE , PERSON.BIRTH_DT , PERSON.DECEASED_DT , PERSON.CHILDREN_CT , PERSON.DISAB_START_DT , PERSON.DISAB_END_DT , PERSON.USER_IND , PERSON.LAST_UPDATE_DT , PERSON.LAST_UPDATE_USER , PERSON.LAST_UPDATE_TX_ID ,CONTACT.ACCESS_TOKEN_VALUE , CONTACT.PENDING_CDC_IND, CONTACT.ENTITYLINK_ST_TP_CD, CONTACT.ENTITY_ID, CONTACT.ENTITY_TYPE, CONTACT.ENTITY_STATUS_TP_CD, PERSON.XBand_Level FROM PERSON,CONTACT WHERE PERSON.CONT_ID = CONTACT.CONT_ID AND PERSON.CONT_ID = ?", pattern="tableAlias (CONTACT => com.dwl.tcrm.coreParty.entityObject.EObjContact, H_CONTACT => com.dwl.tcrm.coreParty.entityObject.EObjContact, PERSON => com.dwl.tcrm.coreParty.entityObject.EObjPerson, H_PERSON => com.dwl.tcrm.coreParty.entityObject.EObjPerson, CONTSUMMARY => com.dwl.tcrm.coreParty.entityObject.EObjContSummary , PERSON => com.mit.mdm.customModels.entityObject.EObjXPersonExt , H_PERSON => com.mit.mdm.customModels.entityObject.EObjXPersonExt)" )
   * 
   * @generated
   */
  public Iterator<ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt>> getPerson (Object[] parameters)
  {
    return queryIterator (getPersonStatementDescriptor, parameters);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor getPersonStatementDescriptor = createStatementDescriptor (
    "getPerson(Object[])",
    "SELECT CONTACT.CONT_ID , CONTACT.ACCE_COMP_TP_CD , CONTACT.PREF_LANG_TP_CD , CONTACT.CREATED_DT , CONTACT.SINCE_DT , CONTACT.LEFT_DT , CONTACT.INACTIVATED_DT , CONTACT.CONTACT_NAME , CONTACT.PERSON_ORG_CODE , CONTACT.SOLICIT_IND , CONTACT.CONFIDENTIAL_IND , CONTACT.CLIENT_IMP_TP_CD , CONTACT.CLIENT_ST_TP_CD , CONTACT.CLIENT_POTEN_TP_CD , CONTACT.RPTING_FREQ_TP_CD , CONTACT.LAST_STATEMENT_DT , CONTACT.PROVIDED_BY_CONT , CONTACT.LAST_UPDATE_DT , CONTACT.LAST_UPDATE_USER , CONTACT.ALERT_IND , CONTACT.LAST_UPDATE_TX_ID ,CONTACT.LAST_USED_DT , CONTACT.LAST_VERIFIED_DT , CONTACT.SOURCE_IDENT_TP_CD , CONTACT.DO_NOT_DELETE_IND , PERSON.CONT_ID , PERSON.MARITAL_ST_TP_CD , PERSON.BIRTHPLACE_TP_CD , PERSON.CITIZENSHIP_TP_CD , PERSON.HIGHEST_EDU_TP_CD , PERSON.AGE_VER_DOC_TP_CD , PERSON.GENDER_TP_CODE , PERSON.BIRTH_DT , PERSON.DECEASED_DT , PERSON.CHILDREN_CT , PERSON.DISAB_START_DT , PERSON.DISAB_END_DT , PERSON.USER_IND , PERSON.LAST_UPDATE_DT , PERSON.LAST_UPDATE_USER , PERSON.LAST_UPDATE_TX_ID ,CONTACT.ACCESS_TOKEN_VALUE , CONTACT.PENDING_CDC_IND, CONTACT.ENTITYLINK_ST_TP_CD, CONTACT.ENTITY_ID, CONTACT.ENTITY_TYPE, CONTACT.ENTITY_STATUS_TP_CD, PERSON.XBand_Level FROM PERSON,CONTACT WHERE PERSON.CONT_ID = CONTACT.CONT_ID AND PERSON.CONT_ID = ?",
    new int[] {SINGLE_ROW_PARAMETERS, MULTI_ROW_RESULT, java.sql.ResultSet.CONCUR_READ_ONLY, java.sql.ResultSet.CLOSE_CURSORS_AT_COMMIT, java.sql.ResultSet.TYPE_FORWARD_ONLY, DISALLOW_STATIC_ROWSET_CURSORS},
    SqlStatementType.QUERY,
    new String[]{"cont_id", "acce_comp_tp_cd", "pref_lang_tp_cd", "created_dt", "since_dt", "left_dt", "inactivated_dt", "contact_name", "person_org_code", "solicit_ind", "confidential_ind", "client_imp_tp_cd", "client_st_tp_cd", "client_poten_tp_cd", "rpting_freq_tp_cd", "last_statement_dt", "provided_by_cont", "last_update_dt", "last_update_user", "alert_ind", "last_update_tx_id", "last_used_dt", "last_verified_dt", "source_ident_tp_cd", "do_not_delete_ind", "cont_id", "marital_st_tp_cd", "birthplace_tp_cd", "citizenship_tp_cd", "highest_edu_tp_cd", "age_ver_doc_tp_cd", "gender_tp_code", "birth_dt", "deceased_dt", "children_ct", "disab_start_dt", "disab_end_dt", "user_ind", "last_update_dt", "last_update_user", "last_update_tx_id", "access_token_value", "pending_cdc_ind", "entitylink_st_tp_cd", "entity_id", "entity_type", "entity_status_tp_cd", "xband_level"},
    new GetPersonParameterHandler (),
    new int[][]{{Types.BIGINT}, {19}, {0}, {1}},
    null,
    new GetPersonRowHandler (),
    new int[][]{ {Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP, Types.VARCHAR, Types.CHAR, Types.CHAR, Types.CHAR, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.TIMESTAMP, Types.BIGINT, Types.TIMESTAMP, Types.VARCHAR, Types.CHAR, Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.BIGINT, Types.CHAR, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.CHAR, Types.TIMESTAMP, Types.TIMESTAMP, Types.SMALLINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.CHAR, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT, Types.VARCHAR, Types.CHAR, Types.BIGINT, Types.BIGINT, Types.VARCHAR, Types.BIGINT, Types.VARCHAR}, {19, 19, 19, 0, 0, 0, 0, 255, 1, 1, 1, 19, 19, 19, 19, 0, 19, 0, 20, 1, 19, 0, 0, 19, 1, 19, 19, 19, 19, 19, 19, 1, 0, 0, 10, 0, 0, 1, 0, 20, 19, 50, 1, 19, 19, 25, 19, 250}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}},
    null,
    identifier,
    generationTime,
    collection,
    forceSingleBindIsolation,
    null,
    3);

  /**
   * @generated
   */
  public static class GetPersonParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      setObject (stmt, 1, Types.BIGINT, parameters[0], 0);
    }
  }

  /**
   * @generated
   */
  public static class GetPersonRowHandler extends BaseRowHandler<ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt>>
  {
    /**
     * @generated
     */
    public ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt> handle (java.sql.ResultSet rs, ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt> returnObject) throws java.sql.SQLException
    {
      returnObject = new ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt> ();

      EObjContact returnObject1 = new EObjContact ();
      returnObject1.setContIdPK(getLongObject (rs, 1)); 
      returnObject1.setAcceCompTpCd(getLongObject (rs, 2)); 
      returnObject1.setPrefLangTpCd(getLongObject (rs, 3)); 
      returnObject1.setCreatedDt(getTimestamp (rs, 4)); 
      returnObject1.setSinceDt(getTimestamp (rs, 5)); 
      returnObject1.setLeftDt(getTimestamp (rs, 6)); 
      returnObject1.setInactivatedDt(getTimestamp (rs, 7)); 
      returnObject1.setContactName(getString (rs, 8)); 
      returnObject1.setPersonOrgCode(getString (rs, 9)); 
      returnObject1.setSolicitInd(getString (rs, 10)); 
      returnObject1.setConfidentialInd(getString (rs, 11)); 
      returnObject1.setClientImpTpCd(getLongObject (rs, 12)); 
      returnObject1.setClientStTpCd(getLongObject (rs, 13)); 
      returnObject1.setClientPotenTpCd(getLongObject (rs, 14)); 
      returnObject1.setRptingFreqTpCd(getLongObject (rs, 15)); 
      returnObject1.setLastStatementDt(getTimestamp (rs, 16)); 
      returnObject1.setProvidedByCont(getLongObject (rs, 17)); 
      returnObject1.setLastUpdateDt(getTimestamp (rs, 18)); 
      returnObject1.setLastUpdateUser(getString (rs, 19)); 
      returnObject1.setAlertInd(getString (rs, 20)); 
      returnObject1.setLastUpdateTxId(getLongObject (rs, 21)); 
      returnObject1.setLastUsedDt(getTimestamp (rs, 22)); 
      returnObject1.setLastVerifiedDt(getTimestamp (rs, 23)); 
      returnObject1.setSourceIdentTpCd(getLongObject (rs, 24)); 
      returnObject1.setDoNotDelInd(getString (rs, 25)); 
      returnObject1.setAccessTokenValue(getString (rs, 42)); 
      returnObject1.setPendingCDCInd(getString (rs, 43)); 
      returnObject1.setEntitylink_st_tp_cd(getLongObject (rs, 44)); 
      returnObject1.setEntity_id(getLongObject (rs, 45)); 
      returnObject1.setEntity_type(getString (rs, 46)); 
      returnObject1.setEntityStatusTpCd(getLongObject (rs, 47)); 
      returnObject.add (returnObject1);

      EObjPerson returnObject2 = new EObjPerson ();
      returnObject2.setContIdPK(getLongObject (rs, 26)); 
      returnObject2.setMaritalStTpCd(getLongObject (rs, 27)); 
      returnObject2.setBirthPlaceTpCd(getLongObject (rs, 28)); 
      returnObject2.setCitizenshipTpCd(getLongObject (rs, 29)); 
      returnObject2.setHighestEduTpCd(getLongObject (rs, 30)); 
      returnObject2.setAgeVerDocTpCd(getLongObject (rs, 31)); 
      returnObject2.setGenderTpCd(getString (rs, 32)); 
      returnObject2.setBirthDt(getTimestamp (rs, 33)); 
      returnObject2.setDeceasedDt(getTimestamp (rs, 34)); 
      returnObject2.setChildrenCt(getIntObject (rs, 35)); 
      returnObject2.setDisabStartDt(getTimestamp (rs, 36)); 
      returnObject2.setDisabEndDt(getTimestamp (rs, 37)); 
      returnObject2.setUserInd(getString (rs, 38)); 
      returnObject2.setLastUpdateDt(getTimestamp (rs, 39)); 
      returnObject2.setLastUpdateUser(getString (rs, 40)); 
      returnObject2.setLastUpdateTxId(getLongObject (rs, 41)); 
      returnObject.add (returnObject2);

      EObjXPersonExt returnObject3 = new EObjXPersonExt ();
      returnObject3.setLastUpdateDt(getTimestamp (rs, 39)); 
      returnObject3.setLastUpdateUser(getString (rs, 40)); 
      returnObject3.setLastUpdateTxId(getLongObject (rs, 41)); 
      returnObject3.setXBandLevel(getString (rs, 48)); 
      returnObject.add (returnObject3);

    
      return returnObject;
    }
  }

  /**
   * @Select( sql="SELECT DISTINCT C.H_CONT_ID , C.H_ACTION_CODE , C.H_CREATED_BY , C.H_CREATE_DT , C.H_END_DT , C.CONT_ID , C.ACCE_COMP_TP_CD , C.PREF_LANG_TP_CD , C.CREATED_DT , C.SINCE_DT , C.LEFT_DT , C.INACTIVATED_DT , C.CONTACT_NAME , C.PERSON_ORG_CODE , C.SOLICIT_IND , C.CONFIDENTIAL_IND , C.CLIENT_IMP_TP_CD , C.CLIENT_ST_TP_CD , C.CLIENT_POTEN_TP_CD , C.RPTING_FREQ_TP_CD , C.LAST_STATEMENT_DT , C.PROVIDED_BY_CONT , C.LAST_UPDATE_DT , C.LAST_UPDATE_USER , C.LAST_UPDATE_TX_ID , C.LAST_USED_DT , C.LAST_VERIFIED_DT , C.SOURCE_IDENT_TP_CD , C.DO_NOT_DELETE_IND , C.ALERT_IND , P.H_CONT_ID AS H_CONT_ID_PERSON, P.H_ACTION_CODE , P.H_CREATED_BY , P.H_CREATE_DT , P.H_END_DT , P.CONT_ID , P.MARITAL_ST_TP_CD , P.BIRTHPLACE_TP_CD , P.CITIZENSHIP_TP_CD , P.HIGHEST_EDU_TP_CD , P.AGE_VER_DOC_TP_CD , P.GENDER_TP_CODE , P.BIRTH_DT , P.DECEASED_DT , P.CHILDREN_CT , P.DISAB_START_DT , P.DISAB_END_DT , P.USER_IND , P.LAST_UPDATE_DT , P.LAST_UPDATE_USER , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, C.ENTITYLINK_ST_TP_CD, C.ENTITY_ID, C.ENTITY_TYPE, C.ENTITY_STATUS_TP_CD, P.XBand_Level FROM H_CONTACT C LEFT JOIN H_PERSON P ON P.CONT_ID = C.CONT_ID AND P.LAST_UPDATE_TX_ID = C.LAST_UPDATE_TX_ID WHERE C.CONT_ID = ? AND ( C.H_CREATE_DT BETWEEN ? AND ? ) UNION SELECT DISTINCT C.H_CONT_ID , C.H_ACTION_CODE , C.H_CREATED_BY , C.H_CREATE_DT , C.H_END_DT , C.CONT_ID , C.ACCE_COMP_TP_CD , C.PREF_LANG_TP_CD , C.CREATED_DT , C.SINCE_DT , C.LEFT_DT , C.INACTIVATED_DT , C.CONTACT_NAME , C.PERSON_ORG_CODE , C.SOLICIT_IND , C.CONFIDENTIAL_IND , C.CLIENT_IMP_TP_CD , C.CLIENT_ST_TP_CD , C.CLIENT_POTEN_TP_CD , C.RPTING_FREQ_TP_CD , C.LAST_STATEMENT_DT , C.PROVIDED_BY_CONT , C.LAST_UPDATE_DT , C.LAST_UPDATE_USER , C.LAST_UPDATE_TX_ID , C.LAST_USED_DT , C.LAST_VERIFIED_DT , C.SOURCE_IDENT_TP_CD , C.DO_NOT_DELETE_IND , C.ALERT_IND , P.H_CONT_ID AS H_CONT_ID_PERSON, P.H_ACTION_CODE , P.H_CREATED_BY , P.H_CREATE_DT , P.H_END_DT , P.CONT_ID , P.MARITAL_ST_TP_CD , P.BIRTHPLACE_TP_CD , P.CITIZENSHIP_TP_CD , P.HIGHEST_EDU_TP_CD , P.AGE_VER_DOC_TP_CD , P.GENDER_TP_CODE , P.BIRTH_DT , P.DECEASED_DT , P.CHILDREN_CT , P.DISAB_START_DT , P.DISAB_END_DT , P.USER_IND , P.LAST_UPDATE_DT , P.LAST_UPDATE_USER , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, C.ENTITYLINK_ST_TP_CD, C.ENTITY_ID, C.ENTITY_TYPE, C.ENTITY_STATUS_TP_CD, P.XBand_Level FROM H_PERSON P LEFT JOIN H_CONTACT C ON P.CONT_ID = C.CONT_ID AND P.LAST_UPDATE_TX_ID = C.LAST_UPDATE_TX_ID WHERE P.CONT_ID = ? AND ( P.H_CREATE_DT BETWEEN ? AND ? )", pattern="<rsm><col number='1' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='historyIdPK'></col><col number='2' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='histActionCode'></col><col number='3' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='histCreatedBy'></col><col number='4' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='histCreateDt'></col><col number='5' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='histEndDt'></col><col number='6' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='contIdPK'></col><col number='7' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='acceCompTpCd'></col><col number='8' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='prefLangTpCd'></col><col number='9' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='createdDt'></col><col number='10' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='sinceDt'></col><col number='11' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='leftDt'></col><col number='12' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='inactivatedDt'></col><col number='13' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='contactName'></col><col number='14' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='personOrgCode'></col><col number='15' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='solicitInd'></col><col number='16' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='confidentialInd'></col><col number='17' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='clientImpTpCd'></col><col number='18' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='clientStTpCd'></col><col number='19' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='clientPotenTpCd'></col><col number='20' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='rptingFreqTpCd'></col><col number='21' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastStatementDt'></col><col number='22' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='providedByCont'></col><col number='23' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastUpdateDt'></col><col number='24' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastUpdateUser'></col><col number='25' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastUpdateTxId'></col><col number='26' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastUsedDt'></col><col number='27' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastVerifiedDt'></col><col number='28' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='sourceIdentTpCd'></col><col number='29' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='doNotDelInd'></col><col number='30' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='alertInd'></col><col number='31' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='historyIdPK'></col><col number='32' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='histActionCode'></col><col number='33' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='histCreatedBy'></col><col number='34' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='histCreateDt'></col><col number='35' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='histEndDt'></col><col number='36' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='contIdPK'></col><col number='37' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='maritalStTpCd'></col><col number='38' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='birthPlaceTpCd'></col><col number='39' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='citizenshipTpCd'></col><col number='40' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='highestEduTpCd'></col><col number='41' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='ageVerDocTpCd'></col><col number='42' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='genderTpCd'></col><col number='43' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='birthDt'></col><col number='44' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='deceasedDt'></col><col number='45' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='childrenCt'></col><col number='46' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='disabStartDt'></col><col number='47' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='disabEndDt'></col><col number='48' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='userInd'></col><col number='49' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='lastUpdateDt'></col><col number='50' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='lastUpdateUser'></col><col number='51' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='lastUpdateTxId'></col><col number='52' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='accessTokenValue'></col><col number='53' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='pendingCDCInd'></col><col number='54' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='entitylink_st_tp_cd'></col><col number='55' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='entity_id'></col><col number='56' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='entity_type'></col><col number='57' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='entityStatusTpCd'></col><col number='58' bean='com.mit.mdm.customModels.entityObject.EObjXPersonExt' property='XBandLevel'></col></rsm>" )
   * 
   * @generated
   */
  public Iterator<ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt>> getPersonImages (Object[] parameters)
  {
    return queryIterator (getPersonImagesStatementDescriptor, parameters);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor getPersonImagesStatementDescriptor = createStatementDescriptor (
    "getPersonImages(Object[])",
    "SELECT DISTINCT C.H_CONT_ID , C.H_ACTION_CODE , C.H_CREATED_BY , C.H_CREATE_DT , C.H_END_DT , C.CONT_ID , C.ACCE_COMP_TP_CD , C.PREF_LANG_TP_CD , C.CREATED_DT , C.SINCE_DT , C.LEFT_DT , C.INACTIVATED_DT , C.CONTACT_NAME , C.PERSON_ORG_CODE , C.SOLICIT_IND , C.CONFIDENTIAL_IND , C.CLIENT_IMP_TP_CD , C.CLIENT_ST_TP_CD , C.CLIENT_POTEN_TP_CD , C.RPTING_FREQ_TP_CD , C.LAST_STATEMENT_DT , C.PROVIDED_BY_CONT , C.LAST_UPDATE_DT , C.LAST_UPDATE_USER , C.LAST_UPDATE_TX_ID , C.LAST_USED_DT , C.LAST_VERIFIED_DT , C.SOURCE_IDENT_TP_CD , C.DO_NOT_DELETE_IND , C.ALERT_IND , P.H_CONT_ID AS H_CONT_ID_PERSON, P.H_ACTION_CODE , P.H_CREATED_BY , P.H_CREATE_DT , P.H_END_DT , P.CONT_ID , P.MARITAL_ST_TP_CD , P.BIRTHPLACE_TP_CD , P.CITIZENSHIP_TP_CD , P.HIGHEST_EDU_TP_CD , P.AGE_VER_DOC_TP_CD , P.GENDER_TP_CODE , P.BIRTH_DT , P.DECEASED_DT , P.CHILDREN_CT , P.DISAB_START_DT , P.DISAB_END_DT , P.USER_IND , P.LAST_UPDATE_DT , P.LAST_UPDATE_USER , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, C.ENTITYLINK_ST_TP_CD, C.ENTITY_ID, C.ENTITY_TYPE, C.ENTITY_STATUS_TP_CD, P.XBand_Level FROM H_CONTACT C LEFT JOIN H_PERSON P ON P.CONT_ID = C.CONT_ID AND P.LAST_UPDATE_TX_ID = C.LAST_UPDATE_TX_ID WHERE C.CONT_ID = ? AND ( C.H_CREATE_DT BETWEEN ? AND ? ) UNION SELECT DISTINCT C.H_CONT_ID , C.H_ACTION_CODE , C.H_CREATED_BY , C.H_CREATE_DT , C.H_END_DT , C.CONT_ID , C.ACCE_COMP_TP_CD , C.PREF_LANG_TP_CD , C.CREATED_DT , C.SINCE_DT , C.LEFT_DT , C.INACTIVATED_DT , C.CONTACT_NAME , C.PERSON_ORG_CODE , C.SOLICIT_IND , C.CONFIDENTIAL_IND , C.CLIENT_IMP_TP_CD , C.CLIENT_ST_TP_CD , C.CLIENT_POTEN_TP_CD , C.RPTING_FREQ_TP_CD , C.LAST_STATEMENT_DT , C.PROVIDED_BY_CONT , C.LAST_UPDATE_DT , C.LAST_UPDATE_USER , C.LAST_UPDATE_TX_ID , C.LAST_USED_DT , C.LAST_VERIFIED_DT , C.SOURCE_IDENT_TP_CD , C.DO_NOT_DELETE_IND , C.ALERT_IND , P.H_CONT_ID AS H_CONT_ID_PERSON, P.H_ACTION_CODE , P.H_CREATED_BY , P.H_CREATE_DT , P.H_END_DT , P.CONT_ID , P.MARITAL_ST_TP_CD , P.BIRTHPLACE_TP_CD , P.CITIZENSHIP_TP_CD , P.HIGHEST_EDU_TP_CD , P.AGE_VER_DOC_TP_CD , P.GENDER_TP_CODE , P.BIRTH_DT , P.DECEASED_DT , P.CHILDREN_CT , P.DISAB_START_DT , P.DISAB_END_DT , P.USER_IND , P.LAST_UPDATE_DT , P.LAST_UPDATE_USER , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, C.ENTITYLINK_ST_TP_CD, C.ENTITY_ID, C.ENTITY_TYPE, C.ENTITY_STATUS_TP_CD, P.XBand_Level FROM H_PERSON P LEFT JOIN H_CONTACT C ON P.CONT_ID = C.CONT_ID AND P.LAST_UPDATE_TX_ID = C.LAST_UPDATE_TX_ID WHERE P.CONT_ID = ? AND ( P.H_CREATE_DT BETWEEN ? AND ? )",
    new int[] {SINGLE_ROW_PARAMETERS, MULTI_ROW_RESULT, java.sql.ResultSet.CONCUR_READ_ONLY, java.sql.ResultSet.CLOSE_CURSORS_AT_COMMIT, java.sql.ResultSet.TYPE_FORWARD_ONLY, DISALLOW_STATIC_ROWSET_CURSORS},
    SqlStatementType.QUERY,
    new String[]{"h_cont_id", "h_action_code", "h_created_by", "h_create_dt", "h_end_dt", "cont_id", "acce_comp_tp_cd", "pref_lang_tp_cd", "created_dt", "since_dt", "left_dt", "inactivated_dt", "contact_name", "person_org_code", "solicit_ind", "confidential_ind", "client_imp_tp_cd", "client_st_tp_cd", "client_poten_tp_cd", "rpting_freq_tp_cd", "last_statement_dt", "provided_by_cont", "last_update_dt", "last_update_user", "last_update_tx_id", "last_used_dt", "last_verified_dt", "source_ident_tp_cd", "do_not_delete_ind", "alert_ind", "h_cont_id_person", "h_action_code", "h_created_by", "h_create_dt", "h_end_dt", "cont_id", "marital_st_tp_cd", "birthplace_tp_cd", "citizenship_tp_cd", "highest_edu_tp_cd", "age_ver_doc_tp_cd", "gender_tp_code", "birth_dt", "deceased_dt", "children_ct", "disab_start_dt", "disab_end_dt", "user_ind", "last_update_dt", "last_update_user", "last_update_tx_id", "access_token_value", "pending_cdc_ind", "entitylink_st_tp_cd", "entity_id", "entity_type", "entity_status_tp_cd", "xband_level"},
    new GetPersonImagesParameterHandler (),
    new int[][]{{Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP}, {19, 0, 0, 19, 0, 0}, {0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}},
    null,
    new GetPersonImagesRowHandler (),
    new int[][]{ {Types.BIGINT, Types.CHAR, Types.VARCHAR, Types.TIMESTAMP, Types.TIMESTAMP, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP, Types.VARCHAR, Types.CHAR, Types.CHAR, Types.CHAR, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.TIMESTAMP, Types.BIGINT, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.BIGINT, Types.CHAR, Types.CHAR, Types.BIGINT, Types.CHAR, Types.VARCHAR, Types.TIMESTAMP, Types.TIMESTAMP, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.CHAR, Types.TIMESTAMP, Types.TIMESTAMP, Types.SMALLINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.CHAR, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT, Types.VARCHAR, Types.CHAR, Types.BIGINT, Types.BIGINT, Types.VARCHAR, Types.BIGINT, Types.VARCHAR}, {19, 1, 20, 0, 0, 19, 19, 19, 0, 0, 0, 0, 255, 1, 1, 1, 19, 19, 19, 19, 0, 19, 0, 20, 19, 0, 0, 19, 1, 1, 19, 1, 20, 0, 0, 19, 19, 19, 19, 19, 19, 1, 0, 0, 10, 0, 0, 1, 0, 20, 19, 50, 1, 19, 19, 25, 19, 250}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}},
    null,
    identifier,
    generationTime,
    collection,
    forceSingleBindIsolation,
    null,
    4);

  /**
   * @generated
   */
  public static class GetPersonImagesParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      setObject (stmt, 1, Types.BIGINT, parameters[0], 0);
      setObject (stmt, 2, Types.TIMESTAMP, parameters[1], 0);
      setObject (stmt, 3, Types.TIMESTAMP, parameters[2], 0);
      setObject (stmt, 4, Types.BIGINT, parameters[3], 0);
      setObject (stmt, 5, Types.TIMESTAMP, parameters[4], 0);
      setObject (stmt, 6, Types.TIMESTAMP, parameters[5], 0);
    }
  }

  /**
   * @generated
   */
  public static class GetPersonImagesRowHandler extends BaseRowHandler<ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt>>
  {
    /**
     * @generated
     */
    public ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt> handle (java.sql.ResultSet rs, ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt> returnObject) throws java.sql.SQLException
    {
      returnObject = new ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt> ();

      EObjContact returnObject1 = new EObjContact ();
      returnObject1.setHistoryIdPK(getLongObject (rs, 1)); 
      returnObject1.setHistActionCode(getString (rs, 2)); 
      returnObject1.setHistCreatedBy(getString (rs, 3)); 
      returnObject1.setHistCreateDt(getTimestamp (rs, 4)); 
      returnObject1.setHistEndDt(getTimestamp (rs, 5)); 
      returnObject1.setContIdPK(getLongObject (rs, 6)); 
      returnObject1.setAcceCompTpCd(getLongObject (rs, 7)); 
      returnObject1.setPrefLangTpCd(getLongObject (rs, 8)); 
      returnObject1.setCreatedDt(getTimestamp (rs, 9)); 
      returnObject1.setSinceDt(getTimestamp (rs, 10)); 
      returnObject1.setLeftDt(getTimestamp (rs, 11)); 
      returnObject1.setInactivatedDt(getTimestamp (rs, 12)); 
      returnObject1.setContactName(getString (rs, 13)); 
      returnObject1.setPersonOrgCode(getString (rs, 14)); 
      returnObject1.setSolicitInd(getString (rs, 15)); 
      returnObject1.setConfidentialInd(getString (rs, 16)); 
      returnObject1.setClientImpTpCd(getLongObject (rs, 17)); 
      returnObject1.setClientStTpCd(getLongObject (rs, 18)); 
      returnObject1.setClientPotenTpCd(getLongObject (rs, 19)); 
      returnObject1.setRptingFreqTpCd(getLongObject (rs, 20)); 
      returnObject1.setLastStatementDt(getTimestamp (rs, 21)); 
      returnObject1.setProvidedByCont(getLongObject (rs, 22)); 
      returnObject1.setLastUpdateDt(getTimestamp (rs, 23)); 
      returnObject1.setLastUpdateUser(getString (rs, 24)); 
      returnObject1.setLastUpdateTxId(getLongObject (rs, 25)); 
      returnObject1.setLastUsedDt(getTimestamp (rs, 26)); 
      returnObject1.setLastVerifiedDt(getTimestamp (rs, 27)); 
      returnObject1.setSourceIdentTpCd(getLongObject (rs, 28)); 
      returnObject1.setDoNotDelInd(getString (rs, 29)); 
      returnObject1.setAlertInd(getString (rs, 30)); 
      returnObject1.setAccessTokenValue(getString (rs, 52)); 
      returnObject1.setPendingCDCInd(getString (rs, 53)); 
      returnObject1.setEntitylink_st_tp_cd(getLongObject (rs, 54)); 
      returnObject1.setEntity_id(getLongObject (rs, 55)); 
      returnObject1.setEntity_type(getString (rs, 56)); 
      returnObject1.setEntityStatusTpCd(getLongObject (rs, 57)); 
      returnObject.add (returnObject1);

      EObjPerson returnObject2 = new EObjPerson ();
      returnObject2.setHistoryIdPK(getLongObject (rs, 31)); 
      returnObject2.setHistActionCode(getString (rs, 32)); 
      returnObject2.setHistCreatedBy(getString (rs, 33)); 
      returnObject2.setHistCreateDt(getTimestamp (rs, 34)); 
      returnObject2.setHistEndDt(getTimestamp (rs, 35)); 
      returnObject2.setContIdPK(getLongObject (rs, 36)); 
      returnObject2.setMaritalStTpCd(getLongObject (rs, 37)); 
      returnObject2.setBirthPlaceTpCd(getLongObject (rs, 38)); 
      returnObject2.setCitizenshipTpCd(getLongObject (rs, 39)); 
      returnObject2.setHighestEduTpCd(getLongObject (rs, 40)); 
      returnObject2.setAgeVerDocTpCd(getLongObject (rs, 41)); 
      returnObject2.setGenderTpCd(getString (rs, 42)); 
      returnObject2.setBirthDt(getTimestamp (rs, 43)); 
      returnObject2.setDeceasedDt(getTimestamp (rs, 44)); 
      returnObject2.setChildrenCt(getIntObject (rs, 45)); 
      returnObject2.setDisabStartDt(getTimestamp (rs, 46)); 
      returnObject2.setDisabEndDt(getTimestamp (rs, 47)); 
      returnObject2.setUserInd(getString (rs, 48)); 
      returnObject2.setLastUpdateDt(getTimestamp (rs, 49)); 
      returnObject2.setLastUpdateUser(getString (rs, 50)); 
      returnObject2.setLastUpdateTxId(getLongObject (rs, 51)); 
      returnObject.add (returnObject2);

      EObjXPersonExt returnObject3 = new EObjXPersonExt ();
      returnObject3.setXBandLevel(getString (rs, 58)); 
      returnObject.add (returnObject3);

    
      return returnObject;
    }
  }

  /**
   * @Select( sql="SELECT DISTINCT C.CONT_ID , C.LAST_UPDATE_DT , C.LAST_UPDATE_TX_ID , P.CONT_ID , P.LAST_UPDATE_DT , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, P.XBand_Level FROM H_CONTACT C LEFT JOIN H_PERSON P ON P.CONT_ID = C.CONT_ID AND P.LAST_UPDATE_TX_ID = C.LAST_UPDATE_TX_ID WHERE C.CONT_ID = ? AND (C.H_CREATE_DT BETWEEN ? AND ? ) UNION SELECT DISTINCT C.CONT_ID , C.LAST_UPDATE_DT , C.LAST_UPDATE_TX_ID , P.CONT_ID , P.LAST_UPDATE_DT , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, P.XBand_Level FROM H_PERSON P LEFT JOIN H_CONTACT C ON P.CONT_ID = C.CONT_ID AND P.LAST_UPDATE_TX_ID = C.LAST_UPDATE_TX_ID WHERE P.CONT_ID = ? AND ( P.H_CREATE_DT BETWEEN ? AND ? )", pattern="<rsm><col number='1' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='contIdPK'></col><col number='2' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastUpdateDt'></col><col number='3' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='lastUpdateTxId'></col><col number='4' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='contIdPK'></col><col number='5' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='lastUpdateDt'></col><col number='6' bean='com.dwl.tcrm.coreParty.entityObject.EObjPerson' property='lastUpdateTxId'></col><col number='7' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='accessTokenValue'></col><col number='8' bean='com.dwl.tcrm.coreParty.entityObject.EObjContact' property='pendingCDCInd'></col><col number='9' bean='com.mit.mdm.customModels.entityObject.EObjXPersonExt' property='XBandLevel'></col></rsm>" )
   * 
   * @generated
   */
  public Iterator<ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt>> getPersonsLightImages (Object[] parameters)
  {
    return queryIterator (getPersonsLightImagesStatementDescriptor, parameters);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor getPersonsLightImagesStatementDescriptor = createStatementDescriptor (
    "getPersonsLightImages(Object[])",
    "SELECT DISTINCT C.CONT_ID , C.LAST_UPDATE_DT , C.LAST_UPDATE_TX_ID , P.CONT_ID , P.LAST_UPDATE_DT , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, P.XBand_Level FROM H_CONTACT C LEFT JOIN H_PERSON P ON P.CONT_ID = C.CONT_ID AND P.LAST_UPDATE_TX_ID = C.LAST_UPDATE_TX_ID WHERE C.CONT_ID = ? AND (C.H_CREATE_DT BETWEEN ? AND ? ) UNION SELECT DISTINCT C.CONT_ID , C.LAST_UPDATE_DT , C.LAST_UPDATE_TX_ID , P.CONT_ID , P.LAST_UPDATE_DT , P.LAST_UPDATE_TX_ID , C.ACCESS_TOKEN_VALUE , C.PENDING_CDC_IND, P.XBand_Level FROM H_PERSON P LEFT JOIN H_CONTACT C ON P.CONT_ID = C.CONT_ID AND P.LAST_UPDATE_TX_ID = C.LAST_UPDATE_TX_ID WHERE P.CONT_ID = ? AND ( P.H_CREATE_DT BETWEEN ? AND ? )",
    new int[] {SINGLE_ROW_PARAMETERS, MULTI_ROW_RESULT, java.sql.ResultSet.CONCUR_READ_ONLY, java.sql.ResultSet.CLOSE_CURSORS_AT_COMMIT, java.sql.ResultSet.TYPE_FORWARD_ONLY, DISALLOW_STATIC_ROWSET_CURSORS},
    SqlStatementType.QUERY,
    new String[]{"cont_id", "last_update_dt", "last_update_tx_id", "cont_id", "last_update_dt", "last_update_tx_id", "access_token_value", "pending_cdc_ind", "xband_level"},
    new GetPersonsLightImagesParameterHandler (),
    new int[][]{{Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP}, {19, 0, 0, 19, 0, 0}, {0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}},
    null,
    new GetPersonsLightImagesRowHandler (),
    new int[][]{ {Types.BIGINT, Types.TIMESTAMP, Types.BIGINT, Types.BIGINT, Types.TIMESTAMP, Types.BIGINT, Types.VARCHAR, Types.CHAR, Types.VARCHAR}, {19, 0, 19, 19, 0, 19, 50, 1, 250}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}},
    null,
    identifier,
    generationTime,
    collection,
    forceSingleBindIsolation,
    null,
    5);

  /**
   * @generated
   */
  public static class GetPersonsLightImagesParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      setObject (stmt, 1, Types.BIGINT, parameters[0], 0);
      setObject (stmt, 2, Types.TIMESTAMP, parameters[1], 0);
      setObject (stmt, 3, Types.TIMESTAMP, parameters[2], 0);
      setObject (stmt, 4, Types.BIGINT, parameters[3], 0);
      setObject (stmt, 5, Types.TIMESTAMP, parameters[4], 0);
      setObject (stmt, 6, Types.TIMESTAMP, parameters[5], 0);
    }
  }

  /**
   * @generated
   */
  public static class GetPersonsLightImagesRowHandler extends BaseRowHandler<ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt>>
  {
    /**
     * @generated
     */
    public ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt> handle (java.sql.ResultSet rs, ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt> returnObject) throws java.sql.SQLException
    {
      returnObject = new ResultQueue3<EObjContact,EObjPerson,EObjXPersonExt> ();

      EObjContact returnObject1 = new EObjContact ();
      returnObject1.setContIdPK(getLongObject (rs, 1)); 
      returnObject1.setLastUpdateDt(getTimestamp (rs, 2)); 
      returnObject1.setLastUpdateTxId(getLongObject (rs, 3)); 
      returnObject1.setAccessTokenValue(getString (rs, 7)); 
      returnObject1.setPendingCDCInd(getString (rs, 8)); 
      returnObject.add (returnObject1);

      EObjPerson returnObject2 = new EObjPerson ();
      returnObject2.setContIdPK(getLongObject (rs, 4)); 
      returnObject2.setLastUpdateDt(getTimestamp (rs, 5)); 
      returnObject2.setLastUpdateTxId(getLongObject (rs, 6)); 
      returnObject.add (returnObject2);

      EObjXPersonExt returnObject3 = new EObjXPersonExt ();
      returnObject3.setXBandLevel(getString (rs, 9)); 
      returnObject.add (returnObject3);

    
      return returnObject;
    }
  }

}
