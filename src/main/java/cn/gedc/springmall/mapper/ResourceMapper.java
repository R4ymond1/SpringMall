package cn.gedc.springmall.mapper;

import cn.gedc.springmall.bean.MyResourceBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by gedc on 2020/12/20.
 */
@Component
@Mapper
public interface ResourceMapper {
    /**
     * 从数据库中查询所有资源
     * @return
     */
    @Select("select * from resource ")
    List<MyResourceBean> selectAllResource();
}