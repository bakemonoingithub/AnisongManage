package org.example.anisonmanage.vo;

import lombok.Data;

@Data
public class LyricsLineVO {
    private Integer lineNumber;
    private String content;
    private String rubyText;    // 合并注音信息
    private String translation; // 合并翻译信息
}
