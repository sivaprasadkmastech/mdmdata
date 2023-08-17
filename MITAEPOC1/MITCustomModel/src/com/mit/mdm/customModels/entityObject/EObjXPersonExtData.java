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
 * IBM-MDMWB-1.0-[d64f70e7dd2468b33366dca0b2cc92c6]
 */


package com.mit.mdm.customModels.entityObject;

import java.util.Iterator;
import com.ibm.mdm.base.db.EntityMapping;
import com.ibm.pdq.annotation.Select;
import com.ibm.pdq.annotation.Update;

import com.dwl.tcrm.coreParty.entityObject.EObjPerson;

import com.mit.mdm.customModels.entityObject.EObjXPersonExt;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public interface EObjXPersonExtData {


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getEObjXPersonExtSql = "select XBand_Level,  LAST_UPDATE_DT, LAST_UPDATE_USER, LAST_UPDATE_TX_ID from PERSON where CONT_ID = ? ";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String createEObjXPersonExtSql = "insert into PERSON (USER_IND, CHILDREN_CT, BIRTH_DT, DECEASED_DT, DISAB_END_DT, DISAB_START_DT, GENDER_TP_CODE, CONT_ID, MARITAL_ST_TP_CD, HIGHEST_EDU_TP_CD, AGE_VER_DOC_TP_CD, BIRTHPLACE_TP_CD, CITIZENSHIP_TP_CD, XBand_Level, LAST_UPDATE_DT, LAST_UPDATE_USER, LAST_UPDATE_TX_ID) values( ?1.userInd, ?1.childrenCt, ?1.birthDt, ?1.deceasedDt, ?1.disabEndDt, ?1.disabStartDt, ?1.genderTpCd, ?1.contIdPK, ?1.maritalStTpCd, ?1.highestEduTpCd, ?1.ageVerDocTpCd, ?1.birthPlaceTpCd, ?1.citizenshipTpCd, ?2.xBandLevel, ?1.lastUpdateDt, ?1.lastUpdateUser, ?1.lastUpdateTxId)";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String updateEObjXPersonExtSql = "update PERSON set USER_IND = ?1.userInd, CHILDREN_CT = ?1.childrenCt, BIRTH_DT = ?1.birthDt, DECEASED_DT = ?1.deceasedDt, DISAB_END_DT = ?1.disabEndDt, DISAB_START_DT = ?1.disabStartDt, GENDER_TP_CODE = ?1.genderTpCd, MARITAL_ST_TP_CD = ?1.maritalStTpCd, HIGHEST_EDU_TP_CD = ?1.highestEduTpCd, AGE_VER_DOC_TP_CD = ?1.ageVerDocTpCd, BIRTHPLACE_TP_CD = ?1.birthPlaceTpCd, CITIZENSHIP_TP_CD = ?1.citizenshipTpCd, XBand_Level = ?2.xBandLevel, LAST_UPDATE_DT = ?1.lastUpdateDt, LAST_UPDATE_USER = ?1.lastUpdateUser, LAST_UPDATE_TX_ID = ?1.lastUpdateTxId where CONT_ID = ?1.contIdPK and LAST_UPDATE_DT = ?1.oldLastUpdateDt";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String deleteEObjXPersonExtSql = "delete from PERSON where CONT_ID = ?";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String EObjXPersonExtKeyField = "EObjXPersonExt.contIdPK";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String EObjXPersonExtGetFields =
    "EObjXPersonExt.xBandLevel," +
    "EObjXPersonExt.lastUpdateDt," +
    "EObjXPersonExt.lastUpdateUser," +
    "EObjXPersonExt.lastUpdateTxId";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String EObjXPersonExtAllFields =
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.userInd," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.childrenCt," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.birthDt," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.deceasedDt," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.disabEndDt," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.disabStartDt," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.genderTpCd," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.contIdPK," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.maritalStTpCd," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.highestEduTpCd," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.ageVerDocTpCd," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.birthPlaceTpCd," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.citizenshipTpCd," +
    "com.mit.mdm.customModels.entityObject.EObjXPersonExt.xBandLevel," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateDt," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateUser," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateTxId";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String EObjXPersonExtUpdateFields =
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.userInd," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.childrenCt," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.birthDt," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.deceasedDt," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.disabEndDt," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.disabStartDt," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.genderTpCd," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.maritalStTpCd," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.highestEduTpCd," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.ageVerDocTpCd," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.birthPlaceTpCd," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.citizenshipTpCd," +
    "com.mit.mdm.customModels.entityObject.EObjXPersonExt.xBandLevel," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateDt," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateUser," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.lastUpdateTxId," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.contIdPK," +
    "com.dwl.tcrm.coreParty.entityObject.EObjPerson.oldLastUpdateDt";   

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
    * Select XPerson by parameters.
   * @generated
   */
  @Select(sql=getEObjXPersonExtSql)
  @EntityMapping(parameters=EObjXPersonExtKeyField, results=EObjXPersonExtGetFields)
  Iterator<EObjXPersonExt> getEObjXPersonExt(Long contIdPK);  
   
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
    * Create XPerson by EObjXPersonExt Object.
   * @generated
   */
  @Update(sql=createEObjXPersonExtSql)
  @EntityMapping(parameters=EObjXPersonExtAllFields)
    int createEObjXPersonExt(EObjPerson e1, EObjXPersonExt e2); 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
    * Update one XPerson by EObjXPersonExt object.
   * @generated
   */
  @Update(sql=updateEObjXPersonExtSql)
  @EntityMapping(parameters=EObjXPersonExtUpdateFields)
    int updateEObjXPersonExt(EObjPerson e1, EObjXPersonExt e2); 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
    * Delete XPerson by parameters.
   * @generated
   */
  @Update(sql=deleteEObjXPersonExtSql)
  @EntityMapping(parameters=EObjXPersonExtKeyField)
  int deleteEObjXPersonExt(Long contIdPK);

}

