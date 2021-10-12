package servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = "/login.jsp"; //default
		String message = "";
		
		String initUserName = getServletContext().getInitParameter("userName");
		String initPassword =  getServletContext().getInitParameter("password");
		
		String action = request.getParameter("action");
		
		if (action == null) {
			action = "signin";
		}
		
		if (action.equals("signin")) {

			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			
			request.getSession(true).invalidate();
			// make sure that email is valid
			String regexMail = "^[A-Z0-9_a-z]+@[A-Z0-9\\.a-z]+\\.[A-Za-z]{2,6}$";
			String regex = "[a-zA-Z0-9_!@#$%^&*]+";
			User user = new User(userName, password);
			
			HttpSession session = request.getSession(true);
			if (!password.matches(regex) || !userName.matches(regexMail)) {
				message = "invalid syntax";
				url = "/login.jsp";
			} else {
				if (userName != null && password.equals(initPassword) && userName.equalsIgnoreCase(initUserName)) {
					url = "/dashboard.jsp";
				} else if(userName == null || password == null) {
					url = "/login.jsp";
					message = "Please input user or password";
				} else {
					url = "/login.jsp";
					message = "Wrong User Name or Password";
				}
			}
			
			session.setAttribute("user", user);
			session.setAttribute("message", message);
		}
		
		getServletContext()
			.getRequestDispatcher(url)
			.forward(request, response);
		
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) {
		
		response.setContentType("text/html;charset=UTF-8");
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			request.getSession(true).invalidate();
			// make sure that email is valid
			String regexMail = "/^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$/";
			String regex = "[a-zA-Z0-9_!@#$%^&*]+";
			// collect data from a login form
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			User user = new User();
			user.setName(userName);
			user.setPassword(password);
			
			HttpSession session = request.getSession(true);
			if (!password.matches(regex) || !userName.matches(regexMail)) {
				session.setAttribute("error", "invalud syntax");
				response.sendRedirect("/login.jsp");
			}
			// read information of account in web.xml
			String uid = getServletContext().getInitParameter("userName");
			String pwd = getServletContext().getInitParameter("password");
			// check account
			if (user != null && acc.getPwd().);
			
			
		} catch(NullPointerException e) {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		} catch(Exception ex) {
			response.getWriter().println(ex);
		}
		
	}

}
