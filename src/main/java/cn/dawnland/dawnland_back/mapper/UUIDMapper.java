package cn.dawnland.dawnland_back.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UUIDMapper {

    /** uuid查询游戏名 */
    @Select("select name from uuid where uuid = #{uuid}")
    String findNameByUUID(@Param("uuid") String uuid);


    /** 游戏名查询uuid */
    @Select("select uuid from uuid where name = #{name}")
    String findUUIDByName(@Param("name") String name);

}
