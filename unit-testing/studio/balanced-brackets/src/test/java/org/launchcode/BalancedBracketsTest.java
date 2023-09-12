package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
        assertnotNull(BalancedBrackets.hasBalancedBrackets("[]"));
        assertEquals(BalancedBrackets.hasBalancedBrackets("[]", "[]"));
    }

    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    public void noBrackets() {
        String bracketless = "Nope";
        assertFalse(BalancedBrackets.hasBalancedBrackets(bracketless));
    }

    public void inTheMiddle() {
        String test = "Ban[ana";
        assertFalse(BalancedBrackets.hasBalancedBrackets(test));
    }

    public void atTheEnd() {
        String test = "Banana]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(test));
    }

    public void backwardsBrackets() {
        String test = "Ban][ana";
        assertFalse(BalancedBrackets.hasBalancedBrackets(test));
    }

    public void inTheMiddle() {
        String test = "Ban[ana";
        assertFalse(BalancedBrackets.hasBalancedBrackets(test));
    }

    @Test
    public void unbalancedInString() {
        String launch = "Launch]Code[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(launch));
    }

    public void unbalanced() {
        String unbalancedString = "][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(unbalancedString));
    }

    public void emptyTest() {
        assertEquals(true, true);
    }
}