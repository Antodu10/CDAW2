package imt.nordeurope.j2ee.tp.piat;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import imt.nordeurope.douai.j2ee.tp.piat.beans.OlympicBean.OlympicBean;

/**
 * Servlet implementation class JSPOlympicServlet
 */
@WebServlet(name = "JSPOlympic", urlPatterns = "/JSPOlympic")
public class JSPOlympicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSPOlympicServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		OlympicBean olympicBean = new OlympicBean();
		request.setAttribute("olympicBean", olympicBean);
		RequestDispatcher dispatcher =request.getServletContext().getRequestDispatcher("/Olympic.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		OlympicBean olympicBean = new OlympicBean();
		request.setAttribute("olympicBean", olympicBean);
		RequestDispatcher dispatcher =request.getServletContext().getRequestDispatcher("/Olympic.jsp");
		dispatcher.forward(request, response);

	}

}
