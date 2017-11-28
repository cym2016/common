package com.heepay.common.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class HttpClientUtils {

	private static final Logger logger = LogManager.getLogger();
  /**
   * 发送xml数据请求到server端
   * 
   * @param url
   *          xml请求数据地址
   * @param xmlString
   *          发送的xml数据流
   * @return null发送失败，否则返回响应内容
   */
  public static String postWeChatXml(String url, String xmlString) {
    // 关闭
    System.setProperty("org.apache.commons.logging.Log",
        "org.apache.commons.logging.impl.SimpleLog");
    System.setProperty("org.apache.commons.logging.simplelog.showdatetime",
        "true");
    System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.commons.httpclient",
            "stdout");

    // 创建httpclient工具对象
    HttpClient client = new HttpClient();
    // 创建post请求方法
    PostMethod myPost = new PostMethod(url);
    // 设置请求超时时间
    client.setConnectionTimeout(300 * 1000);
    String responseString = null;
    try {
      // 设置请求头部类型
      myPost.setRequestHeader("Content-Type", "text/xml");
      myPost.setRequestHeader("charset", "utf-8");
     
      // 设置请求体，即xml文本内容，注：这里写了两种方式，一种是直接获取xml内容字符串，一种是读取xml文件以流的形式
      myPost.setRequestBody(xmlString);

      // InputStream body=this.getClass().getResourceAsStream("/"+xmlFileName);
      // myPost.setRequestBody(body);
      myPost.setRequestEntity(new StringRequestEntity(xmlString, "text/xml",
          "utf-8"));
      int statusCode = client.executeMethod(myPost);
      if (statusCode == HttpStatus.SC_OK) {
        BufferedInputStream bis = new BufferedInputStream(
            myPost.getResponseBodyAsStream());
        byte[] bytes = new byte[1024];
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int count = 0;
        while ((count = bis.read(bytes)) != -1) {
          bos.write(bytes, 0, count);
        }
        byte[] strByte = bos.toByteArray();
        responseString = new String(strByte, 0, strByte.length, "utf-8");
        bos.close();
        bis.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    myPost.releaseConnection();
    return responseString;
  }
  
	/**
	 * 短信发送验证码 通过GET方式发起http请求
	 *
	 * @author W.X  
	 * @date 2016年1月29日 下午4:08:09 
	 * @return void
	 * @throws
	 */
	public static int requestByGetMethod(String url) {
		
		// 创建默认的httpClient实例
		CloseableHttpClient httpClient = getHttpClient();
		try {
			// 用get方法发送http请求
			HttpGet get = new HttpGet(url);
			logger.info("执行get请求:....{}" ,get.getURI());
			CloseableHttpResponse httpResponse = null;
			// 发送get请求
			httpResponse = httpClient.execute(get);
			try {
				// response实体
				HttpEntity entity = httpResponse.getEntity();
				
				if (null != entity) {					
					return  Constants.Http.RESULT_SUCCESS;
				}
			} finally {
				httpResponse.close();
			}
			
		} catch (Exception e) {
			logger.error("执行get请求 异常:....{}" ,e.getMessage());
			return  Constants.Http.RESULT_ERROR;
		} finally {
			try {
				closeHttpClient(httpClient);
			} catch (IOException e) {
				logger.error("执行get请求 异常:....{}" ,e.getMessage());
				e.printStackTrace();
			}
		}		
		return  Constants.Http.RESULT_ERROR;

	}
	
	
	
	

	/**
	 * POST方式发起http请求
	 *
	 * @author zhenghua.yang  
	 * @date 2016年1月29日 下午4:08:19 
	 * @return void
	 * @throws
	 */
	public static void requestByPostMethod(String url) {
		requestByPostMethod(url, null);
	}

	/**
	 * POST方式发起http请求
	 *
	 * @author zhenghua.yang  
	 * @date 2016年1月29日 下午4:08:19 
	 * @return void
	 * @throws
	 */
	public static int requestByPostMethod(String url, Map<String, String> paramMap) {
		CloseableHttpClient httpClient = getHttpClient();
		int result = Constants.Http.RESULT_SUCCESS;
		try {
			HttpPost post = new HttpPost(url);

			// url格式编码
			UrlEncodedFormEntity uefEntity = null;

			// 创建参数列表
			List<NameValuePair> list = new ArrayList<NameValuePair>();

			if (null != paramMap) {
				for (Map.Entry<String, String> entity : paramMap.entrySet()) {
					list.add(new BasicNameValuePair(entity.getKey(), entity.getValue()));
				}
				uefEntity = new UrlEncodedFormEntity(list, "UTF-8");
				post.setEntity(uefEntity);
			}

			System.out.println("POST 请求...." + post.getURI());

			// 执行请求
			CloseableHttpResponse httpResponse = httpClient.execute(post);
			StatusLine statusLine = httpResponse.getStatusLine();
			System.out.println(statusLine);

			try {
				HttpEntity entity = httpResponse.getEntity();
				if (entity != null) {
					System.out.println("--------------------------------------");
					System.out.println("Response content: " + EntityUtils.toString(entity, "UTF-8"));
					System.out.println("--------------------------------------");
				}
			} finally {
				httpResponse.close();
			}
			
			result = Constants.Http.RESULT_SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			result = Constants.Http.RESULT_ERROR;
		} finally {
			try {
				closeHttpClient(httpClient);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	
	/**
	 * 
	* @description POST方式发起http请求   编码格式GB2312
	* @author 王亚洪       
	* @created 2016年12月27日 上午11:46:10     
	* @param url
	* @param paramMap
	* @return
	 */
	 public static int requestByPostMethodForWeiXin(String url, Map<String, String> paramMap) {
	    CloseableHttpClient httpClient = getHttpClient();
	    int result = Constants.Http.RESULT_SUCCESS;
	    try {
	      HttpPost post = new HttpPost(url);

	      // url格式编码
	      UrlEncodedFormEntity uefEntity = null;

	      // 创建参数列表
	      List<NameValuePair> list = new ArrayList<NameValuePair>();

	      if (null != paramMap) {
	        for (Map.Entry<String, String> entity : paramMap.entrySet()) {
	          list.add(new BasicNameValuePair(entity.getKey(), entity.getValue()));
	        }
	        uefEntity = new UrlEncodedFormEntity(list, "GB2312");
	        post.setEntity(uefEntity);
	      }

	      System.out.println("POST 请求...." + post.getURI());

	      // 执行请求
	      CloseableHttpResponse httpResponse = httpClient.execute(post);
	      StatusLine statusLine = httpResponse.getStatusLine();
	      System.out.println(statusLine);

	      try {
	        HttpEntity entity = httpResponse.getEntity();
	        if (entity != null) {
	          System.out.println("--------------------------------------");
	          System.out.println("Response content: " + EntityUtils.toString(entity, "UTF-8"));
	          System.out.println("--------------------------------------");
	        }
	      } finally {
	        httpResponse.close();
	      }
	      
	      result = Constants.Http.RESULT_SUCCESS;
	    } catch (Exception e) {
	      e.printStackTrace();
	      result = Constants.Http.RESULT_ERROR;
	    } finally {
	      try {
	        closeHttpClient(httpClient);
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	    }
	    
	    return result;
	  }
	
	 
	/**
	 * POST方式发起http请求,返回调用结果
	 *
	 * @author zc
	 * @date 2016年7月7日 下午4:08:19 
	 * @return void
	 * @throws
	 */
	public static String requestByPostMethodReturnBody(String url, Map<String, String> paramMap) {
		CloseableHttpClient httpClient = getHttpClient();
		String result = Constants.Http.RESULT_ERROR_STR ;
		try {
			HttpPost post = new HttpPost(url);
			// url格式编码
			UrlEncodedFormEntity uefEntity = null;

			// 创建参数列表
			List<NameValuePair> list = new ArrayList<NameValuePair>();
			String param = "?";

			if (null != paramMap) {
				for (Map.Entry<String, String> entity : paramMap.entrySet()) {
					list.add(new BasicNameValuePair(entity.getKey(), entity.getValue()));
					param = param + entity.getKey() + "=" + entity.getValue() + "&";
				}
				uefEntity = new UrlEncodedFormEntity(list, "UTF-8");
				post.setEntity(uefEntity);
			}

			System.out.println("POST 请求...." + post.getURI() + param);

			// 执行请求			
			CloseableHttpResponse httpResponse = httpClient.execute(post);
			StatusLine statusLine = httpResponse.getStatusLine();
			System.out.println(statusLine);

			try {
				HttpEntity entity = httpResponse.getEntity();
				if (entity != null) {					
					//System.out.println("Response content: " + EntityUtils.toString(entity, "UTF-8"));
					result = EntityUtils.toString(entity, "UTF-8");
				}
			} finally {
				httpResponse.close();
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
			result = Constants.Http.RESULT_ERROR_STR;
		} finally {
			try {
				closeHttpClient(httpClient);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	private static CloseableHttpClient getHttpClient() {
		return HttpClients.createDefault();
	}

	private static void closeHttpClient(CloseableHttpClient client) throws IOException {
		if (client != null) {
			client.close();
		}
	}

	/**
	 * 通过GET方式发起http请求
	 * @param url
	 * @return
	 */
	public static String httpGet(String url) {
		// 创建默认的httpClient实例
		CloseableHttpClient httpClient = getHttpClient();
		try {
			// 用get方法发送http请求
			HttpGet get = new HttpGet(url);
			System.out.println("执行get请求:...." + get.getURI());
			CloseableHttpResponse httpResponse = null;
			// 发送get请求
			httpResponse = httpClient.execute(get);
			try {
				// response实体
				HttpEntity entity = httpResponse.getEntity();
				if (null != entity) {
					String result = EntityUtils.toString(entity);
					System.out.println("响应状态码:" + httpResponse.getStatusLine());
					System.out.println("-------------------------------------------------");
					System.out.println("响应内容:" + result);
					System.out.println("-------------------------------------------------");
					return result;
				}
			} finally {
				httpResponse.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeHttpClient(httpClient);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return null;
	}
}
