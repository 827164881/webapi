package com.poli.webapi.common.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.poli.webapi.common.entity.ImUser;
import com.poli.webapi.common.mapper.ImUserMapper;
import com.poli.webapi.common.mapper.ImUserPlusMapper;
import com.poli.webapi.common.service.ImUserService;
import com.poli.webapi.config.datasource.pager.OutWithError;
import com.poli.webapi.config.datasource.pager.Pager;
import com.poli.webapi.config.datasource.pager.PagerOut;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

  @Autowired
  private ImUserPlusMapper mapperVo;

  @Override
  public Object getUserList() {
    Pager pager = new Pager();
    pager.setPage(1);
    pager.setSize(5);
    PageHelper.startPage(pager.getPage(), pager.getSize());
    ImUser user = new ImUser();
    List<ImUser> cycleList = mapperVo.selectList( new QueryWrapper(user));
    PagerOut out = new PagerOut(pager);
    out.setResult(cycleList);
    return out;
  }

  @Override
  public Object insertUser() {
    ImUser imUser = new ImUser();
    imUser.setBirthday(new Date());
    imUser.setHeadImg("www.baidu.com");
    imUser.setPhone("18633131359");
    imUser.setMail("827164881@qq.com");
    mapperVo.insert(imUser);
    return new OutWithError();
  }

  @Override
  public Object updateUser() {
    Map<String,Object> map = new HashMap<>();
    map.put("phone","18633131359");
    List<ImUser> imUsers = mapperVo.selectByMap(map);
    //更新第一个元素
    imUsers.get(0).setNickname("MMonkey.G");
    int i = mapperVo.updateById(imUsers.get(0));
    return new OutWithError().setMsg("更新"+i);
  }

  @Override
  public Object deleteUser() {
    int i = mapperVo.deleteById(1);
    return new OutWithError().setMsg("删除"+i);
  }
}
