package cn.bcs.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.bcs.bean.HomeData;
import cn.bcs.bean.ImgData;
import cn.bcs.utils.DataSourceUtils;

public class HomeDataDao {
	//查询主页所有
	public List<HomeData> findProduct() throws SQLException{
		String sql = "select * from mainhome";
		QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
		return queryRunner.query(sql, new BeanListHandler<HomeData>(HomeData.class));
	}
	
	//查询图片详细细节所有
	public List<ImgData> findImgDetail(int id) throws SQLException{
		String sql = "select * from imgdata where id="+id;
		QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
		return queryRunner.query(sql, new BeanListHandler<ImgData>(ImgData.class));
	}
	
//	public static void main(String[] args) {
//		try {
//			System.out.println(new HomeDataDao().findProduct());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
