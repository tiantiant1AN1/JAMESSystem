package com.james.system.service;

import com.james.system.entity.NbaTeam;
import com.james.system.mapper.NbaTeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * NBA球队 Service
 */
@Service
public class NbaTeamService {

    @Autowired
    private NbaTeamMapper nbaTeamMapper;

    /**
     * 根据ID查询球队
     */
    public NbaTeam getById(Integer teamId) {
        return nbaTeamMapper.selectById(teamId);
    }

    /**
     * 查询所有球队
     */
    public List<NbaTeam> getAll() {
        return nbaTeamMapper.selectAll();
    }

    /**
     * 根据名称模糊查询
     */
    public List<NbaTeam> getByName(String franchiseName) {
        return nbaTeamMapper.selectByName(franchiseName);
    }

    /**
     * 查询有总冠军的球队
     */
    public List<NbaTeam> getChampions() {
        return nbaTeamMapper.selectChampions();
    }

    /**
     * 按总冠军数排序
     */
    public List<NbaTeam> getOrderByChampionships() {
        return nbaTeamMapper.selectOrderByChampionships();
    }

    /**
     * 新增球队
     */
    public int add(NbaTeam team) {
        return nbaTeamMapper.insert(team);
    }

    /**
     * 更新球队
     */
    public int update(NbaTeam team) {
        return nbaTeamMapper.update(team);
    }

    /**
     * 删除球队
     */
    public int delete(Integer teamId) {
        return nbaTeamMapper.deleteById(teamId);
    }
}
