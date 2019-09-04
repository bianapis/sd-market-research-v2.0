package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryExecuteInputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryExecuteInputModelGeneralMarketResearchDirectoryEntryInstanceRecord
 */
public class CRGeneralMarketResearchDirectoryEntryExecuteInputModelGeneralMarketResearchDirectoryEntryInstanceRecord   {
  private CRGeneralMarketResearchDirectoryEntryExecuteInputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage generalMarketResearchViewpointUsage = null;


  /**
   * Get generalMarketResearchViewpointUsage
   * @return generalMarketResearchViewpointUsage
  **/

  public CRGeneralMarketResearchDirectoryEntryExecuteInputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage getGeneralMarketResearchViewpointUsage() {
    return generalMarketResearchViewpointUsage;
  }

  public void setGeneralMarketResearchViewpointUsage(CRGeneralMarketResearchDirectoryEntryExecuteInputModelGeneralMarketResearchDirectoryEntryInstanceRecordGeneralMarketResearchViewpointUsage generalMarketResearchViewpointUsage) {
    this.generalMarketResearchViewpointUsage = generalMarketResearchViewpointUsage;
  }


}

