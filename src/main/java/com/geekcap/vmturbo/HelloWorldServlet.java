package com.geekcap.vmturbo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet 
{
  public void service( HttpServletRequest req, HttpServletResponse res ) throws IOException {
    PrintWriter out = res.getWriter();
    out.println( "Ralph: First, address the ball" );
    out.println( "Norton: Hello, Ball!" );
    out.close();
  }
}
