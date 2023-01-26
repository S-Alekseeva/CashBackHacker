package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testBoundaryValue999() {

        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void TestBoundaryValue1001() {

        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void TestValue1000() {

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void TestValue0() {

        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}