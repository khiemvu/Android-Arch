package com.example.admin.demo.repository.dto;

import com.example.admin.demo.repository.database.dao.ConvertableDTO;
import com.example.admin.demo.repository.database.entity.User;

/**
 * Created by admin on 8/15/2017.
 */

public class UserDTO implements ConvertableDTO<User, UserDTO>
{
    private String webUserId;
    private String enterpriseId;
    private String firstName;
    private String lastName;
    private String email;
    private String token;
    private String permissionHash;
    private String photoId;
    private boolean customer;
    private Boolean firstLogin;
    String languageCode;

    public String getWebUserId()
    {
        return webUserId;
    }

    public void setWebUserId(String webUserId)
    {
        this.webUserId = webUserId;
    }

    public String getEnterpriseId()
    {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId)
    {
        this.enterpriseId = enterpriseId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public String getPermissionHash()
    {
        return permissionHash;
    }

    public void setPermissionHash(String permissionHash)
    {
        this.permissionHash = permissionHash;
    }

    public String getPhotoId()
    {
        return photoId;
    }

    public void setPhotoId(String photoId)
    {
        this.photoId = photoId;
    }

    public boolean isCustomer()
    {
        return customer;
    }

    public void setCustomer(boolean customer)
    {
        this.customer = customer;
    }

    public Boolean getFirstLogin()
    {
        return firstLogin;
    }

    public void setFirstLogin(Boolean firstLogin)
    {
        this.firstLogin = firstLogin;
    }

    public String getLanguageCode()
    {
        return languageCode;
    }

    public void setLanguageCode(String languageCode)
    {
        this.languageCode = languageCode;
    }

    @Override
    public User convertFromDTO(UserDTO userDTO)
    {
        User user = new User();
        user.setCustomer(userDTO.isCustomer());
        user.setEmail(userDTO.getEmail());
        user.setEnterpriseId(userDTO.getEnterpriseId());
        user.setFirstLogin(userDTO.getFirstLogin());
        user.setFirstName(userDTO.getFirstName());
        user.setLanguageCode(userDTO.getLanguageCode());
        user.setLastName(userDTO.getLastName());
        user.setWebUserId(userDTO.getWebUserId());
        user.setToken(userDTO.getToken());
        return user;
    }

    @Override
    public UserDTO convertToDTO(User user)
    {
        return null;
    }
}
