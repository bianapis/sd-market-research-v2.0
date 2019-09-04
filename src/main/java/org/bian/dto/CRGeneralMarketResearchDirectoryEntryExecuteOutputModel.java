package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryExecuteOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryExecuteOutputModel
 */
public class CRGeneralMarketResearchDirectoryEntryExecuteOutputModel   {
  private CRGeneralMarketResearchDirectoryEntryExecuteOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord = null;

  private String generalMarketResearchDirectoryEntryExecuteActionTaskReference = null;

  private Object generalMarketResearchDirectoryEntryExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get generalMarketResearchDirectoryEntryInstanceRecord
   * @return generalMarketResearchDirectoryEntryInstanceRecord
  **/

  public CRGeneralMarketResearchDirectoryEntryExecuteOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord getGeneralMarketResearchDirectoryEntryInstanceRecord() {
    return generalMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceRecord(CRGeneralMarketResearchDirectoryEntryExecuteOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord) {
    this.generalMarketResearchDirectoryEntryInstanceRecord = generalMarketResearchDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a General Market Research Directory Entry instance execute service call 
   * @return generalMarketResearchDirectoryEntryExecuteActionTaskReference
  **/

  public String getGeneralMarketResearchDirectoryEntryExecuteActionTaskReference() {
    return generalMarketResearchDirectoryEntryExecuteActionTaskReference;
  }

  public void setGeneralMarketResearchDirectoryEntryExecuteActionTaskReference(String generalMarketResearchDirectoryEntryExecuteActionTaskReference) {
    this.generalMarketResearchDirectoryEntryExecuteActionTaskReference = generalMarketResearchDirectoryEntryExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

