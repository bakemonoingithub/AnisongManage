package org.example.anisonmanage.service.serviceImpl;

import jakarta.transaction.Transactional;
import org.example.anisonmanage.dto.SongDTO;
import org.example.anisonmanage.entity.Song;
import org.example.anisonmanage.repository.SongRepository;
import org.example.anisonmanage.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@Service
@Transactional
public class SongServiceImpl implements SongService {
    @Autowired
    SongRepository songRepository;
    @Override
    public void add(SongDTO song) {
        Song songEntity = new Song();
        updateEntityFromDTO(song, songEntity);
        songRepository.save(songEntity);
    }

    @Override
    public void update(Long id, SongDTO song) {
        Song existingSong = songRepository.findById(id).orElseThrow(
                ()->new ResourceAccessException("没有找到对应歌曲")
        );
        updateEntityFromDTO(song, existingSong);
    }

    @Override
    public void deleteSong(Long id) {
        Song existingSong = songRepository.findById(id).orElseThrow(
                ()->new ResourceAccessException("没有找到对应歌曲")
        );
        songRepository.delete(existingSong); //直接级联删除
    }

    @Override
    public int batchDeleteSongs(List<Long> ids) {
        return songRepository.deleteBatchByIds(ids);
    }

    private void updateEntityFromDTO(SongDTO source, Song target){
        if (source.getTitle() != null) {
            target.setTitle(source.getTitle());
        }
        if(source.getAuthor() != null){
            target.setAuthor(source.getAuthor());
        }
        if (source.getOriginalLyric() != null) {
            target.setOriginalLyric(source.getOriginalLyric());
        }
        if (source.getTranslatedLyric() != null) {
            target.setTranslatedLyric(source.getTranslatedLyric());
        }
    }
}
