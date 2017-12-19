package dao;

import entity.User;

public interface UserDao {
    int deleteById(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectById(Integer userid);

    int updateByIdSelective(User record);

    int updateById(User record);
}