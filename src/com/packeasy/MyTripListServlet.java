package com.packeasy;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class MyTripListServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try
        {
            System.out.println("In the MyTripList Servlet");
            MyTripListBean list = new MyTripListBean();
            list.setUid(request.getParameter("uid"));
            list = MyTripListDAO.getList(list);
            if(list.isValid())
            {
                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser",list);
                response.sendRedirect("home.html");
            }else
//                response.sendRedirect("login_failed.html");
            	System.out.println("Response Failed");
        } catch (Throwable exc)
        {
            System.out.println(exc);
        }
	}
	protected void doPost(){
	}

}
