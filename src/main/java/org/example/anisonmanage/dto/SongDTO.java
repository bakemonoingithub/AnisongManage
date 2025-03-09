package org.example.anisonmanage.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.groups.Default;
import lombok.Data;

@Data
public class SongDTO {
    public interface Add extends Default {};
    public interface Update extends Default{};
    @NotNull(groups = Update.class)
    private Long id;

    @NotBlank(message = "标题不能为空")
    @Size(max = 100, message = "标题长度超过限制")
    private String title;

    @Size(max = 20, message = "作者名称长度超过限制")
    private String author; //作者
    @NotNull
    private String originalLyric;

    private String translatedLyric;
}
