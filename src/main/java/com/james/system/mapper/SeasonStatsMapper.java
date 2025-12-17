package com.james.system.mapper;

import com.james.system.entity.SeasonStats;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 赛季统计 Mapper
 */
@Mapper
public interface SeasonStatsMapper {

    /** 根据ID查询 */
    SeasonStats selectById(Long id);

    /** 查询所有 */
    List<SeasonStats> selectAll();

    /** 根据球员ID查询 */
    List<SeasonStats> selectByPlayerId(String playerId);

    /** 根据赛季查询 */
    List<SeasonStats> selectBySeasonYear(String seasonYear);

    /** 根据球队ID查询 */
    List<SeasonStats> selectByTeamId(String teamId);

    /** 根据球员ID和赛季查询 */
    SeasonStats selectByPlayerAndSeason(@Param("playerId") String playerId, @Param("seasonYear") String seasonYear);

    /** 查询得分榜（按赛季） */
    List<SeasonStats> selectTopScorers(@Param("seasonYear") String seasonYear, @Param("limit") int limit);

    /** 新增 */
    int insert(SeasonStats seasonStats);

    /** 更新 */
    int update(SeasonStats seasonStats);

    /** 删除 */
    int deleteById(Long id);
}
