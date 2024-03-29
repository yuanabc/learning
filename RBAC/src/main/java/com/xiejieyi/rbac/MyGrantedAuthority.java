package com.xiejieyi.rbac;

import org.springframework.security.core.GrantedAuthority;

/**
 * 类描述：
 *
 * @author
 */
public class MyGrantedAuthority implements GrantedAuthority
{

    private String url;
    private String method;

    public String getPermissionUrl()
    {
        return url;
    }

    public void setPermissionUrl(String permissionUrl)
    {
        this.url = permissionUrl;
    }

    public String getMethod()
    {
        return method;
    }

    public void setMethod(String method)
    {
        this.method = method;
    }

    public MyGrantedAuthority(String url, String method)
    {
        this.url = url;
        this.method = method;
    }

    @Override
    public String getAuthority()
    {
        return this.url + ";" + this.method;
    }
}