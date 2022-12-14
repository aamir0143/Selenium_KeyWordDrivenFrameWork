package com.qa.fb.tests;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.fb.keyword.base.Base;
import com.qa.fb.keyword.engine.KeyWordEngine;

public class SignUpPageTest extends Base{
	public KeyWordEngine keyWordEngine;
	Logger log = Logger.getLogger(SignUpPageTest.class);
	
	@BeforeMethod
	public void setUp() {
		log.info("*** Starting test cases execution  ****");
	}
	
	@Test
	public void signUpTest() throws InvalidFormatException   {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("signup");
	}
}
