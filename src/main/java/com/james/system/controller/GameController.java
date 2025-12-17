package com.james.system.controller;

import com.james.system.entity.Game;
import com.james.system.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * 比赛 Controller
 */
@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private GameService gameService;

    /**
     * 查询所有比赛
     */
    @GetMapping
    public List<Game> getAll() {
        return gameService.getAll();
    }

    /**
     * 根据ID查询
     */
    @GetMapping("/{id}")
    public Game getById(@PathVariable Long id) {
        return gameService.getById(id);
    }

    /**
     * 根据比赛ID查询
     */
    @GetMapping("/game/{gameId}")
    public Game getByGameId(@PathVariable String gameId) {
        return gameService.getByGameId(gameId);
    }

    /**
     * 根据赛季查询
     */
    @GetMapping("/season/{seasonYear}")
    public List<Game> getBySeasonYear(@PathVariable String seasonYear) {
        return gameService.getBySeasonYear(seasonYear);
    }

    /**
     * 根据日期范围查询
     */
    @GetMapping("/date-range")
    public List<Game> getByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return gameService.getByDateRange(startDate, endDate);
    }

    /**
     * 根据球队ID查询
     */
    @GetMapping("/team/{teamId}")
    public List<Game> getByTeamId(@PathVariable String teamId) {
        return gameService.getByTeamId(teamId);
    }

    /**
     * 根据比赛类型查询
     */
    @GetMapping("/type/{gameType}")
    public List<Game> getByGameType(@PathVariable String gameType) {
        return gameService.getByGameType(gameType);
    }

    /**
     * 新增比赛
     */
    @PostMapping
    public int add(@RequestBody Game game) {
        return gameService.add(game);
    }

    /**
     * 更新比赛
     */
    @PutMapping
    public int update(@RequestBody Game game) {
        return gameService.update(game);
    }

    /**
     * 删除比赛
     */
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Long id) {
        return gameService.delete(id);
    }
}
