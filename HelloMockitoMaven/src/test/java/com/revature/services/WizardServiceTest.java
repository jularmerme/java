package com.revature.services;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.revature.data.DummyWizardDataImpl;
import com.revature.models.Wizard;
import com.revature.services.WizardServiceImpl;

import junit.framework.TestCase;

/* For more information about Mockito, please visit these resources:
 * 1. Stubbing & Mocking with Mockito and JUnit: https://semaphoreci.com/community/tutorials/stubbing-and-mocking-with-mockito-2-and-junit
 * 2. Troubleshooting Mockito (StackOverflow): https://stackoverflow.com/questions/64725199/mockito-unfinishedstubbingexception-thrown-on-a-junit-test-case-which-calls-a-vo?noredirect=1#comment114442210_64725199
 * 3. Mockito JUnit Tutorial (YouTube): https://youtu.be/HsQ9OwKA79s
 * */

public class WizardServiceTest extends TestCase {
	
	// Class to be tested
	private WizardServiceImpl wService;
	
	// Dependencies(will be mocked)
	private DummyWizardDataImpl mockdao;
	
	// Test Data
	private Wizard w;
	
	@Before
	public void setUp() {
		/* Mockito SetUp */
		// 1. Mock the depending classes
		mockdao = Mockito.mock(DummyWizardDataImpl.class);
		
		// 2. Inject your service with the mocked classes
		wService = new WizardServiceImpl(mockdao);
		
		// 3. Provide a wizard stub to test with
		w = new Wizard();
		w.setId(1);
		w.setName("Harry");
		w.setSpell("Thunder");
	}

	@Test
	public void testCreateNewWizard() {
		// Arrange
		// Here, we are telling Mockito what to do with out mock method calls
		// and what to except in return from the call
		when(mockdao.add(w)).thenReturn(true);
		
		// Act
		// Run targeted test method with service injector
		wService.createNewWizard(w);
		
		// Assert
		// Verify that the dao mock ran with injector
		verify(mockdao, times(1)).add(w);
		assertEquals(1, w.getId());
//		assertEquals(w.getName(), w.get(0).getName());
		
	}
	
	void testDeleteWizard() {
		fail("Not yet implemented");
	}

}
