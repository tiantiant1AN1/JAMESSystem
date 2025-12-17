package com.james.system.service;

import com.james.system.entity.GameDetail;
import com.james.system.mapper.GameDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 比赛详情 Service
 */
@Service
public class GameDetailService {

    @Autowired
    private GameDetailMapper gameDetailMapper;

    public GameDetail getById(Long id) {
        return gameDetailMapper.selectById(id);
    }

    public List<GameDetail> getAll() {
        return gameDetailMapper.selectAll();
    }

    public List<GameDetail> getByGameId(String gameId) {
        return gameDetailMapper.selectByGameId(gameId);
    }

    public List<GameDetail> getByPlayerId(String playerId) {
        return gameDetailMapper.selectByPlayerId(playerId);
    }

    public List<GameDetail> getByTeamId(String teamId) {
        return gameDetailMapper.selectByTeamId(teamId);
    }

    public GameDetail getByGameAndPlayer(String gameId, String playerId) {
        return gameDetailMapper.selectByGameAndPlayer(gameId, playerId);
    }

    public int add(GameDetail gameDetail) {
        return gameDetailMapper.insert(gameDetail);
    }

    public int update(GameDetail gameDetail) {
        return gameDetailMapper.update(gameDetail);
    }

    public int delete(Long id) {
        return gameDetailMapper.deleteById(id);
    }

    public int deleteByGameId(String gameId) {
        return gameDetailMapper.deleteByGameId(gameId);
    }
}
