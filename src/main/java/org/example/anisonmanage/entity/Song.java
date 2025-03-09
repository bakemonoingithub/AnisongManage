package org.example.anisonmanage.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "songs")
@Getter
@Setter
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;
    @Column(nullable = false, length = 100)
    private String author;
    @Lob
    @Column(name = "original_lyric")
    private String originalLyric;
    @Lob
    @Column(name = "translated_lyric")
    private String translatedLyric;
    @OneToMany(
            mappedBy = "song",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<LyricLine> lyrics = new ArrayList<>();
}
