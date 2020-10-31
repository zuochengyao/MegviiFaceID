package com.megvii.faceid;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FaceIDConfigTest
{
    private final FaceIDConfig faceIDConfig;
    public FaceIDConfigTest()
    {
        faceIDConfig = new FaceIDConfig("1","1");
    }

    @BeforeEach
    void setUp()
    {
        System.out.println("FaceIDConfigTest setUp");
    }

    @AfterEach
    void tearDown()
    {
        System.out.println("FaceIDConfigTest tearDown");
    }

    @Test
    void getApiKey()
    {
        System.out.println(faceIDConfig.getApiKey());
    }

    @Test
    void getApiSecret()
    {
        System.out.println(faceIDConfig.getApiSecret());
    }

    @Test
    void getApiSign()
    {
        System.out.println(faceIDConfig.getApiSign());
        System.out.println(faceIDConfig.getApiSign());
    }
}