package com.james.system.controller;

import com.james.system.entity.GameDetail;
import com.james.system.service.GameDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 比赛详情 Controller
 */
@RestController
@RequestMapping("/api/game-details")
public class GameDetailController {

    @Autowired
    private GameDetailService gameDetailService;

    /**
     * 查询所有比赛详情
     */
    @GetMapping
    public List<GameDetail> getAll() {
        return gameDetailService.getAll();
    }

    /**
     * 根据ID查询
     */
    @GetMapping("/{id}")
    public GameDetail getById(@PathVariable Long id) {
        return gameDetailService.getById(id);
    }

    /**
     * 根据比赛ID查询
     */
    @GetMapping("/game/{gameId}")
    public List<GameDetail> getByGameId(@PathVariable String gameId) {
        return gameDetailService.getByGameId(gameId);
    }

    /**
     * 根据球员ID查询
     */
    @GetMapping("/player/{playerId}")
    public List<GameDetail> getByPlayerId(@PathVariable String playerId) {
        return gameDetailService.getByPlayerId(playerId);
    }

    /**
     * 根据球队ID查询
     */
    @GetMapping("/team/{teamId}")
    public List<GameDetail> getByTeamId(@PathVariable String teamId) {
        return gameDetailService.getByTeamId(teamId);
    }

    /**
     * 根据比赛ID和球员ID查询
     */
    @GetMapping("/game/{gameId}/player/{playerId}")
    public GameDetail getByGameAndPlayer(@PathVariable String gameId, @PathVariable String playerId) {
        return gameDetailService.getByGameAndPlayer(gameId, playerId);
    }

    /**
     * 新增比赛详情
     */
    @PostMapping
    public int add(@RequestBody GameDetail gameDetail) {
        return gameDetailService.add(gameDetail);
    }

    /**
     * 更新比赛详情
     */
    @PutMapping
    public int update(@RequestBody GameDetail gameDetail) {
        return gameDetailService.update(gameDetail);
    }

    /**
     * 删除比赛详情
     */
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Long id) {
        return gameDetailService.delete(id);
    }
}
