package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void test() {
        Home.main(new String[0]);
        Assertions.assertNotNull(Home.cat1);
        Assertions.assertNotNull(Home.cat2);
        Assertions.assertNotNull(Home.cat3);
        Assertions.assertTrue(Home.cat1 != Home.cat2);
        Assertions.assertTrue(Home.cat1 != Home.cat3);
    }
}
