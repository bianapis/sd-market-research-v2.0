package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRegisterOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryRegisterOutputModel
 */
public class CRGeneralMarketResearchDirectoryEntryRegisterOutputModel   {
  private String generalMarketResearchDirectoryEntryInstanceReference = null;

  private String generalMarketResearchDirectoryEntryRegisterActionReference = null;

  private Object generalMarketResearchDirectoryEntryRegisterActionRecord = null;

  private String generalMarketResearchDirectoryEntryInstanceStatus = null;

  private CRGeneralMarketResearchDirectoryEntryRegisterOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Register service call 
   * @return generalMarketResearchDirectoryEntryRegisterActionReference
  **/

  public String getGeneralMarketResearchDirectoryEntryRegisterActionReference() {
    return generalMarketResearchDirectoryEntryRegisterActionReference;
  }

  public void setGeneralMarketResearchDirectoryEntryRegisterActionReference(String generalMarketResearchDirectoryEntryRegisterActionReference) {
    this.generalMarketResearchDirectoryEntryRegisterActionReference = generalMarketResearchDirectoryEntryRegisterActionReference;
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

  public CRGeneralMarketResearchDirectoryEntryRegisterOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord getGeneralMarketResearchDirectoryEntryInstanceRecord() {
    return generalMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceRecord(CRGeneralMarketResearchDirectoryEntryRegisterOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord) {
    this.generalMarketResearchDirectoryEntryInstanceRecord = generalMarketResearchDirectoryEntryInstanceRecord;
  }


}

