package cn.dawnland.dawnland_back.service;

public interface UUIDService {

    /** uuid查询游戏名 */
    String findNameByUUID(String uuid);

    /** 游戏名查询uuid */
    String findUUIDByName(String name);

}
