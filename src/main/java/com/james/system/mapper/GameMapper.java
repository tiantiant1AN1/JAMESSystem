package com.james.system.mapper;

import com.james.system.entity.Game;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

/**
 * 比赛 Mapper
 */
@Mapper
public interface GameMapper {

    /** 根据ID查询 */
    Game selectById(Long id);

    /** 根据比赛ID查询 */
    Game selectByGameId(String gameId);

    /** 查询所有 */
    List<Game> selectAll();

    /** 根据赛季查询 */
    List<Game> selectBySeasonYear(String seasonYear);

    /** 根据日期范围查询 */
    List<Game> selectByDateRange(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    /** 根据球队ID查询（主场或客场） */
    List<Game> selectByTeamId(String teamId);

    /** 根据比赛类型查询 */
    List<Game> selectByGameType(String gameType);

    /** 新增 */
    int insert(Game game);

    /** 更新 */
    int update(Game game);

    /** 删除 */
    int deleteById(Long id);

    /** 根据比赛ID删除 */
    int deleteByGameId(String gameId);
}
