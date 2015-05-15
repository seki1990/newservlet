package com.chuangwai.newserver;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class _GetNewServlet extends HttpServlet {
	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setCharacterEncoding("utf-8");
        String a = request.getParameter("a");
        String b = request.getParameter("b");
        try {
            int aa = Integer.parseInt(a);
            int bb = Integer.parseInt(b);
            System.out.println("a: "+a + " b:"+b);
            //response.getWriter().write(aa + bb);
            response.getWriter().println((aa+bb));
        }catch (Exception e){ 
            e.printStackTrace();
        }   
    } 

}
