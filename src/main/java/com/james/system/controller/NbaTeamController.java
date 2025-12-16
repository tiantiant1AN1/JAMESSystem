package com.james.system.controller;

import com.james.system.entity.NbaTeam;
import com.james.system.service.NbaTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * NBA球队 Controller
 */
@RestController
@RequestMapping("/api/teams")
public class NbaTeamController {

    @Autowired
    private NbaTeamService nbaTeamService;

    /**
     * 查询所有球队
     */
    @GetMapping
    public List<NbaTeam> getAll() {
        return nbaTeamService.getAll();
    }

    /**
     * 根据ID查询球队
     */
    @GetMapping("/{teamId}")
    public NbaTeam getById(@PathVariable Integer teamId) {
        return nbaTeamService.getById(teamId);
    }

    /**
     * 根据名称模糊查询
     */
    @GetMapping("/search")
    public List<NbaTeam> getByName(@RequestParam String name) {
        return nbaTeamService.getByName(name);
    }

    /**
     * 查询有总冠军的球队
     */
    @GetMapping("/champions")
    public List<NbaTeam> getChampions() {
        return nbaTeamService.getChampions();
    }

    /**
     * 按总冠军数排序
     */
    @GetMapping("/ranking")
    public List<NbaTeam> getRanking() {
        return nbaTeamService.getOrderByChampionships();
    }

    /**
     * 新增球队
     */
    @PostMapping
    public int add(@RequestBody NbaTeam team) {
        return nbaTeamService.add(team);
    }

    /**
     * 更新球队
     */
    @PutMapping
    public int update(@RequestBody NbaTeam team) {
        return nbaTeamService.update(team);
    }

    /**
     * 删除球队
     */
    @DeleteMapping("/{teamId}")
    public int delete(@PathVariable Integer teamId) {
        return nbaTeamService.delete(teamId);
    }
}
