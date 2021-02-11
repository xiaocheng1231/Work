package com.atxiaocheng.demo.user.service;

import com.atxiaocheng.demo.user.dao.UserDao;
import com.atxiaocheng.demo.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author cheng
 * @create 2021-02-10-18:24
 */
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public List<UserEntity> getAll(Map map) {
        return userDao.getAll(map);
    }

    @Override
    public void deleById(Integer id) {
        userDao.delById(id);
    }

    @Override
    public void save(UserEntity userEntity) {


        userEntity.setCreatetime(new Date());
        userEntity.setStatus(1);
        userDao.save(userEntity);
    }
}
