package cn.zhiqing.community.mapper;


import cn.zhiqing.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
//    分页查询帖子
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);
//    动态查询的时候只有一个参数的时候  必须有 param参数 起个别名
    int selectDiscussPostRows(@Param("userId") int userId);
}
