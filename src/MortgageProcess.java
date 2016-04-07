

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MortgageProcess
 */
@WebServlet("/MortgageProcess")
public class MortgageProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MortgageProcess() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		MortgageCalculator mc = new MortgageCalculator();
		MortgageFormat mf = new MortgageFormat();
		HttpSession session = request.getSession();
		
		double _principal = Double.parseDouble(request.getParameter("principal"));
		double _rate = Double.parseDouble(request.getParameter("rate"));
		int _term = Integer.parseInt(request.getParameter("term"));
		
		double _amount = mc.CalculateAmount(_principal, _rate, _term);
		
		String message = "Your monthly mortgage amount is " + mf.FormatTheAmount(_amount);
		
		session.setAttribute("principal", request.getParameter("principal"));
		session.setAttribute("rate", request.getParameter("rate"));
		session.setAttribute("term", request.getParameter("term"));

		request.setAttribute("message", message);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
