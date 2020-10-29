package com.megvii.faceid;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FaceIDConfigTest
{
    private final FaceIDConfig faceIDConfig;
    public FaceIDConfigTest()
    {
        faceIDConfig = new FaceIDConfig("","");
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

    }

    @Test
    void setApiKey()
    {
        faceIDConfig.setApiKey("S");
        System.out.println(faceIDConfig.getApiKey());
    }

    @Test
    void getApiSecret()
    {
    }

    @Test
    void setApiSecret()
    {
    }

    @Test
    void getApiSign()
    {
    }

    @Test
    void setApiSign()
    {
    }
}