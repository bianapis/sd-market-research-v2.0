package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryRetrieveInputModelGeneralMarketResearchDirectoryEntryInstanceReportRecord
 */
public class CRGeneralMarketResearchDirectoryEntryRetrieveInputModelGeneralMarketResearchDirectoryEntryInstanceReportRecord   {
  private String generalMarketResearchDirectoryEntryInstanceReportReference = null;

  private String generalMarketResearchDirectoryEntryInstanceReportType = null;

  private String generalMarketResearchDirectoryEntryInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return generalMarketResearchDirectoryEntryInstanceReportReference
  **/

  public String getGeneralMarketResearchDirectoryEntryInstanceReportReference() {
    return generalMarketResearchDirectoryEntryInstanceReportReference;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceReportReference(String generalMarketResearchDirectoryEntryInstanceReportReference) {
    this.generalMarketResearchDirectoryEntryInstanceReportReference = generalMarketResearchDirectoryEntryInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return generalMarketResearchDirectoryEntryInstanceReportParameters
  **/

  public String getGeneralMarketResearchDirectoryEntryInstanceReportParameters() {
    return generalMarketResearchDirectoryEntryInstanceReportParameters;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceReportParameters(String generalMarketResearchDirectoryEntryInstanceReportParameters) {
    this.generalMarketResearchDirectoryEntryInstanceReportParameters = generalMarketResearchDirectoryEntryInstanceReportParameters;
  }


}

