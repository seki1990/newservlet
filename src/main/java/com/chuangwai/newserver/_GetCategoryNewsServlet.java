package com.chuangwai.newserver;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSON;


public class _GetCategoryNewsServlet extends HttpServlet {
	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setCharacterEncoding("utf-8");

        Mysql mysql = new Mysql("jdbc:mysql://localhost/chuangwai?useUnicode=true&characterEncoding=utf8","root","chuangwai123");
		ResultSet ret ;
		ret = mysql.query("select distinct category from news;");
	    try {
	    	ArrayList<String> ans = new ArrayList<String>() ;
	    	while( ret.next() )
	    	{
	    		ans.add( ret.getString(1) );
	    	}
            response.getWriter().println(JSON.toJSONString(ans));
        }catch (Exception e){ 
            e.printStackTrace();
        }   
    } 
	
	

}
