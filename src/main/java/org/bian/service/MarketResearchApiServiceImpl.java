/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MarketResearchApiServiceImpl implements MarketResearchApiService {

	public SDMarketResearchActivateOutputModel activate(SDMarketResearchActivateInputModel request){
		return JsonReader.read("activate-SDMarketResearchActivateOutputModel.json",new TypeReference<SDMarketResearchActivateOutputModel>(){});
	}
	
	public SDMarketResearchConfigureOutputModel configure(String sdReferenceId, SDMarketResearchConfigureInputModel request){
		return JsonReader.read("configure-SDMarketResearchConfigureOutputModel.json",new TypeReference<SDMarketResearchConfigureOutputModel>(){});
	}
	
	public CRGeneralMarketResearchDirectoryEntryExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRGeneralMarketResearchDirectoryEntryExecuteInputModel request){
		return JsonReader.read("execute-CRGeneralMarketResearchDirectoryEntryExecuteOutputModel.json",new TypeReference<CRGeneralMarketResearchDirectoryEntryExecuteOutputModel>(){});
	}
	
	public SDMarketResearchFeedbackOutputModel feedback(String sdReferenceId, SDMarketResearchFeedbackInputModel request){
		return JsonReader.read("feedback-SDMarketResearchFeedbackOutputModel.json",new TypeReference<SDMarketResearchFeedbackOutputModel>(){});
	}
	
	public CRGeneralMarketResearchDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRGeneralMarketResearchDirectoryEntryRegisterInputModel request){
		return JsonReader.read("register-CRGeneralMarketResearchDirectoryEntryRegisterOutputModel.json",new TypeReference<CRGeneralMarketResearchDirectoryEntryRegisterOutputModel>(){});
	}
	
	public CRGeneralMarketResearchDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRGeneralMarketResearchDirectoryEntryRequestInputModel request){
		return JsonReader.read("request-CRGeneralMarketResearchDirectoryEntryRequestOutputModel.json",new TypeReference<CRGeneralMarketResearchDirectoryEntryRequestOutputModel>(){});
	}
	
	public CRGeneralMarketResearchDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRGeneralMarketResearchDirectoryEntryRetrieveOutputModel.json",new TypeReference<CRGeneralMarketResearchDirectoryEntryRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDMarketResearchRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDMarketResearchRetrieveOutputModel.json",new TypeReference<SDMarketResearchRetrieveOutputModel>(){});
	}
	
	public CRGeneralMarketResearchDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRGeneralMarketResearchDirectoryEntryUpdateInputModel request){
		return JsonReader.read("update-CRGeneralMarketResearchDirectoryEntryUpdateOutputModel.json",new TypeReference<CRGeneralMarketResearchDirectoryEntryUpdateOutputModel>(){});
	}
	
}
