package com.james.system.service;

import com.james.system.entity.SeasonStats;
import com.james.system.mapper.SeasonStatsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 赛季统计 Service
 */
@Service
public class SeasonStatsService {

    @Autowired
    private SeasonStatsMapper seasonStatsMapper;

    public SeasonStats getById(Long id) {
        return seasonStatsMapper.selectById(id);
    }

    public List<SeasonStats> getAll() {
        return seasonStatsMapper.selectAll();
    }

    public List<SeasonStats> getByPlayerId(String playerId) {
        return seasonStatsMapper.selectByPlayerId(playerId);
    }

    public List<SeasonStats> getBySeasonYear(String seasonYear) {
        return seasonStatsMapper.selectBySeasonYear(seasonYear);
    }

    public List<SeasonStats> getByTeamId(String teamId) {
        return seasonStatsMapper.selectByTeamId(teamId);
    }

    public SeasonStats getByPlayerAndSeason(String playerId, String seasonYear) {
        return seasonStatsMapper.selectByPlayerAndSeason(playerId, seasonYear);
    }

    public List<SeasonStats> getTopScorers(String seasonYear, int limit) {
        return seasonStatsMapper.selectTopScorers(seasonYear, limit);
    }

    public int add(SeasonStats seasonStats) {
        return seasonStatsMapper.insert(seasonStats);
    }

    public int update(SeasonStats seasonStats) {
        return seasonStatsMapper.update(seasonStats);
    }

    public int delete(Long id) {
        return seasonStatsMapper.deleteById(id);
    }
}
