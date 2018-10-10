package com.example.time.service;

import com.example.time.entity.Album;

import java.util.List;

/**
 * Created by xuj on 2018/9/29.
 */
public interface AlbumService {
    List<Album>  getAlbums();
    Album getAlbum(int id);
}
