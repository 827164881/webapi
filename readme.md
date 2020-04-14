
## 该项目计划搭建一个springboot、mybaits-plus、pager-helper、 spring security搭建一个接口项目，然后再对该项目进行springcloud改造

#### 20200413 提交初始架构
实现了springboot、mybaits-plus、pager-helper架构的一个简单查询

看到开源项目
```java
<dependency>
    <groupId>tk.mybatis</groupId>
    <artifactId>mapper-spring-boot-starter</artifactId>
    <version>${mapper.starter.version}</version>
</dependency>
```
其中的写法为：
```java
 if (country.getPage() != null && country.getRows() != null) {
      PageHelper.startPage(country.getPage(), country.getRows());
  }
  Weekend<Country> weekend = Weekend.of(Country.class);
  WeekendCriteria<Country, Object> criteria = weekend.weekendCriteria();
  if (country.getCountryname() != null && country.getCountryname().length() > 0) {
      criteria.andLike(Country::getCountryname, "%" + country.getCountryname() + "%");
  }
  if (country.getCountrycode() != null && country.getCountrycode().length() > 0) {
      criteria.andLike(Country::getCountrycode, "%" + country.getCountrycode() + "%");
  }
  return countryMapper.selectByExample(weekend);
```
相比mybatis-plus中
```java
Pager pager = new Pager();
pager.setPage(1);
pager.setSize(5);
PageHelper.startPage(pager.getPage(), pager.getSize());
ImUser user = new ImUser();
QueryWrapper queryWrapper = new QueryWrapper(user);
queryWrapper.between("birthday", date1,date2);
queryWrapper.like("nickname","MM");
List<ImUser> cycleList = mapperVo.selectList( queryWrapper);
```
这种写法屏蔽了数据库字段，虽然是驼峰命名，但还是会有字段名写错的情况，所有我觉得，mapper-spring-boot-starter这个包封装的更简单，屏蔽了拼写等错误的发生操作。