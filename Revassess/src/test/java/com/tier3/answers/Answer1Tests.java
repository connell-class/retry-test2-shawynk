package com.tier3.answers;

import static com.tier3.answers.PointsTests.addPoints;
import static org.junit.Assert.assertTrue;

import com.revature.config.TestConfig;

import org.hibernate.Session;
import org.junit.Test;

/**
 * prompt: Add an AWS RDS Instance jdbc url and credentials to the configuration
 * file (vendor can be either Oracle or PostgreSQL)
 */
public class Answer1Tests {

    /**
     * tests the connection to the db instance to ensure there is one
     */
    @Test
    public void test1() {
        Session sess = TestConfig.getInstance().openSession();
        assertTrue(sess.isConnected());
        addPoints(10);
    }
}