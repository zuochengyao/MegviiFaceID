package com.megvii.faceid;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FaceIDConfigTest
{
    private final FaceID faceid;
    public FaceIDConfigTest()
    {
        faceid = new FaceID("1", "1");
    }

    @BeforeEach
    void setUp()
    {
        System.out.println("FaceIDTest setUp");
    }

    @AfterEach
    void tearDown()
    {
        System.out.println("FaceIDTest tearDown");
    }

    @Test
    void getApiKey()
    {
        System.out.println(faceid.getApiKey());
    }

    @Test
    void getApiSecret()
    {
        System.out.println(faceid.getApiSecret());
    }

    @Test
    void getApiSign()
    {
        System.out.println(faceid.getApiSign());
        System.out.println(faceid.getApiSign());
    }
}