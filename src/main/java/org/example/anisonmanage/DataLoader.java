package org.example.anisonmanage;

import org.example.anisonmanage.entity.Song;
import org.example.anisonmanage.repository.SongRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
//public class DataLoader implements CommandLineRunner {
//    private final SongRepository songRepository;
//
//    public DataLoader(SongRepository songRepository) {
//        this.songRepository = songRepository;
//    }
//
//    @Override
//    public void run(String... args) {
//        Song song = new Song();
//        song.setTitle("Lemon");
//        song.setOriginalLyric("夢ならばどれほどよかったでしょう...");
//        song.setTranslatedLyric("如果这只是一场梦该有多好...");
//
//        Song savedSong = songRepository.save(song);
//        System.out.println("保存成功，ID：" + savedSong.getId());
//    }
//}