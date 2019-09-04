package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecordReferencedMarketResearchRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecord
 */
public class CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecord   {
  private String generalMarketResearchViewpointType = null;

  private String generalMarketResearchViewpointDescription = null;

  private CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecordReferencedMarketResearchRecord referencedMarketResearchRecord = null;

  private CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage generalMarketResearchViewpointUsage = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of research view provided by the research (e.g. competitor research) 
   * @return generalMarketResearchViewpointType
  **/

  public String getGeneralMarketResearchViewpointType() {
    return generalMarketResearchViewpointType;
  }

  public void setGeneralMarketResearchViewpointType(String generalMarketResearchViewpointType) {
    this.generalMarketResearchViewpointType = generalMarketResearchViewpointType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the available market research consolidated for this maintained viewpoint 
   * @return generalMarketResearchViewpointDescription
  **/

  public String getGeneralMarketResearchViewpointDescription() {
    return generalMarketResearchViewpointDescription;
  }

  public void setGeneralMarketResearchViewpointDescription(String generalMarketResearchViewpointDescription) {
    this.generalMarketResearchViewpointDescription = generalMarketResearchViewpointDescription;
  }


  /**
   * Get referencedMarketResearchRecord
   * @return referencedMarketResearchRecord
  **/

  public CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecordReferencedMarketResearchRecord getReferencedMarketResearchRecord() {
    return referencedMarketResearchRecord;
  }

  public void setReferencedMarketResearchRecord(CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecordReferencedMarketResearchRecord referencedMarketResearchRecord) {
    this.referencedMarketResearchRecord = referencedMarketResearchRecord;
  }


  /**
   * Get generalMarketResearchViewpointUsage
   * @return generalMarketResearchViewpointUsage
  **/

  public CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage getGeneralMarketResearchViewpointUsage() {
    return generalMarketResearchViewpointUsage;
  }

  public void setGeneralMarketResearchViewpointUsage(CRGeneralMarketResearchDirectoryEntryRegisterInputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage generalMarketResearchViewpointUsage) {
    this.generalMarketResearchViewpointUsage = generalMarketResearchViewpointUsage;
  }


}

