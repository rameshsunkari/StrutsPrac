package org.struts.web.action;

import org.struts.web.service.TutorialFinderService;

public class TutorialAction {
	String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String execute(){
		TutorialFinderService service = new TutorialFinderService();
		message = service.getBestTutorialSite();
		
		return "success";
	}

}
