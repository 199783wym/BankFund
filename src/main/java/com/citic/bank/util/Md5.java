package com.citic.bank.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {
    public static String  MD5(String passwd){
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }

        char[] charArray = passwd.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i=0; i< charArray.length; i++){
            byteArray[i] = (byte)charArray[i];
        }

        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexvalue = new StringBuffer();

        for (int i=0; i<md5Bytes.length; i++){
            int val = ((int)md5Bytes[i] & 0xff);
            if (val < 16){
                hexvalue.append("0");
            }
            hexvalue.append(Integer.toHexString(val));
        }

        return hexvalue.toString();
    }

    public static String KL(String passwd){
        char[] a = passwd.toCharArray();
        for (int i=0; i<a.length; i++){
            a[i] = (char)(a[i] ^ 't');
        }
        String s = new String(a);
        return s;
    }

    public static String JM(String passwd){
        char[] a = passwd.toCharArray();
        for (int i=0; i<a.length; i++){
            a[i] = (char)(a[i] ^ 't');
        }
        String k = new String(a);
        return k;
    }
}
