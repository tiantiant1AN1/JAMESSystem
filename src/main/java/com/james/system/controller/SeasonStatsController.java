package com.james.system.controller;

import com.james.system.entity.SeasonStats;
import com.james.system.service.SeasonStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 赛季统计 Controller
 */
@RestController
@RequestMapping("/api/season-stats")
public class SeasonStatsController {

    @Autowired
    private SeasonStatsService seasonStatsService;

    /**
     * 查询所有赛季统计
     */
    @GetMapping
    public List<SeasonStats> getAll() {
        return seasonStatsService.getAll();
    }

    /**
     * 根据ID查询
     */
    @GetMapping("/{id}")
    public SeasonStats getById(@PathVariable Long id) {
        return seasonStatsService.getById(id);
    }

    /**
     * 根据球员ID查询
     */
    @GetMapping("/player/{playerId}")
    public List<SeasonStats> getByPlayerId(@PathVariable String playerId) {
        return seasonStatsService.getByPlayerId(playerId);
    }

    /**
     * 根据赛季查询
     */
    @GetMapping("/season/{seasonYear}")
    public List<SeasonStats> getBySeasonYear(@PathVariable String seasonYear) {
        return seasonStatsService.getBySeasonYear(seasonYear);
    }

    /**
     * 根据球队ID查询
     */
    @GetMapping("/team/{teamId}")
    public List<SeasonStats> getByTeamId(@PathVariable String teamId) {
        return seasonStatsService.getByTeamId(teamId);
    }

    /**
     * 根据球员ID和赛季查询
     */
    @GetMapping("/player/{playerId}/season/{seasonYear}")
    public SeasonStats getByPlayerAndSeason(@PathVariable String playerId, @PathVariable String seasonYear) {
        return seasonStatsService.getByPlayerAndSeason(playerId, seasonYear);
    }

    /**
     * 查询得分榜
     */
    @GetMapping("/top-scorers/{seasonYear}")
    public List<SeasonStats> getTopScorers(
            @PathVariable String seasonYear,
            @RequestParam(defaultValue = "10") int limit) {
        return seasonStatsService.getTopScorers(seasonYear, limit);
    }

    /**
     * 新增赛季统计
     */
    @PostMapping
    public int add(@RequestBody SeasonStats seasonStats) {
        return seasonStatsService.add(seasonStats);
    }

    /**
     * 更新赛季统计
     */
    @PutMapping
    public int update(@RequestBody SeasonStats seasonStats) {
        return seasonStatsService.update(seasonStats);
    }

    /**
     * 删除赛季统计
     */
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Long id) {
        return seasonStatsService.delete(id);
    }
}
