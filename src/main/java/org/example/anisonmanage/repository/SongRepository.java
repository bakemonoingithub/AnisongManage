package org.example.anisonmanage.repository;

import org.example.anisonmanage.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SongRepository extends JpaRepository<Song, Long> {
    @Modifying
    @Query(value = "DELETE FROM Song s WHERE s.id IN (:ids)")
    int deleteBatchByIds(@Param("ids") List<Long> ids);
}
