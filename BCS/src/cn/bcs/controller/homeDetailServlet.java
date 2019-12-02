package cn.bcs.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import cn.bcs.bean.HomeData;
import cn.bcs.bean.ImgData;
import cn.bcs.dao.HomeDataDao;

/**
 * Servlet implementation class homeDetailServlet
 */
@WebServlet("/homeDetailServlet")
public class homeDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    HomeDataDao homeDataDao =new HomeDataDao();
    
// frameset
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		List<ImgData> imgDatas = null;
		List<HomeData> homeDatas = null;
		try {
			imgDatas = homeDataDao.findImgDetail(id);
			homeDatas = homeDataDao.findProduct();
			for(HomeData homedata:homeDatas) {
				if(id==homedata.getId()) {
					homedata.setImgDatas(imgDatas);
					break;
				}
			}
			
			
			JSON json = (JSON) JSON.toJSON(homeDatas);
			
			System.out.println(json);
			response.setCharacterEncoding("utf-8");
			//返回的格式必须设置为application/json   这里改为了text
			response.setContentType("application/json; charset=utf-8");//返回的格式必须设置为application/json
			response.getWriter().write(json.toString());//写入到返回结果中
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
