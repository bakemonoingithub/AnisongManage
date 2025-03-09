package org.example.anisonmanage.vo;

import lombok.Data;

import java.util.List;

// VO（编辑状态用）
@Data
public class RubyEditorVO {
    private String originalText;
    private String currentRuby;
    private Boolean modified;
    private List<String> suggestRubies; // 雅虎API建议的备选注音
}
