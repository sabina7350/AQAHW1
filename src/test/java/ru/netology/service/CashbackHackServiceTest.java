package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void amountMore1000() {
        CashbackHackService service = new CashbackHackService();
        service.remain(1500);
        int actual = service.remain(1500);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amountEqual1000() {
        CashbackHackService service = new CashbackHackService();
        service.remain(1000);
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amountLess1000() {
        CashbackHackService service = new CashbackHackService();
        service.remain(700);
        int actual = service.remain(700);
        int expected = 300;

        Assert.assertEquals(expected, actual);
    }

}


