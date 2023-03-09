package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void notEnoughAmountToCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }

    @Test
    public void enoughAmountToCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void notEnoughAmountToBigCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1450;
        int actual = service.remain(amount);
        int expected = 550;

        assertEquals(actual, expected);
    }
}