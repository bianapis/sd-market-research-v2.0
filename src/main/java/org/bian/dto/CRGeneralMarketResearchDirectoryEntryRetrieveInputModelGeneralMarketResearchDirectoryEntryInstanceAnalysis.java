package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryRetrieveInputModelGeneralMarketResearchDirectoryEntryInstanceAnalysis
 */
public class CRGeneralMarketResearchDirectoryEntryRetrieveInputModelGeneralMarketResearchDirectoryEntryInstanceAnalysis   {
  private String generalMarketResearchDirectoryEntryInstanceAnalysisReference = null;

  private String generalMarketResearchDirectoryEntryInstanceAnalysisReportType = null;

  private String generalMarketResearchDirectoryEntryInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return generalMarketResearchDirectoryEntryInstanceAnalysisReference
  **/

  public String getGeneralMarketResearchDirectoryEntryInstanceAnalysisReference() {
    return generalMarketResearchDirectoryEntryInstanceAnalysisReference;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceAnalysisReference(String generalMarketResearchDirectoryEntryInstanceAnalysisReference) {
    this.generalMarketResearchDirectoryEntryInstanceAnalysisReference = generalMarketResearchDirectoryEntryInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return generalMarketResearchDirectoryEntryInstanceAnalysisReportType
  **/

  public String getGeneralMarketResearchDirectoryEntryInstanceAnalysisReportType() {
    return generalMarketResearchDirectoryEntryInstanceAnalysisReportType;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceAnalysisReportType(String generalMarketResearchDirectoryEntryInstanceAnalysisReportType) {
    this.generalMarketResearchDirectoryEntryInstanceAnalysisReportType = generalMarketResearchDirectoryEntryInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return generalMarketResearchDirectoryEntryInstanceAnalysisParameters
  **/

  public String getGeneralMarketResearchDirectoryEntryInstanceAnalysisParameters() {
    return generalMarketResearchDirectoryEntryInstanceAnalysisParameters;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceAnalysisParameters(String generalMarketResearchDirectoryEntryInstanceAnalysisParameters) {
    this.generalMarketResearchDirectoryEntryInstanceAnalysisParameters = generalMarketResearchDirectoryEntryInstanceAnalysisParameters;
  }


}

