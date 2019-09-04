package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryUpdateInputModelGeneralMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryUpdateInputModel
 */
public class CRGeneralMarketResearchDirectoryEntryUpdateInputModel   {
  private String marketResearchServicingSessionReference = null;

  private String generalMarketResearchDirectoryEntryInstanceReference = null;

  private CRGeneralMarketResearchDirectoryEntryUpdateInputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord = null;

  private Object generalMarketResearchDirectoryEntryUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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

  public CRGeneralMarketResearchDirectoryEntryUpdateInputModelGeneralMarketResearchDirectoryEntryInstanceRecord getGeneralMarketResearchDirectoryEntryInstanceRecord() {
    return generalMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceRecord(CRGeneralMarketResearchDirectoryEntryUpdateInputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord) {
    this.generalMarketResearchDirectoryEntryInstanceRecord = generalMarketResearchDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return generalMarketResearchDirectoryEntryUpdateActionTaskRecord
  **/

  public Object getGeneralMarketResearchDirectoryEntryUpdateActionTaskRecord() {
    return generalMarketResearchDirectoryEntryUpdateActionTaskRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryUpdateActionTaskRecord(Object generalMarketResearchDirectoryEntryUpdateActionTaskRecord) {
    this.generalMarketResearchDirectoryEntryUpdateActionTaskRecord = generalMarketResearchDirectoryEntryUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

