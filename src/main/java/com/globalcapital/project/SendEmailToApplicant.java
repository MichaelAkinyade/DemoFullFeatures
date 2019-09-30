package com.globalcapital.project;

import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.model.bpmn.instance.Task;

public class SendEmailToApplicant implements JavaDelegate {

	   Task taskForm;

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		Map<String, Object> variables = execution.getVariables();
		String emailAddy = (String) variables.get("emailAddress");
		System.out.println("emailAddress is :" + emailAddy);
		if (!emailAddy.isEmpty()) {
			SendEmail sendEmail = new SendEmail();
			sendEmail.sendMail(" ");
		
		}
		
		

	}
}