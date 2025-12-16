package com.james.system.mapper;

import com.james.system.entity.NbaTeam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * NBA球队 Mapper接口
 */
@Mapper
public interface NbaTeamMapper {

    /**
     * 根据ID查询球队
     */
    NbaTeam selectById(@Param("teamId") Integer teamId);

    /**
     * 查询所有球队
     */
    List<NbaTeam> selectAll();

    /**
     * 根据名称模糊查询
     */
    List<NbaTeam> selectByName(@Param("franchiseName") String franchiseName);

    /**
     * 查询有总冠军的球队
     */
    List<NbaTeam> selectChampions();

    /**
     * 按总冠军数排序
     */
    List<NbaTeam> selectOrderByChampionships();

    /**
     * 新增球队
     */
    int insert(NbaTeam team);

    /**
     * 更新球队
     */
    int update(NbaTeam team);

    /**
     * 删除球队
     */
    int deleteById(@Param("teamId") Integer teamId);
}
