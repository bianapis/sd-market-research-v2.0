package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceAnalysis
 */
public class CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceAnalysis   {
  private String generalMarketResearchDirectoryEntryInstanceAnalysisData = null;

  private String generalMarketResearchDirectoryEntryInstanceAnalysisReportType = null;

  private Object generalMarketResearchDirectoryEntryInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return generalMarketResearchDirectoryEntryInstanceAnalysisData
  **/

  public String getGeneralMarketResearchDirectoryEntryInstanceAnalysisData() {
    return generalMarketResearchDirectoryEntryInstanceAnalysisData;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceAnalysisData(String generalMarketResearchDirectoryEntryInstanceAnalysisData) {
    this.generalMarketResearchDirectoryEntryInstanceAnalysisData = generalMarketResearchDirectoryEntryInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return generalMarketResearchDirectoryEntryInstanceAnalysisReport
  **/

  public Object getGeneralMarketResearchDirectoryEntryInstanceAnalysisReport() {
    return generalMarketResearchDirectoryEntryInstanceAnalysisReport;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceAnalysisReport(Object generalMarketResearchDirectoryEntryInstanceAnalysisReport) {
    this.generalMarketResearchDirectoryEntryInstanceAnalysisReport = generalMarketResearchDirectoryEntryInstanceAnalysisReport;
  }


}

