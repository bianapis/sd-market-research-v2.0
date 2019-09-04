package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryExecuteOutputModelGeneralMarketResearchDirectoryEntryInstanceRecordReferencedMarketResearchRecord
 */
public class CRGeneralMarketResearchDirectoryEntryExecuteOutputModelGeneralMarketResearchDirectoryEntryInstanceRecordReferencedMarketResearchRecord   {
  private String marketResearchReportTypeDefinition = null;

  private String marketResearchReportVersionPeriod = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Describes the available market research report content (e.g. customer social network usage analysis) 
   * @return marketResearchReportTypeDefinition
  **/

  public String getMarketResearchReportTypeDefinition() {
    return marketResearchReportTypeDefinition;
  }

  public void setMarketResearchReportTypeDefinition(String marketResearchReportTypeDefinition) {
    this.marketResearchReportTypeDefinition = marketResearchReportTypeDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the version and period covered by the research 
   * @return marketResearchReportVersionPeriod
  **/

  public String getMarketResearchReportVersionPeriod() {
    return marketResearchReportVersionPeriod;
  }

  public void setMarketResearchReportVersionPeriod(String marketResearchReportVersionPeriod) {
    this.marketResearchReportVersionPeriod = marketResearchReportVersionPeriod;
  }


}

