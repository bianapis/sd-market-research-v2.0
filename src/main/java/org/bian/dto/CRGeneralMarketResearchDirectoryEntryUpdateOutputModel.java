package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryUpdateInputModelGeneralMarketResearchDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryUpdateOutputModel
 */
public class CRGeneralMarketResearchDirectoryEntryUpdateOutputModel   {
  private CRGeneralMarketResearchDirectoryEntryUpdateInputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord = null;

  private String generalMarketResearchDirectoryEntryUpdateActionTaskReference = null;

  private Object generalMarketResearchDirectoryEntryUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return generalMarketResearchDirectoryEntryUpdateActionTaskReference
  **/

  public String getGeneralMarketResearchDirectoryEntryUpdateActionTaskReference() {
    return generalMarketResearchDirectoryEntryUpdateActionTaskReference;
  }

  public void setGeneralMarketResearchDirectoryEntryUpdateActionTaskReference(String generalMarketResearchDirectoryEntryUpdateActionTaskReference) {
    this.generalMarketResearchDirectoryEntryUpdateActionTaskReference = generalMarketResearchDirectoryEntryUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

