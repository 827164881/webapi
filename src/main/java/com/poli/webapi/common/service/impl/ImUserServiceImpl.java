package com.poli.webapi.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.poli.webapi.common.entity.ImUser;
import com.poli.webapi.common.mapper.ImUserMapper;
import com.poli.webapi.common.service.ImUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: monkey.G
 * @create: 2020-04-09 18:56
 **/
@Service
public class ImUserServiceImpl implements ImUserService {
  @Autowired
  private ImUserMapper imUserMapper;

  @Override
  public Object getUserList() {
    PageHelper.startPage(1, 10);
    List<ImUser> cycleList = imUserMapper.selectUserList();
    return cycleList;
  }
}
