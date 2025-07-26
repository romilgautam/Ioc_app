package in.ashokit.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class RequestLogInterceptor implements HandlerInterceptor {

	
	  @Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		  System.out.println("Pre- Handle Method is called...");
		  return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	  
	  @Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		  System.out.println("Post- Handle Method is called...");
		  
		  HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
}
