package kz.edu.iitu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {

    private ServletContext context;

    public void init(FilterConfig fConfig) throws ServletException {
        this.context = fConfig.getServletContext();
        this.context.log("AuthenticationFilter initialized");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String uri = req.getRequestURI();
        this.context.log("Requested Resource::"+uri);
//        System.out.println("Requested Resource::" + uri);

        HttpSession session = req.getSession(false);

//        if(session == null){
//            System.out.println("NULL:LL");
//        }else{
//            System.out.println("NOT NULL");
//        }
        if(session == null && !(uri.endsWith("jsp") || uri.endsWith("LoginServlet"))){
            this.context.log("Unauthorized access request");
//            System.out.println("Unauthorized access request");
            res.sendRedirect("login.jsp");
        }else{
            chain.doFilter(request, response);
        }
    }

    public void destroy() {
    }

}
