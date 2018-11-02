package cn.dawnland.dawnland_back.service;

public interface UserService {

    /** 积分查询 */
    Long fingScore(String name);

    /** 积分增减 */
    Integer updateScore(String name, String symal, Long amount);


}
