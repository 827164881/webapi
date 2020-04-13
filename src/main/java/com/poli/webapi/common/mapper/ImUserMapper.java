package com.poli.webapi.common.mapper;

import com.poli.webapi.common.entity.ImUser;
import java.util.List;

public interface ImUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImUser record);

    int insertSelective(ImUser record);

    ImUser selectByPrimaryKey(Integer id);

    List<ImUser> selectUserList();

    int updateByPrimaryKeySelective(ImUser record);

    int updateByPrimaryKey(ImUser record);
}