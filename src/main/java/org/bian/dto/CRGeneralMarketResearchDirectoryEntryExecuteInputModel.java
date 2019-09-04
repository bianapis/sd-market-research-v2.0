package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryExecuteInputModelExecuteRecordType;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryExecuteInputModelGeneralMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryExecuteInputModel
 */
public class CRGeneralMarketResearchDirectoryEntryExecuteInputModel   {
  private String marketResearchServicingSessionReference = null;

  private String generalMarketResearchDirectoryEntryInstanceReference = null;

  private CRGeneralMarketResearchDirectoryEntryExecuteInputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord = null;

  private Object generalMarketResearchDirectoryEntryExecuteActionTaskRecord = null;

  private CRGeneralMarketResearchDirectoryEntryExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return marketResearchServicingSessionReference
  **/

  public String getMarketResearchServicingSessionReference() {
    return marketResearchServicingSessionReference;
  }

  public void setMarketResearchServicingSessionReference(String marketResearchServicingSessionReference) {
    this.marketResearchServicingSessionReference = marketResearchServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the General Market Research Directory Entry instance 
   * @return generalMarketResearchDirectoryEntryInstanceReference
  **/

  public String getGeneralMarketResearchDirectoryEntryInstanceReference() {
    return generalMarketResearchDirectoryEntryInstanceReference;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceReference(String generalMarketResearchDirectoryEntryInstanceReference) {
    this.generalMarketResearchDirectoryEntryInstanceReference = generalMarketResearchDirectoryEntryInstanceReference;
  }


  /**
   * Get generalMarketResearchDirectoryEntryInstanceRecord
   * @return generalMarketResearchDirectoryEntryInstanceRecord
  **/

  public CRGeneralMarketResearchDirectoryEntryExecuteInputModelGeneralMarketResearchDirectoryEntryInstanceRecord getGeneralMarketResearchDirectoryEntryInstanceRecord() {
    return generalMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceRecord(CRGeneralMarketResearchDirectoryEntryExecuteInputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord) {
    this.generalMarketResearchDirectoryEntryInstanceRecord = generalMarketResearchDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return generalMarketResearchDirectoryEntryExecuteActionTaskRecord
  **/

  public Object getGeneralMarketResearchDirectoryEntryExecuteActionTaskRecord() {
    return generalMarketResearchDirectoryEntryExecuteActionTaskRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryExecuteActionTaskRecord(Object generalMarketResearchDirectoryEntryExecuteActionTaskRecord) {
    this.generalMarketResearchDirectoryEntryExecuteActionTaskRecord = generalMarketResearchDirectoryEntryExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRGeneralMarketResearchDirectoryEntryExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRGeneralMarketResearchDirectoryEntryExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

