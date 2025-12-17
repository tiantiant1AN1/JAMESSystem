package com.james.system.service;

import com.james.system.entity.Game;
import com.james.system.mapper.GameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * 比赛 Service
 */
@Service
public class GameService {

    @Autowired
    private GameMapper gameMapper;

    public Game getById(Long id) {
        return gameMapper.selectById(id);
    }

    public Game getByGameId(String gameId) {
        return gameMapper.selectByGameId(gameId);
    }

    public List<Game> getAll() {
        return gameMapper.selectAll();
    }

    public List<Game> getBySeasonYear(String seasonYear) {
        return gameMapper.selectBySeasonYear(seasonYear);
    }

    public List<Game> getByDateRange(LocalDate startDate, LocalDate endDate) {
        return gameMapper.selectByDateRange(startDate, endDate);
    }

    public List<Game> getByTeamId(String teamId) {
        return gameMapper.selectByTeamId(teamId);
    }

    public List<Game> getByGameType(String gameType) {
        return gameMapper.selectByGameType(gameType);
    }

    public int add(Game game) {
        return gameMapper.insert(game);
    }

    public int update(Game game) {
        return gameMapper.update(game);
    }

    public int delete(Long id) {
        return gameMapper.deleteById(id);
    }

    public int deleteByGameId(String gameId) {
        return gameMapper.deleteByGameId(gameId);
    }
}
