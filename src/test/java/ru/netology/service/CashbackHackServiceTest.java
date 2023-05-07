package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void calculateRemainsIfAmountLessThousand() {
        int amount = 1;
        int expected = 999;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateRemainsIfAmountMultipleThousand() {
        int amount = 2000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void calculateRemainsIfAmountMoreThousand() {
        int amount = 1999;
        int expected = 1;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateRemainsIfAmountIsZero() {
        int amount = 0;
        int expected = 1000;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }
}