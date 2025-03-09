package org.example.anisonmanage.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "lyric_lines")
public class LyricLine {
    @Id
    @GeneratedValue
    private Long id;
    private Integer lineNumber;
    private String content;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "song_id")
    private Song song;
}
