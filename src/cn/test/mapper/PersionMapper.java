package cn.test.mapper;

import cn.test.entity.Persion;
import cn.test.entity.PersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersionMapper {
    long countByExample(PersionExample example);

    int deleteByExample(PersionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Persion record);

    int insertSelective(Persion record);

    List<Persion> selectByExample(PersionExample example);

    Persion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Persion record, @Param("example") PersionExample example);

    int updateByExample(@Param("record") Persion record, @Param("example") PersionExample example);

    int updateByPrimaryKeySelective(Persion record);

    int updateByPrimaryKey(Persion record);
}