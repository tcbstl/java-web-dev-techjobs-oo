package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job;
    Job test_job2;
    Job test_allFields;
    Job test_equality;
    Job test_equality2;

    @Test
    public void testJobConstructorSetsAllFields(){
        test_allFields = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertTrue(test_allFields instanceof Job);
        assertEquals("Product Tester",test_allFields.getName());
        assertEquals("ACME", test_allFields.getEmployer().toString());
        assertEquals("Desert", test_allFields.getLocation().toString());
        assertEquals("Quality Control", test_allFields.getPositionType().toString());
        assertEquals("Persistence", test_allFields.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality(){
        test_equality = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        test_equality2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertFalse(test_equality.equals(test_equality2));
    }

    @Before
    public void createJobObject() {
        test_job = new Job();
        test_job2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertEquals(6, test_job.getId(), .001);
        assertEquals(7, test_job2.getId(), .001);
    }
}
