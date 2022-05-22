package com.revature.services;

import com.revature.data.DummyWizardData;
import com.revature.data.DummyWizardDataImpl;
import com.revature.models.Wizard;

public class WizardServiceImpl implements WizardService {
	
	
	private static DummyWizardData wizardData;
	
	public WizardServiceImpl() {
		wizardData = new DummyWizardDataImpl();
	}

	public WizardServiceImpl(DummyWizardDataImpl mockdao) {
		wizardData = mockdao;
	}

	public void createNewWizard(Wizard w) {
		wizardData.add(w);
	}

	public void deleteWizard(Wizard w) {
		wizardData.delete(w);
	}

	public Wizard getWizard(int index) {
		return null;
	}

}
