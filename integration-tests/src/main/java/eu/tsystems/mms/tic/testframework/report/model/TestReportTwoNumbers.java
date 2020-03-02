package eu.tsystems.mms.tic.testframework.report.model;

import eu.tsystems.mms.tic.testframework.report.abstracts.AbstractTestReportNumbers;

/**
 * Created by jlma on 30.05.2017.
 */
public class TestReportTwoNumbers extends AbstractTestReportNumbers {

    public TestReportTwoNumbers() {
        highCorridorLimit = 19;
        highCorridorActual = 26;
        midCorridorActual = 3;
        lowCorridorActual = 5;
        all = 77;
        allSuccessful = 26;
        passed = 11;
        passedMinor = 13;
        passedRetry = 2;
        allSkipped = 16;
        skipped = 16;
        allBroken = 35;
        failed = 14;
        failedMinor = 21;
        failedRetried = 4;
        failedExpected = 7;
        failureAspects = 8;
        exitPoints = 42;
        percentage = 34;
    }


}
