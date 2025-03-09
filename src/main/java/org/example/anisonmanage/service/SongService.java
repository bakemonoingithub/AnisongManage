package org.example.anisonmanage.service;

import org.example.anisonmanage.dto.SongDTO;
import org.example.anisonmanage.entity.Song;

import java.util.List;

public interface SongService {
    void add(SongDTO song);

    void update(Long id, SongDTO song);

    void deleteSong(Long id);

    int batchDeleteSongs(List<Long> ids);
}
