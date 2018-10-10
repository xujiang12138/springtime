package com.example.time.controller;

import com.example.time.entity.Album;
import com.example.time.service.AlbumService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuj on 2018/9/29.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/album")
public class AlbumController {
    @Resource
    private AlbumService albumService;

    @GetMapping("/list")
    public List<Album> getAlbums(){
        return  albumService.getAlbums();
    }

    @GetMapping("/{id}")
    public Album getAlbum(@PathVariable Integer id){
        return  albumService.getAlbum(id);
    }
}
