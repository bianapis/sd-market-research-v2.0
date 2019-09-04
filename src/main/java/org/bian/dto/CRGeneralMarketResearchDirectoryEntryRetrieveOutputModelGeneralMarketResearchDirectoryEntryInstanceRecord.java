package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecordReferencedMarketResearchRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord
 */
public class CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord   {
  private String generalMarketResearchViewpointType = null;

  private String generalMarketResearchViewpointDescription = null;

  private CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecordReferencedMarketResearchRecord referencedMarketResearchRecord = null;

  private CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage generalMarketResearchViewpointUsage = null;


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

  public CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecordReferencedMarketResearchRecord getReferencedMarketResearchRecord() {
    return referencedMarketResearchRecord;
  }

  public void setReferencedMarketResearchRecord(CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecordReferencedMarketResearchRecord referencedMarketResearchRecord) {
    this.referencedMarketResearchRecord = referencedMarketResearchRecord;
  }


  /**
   * Get generalMarketResearchViewpointUsage
   * @return generalMarketResearchViewpointUsage
  **/

  public CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage getGeneralMarketResearchViewpointUsage() {
    return generalMarketResearchViewpointUsage;
  }

  public void setGeneralMarketResearchViewpointUsage(CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage generalMarketResearchViewpointUsage) {
    this.generalMarketResearchViewpointUsage = generalMarketResearchViewpointUsage;
  }


}

