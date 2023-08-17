package com.mit.mdm.customModels.entityObject;

import com.ibm.pdq.runtime.generator.BaseParameterHandler;
import java.util.Iterator;
import java.sql.PreparedStatement;
import com.ibm.pdq.runtime.statement.StatementDescriptor;
import com.ibm.pdq.runtime.generator.BaseData;
import java.sql.SQLException;
import com.ibm.pdq.annotation.Metadata;
import com.mit.mdm.customModels.entityObject.EObjXPersonExt;
import com.ibm.pdq.runtime.generator.BaseRowHandler;
import com.dwl.tcrm.coreParty.entityObject.EObjPerson;
import com.ibm.pdq.runtime.statement.SqlStatementType;
import java.sql.Types;


/**
 * <!-- begin-user-doc -->
 * 
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EObjXPersonExtDataImpl  extends BaseData implements EObjXPersonExtData
{

  /**
   * @generated
   */
  public static final String generatorVersion = "3.200.75";

  /**
   * @generated
   */
  public static final String identifier = "EObjXPersonExtData";

  /**
   * @generated
   */
  public static final long generationTime = 0x0000018924d647aaL;

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
  public EObjXPersonExtDataImpl()
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
   * @Select( sql="select XBand_Level,  LAST_UPDATE_DT, LAST_UPDATE_USER, LAST_UPDATE_TX_ID from PERSON where CONT_ID = ? " )
   * 
   * @generated
   */
  public Iterator<EObjXPersonExt> getEObjXPersonExt (Long contIdPK)
  {
    return queryIterator (getEObjXPersonExtStatementDescriptor, contIdPK);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor getEObjXPersonExtStatementDescriptor = createStatementDescriptor (
    "getEObjXPersonExt(Long)",
    "select XBand_Level,  LAST_UPDATE_DT, LAST_UPDATE_USER, LAST_UPDATE_TX_ID from PERSON where CONT_ID = ? ",
    new int[] {SINGLE_ROW_PARAMETERS, MULTI_ROW_RESULT, java.sql.ResultSet.CONCUR_READ_ONLY, java.sql.ResultSet.CLOSE_CURSORS_AT_COMMIT, java.sql.ResultSet.TYPE_FORWARD_ONLY, DISALLOW_STATIC_ROWSET_CURSORS},
    SqlStatementType.QUERY,
    new String[]{"xband_level", "last_update_dt", "last_update_user", "last_update_tx_id"},
    new GetEObjXPersonExtParameterHandler (),
    new int[][]{{Types.BIGINT}, {19}, {0}, {1}},
    null,
    new GetEObjXPersonExtRowHandler (),
    new int[][]{ {Types.VARCHAR, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT}, {250, 0, 20, 19}, {0, 0, 0, 0}, {0, 0, 0, 0}},
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
  public static class GetEObjXPersonExtParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      setLong (stmt, 1, Types.BIGINT, (Long)parameters[0]);
    }
  }

  /**
   * @generated
   */
  public static class GetEObjXPersonExtRowHandler extends BaseRowHandler<EObjXPersonExt>
  {
    /**
     * @generated
     */
    public EObjXPersonExt handle (java.sql.ResultSet rs, EObjXPersonExt returnObject) throws java.sql.SQLException
    {
      returnObject = new EObjXPersonExt ();
      returnObject.setXBandLevel(getString (rs, 1)); 
      returnObject.setLastUpdateDt(getTimestamp (rs, 2)); 
      returnObject.setLastUpdateUser(getString (rs, 3)); 
      returnObject.setLastUpdateTxId(getLongObject (rs, 4)); 
    
      return returnObject;
    }
  }

  /**
   * @Update( sql="insert into PERSON (USER_IND, CHILDREN_CT, BIRTH_DT, DECEASED_DT, DISAB_END_DT, DISAB_START_DT, GENDER_TP_CODE, CONT_ID, MARITAL_ST_TP_CD, HIGHEST_EDU_TP_CD, AGE_VER_DOC_TP_CD, BIRTHPLACE_TP_CD, CITIZENSHIP_TP_CD, XBand_Level, LAST_UPDATE_DT, LAST_UPDATE_USER, LAST_UPDATE_TX_ID) values( ?1.userInd, ?1.childrenCt, ?1.birthDt, ?1.deceasedDt, ?1.disabEndDt, ?1.disabStartDt, ?1.genderTpCd, ?1.contIdPK, ?1.maritalStTpCd, ?1.highestEduTpCd, ?1.ageVerDocTpCd, ?1.birthPlaceTpCd, ?1.citizenshipTpCd, ?2.xBandLevel, ?1.lastUpdateDt, ?1.lastUpdateUser, ?1.lastUpdateTxId)" )
   * 
   * @generated
   */
  public int createEObjXPersonExt (EObjPerson e1, EObjXPersonExt e2)
  {
    return update (createEObjXPersonExtStatementDescriptor, e1, e2);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor createEObjXPersonExtStatementDescriptor = createStatementDescriptor (
    "createEObjXPersonExt(com.dwl.tcrm.coreParty.entityObject.EObjPerson, com.mit.mdm.customModels.entityObject.EObjXPersonExt)",
    "insert into PERSON (USER_IND, CHILDREN_CT, BIRTH_DT, DECEASED_DT, DISAB_END_DT, DISAB_START_DT, GENDER_TP_CODE, CONT_ID, MARITAL_ST_TP_CD, HIGHEST_EDU_TP_CD, AGE_VER_DOC_TP_CD, BIRTHPLACE_TP_CD, CITIZENSHIP_TP_CD, XBand_Level, LAST_UPDATE_DT, LAST_UPDATE_USER, LAST_UPDATE_TX_ID) values(  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? )",
    new int[] {SINGLE_ROW_PARAMETERS},
    SqlStatementType.INSERT,
    null,
    new CreateEObjXPersonExtParameterHandler (),
    new int[][]{{Types.CHAR, Types.SMALLINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP, Types.CHAR, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.VARCHAR, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT}, {1, 10, 0, 0, 0, 0, 1, 19, 19, 19, 19, 19, 19, 250, 0, 0, 19}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}},
    null,
    null,
    null,
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
  public static class CreateEObjXPersonExtParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      EObjPerson bean0 = (EObjPerson) parameters[0];
      setString (stmt, 1, Types.CHAR, (String)bean0.getUserInd());
      setInteger (stmt, 2, Types.SMALLINT, (Integer)bean0.getChildrenCt());
      setTimestamp (stmt, 3, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getBirthDt());
      setTimestamp (stmt, 4, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getDeceasedDt());
      setTimestamp (stmt, 5, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getDisabEndDt());
      setTimestamp (stmt, 6, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getDisabStartDt());
      setString (stmt, 7, Types.CHAR, (String)bean0.getGenderTpCd());
      setLong (stmt, 8, Types.BIGINT, (Long)bean0.getContIdPK());
      setLong (stmt, 9, Types.BIGINT, (Long)bean0.getMaritalStTpCd());
      setLong (stmt, 10, Types.BIGINT, (Long)bean0.getHighestEduTpCd());
      setLong (stmt, 11, Types.BIGINT, (Long)bean0.getAgeVerDocTpCd());
      setLong (stmt, 12, Types.BIGINT, (Long)bean0.getBirthPlaceTpCd());
      setLong (stmt, 13, Types.BIGINT, (Long)bean0.getCitizenshipTpCd());
      EObjXPersonExt bean1 = (EObjXPersonExt) parameters[1];
      setString (stmt, 14, Types.VARCHAR, (String)bean1.getXBandLevel());
      setTimestamp (stmt, 15, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getLastUpdateDt());
      setString (stmt, 16, Types.VARCHAR, (String)bean0.getLastUpdateUser());
      setLong (stmt, 17, Types.BIGINT, (Long)bean0.getLastUpdateTxId());
    }
  }

  /**
   * @Update( sql="update PERSON set USER_IND = ?1.userInd, CHILDREN_CT = ?1.childrenCt, BIRTH_DT = ?1.birthDt, DECEASED_DT = ?1.deceasedDt, DISAB_END_DT = ?1.disabEndDt, DISAB_START_DT = ?1.disabStartDt, GENDER_TP_CODE = ?1.genderTpCd, MARITAL_ST_TP_CD = ?1.maritalStTpCd, HIGHEST_EDU_TP_CD = ?1.highestEduTpCd, AGE_VER_DOC_TP_CD = ?1.ageVerDocTpCd, BIRTHPLACE_TP_CD = ?1.birthPlaceTpCd, CITIZENSHIP_TP_CD = ?1.citizenshipTpCd, XBand_Level = ?2.xBandLevel, LAST_UPDATE_DT = ?1.lastUpdateDt, LAST_UPDATE_USER = ?1.lastUpdateUser, LAST_UPDATE_TX_ID = ?1.lastUpdateTxId where CONT_ID = ?1.contIdPK and LAST_UPDATE_DT = ?1.oldLastUpdateDt" )
   * 
   * @generated
   */
  public int updateEObjXPersonExt (EObjPerson e1, EObjXPersonExt e2)
  {
    return update (updateEObjXPersonExtStatementDescriptor, e1, e2);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor updateEObjXPersonExtStatementDescriptor = createStatementDescriptor (
    "updateEObjXPersonExt(com.dwl.tcrm.coreParty.entityObject.EObjPerson, com.mit.mdm.customModels.entityObject.EObjXPersonExt)",
    "update PERSON set USER_IND =  ? , CHILDREN_CT =  ? , BIRTH_DT =  ? , DECEASED_DT =  ? , DISAB_END_DT =  ? , DISAB_START_DT =  ? , GENDER_TP_CODE =  ? , MARITAL_ST_TP_CD =  ? , HIGHEST_EDU_TP_CD =  ? , AGE_VER_DOC_TP_CD =  ? , BIRTHPLACE_TP_CD =  ? , CITIZENSHIP_TP_CD =  ? , XBand_Level =  ? , LAST_UPDATE_DT =  ? , LAST_UPDATE_USER =  ? , LAST_UPDATE_TX_ID =  ?  where CONT_ID =  ?  and LAST_UPDATE_DT =  ? ",
    new int[] {SINGLE_ROW_PARAMETERS},
    SqlStatementType.UPDATE,
    null,
    new UpdateEObjXPersonExtParameterHandler (),
    new int[][]{{Types.CHAR, Types.SMALLINT, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP, Types.CHAR, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.VARCHAR, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT, Types.BIGINT, Types.TIMESTAMP}, {1, 10, 0, 0, 0, 0, 1, 19, 19, 19, 19, 19, 250, 0, 0, 19, 19, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}},
    null,
    null,
    null,
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
  public static class UpdateEObjXPersonExtParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      EObjPerson bean0 = (EObjPerson) parameters[0];
      setString (stmt, 1, Types.CHAR, (String)bean0.getUserInd());
      setInteger (stmt, 2, Types.SMALLINT, (Integer)bean0.getChildrenCt());
      setTimestamp (stmt, 3, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getBirthDt());
      setTimestamp (stmt, 4, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getDeceasedDt());
      setTimestamp (stmt, 5, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getDisabEndDt());
      setTimestamp (stmt, 6, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getDisabStartDt());
      setString (stmt, 7, Types.CHAR, (String)bean0.getGenderTpCd());
      setLong (stmt, 8, Types.BIGINT, (Long)bean0.getMaritalStTpCd());
      setLong (stmt, 9, Types.BIGINT, (Long)bean0.getHighestEduTpCd());
      setLong (stmt, 10, Types.BIGINT, (Long)bean0.getAgeVerDocTpCd());
      setLong (stmt, 11, Types.BIGINT, (Long)bean0.getBirthPlaceTpCd());
      setLong (stmt, 12, Types.BIGINT, (Long)bean0.getCitizenshipTpCd());
      EObjXPersonExt bean1 = (EObjXPersonExt) parameters[1];
      setString (stmt, 13, Types.VARCHAR, (String)bean1.getXBandLevel());
      setTimestamp (stmt, 14, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getLastUpdateDt());
      setString (stmt, 15, Types.VARCHAR, (String)bean0.getLastUpdateUser());
      setLong (stmt, 16, Types.BIGINT, (Long)bean0.getLastUpdateTxId());
      setLong (stmt, 17, Types.BIGINT, (Long)bean0.getContIdPK());
      setTimestamp (stmt, 18, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getOldLastUpdateDt());
    }
  }

  /**
   * @Update( sql="delete from PERSON where CONT_ID = ?" )
   * 
   * @generated
   */
  public int deleteEObjXPersonExt (Long contIdPK)
  {
    return update (deleteEObjXPersonExtStatementDescriptor, contIdPK);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor deleteEObjXPersonExtStatementDescriptor = createStatementDescriptor (
    "deleteEObjXPersonExt(Long)",
    "delete from PERSON where CONT_ID = ?",
    new int[] {SINGLE_ROW_PARAMETERS},
    SqlStatementType.DELETE,
    null,
    new DeleteEObjXPersonExtParameterHandler (),
    new int[][]{{Types.BIGINT}, {19}, {0}, {1}},
    null,
    null,
    null,
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
  public static class DeleteEObjXPersonExtParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      setLong (stmt, 1, Types.BIGINT, (Long)parameters[0]);
    }
  }

}
