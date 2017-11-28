package com.heepay.common.util;
import org.apache.commons.lang.StringUtils;
import com.heepay.redis.JedisClusterUtil;
import redis.clients.jedis.JedisCluster;


/**
 * 银行卡bin管理工具类
 *
 */

public class BankCarBinUtil {

    private BankCarBinUtil(){

    }
    /**
     * 根据银行卡号返回对应的银行类型和名称json
      * @param cardNo 银行卡号
     * @return
     */
 public static String getNameOfBank(String cardNo) {
    
    if(cardNo==null || cardNo.length()<16 || cardNo.length()>19){
      return null; 
    }
    
    //6位Bin号
    String cardNoSix=cardNo.substring(0,6);
    String binSix=intercept("bankCardBinCatch6",cardNoSix);
    if(StringUtils.isNotBlank(binSix)){
      return binSix;
    }
    
    //5位Bin号
    String cardNoFive=cardNo.substring(0,5);
    String binFive=intercept("bankCardBinCatch5",cardNoFive);
    if(StringUtils.isNotBlank(binFive)){
      return binFive;
    }
    
    //8位Bin号
    String cardNoEight=cardNo.substring(0,8);
    String binEight=intercept("bankCardBinCatch8",cardNoEight);
    if(StringUtils.isNotBlank(binEight)){
      return binEight;
    }
    
    //7位的bin号
    String cardNoSeven=cardNo.substring(0,7);
    String binSeven=intercept("bankCardBinCatch7",cardNoSeven);
    if(StringUtils.isNotBlank(binSeven)){
      return binSeven;
    }
    return null;
    
  }
  
  
  private static String intercept(String cardBinNo, String bankcardNote) {
      JedisCluster jedisCluster = JedisClusterUtil.getJedisCluster();
      Object obj =  jedisCluster.hget(cardBinNo, bankcardNote);
      if (obj != null) {
          return obj.toString();
      }
      return null;
  }
}


