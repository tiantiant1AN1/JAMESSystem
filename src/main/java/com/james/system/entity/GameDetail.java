package com.james.system.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 比赛详情实体类
 * 对应数据库表: game_details
 */
public class GameDetail {

    /** 主键ID */
    private Long id;

    /** 比赛ID */
    private String gameId;

    /** 球员ID */
    private String playerId;

    /** 球队ID */
    private String teamId;

    /** 是否主场 */
    private Boolean isHome;

    /** 出场时间 */
    private BigDecimal min;

    /** 投篮命中数 */
    private Integer fgm;

    /** 投篮尝试数 */
    private Integer fga;

    /** 投篮命中率 */
    private BigDecimal fgPct;

    /** 三分命中数 */
    private Integer fg3m;

    /** 三分尝试数 */
    private Integer fg3a;

    /** 三分命中率 */
    private BigDecimal fg3Pct;

    /** 罚球命中数 */
    private Integer ftm;

    /** 罚球尝试数 */
    private Integer fta;

    /** 罚球命中率 */
    private BigDecimal ftPct;

    /** 进攻篮板 */
    private Integer oreb;

    /** 防守篮板 */
    private Integer dreb;

    /** 总篮板 */
    private Integer reb;

    /** 助攻 */
    private Integer ast;

    /** 抢断 */
    private Integer stl;

    /** 盖帽 */
    private Integer blk;

    /** 失误 */
    private Integer tov;

    /** 犯规 */
    private Integer pf;

    /** 得分 */
    private Integer pts;

    /** 创建时间 */
    private LocalDateTime createdAt;

    /** 更新时间 */
    private LocalDateTime updatedAt;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getGameId() { return gameId; }
    public void setGameId(String gameId) { this.gameId = gameId; }

    public String getPlayerId() { return playerId; }
    public void setPlayerId(String playerId) { this.playerId = playerId; }

    public String getTeamId() { return teamId; }
    public void setTeamId(String teamId) { this.teamId = teamId; }

    public Boolean getIsHome() { return isHome; }
    public void setIsHome(Boolean isHome) { this.isHome = isHome; }

    public BigDecimal getMin() { return min; }
    public void setMin(BigDecimal min) { this.min = min; }

    public Integer getFgm() { return fgm; }
    public void setFgm(Integer fgm) { this.fgm = fgm; }

    public Integer getFga() { return fga; }
    public void setFga(Integer fga) { this.fga = fga; }

    public BigDecimal getFgPct() { return fgPct; }
    public void setFgPct(BigDecimal fgPct) { this.fgPct = fgPct; }

    public Integer getFg3m() { return fg3m; }
    public void setFg3m(Integer fg3m) { this.fg3m = fg3m; }

    public Integer getFg3a() { return fg3a; }
    public void setFg3a(Integer fg3a) { this.fg3a = fg3a; }

    public BigDecimal getFg3Pct() { return fg3Pct; }
    public void setFg3Pct(BigDecimal fg3Pct) { this.fg3Pct = fg3Pct; }

    public Integer getFtm() { return ftm; }
    public void setFtm(Integer ftm) { this.ftm = ftm; }

    public Integer getFta() { return fta; }
    public void setFta(Integer fta) { this.fta = fta; }

    public BigDecimal getFtPct() { return ftPct; }
    public void setFtPct(BigDecimal ftPct) { this.ftPct = ftPct; }

    public Integer getOreb() { return oreb; }
    public void setOreb(Integer oreb) { this.oreb = oreb; }

    public Integer getDreb() { return dreb; }
    public void setDreb(Integer dreb) { this.dreb = dreb; }

    public Integer getReb() { return reb; }
    public void setReb(Integer reb) { this.reb = reb; }

    public Integer getAst() { return ast; }
    public void setAst(Integer ast) { this.ast = ast; }

    public Integer getStl() { return stl; }
    public void setStl(Integer stl) { this.stl = stl; }

    public Integer getBlk() { return blk; }
    public void setBlk(Integer blk) { this.blk = blk; }

    public Integer getTov() { return tov; }
    public void setTov(Integer tov) { this.tov = tov; }

    public Integer getPf() { return pf; }
    public void setPf(Integer pf) { this.pf = pf; }

    public Integer getPts() { return pts; }
    public void setPts(Integer pts) { this.pts = pts; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
