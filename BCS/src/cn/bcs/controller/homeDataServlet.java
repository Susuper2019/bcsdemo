package cn.bcs.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.bcs.bean.HomeData;
import cn.bcs.dao.HomeDataDao;

/**
 * Servlet implementation class homeDataServlet
 */
@WebServlet("/homeDataServlet")
public class homeDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    HomeDataDao homeDataDao = new HomeDataDao();

    @Test
    public void testrun() {
    	try {
    		List<HomeData> homeDatas = homeDataDao.findProduct();
    		System.out.println(homeDatas);
    		JSON json = (JSON) JSON.toJSON(homeDatas);
        	System.out.println(json.toJSONString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<HomeData> homeDataList = null;
		try {
			homeDataList = homeDataDao.findProduct();
			JSON json = (JSON) JSON.toJSON(homeDataList);
        	System.out.println(json);
        	
        	
        	response.setCharacterEncoding("utf-8");
    		response.setContentType("application/json; charset=utf-8");//返回的格式必须设置为application/json
    		response.getWriter().write(json.toJSONString());//写入到返回结果中
    		//完成，执行到这里就会返回数据给前端，前端结果为success，调用success里面的内容
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
