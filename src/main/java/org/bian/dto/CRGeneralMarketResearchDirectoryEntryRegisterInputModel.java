package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryRegisterInputModel
 */
public class CRGeneralMarketResearchDirectoryEntryRegisterInputModel   {
  private String marketResearchServicingSessionReference = null;

  private Object generalMarketResearchDirectoryEntryRegisterActionRecord = null;

  private String generalMarketResearchDirectoryEntryInstanceStatus = null;

  private CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Register service call input and output record 
   * @return generalMarketResearchDirectoryEntryRegisterActionRecord
  **/

  public Object getGeneralMarketResearchDirectoryEntryRegisterActionRecord() {
    return generalMarketResearchDirectoryEntryRegisterActionRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryRegisterActionRecord(Object generalMarketResearchDirectoryEntryRegisterActionRecord) {
    this.generalMarketResearchDirectoryEntryRegisterActionRecord = generalMarketResearchDirectoryEntryRegisterActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the General Market Research Directory Entry instance (e.g. initialised, pending, active) 
   * @return generalMarketResearchDirectoryEntryInstanceStatus
  **/

  public String getGeneralMarketResearchDirectoryEntryInstanceStatus() {
    return generalMarketResearchDirectoryEntryInstanceStatus;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceStatus(String generalMarketResearchDirectoryEntryInstanceStatus) {
    this.generalMarketResearchDirectoryEntryInstanceStatus = generalMarketResearchDirectoryEntryInstanceStatus;
  }


  /**
   * Get generalMarketResearchDirectoryEntryInstanceRecord
   * @return generalMarketResearchDirectoryEntryInstanceRecord
  **/

  public CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecord getGeneralMarketResearchDirectoryEntryInstanceRecord() {
    return generalMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceRecord(CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord) {
    this.generalMarketResearchDirectoryEntryInstanceRecord = generalMarketResearchDirectoryEntryInstanceRecord;
  }


}

