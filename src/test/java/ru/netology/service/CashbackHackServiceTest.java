package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

   @Test
   public void testBoundaryValue999() {

       int expected = 1;
       int actual = service.remain(999);
       Assert.assertEquals(expected, actual);
   }

    @Test
    public void TestBoundaryValue1001() {

        int expected = 999;
        int actual = service.remain(1001);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestValue1000() {

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestValue0() {

        int expected = 1000;
        int actual = service.remain(0);
        Assert.assertEquals(expected, actual);
    }
}