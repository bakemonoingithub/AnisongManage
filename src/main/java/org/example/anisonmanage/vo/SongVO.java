package org.example.anisonmanage.vo;


import lombok.Data;

import java.time.LocalDateTime;

/***
 * 用于列表展示歌曲信息
 */
@Data
public class SongVO {
    private Long id;
    private String title; //标题
    private String author; //作者

    private LocalDateTime updateTime; //更新时间
    private Integer lineCount;  // 聚合歌词行数
}
