package com.example.time.dao;

import com.example.time.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xuj on 2018/9/29.
 */
public interface AlbumRepository extends JpaRepository<Album,Integer> {

}
