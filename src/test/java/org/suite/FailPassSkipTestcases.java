package org.suite;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class FailPassSkipTestcases {
public static void main(String[] args) {
	Result rs = JUnitCore.runClasses(A.class,B.class);
	System.out.println("Ignore count: "+rs.getIgnoreCount());
	System.out.println("Run Count: "+rs.getRunCount());
	long rt = rs.getRunTime();
	System.out.println("Run Time: "+rs.getRunTime());
	int fc = rs.getFailureCount();
	System.out.println("Failure Count: "+fc);
	List<Failure> failures = rs.getFailures();
	for (Failure fail : failures) {
		System.out.println(fail);
	}
}
}
