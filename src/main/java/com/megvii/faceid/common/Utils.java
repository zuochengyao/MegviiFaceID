package com.megvii.faceid.common;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Random;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Utils
{
    /**
     * 生成签名字段
     * @param apiKey key
     * @param secretKey secret
     * @param expired 过期时间戳
     * @return sign
     */
    public static String genSign(String apiKey, String secretKey, long expired)
    {
        try
        {
            long now = System.currentTimeMillis() / 1000;
            int rdm = Math.abs(new Random().nextInt());
            String plainText = String.format("a=%s&b=%d&c=%d&d=%d", apiKey, expired, now, rdm);
            byte[] hmacDigest = HmacSha1(plainText.getBytes(), secretKey);
            byte[] signContent = new byte[hmacDigest.length + plainText.getBytes().length];
            System.arraycopy(hmacDigest, 0, signContent, 0, hmacDigest.length);
            System.arraycopy(plainText.getBytes(), 0, signContent, hmacDigest.length, plainText.getBytes().length);
            return base64Encode(signContent).replaceAll("[\\s*\t\n\r]", "");
        }
        catch (NoSuchAlgorithmException | InvalidKeyException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 生成 hmacsha1 签名
     */
    private static byte[] HmacSha1(byte[] binaryData, String key) throws NoSuchAlgorithmException, InvalidKeyException
    {
        Mac mac = Mac.getInstance("HmacSHA1");
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "HmacSHA1");
        mac.init(secretKey);
        return mac.doFinal(binaryData);
    }

    public static String base64Encode(byte[] data)
    {
        return Base64.getEncoder().encodeToString(data);
    }

    public static byte[] base64Decode(String data)
    {
        return Base64.getDecoder().decode(data);
    }

    public static boolean isNullOrEmpty(String str)
    {
        return str == null || str.length() == 0;
    }

    public static boolean isClassExist(String className)
    {
        boolean flag = true;
        try
        {
            Class.forName(className);
        }
        catch (ClassNotFoundException e)
        {
            flag = false;
        }
        return flag;
    }

    /**
     * 获取文件数据流
     * @param file
     */
    public static byte[] getFileBytes(File file)
    {
        byte[] data = null;
        if (file != null && file.exists())
        {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            try
            {
                InputStream in = new FileInputStream(file);
                byte[] buffer = new byte[4 * 1024];
                int len;
                while ((len = in.read(buffer)) != -1) out.write(buffer, 0, len);
                data = out.toByteArray();
                out.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return data;
    }
}
