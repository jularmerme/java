package com.revature.data;

import java.util.ArrayList;

import com.revature.models.Wizard;

public class DummyWizardDataImpl implements DummyWizardData {

	private ArrayList<Wizard> list = new ArrayList<Wizard>();
	private static int WIZARD_ID = 0;
	
	public DummyWizardDataImpl() {
		super();
	}
	
	public DummyWizardDataImpl(ArrayList<Wizard> list) {
		super();
		this.list = list;
	}

	public ArrayList<Wizard> getList() {
		return list;
	}

	public void setList(ArrayList<Wizard> list) {
		this.list = list;
	}

	public static int getWIZARD_ID() {
		return WIZARD_ID;
	}

	public static void setWIZARD_ID(int wIZARD_ID) {
		WIZARD_ID = wIZARD_ID;
	}

	public boolean add(Wizard w) {
		WIZARD_ID++;
		w.setId(WIZARD_ID);
		System.out.println("In the data layer adding a Wizard to a List...\n" + w);
		int oldSize = list.size();
		System.out.println("In data Layer: size before addition : " + list.size());
		list.add(w);
		System.out.println("In the data layer -> list size is now : " + list.size());
		return (oldSize < list.size()) ? true : false;
	}

	public void delete(Wizard w) {
		System.out.println("Output form the data layer removing a Wizard to a List.");
		list.remove(w);
	}

	public Wizard get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
