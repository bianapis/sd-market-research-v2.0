/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface MarketResearchApiService {

	SDMarketResearchActivateOutputModel activate(SDMarketResearchActivateInputModel request);
	
	SDMarketResearchConfigureOutputModel configure(String sdReferenceId, SDMarketResearchConfigureInputModel request);
	
	CRGeneralMarketResearchDirectoryEntryExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRGeneralMarketResearchDirectoryEntryExecuteInputModel request);
	
	SDMarketResearchFeedbackOutputModel feedback(String sdReferenceId, SDMarketResearchFeedbackInputModel request);
	
	CRGeneralMarketResearchDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRGeneralMarketResearchDirectoryEntryRegisterInputModel request);
	
	CRGeneralMarketResearchDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRGeneralMarketResearchDirectoryEntryRequestInputModel request);
	
	CRGeneralMarketResearchDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDMarketResearchRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRGeneralMarketResearchDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRGeneralMarketResearchDirectoryEntryUpdateInputModel request);
	
}
