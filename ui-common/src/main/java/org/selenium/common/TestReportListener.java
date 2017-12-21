package org.selenium.common;

import static org.selenium.common.TestLogger.info;

import java.io.IOException;
import java.util.Date;

import org.apache.log4j.Level;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

public class TestReportListener extends TestListenerAdapter {

	/**
	 * Log reults
	 * @param result
	 */
	private void logResult(ITestResult result) {
        Level level = Level.INFO;
        String message = "";
        switch (result.getStatus()) {
        case ITestResult.STARTED:
        	message = "TEST STARTED";
        	break;
        case ITestResult.FAILURE:
        	level = Level.ERROR;
        	message = "TEST ERROR";
        	break;
        case ITestResult.SKIP:
        	message = "TEST SKIPPED";
        	break;
        case ITestResult.SUCCESS_PERCENTAGE_FAILURE:
        	level = Level.WARN;
        	break;
        case ITestResult.SUCCESS:
        	message = "TEST SUCCESS";
        	break;
        }
        TestLogger.log(message, level);
    }

    @Override
    public void onTestStart(ITestResult result) {
    	logResult(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
		    String filePath = null;
			try {
				filePath = UnitBase.screenShotFile();
				String resultTest = TestLinkAPIResults.TEST_FAILED;
				info("UnitBase.testCaseID:"+UnitBase.testCaseID);
				UnitBase.updateTestLinkResult(UnitBase.testProject,UnitBase.testPlan,UnitBase.testCaseID,UnitBase.testBuild, result.toString(), resultTest);
			} catch (IOException | TestLinkAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    info("filePath:"+filePath);
		    Reporter.log("<a href=\"" + filePath + "\"><p align=\"left\">Error screenshot at " + new Date()+ "</p>");
		    Reporter.log("<p><img width=\"1024\" src=\"" + filePath + "\" alt=\"screenshot at " + new Date()+ "\"/></p></a><br />"); 
            logResult(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    	logResult(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
		try {
			info("UnitBase.testCaseID:"+UnitBase.testCaseID);
			String resultTest = TestLinkAPIResults.TEST_PASSED;
			UnitBase.updateTestLinkResult(UnitBase.testProject,UnitBase.testPlan,UnitBase.testCaseID,UnitBase.testBuild, null, resultTest);
		} catch (TestLinkAPIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	logResult(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    	logResult(result);
    }
}