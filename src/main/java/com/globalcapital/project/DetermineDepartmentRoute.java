package com.globalcapital.project;

import java.util.Map;
import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class DetermineDepartmentRoute implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		Map<String, Object> variables = execution.getVariables();
		String department = (String) variables.get("department");

		if (department.contains("IT")) {

			execution.setVariable("IT", true);

		} else if (department.contains("sales")) {
			execution.setVariable("Sales", true);

		} else if (department.contains("life")) {
			execution.setVariable("Life", true);
		}

	}

}