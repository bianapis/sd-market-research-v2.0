package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRequestInputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryRequestInputModelGeneralMarketResearchDirectoryEntryInstanceRecord
 */
public class CRGeneralMarketResearchDirectoryEntryRequestInputModelGeneralMarketResearchDirectoryEntryInstanceRecord   {
  private CRGeneralMarketResearchDirectoryEntryRequestInputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage generalMarketResearchViewpointUsage = null;


  /**
   * Get generalMarketResearchViewpointUsage
   * @return generalMarketResearchViewpointUsage
  **/

  public CRGeneralMarketResearchDirectoryEntryRequestInputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage getGeneralMarketResearchViewpointUsage() {
    return generalMarketResearchViewpointUsage;
  }

  public void setGeneralMarketResearchViewpointUsage(CRGeneralMarketResearchDirectoryEntryRequestInputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage generalMarketResearchViewpointUsage) {
    this.generalMarketResearchViewpointUsage = generalMarketResearchViewpointUsage;
  }


}

