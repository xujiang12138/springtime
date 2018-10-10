package com.example.time.service.Impl;

import com.example.time.dao.AlbumRepository;
import com.example.time.entity.Album;
import com.example.time.service.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuj on 2018/9/29.
 */
@Service
public class AlbumServiceImpl implements AlbumService {
    @Resource
    private AlbumRepository albumRepository ;
    @Override
    public List<Album> getAlbums() {
        return albumRepository.findAll();
    }

    @Override
    public Album getAlbum(int id) {
        return albumRepository.findById(id).get();
    }
}
