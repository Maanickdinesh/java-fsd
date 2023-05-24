

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter {

	public void destroy() {
		
	}
	
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain ) throws IOException,ServletException
	{
		//method
		String name=req.getParameter("username");
		if(name!=null)
			chain.doFilter(req, res);
		else
			
			res.getWriter().print("<h1>User is not Valid</h1>");
		
	}
	
	public void init (FilterConfig fConfig) throws  ServletException
	{
		
	}

	 

}
