package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceReportRecord
 */
public class CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceReportRecord   {
  private String generalMarketResearchDirectoryEntryInstanceReportData = null;

  private String generalMarketResearchDirectoryEntryInstanceReportType = null;

  private Object generalMarketResearchDirectoryEntryInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return generalMarketResearchDirectoryEntryInstanceReportData
  **/

  public String getGeneralMarketResearchDirectoryEntryInstanceReportData() {
    return generalMarketResearchDirectoryEntryInstanceReportData;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceReportData(String generalMarketResearchDirectoryEntryInstanceReportData) {
    this.generalMarketResearchDirectoryEntryInstanceReportData = generalMarketResearchDirectoryEntryInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return generalMarketResearchDirectoryEntryInstanceReportType
  **/

  public String getGeneralMarketResearchDirectoryEntryInstanceReportType() {
    return generalMarketResearchDirectoryEntryInstanceReportType;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceReportType(String generalMarketResearchDirectoryEntryInstanceReportType) {
    this.generalMarketResearchDirectoryEntryInstanceReportType = generalMarketResearchDirectoryEntryInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return generalMarketResearchDirectoryEntryInstanceReport
  **/

  public Object getGeneralMarketResearchDirectoryEntryInstanceReport() {
    return generalMarketResearchDirectoryEntryInstanceReport;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceReport(Object generalMarketResearchDirectoryEntryInstanceReport) {
    this.generalMarketResearchDirectoryEntryInstanceReport = generalMarketResearchDirectoryEntryInstanceReport;
  }


}

