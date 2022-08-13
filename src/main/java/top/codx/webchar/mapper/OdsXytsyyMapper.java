package top.codx.webchar.mapper;

import top.codx.webchar.model.OdsXytsyy;

/**
 * @author 刘城豪
 */
public interface OdsXytsyyMapper {
    int deleteByPrimaryKey(String xxtsyyid);

    int insert(OdsXytsyy record);

    int insertSelective(OdsXytsyy record);

    OdsXytsyy selectByPrimaryKey(String xxtsyyid);

    int updateByPrimaryKeySelective(OdsXytsyy record);

    int updateByPrimaryKey(OdsXytsyy record);
}