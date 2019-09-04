package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord;
import org.bian.dto.CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchDirectoryEntryRetrieveOutputModel
 */
public class CRGeneralMarketResearchDirectoryEntryRetrieveOutputModel   {
  private CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord = null;

  private String generalMarketResearchDirectoryEntryRetrieveActionTaskReference = null;

  private Object generalMarketResearchDirectoryEntryRetrieveActionTaskRecord = null;

  private String generalMarketResearchDirectoryEntryRetrieveActionResponse = null;

  private CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceReportRecord generalMarketResearchDirectoryEntryInstanceReportRecord = null;

  private CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceAnalysis generalMarketResearchDirectoryEntryInstanceAnalysis = null;


  /**
   * Get generalMarketResearchDirectoryEntryInstanceRecord
   * @return generalMarketResearchDirectoryEntryInstanceRecord
  **/

  public CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord getGeneralMarketResearchDirectoryEntryInstanceRecord() {
    return generalMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceRecord(CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceRecord generalMarketResearchDirectoryEntryInstanceRecord) {
    this.generalMarketResearchDirectoryEntryInstanceRecord = generalMarketResearchDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a General Market Research Directory Entry instance retrieve service call 
   * @return generalMarketResearchDirectoryEntryRetrieveActionTaskReference
  **/

  public String getGeneralMarketResearchDirectoryEntryRetrieveActionTaskReference() {
    return generalMarketResearchDirectoryEntryRetrieveActionTaskReference;
  }

  public void setGeneralMarketResearchDirectoryEntryRetrieveActionTaskReference(String generalMarketResearchDirectoryEntryRetrieveActionTaskReference) {
    this.generalMarketResearchDirectoryEntryRetrieveActionTaskReference = generalMarketResearchDirectoryEntryRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return generalMarketResearchDirectoryEntryRetrieveActionResponse
  **/

  public String getGeneralMarketResearchDirectoryEntryRetrieveActionResponse() {
    return generalMarketResearchDirectoryEntryRetrieveActionResponse;
  }

  public void setGeneralMarketResearchDirectoryEntryRetrieveActionResponse(String generalMarketResearchDirectoryEntryRetrieveActionResponse) {
    this.generalMarketResearchDirectoryEntryRetrieveActionResponse = generalMarketResearchDirectoryEntryRetrieveActionResponse;
  }


  /**
   * Get generalMarketResearchDirectoryEntryInstanceReportRecord
   * @return generalMarketResearchDirectoryEntryInstanceReportRecord
  **/

  public CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceReportRecord getGeneralMarketResearchDirectoryEntryInstanceReportRecord() {
    return generalMarketResearchDirectoryEntryInstanceReportRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceReportRecord(CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceReportRecord generalMarketResearchDirectoryEntryInstanceReportRecord) {
    this.generalMarketResearchDirectoryEntryInstanceReportRecord = generalMarketResearchDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get generalMarketResearchDirectoryEntryInstanceAnalysis
   * @return generalMarketResearchDirectoryEntryInstanceAnalysis
  **/

  public CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceAnalysis getGeneralMarketResearchDirectoryEntryInstanceAnalysis() {
    return generalMarketResearchDirectoryEntryInstanceAnalysis;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceAnalysis(CRGeneralMarketResearchDirectoryEntryRetrieveOutputModelGeneralMarketResearchDirectoryEntryInstanceAnalysis generalMarketResearchDirectoryEntryInstanceAnalysis) {
    this.generalMarketResearchDirectoryEntryInstanceAnalysis = generalMarketResearchDirectoryEntryInstanceAnalysis;
  }


}

