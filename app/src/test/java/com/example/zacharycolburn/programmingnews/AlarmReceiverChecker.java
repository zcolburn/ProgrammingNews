package com.example.zacharycolburn.programmingnews;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class AlarmReceiverChecker {
    @Test
    public void viewCorrect() throws Exception {
        assertNotNull(MainActivity.FeedFetcherReceiver.class);
    }
}