package com.example.admin.demo.repository.dto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by admin on 8/15/2017.
 */

public class LoginInfoDTO
{
    private String email;

    private String password;

    private String imei;

    private String deviceName;

    private Boolean activatingNewAccount;

    private String enterpriseId;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getImei()
    {
        return imei;
    }

    public void setImei(String imei)
    {
        this.imei = imei;
    }

    public Boolean getActivatingNewAccount()
    {
        return activatingNewAccount;
    }

    public void setActivatingNewAccount(Boolean activatingNewAccount)
    {
        this.activatingNewAccount = activatingNewAccount;
    }

    public String getEnterpriseId()
    {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId)
    {
        this.enterpriseId = enterpriseId;
    }

    public String getDeviceName()
    {
        return deviceName;
    }

    public void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;
    }


    public LoginInfoDTO createLoginInfoDTO(String email, String password, String imei, String deviceName)
    {
        LoginInfoDTO loginInfoDTO = new LoginInfoDTO();
        loginInfoDTO.setEmail("khiemvx@moolapp.com");
        loginInfoDTO.setPassword(md5(password));
        loginInfoDTO.setImei(imei);
        loginInfoDTO.setDeviceName(deviceName);
        return loginInfoDTO;
    }

    public static final String md5(final String s)
    {
        final String MD5 = "MD5";
        try
        {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest
                    .getInstance(MD5);
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest)
            {
                String h = Integer.toHexString(0xFF & aMessageDigest);
                while (h.length() < 2)
                {
                    h = "0" + h;
                }
                hexString.append(h);
            }
            return hexString.toString();

        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return "";
    }
}
