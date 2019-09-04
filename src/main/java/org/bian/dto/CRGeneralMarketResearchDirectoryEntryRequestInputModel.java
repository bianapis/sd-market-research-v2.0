package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRequestInputModelGeneralMarketResearchDirectoryEntryInstanceRecord;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryRequestInputModel
 */
public class CRGeneralMarketResearchDirectoryEntryRequestInputModel   {
  private String marketResearchServicingSessionReference = null;

  private String generalMarketResearchDirectoryEntryInstanceReference = null;

  private CRGeneralMarketResearchDirectoryEntryRequestInputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord = null;

  private Object generalMarketResearchDirectoryEntryRequestActionTaskRecord = null;

  private CRGeneralMarketResearchDirectoryEntryRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRGeneralMarketResearchDirectoryEntryRequestInputModelGeneralMarketResearchDirectoryEntryInstanceRecord getGeneralMarketResearchDirectoryEntryInstanceRecord() {
    return generalMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceRecord(CRGeneralMarketResearchDirectoryEntryRequestInputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord) {
    this.generalMarketResearchDirectoryEntryInstanceRecord = generalMarketResearchDirectoryEntryInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRGeneralMarketResearchDirectoryEntryRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRGeneralMarketResearchDirectoryEntryRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

