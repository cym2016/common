package com.heepay.common.util;


import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;



/**
 * @description web写回前台工具
 * @author tianyanqing
 * @date 2016-8-29 
 * @version 1.0
 */
public class WebUtil {

    
   private static final String ContentType_JSON = "application/json";
   private static final String ContentType_XML = "text/xml";
   private static final String ContentType_PLAINTEXT = "text/plain";
   private static final String ContentType_HTML = "text/html;charset=UTF-8";
	
    /**
     * 输出xml
     * @param content
     * @param response
     */
    public static void outputXml(String content, HttpServletResponse response) {
        response.setContentType(ContentType_XML);
        output(content, response);
    }
    
    public static void outputHtml(Object content, HttpServletResponse response) {
      JsonMapperUtil jsonMapperUtil= new JsonMapperUtil();
      outputJson(jsonMapperUtil.toJson(content), response);
    }
    
    public static void outputHTML(String content, HttpServletResponse response) {
        response.setContentType(ContentType_HTML);
        putHtml(content, response);
    }
    public static void outputJSONByWriter(String content, HttpServletResponse response) {
        response.setContentType(ContentType_JSON);
        putHtml(content, response);
    }
    
    public static void putHtml(String content, HttpServletResponse response) {
        PrintWriter out = null;
        try {
            response.setCharacterEncoding("UTF-8");
            out = response.getWriter();

            out.write( content); 
            out.flush();
        } catch (IOException ex) {
        	LogManager.getLogger(WebUtil.class.getName()).log(Level.ERROR,  ex.getMessage());

        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
    
    
    /**
     * 输出json 参数为字符串
     * @param content
     * @param response
     */
    public static void outputJson(String content, HttpServletResponse response) {
        response.setContentType(ContentType_JSON);
        output(content, response);
    }
    
    /**
     * 输出json 参数为object
     * @param content
     * @param response
     */
    public static void outputJson(Object content, HttpServletResponse response) {
        JsonMapperUtil jsonMapperUtil= new JsonMapperUtil();
        outputJson(jsonMapperUtil.toJson(content), response);
    }

    private static void output(String content, HttpServletResponse response) {
        OutputStream out = null;
        try {
            response.setCharacterEncoding("UTF-8");
            out = response.getOutputStream();

            response.setContentLength(content.getBytes("UTF-8").length);
            out.write(content.getBytes("UTF-8")); 
            out.flush();
        } catch (IOException ex) {
        	LogManager.getLogger(WebUtil.class.getName()).log(Level.ERROR,  ex.getMessage());
           
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException ignore) {
            }
        }
    }
    public static void output(String content, HttpServletResponse response, String contentType) {
        if (contentType.equals(ContentType_JSON)) {
            outputJson(content, response);
        } else if (contentType.equals(ContentType_XML)) {
            outputXml(content, response);
        } else {
            response.setContentType(contentType);
            output(content, response);
        }
    }

    public static void outputPlainText(String content, HttpServletResponse response) {
        response.setContentType(ContentType_PLAINTEXT);
        output(content, response);
    }
    
    /**
     * 从session中取值
     * @param request
     * @param name
     * @return
     */
    public static Object getSessionAttribute(HttpServletRequest request, String name) {  
        if(request!=null){
             HttpSession session = request.getSession(false); //fase的意思是如果没有session则不自动创建
             return (session != null ? session.getAttribute(name) : null);  
        }else{
            return null;
        }
       
    }  
    
}
