package com.atxiaocheng.demo.user.dao;

import com.atxiaocheng.demo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author cheng
 * @create 2021-02-10-18:26
 */
@Mapper
public interface UserDao {

    List<UserEntity> getAll(Map map);

    void delById(Integer id);

    public void save(UserEntity userEntity);
}
