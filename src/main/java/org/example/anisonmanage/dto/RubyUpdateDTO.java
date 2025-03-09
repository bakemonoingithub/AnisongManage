package org.example.anisonmanage.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RubyUpdateDTO {
    @NotNull
    private Long lineId;

    @NotBlank
    private String rubyText;
}
