package com.example.time.dao;

import com.example.time.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by xuj on 2018/9/27.
 */
public interface SysUserRepository extends JpaRepository<SysUser,Integer> {
        //方法名根据用户名查询
        List<SysUser> findByNickname(String nickname);
        //方法名根据某个字的开头查询
        SysUser findByNicknameStartingWith(String name);

        List<SysUser> findByNicknameLike(String name);

        //JPQL语句
        //根据用户名查询
        @Query("from SysUser u where u.nickname =:nickname")
        SysUser findUser(@Param("nickname")String nickname);
        //根据某个字查询并且根据粉丝数量升序
        @Query("from SysUser u where u.nickname like  :name  order by u.fans ")
        List<SysUser> findUsers(@Param("name")String name);


}
