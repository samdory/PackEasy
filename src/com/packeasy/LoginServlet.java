package com.packeasy;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hi!get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try
        {
            LoginBean user = new LoginBean();
            String strUid = request.getParameter("uid");
            user.setUserName(strUid);
            user.setPassword(request.getParameter("password"));
            user = LoginDAO.login(user);
            //
            if(user.isValid())
            {
                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser",user);
                session.setAttribute("name",user.getRealName());
                session.setAttribute("uid",strUid);
                session.setAttribute("loggedIn", "yes");
         
                request.setAttribute("uid", strUid);
                RequestDispatcher rd = request.getRequestDispatcher("mytrip_list.jsp");
                rd.forward(request,response);
            }else
                response.sendRedirect("login_failed.html");
        } catch (Throwable exc)
        {
            System.out.println(exc);
        }
	}
}
