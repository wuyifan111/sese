package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class UserAuths implements Serializable {
    //
    private Long id;
    //
    private Integer loginType;
    //
    private String openid;
    //
    private String loginToken;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setLoginType (Integer  loginType){
        this.loginType=loginType;
    }
    public  Integer getLoginType(){
        return this.loginType;
    }
    public void setOpenid (String  openid){
        this.openid=openid;
    }
    public  String getOpenid(){
        return this.openid;
    }
    public void setLoginToken (String  loginToken){
        this.loginToken=loginToken;
    }
    public  String getLoginToken(){
        return this.loginToken;
    }
}
