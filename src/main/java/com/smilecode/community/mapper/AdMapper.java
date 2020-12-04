package com.smilecode.community.mapper;

import java.util.List;
import com.smilecode.community.model.Ad;
import com.smilecode.community.model.AdExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Fri Dec 04 16:34:54 CST 2020
     */
    long countByExample(AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Fri Dec 04 16:34:54 CST 2020
     */
    int deleteByExample(AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Fri Dec 04 16:34:54 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Fri Dec 04 16:34:54 CST 2020
     */
    int insert(Ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Fri Dec 04 16:34:54 CST 2020
     */
    int insertSelective(Ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Fri Dec 04 16:34:54 CST 2020
     */
    List<Ad> selectByExampleWithRowbounds(AdExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Fri Dec 04 16:34:54 CST 2020
     */
    List<Ad> selectByExample(AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Fri Dec 04 16:34:54 CST 2020
     */
    Ad selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Fri Dec 04 16:34:54 CST 2020
     */
    int updateByExampleSelective(@Param("record") Ad record, @Param("example") AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Fri Dec 04 16:34:54 CST 2020
     */
    int updateByExample(@Param("record") Ad record, @Param("example") AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Fri Dec 04 16:34:54 CST 2020
     */
    int updateByPrimaryKeySelective(Ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Fri Dec 04 16:34:54 CST 2020
     */
    int updateByPrimaryKey(Ad record);
}