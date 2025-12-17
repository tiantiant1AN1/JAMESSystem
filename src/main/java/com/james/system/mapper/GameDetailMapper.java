package com.james.system.mapper;

import com.james.system.entity.GameDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 比赛详情 Mapper
 */
@Mapper
public interface GameDetailMapper {

    /** 根据ID查询 */
    GameDetail selectById(Long id);

    /** 查询所有 */
    List<GameDetail> selectAll();

    /** 根据比赛ID查询 */
    List<GameDetail> selectByGameId(String gameId);

    /** 根据球员ID查询 */
    List<GameDetail> selectByPlayerId(String playerId);

    /** 根据球队ID查询 */
    List<GameDetail> selectByTeamId(String teamId);

    /** 根据比赛ID和球员ID查询 */
    GameDetail selectByGameAndPlayer(@Param("gameId") String gameId, @Param("playerId") String playerId);

    /** 新增 */
    int insert(GameDetail gameDetail);

    /** 更新 */
    int update(GameDetail gameDetail);

    /** 删除 */
    int deleteById(Long id);

    /** 根据比赛ID删除 */
    int deleteByGameId(String gameId);
}
