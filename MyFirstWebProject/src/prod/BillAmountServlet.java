package prod;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BillAmountServlet
 */
public class BillAmountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillAmountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String item[]= request.getParameterValues("product");
		int billAmount=0;
		if(item==null)
		{
			response.getWriter().println("No items Selected");
			
		}
		else
		{
		for(String i:item)
		{
			response.getWriter().println("Youve selected "+i);
			response.getWriter().println("\n");
				billAmount++;
		}
		}
		int totalAmount;
		totalAmount=billAmount*10;
		HttpSession session= request.getSession();
     session.setAttribute("bill",totalAmount);
     response.getWriter().println("<a href='SummaryServlet'>Checkout</a>");
	}

}
