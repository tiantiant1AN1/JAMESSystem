package com.james.system.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 比赛信息实体类
 * 对应数据库表: games
 */
public class Game {

    /** 主键ID */
    private Long id;

    /** 比赛ID */
    private String gameId;

    /** 比赛日期 */
    private LocalDate gameDate;

    /** 主场球队ID */
    private String homeTeamId;

    /** 客场球队ID */
    private String awayTeamId;

    /** 主场球队得分 */
    private Integer homeTeamScore;

    /** 客场球队得分 */
    private Integer awayTeamScore;

    /** 赛季年份 */
    private String seasonYear;

    /** 比赛类型 */
    private String gameType;

    /** 创建时间 */
    private LocalDateTime createdAt;

    /** 更新时间 */
    private LocalDateTime updatedAt;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getGameId() { return gameId; }
    public void setGameId(String gameId) { this.gameId = gameId; }

    public LocalDate getGameDate() { return gameDate; }
    public void setGameDate(LocalDate gameDate) { this.gameDate = gameDate; }

    public String getHomeTeamId() { return homeTeamId; }
    public void setHomeTeamId(String homeTeamId) { this.homeTeamId = homeTeamId; }

    public String getAwayTeamId() { return awayTeamId; }
    public void setAwayTeamId(String awayTeamId) { this.awayTeamId = awayTeamId; }

    public Integer getHomeTeamScore() { return homeTeamScore; }
    public void setHomeTeamScore(Integer homeTeamScore) { this.homeTeamScore = homeTeamScore; }

    public Integer getAwayTeamScore() { return awayTeamScore; }
    public void setAwayTeamScore(Integer awayTeamScore) { this.awayTeamScore = awayTeamScore; }

    public String getSeasonYear() { return seasonYear; }
    public void setSeasonYear(String seasonYear) { this.seasonYear = seasonYear; }

    public String getGameType() { return gameType; }
    public void setGameType(String gameType) { this.gameType = gameType; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
