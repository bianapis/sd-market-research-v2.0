package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRetrieveInputModelGeneralMarketResearchDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRetrieveInputModelGeneralMarketResearchDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryRetrieveInputModel
 */
public class CRGeneralMarketResearchDirectoryEntryRetrieveInputModel   {
  private Object generalMarketResearchDirectoryEntryRetrieveActionTaskRecord = null;

  private String generalMarketResearchDirectoryEntryRetrieveActionRequest = null;

  private CRGeneralMarketResearchDirectoryEntryRetrieveInputModelGeneralMarketResearchDirectoryEntryInstanceReportRecord generalMarketResearchDirectoryEntryInstanceReportRecord = null;

  private CRGeneralMarketResearchDirectoryEntryRetrieveInputModelGeneralMarketResearchDirectoryEntryInstanceAnalysis generalMarketResearchDirectoryEntryInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return generalMarketResearchDirectoryEntryRetrieveActionTaskRecord
  **/

  public Object getGeneralMarketResearchDirectoryEntryRetrieveActionTaskRecord() {
    return generalMarketResearchDirectoryEntryRetrieveActionTaskRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryRetrieveActionTaskRecord(Object generalMarketResearchDirectoryEntryRetrieveActionTaskRecord) {
    this.generalMarketResearchDirectoryEntryRetrieveActionTaskRecord = generalMarketResearchDirectoryEntryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return generalMarketResearchDirectoryEntryRetrieveActionRequest
  **/

  public String getGeneralMarketResearchDirectoryEntryRetrieveActionRequest() {
    return generalMarketResearchDirectoryEntryRetrieveActionRequest;
  }

  public void setGeneralMarketResearchDirectoryEntryRetrieveActionRequest(String generalMarketResearchDirectoryEntryRetrieveActionRequest) {
    this.generalMarketResearchDirectoryEntryRetrieveActionRequest = generalMarketResearchDirectoryEntryRetrieveActionRequest;
  }


  /**
   * Get generalMarketResearchDirectoryEntryInstanceReportRecord
   * @return generalMarketResearchDirectoryEntryInstanceReportRecord
  **/

  public CRGeneralMarketResearchDirectoryEntryRetrieveInputModelGeneralMarketResearchDirectoryEntryInstanceReportRecord getGeneralMarketResearchDirectoryEntryInstanceReportRecord() {
    return generalMarketResearchDirectoryEntryInstanceReportRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceReportRecord(CRGeneralMarketResearchDirectoryEntryRetrieveInputModelGeneralMarketResearchDirectoryEntryInstanceReportRecord generalMarketResearchDirectoryEntryInstanceReportRecord) {
    this.generalMarketResearchDirectoryEntryInstanceReportRecord = generalMarketResearchDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get generalMarketResearchDirectoryEntryInstanceAnalysis
   * @return generalMarketResearchDirectoryEntryInstanceAnalysis
  **/

  public CRGeneralMarketResearchDirectoryEntryRetrieveInputModelGeneralMarketResearchDirectoryEntryInstanceAnalysis getGeneralMarketResearchDirectoryEntryInstanceAnalysis() {
    return generalMarketResearchDirectoryEntryInstanceAnalysis;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceAnalysis(CRGeneralMarketResearchDirectoryEntryRetrieveInputModelGeneralMarketResearchDirectoryEntryInstanceAnalysis generalMarketResearchDirectoryEntryInstanceAnalysis) {
    this.generalMarketResearchDirectoryEntryInstanceAnalysis = generalMarketResearchDirectoryEntryInstanceAnalysis;
  }


}

