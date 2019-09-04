package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryUpdateInputModelGeneralMarketResearchDirectoryEntryInstanceRecordReferencedMarketResearchRecord
 */
public class CRGeneralMarketResearchDirectoryEntryUpdateInputModelGeneralMarketResearchDirectoryEntryInstanceRecordReferencedMarketResearchRecord   {
  private String marketResearchReportTypeReference = null;

  private String marketResearchReportVersionPeriod = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a specific type of predefined market research report or database 
   * @return marketResearchReportTypeReference
  **/

  public String getMarketResearchReportTypeReference() {
    return marketResearchReportTypeReference;
  }

  public void setMarketResearchReportTypeReference(String marketResearchReportTypeReference) {
    this.marketResearchReportTypeReference = marketResearchReportTypeReference;
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

