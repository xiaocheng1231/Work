package com.atxiaocheng.demo.user.service;

import com.atxiaocheng.demo.user.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author cheng
 * @create 2021-02-10-18:24
 */
@Service
public interface UserService {
    List<UserEntity> getAll(Map map);

    void deleById(Integer id);


    //保存用户

    public void save(UserEntity u);
}
