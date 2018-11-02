package cn.dawnland.dawnland_back.models;

import java.util.Date;

public class User {

    //uid
    private Long uid;
    //邮箱
    private String email;
    //昵称
    private String nickname;
    //积分
    private Long score;
    //头像
    private Long avatar;
    //密码
    private String password;
    //注册ip
    private String ip;
    //权限
    private Long permission;
    //最后登录时间
    private Date lastSignAt;
    //注册时间
    private Date registerAt;
    //
    private Integer verified;
    private String verificationToken;
    //游戏名
    private String playerName;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getAvatar() {
        return avatar;
    }

    public void setAvatar(Long avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getPermission() {
        return permission;
    }

    public void setPermission(Long permission) {
        this.permission = permission;
    }

    public Date getLastSignAt() {
        return lastSignAt;
    }

    public void setLastSignAt(Date lastSignAt) {
        this.lastSignAt = lastSignAt;
    }

    public Date getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(Date registerAt) {
        this.registerAt = registerAt;
    }

    public Integer getVerified() {
        return verified;
    }

    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    public String getVerificationToken() {
        return verificationToken;
    }

    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}