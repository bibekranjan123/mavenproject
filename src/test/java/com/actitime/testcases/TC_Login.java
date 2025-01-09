package com.actitime.testcases;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generics.BaseTest;
import com.actitime.pages.LoginPage;

@Listeners(com.actitime.generics.Screenshot.class)
public class TC_Login extends BaseTest
{
	@Test
	public void login() throws IOException, InterruptedException
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginMethod();
	}
}