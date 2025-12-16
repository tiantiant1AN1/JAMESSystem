package com.james.system.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * NBA球队实体类
 * 对应数据库表: nba_teams
 */
public class NbaTeam {

    /** 球队ID，主键自增 */
    private Integer teamId;

    /** 球队名称 */
    private String franchiseName;

    /** 联盟(NBA/ABA/BAA) */
    private String league;

    /** 成立赛季 */
    private String yearFrom;

    /** 最新赛季 */
    private String yearTo;

    /** 存在年数 */
    private Integer years;

    /** 总场次 */
    private Integer games;

    /** 胜场 */
    private Integer wins;

    /** 负场 */
    private Integer losses;

    /** 胜率 */
    private BigDecimal winLossPct;

    /** 进入季后赛次数 */
    private Integer playoffs;

    /** 分区冠军次数 */
    private Integer divisionTitles;

    /** 联盟冠军次数 */
    private Integer conferenceTitles;

    /** 总冠军次数 */
    private Integer championships;

    /** 创建时间 */
    private LocalDateTime createdAt;

    /** 更新时间 */
    private LocalDateTime updatedAt;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getFranchiseName() {
        return franchiseName;
    }

    public void setFranchiseName(String franchiseName) {
        this.franchiseName = franchiseName;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(String yearFrom) {
        this.yearFrom = yearFrom;
    }

    public String getYearTo() {
        return yearTo;
    }

    public void setYearTo(String yearTo) {
        this.yearTo = yearTo;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public BigDecimal getWinLossPct() {
        return winLossPct;
    }

    public void setWinLossPct(BigDecimal winLossPct) {
        this.winLossPct = winLossPct;
    }

    public Integer getPlayoffs() {
        return playoffs;
    }

    public void setPlayoffs(Integer playoffs) {
        this.playoffs = playoffs;
    }

    public Integer getDivisionTitles() {
        return divisionTitles;
    }

    public void setDivisionTitles(Integer divisionTitles) {
        this.divisionTitles = divisionTitles;
    }

    public Integer getConferenceTitles() {
        return conferenceTitles;
    }

    public void setConferenceTitles(Integer conferenceTitles) {
        this.conferenceTitles = conferenceTitles;
    }

    public Integer getChampionships() {
        return championships;
    }

    public void setChampionships(Integer championships) {
        this.championships = championships;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
