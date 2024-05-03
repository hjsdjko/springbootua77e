package com.dao;

import com.entity.QiyebaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyebaomingVO;
import com.entity.view.QiyebaomingView;


/**
 * 企业报名
 * 
 * @author 
 * @email 
 * @date 2022-05-13 09:56:56
 */
public interface QiyebaomingDao extends BaseMapper<QiyebaomingEntity> {
	
	List<QiyebaomingVO> selectListVO(@Param("ew") Wrapper<QiyebaomingEntity> wrapper);
	
	QiyebaomingVO selectVO(@Param("ew") Wrapper<QiyebaomingEntity> wrapper);
	
	List<QiyebaomingView> selectListView(@Param("ew") Wrapper<QiyebaomingEntity> wrapper);

	List<QiyebaomingView> selectListView(Pagination page,@Param("ew") Wrapper<QiyebaomingEntity> wrapper);
	
	QiyebaomingView selectView(@Param("ew") Wrapper<QiyebaomingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QiyebaomingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QiyebaomingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QiyebaomingEntity> wrapper);
}
