package org.example.anisonmanage.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.groups.Default;
import lombok.Data;

// DTO（带关联ID）
@Data
public class LyricLineDTO {
    public interface Add extends Default {};
    public interface Update extends Default{};
    @NotNull(groups = Update.class)
    private Long id;
    private Integer lineNumber;

    @NotBlank
    @Size(max = 255)
    private String content;

    @NotNull
    private Long songId;
}
