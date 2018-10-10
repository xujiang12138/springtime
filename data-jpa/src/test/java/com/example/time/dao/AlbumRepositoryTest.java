package com.example.time.dao;

import com.example.time.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by xuj on 2018/9/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumRepositoryTest {
    @Resource
    private AlbumRepository albumRepository ;

    @Test
    public  void addAlbums (){
        Album[] albums ={
                new Album("http://p9f10ih0f.bkt.clouddn.com/18-9-10/52798216.jpg","动漫","我喜欢看动漫",258),
                new Album("http://p9f10ih0f.bkt.clouddn.com/18-9-20/76124660.jpg","落花听雨","寒风一涩，枯叶归根",597),
                new Album("http://p9f10ih0f.bkt.clouddn.com/18-9-20/7344093.jpg","十字洪爱","洪爱永久，一心永恒，从不凋零",149),
                new Album("http://p9f10ih0f.bkt.clouddn.com/18-8-27/75565731.jpg","区块链","一起来赚比特币，从零开始",15494),
                new Album("http://p9f10ih0f.bkt.clouddn.com/18-8-27/91585556.jpg","金锁","这是一个大门，需要一把钥匙才能打开，但这只有智慧",888),
                new Album("http://p9f10ih0f.bkt.clouddn.com/18-9-7/77118577.jpg","Spring","Spring-boot，一个对于微服务开发相对来说即为轻松简单的工具框架",5558),
        };

        for(int i =0 ; i<6;i++){
            albumRepository.save(albums[i]);
        }
    }
    @Test
    public void findHotAlbums() throws Exception {
            Album album = albumRepository.findById(45).get();
        System.out.println(album);
    }

}