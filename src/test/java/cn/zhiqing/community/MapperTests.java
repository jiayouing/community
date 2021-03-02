package cn.zhiqing.community;


import cn.zhiqing.community.entity.DiscussPost;
import cn.zhiqing.community.entity.User;
import cn.zhiqing.community.mapper.DiscussPostMapper;
import cn.zhiqing.community.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectById(){
        User user = userMapper.selectById(101);
        int i = discussPostMapper.selectDiscussPostRows(0);
        System.out.println(i);
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0, 1, 2);
        for (DiscussPost discussPost : discussPosts) {
            System.out.println(discussPost);

        }


    }




}
