package org.example.anisonmanage.controller;

import org.example.anisonmanage.dto.SongDTO;
import org.example.anisonmanage.pojo.Result;
import org.example.anisonmanage.service.SongService;
import org.example.anisonmanage.vo.SongVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/song")
public class SongController {

    @Autowired
    private SongService songService;

    @PostMapping
    public Result add(@RequestBody @Validated SongDTO song){
        songService.add(song);
        return Result.success();
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Long id, @RequestBody @Validated SongDTO song){
        songService.update(id, song);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){
        songService.deleteSong(id);
        return Result.success();
    }

    @DeleteMapping("/batch")
    public Result batchDelete(List<Long> ids){
        int deleteCount = songService.batchDeleteSongs(ids);
        return Result.success("成功删除 %d 条数据".formatted(deleteCount));
    }
}
