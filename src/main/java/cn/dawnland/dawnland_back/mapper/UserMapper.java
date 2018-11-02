package cn.dawnland.dawnland_back.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

@Mapper
public interface UserMapper {

    /** 积分查询 */
    @Select("select score from users where player_name = #{name}")
    Long fingScore(@Param("name")String name);

    /** 积分增减 */
    @SelectProvider(type = UserProvider.class, method = "updateScore")
    Integer updateScore(@Param("name")String name, @Param("symal")String symal, @Param("amount")Long amount);

    class UserProvider{
        public String updateScore(@Param("name")String name, @Param("symal")String symal, @Param("amount")Long amount){
            return new SQL(){{
                UPDATE("users");
                if(symal.equals("+")){
                    SET("score = score + #{amount}");
                }else if(symal.equals("-")){
                    SET("score = score - #{amount}");
                }
                WHERE("player_name = #{name}");
            }}.toString();
        }
    }

}
