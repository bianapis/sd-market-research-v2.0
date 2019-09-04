package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRequestOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryRequestOutputModel
 */
public class CRGeneralMarketResearchDirectoryEntryRequestOutputModel   {
  private CRGeneralMarketResearchDirectoryEntryRequestOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord = null;

  private String generalMarketResearchDirectoryEntryRequestActionTaskReference = null;

  private Object generalMarketResearchDirectoryEntryRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get generalMarketResearchDirectoryEntryInstanceRecord
   * @return generalMarketResearchDirectoryEntryInstanceRecord
  **/

  public CRGeneralMarketResearchDirectoryEntryRequestOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord getGeneralMarketResearchDirectoryEntryInstanceRecord() {
    return generalMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceRecord(CRGeneralMarketResearchDirectoryEntryRequestOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord) {
    this.generalMarketResearchDirectoryEntryInstanceRecord = generalMarketResearchDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a General Market Research Directory Entry instance request service call 
   * @return generalMarketResearchDirectoryEntryRequestActionTaskReference
  **/

  public String getGeneralMarketResearchDirectoryEntryRequestActionTaskReference() {
    return generalMarketResearchDirectoryEntryRequestActionTaskReference;
  }

  public void setGeneralMarketResearchDirectoryEntryRequestActionTaskReference(String generalMarketResearchDirectoryEntryRequestActionTaskReference) {
    this.generalMarketResearchDirectoryEntryRequestActionTaskReference = generalMarketResearchDirectoryEntryRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return generalMarketResearchDirectoryEntryRequestActionTaskRecord
  **/

  public Object getGeneralMarketResearchDirectoryEntryRequestActionTaskRecord() {
    return generalMarketResearchDirectoryEntryRequestActionTaskRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryRequestActionTaskRecord(Object generalMarketResearchDirectoryEntryRequestActionTaskRecord) {
    this.generalMarketResearchDirectoryEntryRequestActionTaskRecord = generalMarketResearchDirectoryEntryRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

