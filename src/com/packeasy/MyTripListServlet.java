package com.packeasy;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyTripListServlet
 */
@WebServlet("/MyTripListServlet")
public class MyTripListServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public MyTripListServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hi!get MyTripListServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
        {
			RequestDispatcher rd = request.getRequestDispatcher("edit_trip.jsp");
            rd.forward(request,response);
            //
    		String strUid = request.getParameter("uid");
    		System.out.println(strUid);
			ArrayList<MyTripListBean> list = MyTripListDAO.getList(strUid);
			PrintWriter pw = response.getWriter();
			for(MyTripListBean tmp : list){
				pw.println("<tr onmouseover=\"ChangeColor(this, true);");
				pw.println("onmouseout=\"ChangeColor(this, false);");
				pw.println("onclick=\"DoNav('create_trip.html');\">");
				System.out.println("WTF3");
				pw.println("<td><%="+tmp.getStartDate()+" %></td>");
				pw.println("<td><%="+tmp.getTripLocation()+" %></td>");
				pw.println("<td><%="+tmp.getNumPackList()+" %></td>");
				pw.println("</tr>");
			}
			pw.close();
        } catch (Throwable exc)
        {
            System.out.println(exc);
        }
	}
}
