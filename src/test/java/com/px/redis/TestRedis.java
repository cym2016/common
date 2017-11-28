package com.px.redis;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.heepay.common.util.Constants;
import com.heepay.enums.BankcardType;
import com.heepay.enums.CostType;
import com.heepay.enums.MerchantStatus;
import com.heepay.enums.ProductStatus;
import com.heepay.enums.ProductType;
import com.heepay.redis.JedisClusterUtil;
import com.heepay.vo.MerchantProductVO;
import com.heepay.vo.MerchantVO;
import com.heepay.vo.ProductFeeVO;
import com.heepay.vo.ProductVO;

public class TestRedis {
	
  public static void readJson2Map(String s) {
    String json = "{\"success\":true,\"A\":{\"address\": \"address2\",\"name\":\"haha2\",\"id\":2,\"email\":\"email2\"},"+
                "\"B\":{\"address\":\"address\",\"name\":\"haha\",\"id\":1,\"email\":\"email\"}}";
    try {
      ObjectMapper mapper = new ObjectMapper ();
        Map<String, Map<String, Object>> maps = mapper.readValue(s, Map.class);
       
        Set<String> key = maps.keySet();
        Iterator<String> iter = key.iterator();
        while (iter.hasNext()) {
            String field = iter.next();
            System.out.println(field + ":" + maps.get(field));
        }
    } catch (JsonParseException e) {
        e.printStackTrace();
    } catch (JsonMappingException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
  
  
	public static void main(String args[]) throws JsonProcessingException{
	  System.out.println("json:::::::::"+Constants.MerchantProductCode.merchantProductCodeMap.get("HY_CHARGE"));
	  
	  String merchantId =  "100013";//"100013" ;
	  //100317
	  //商户基本信息
	  MerchantVO merchantVo = new MerchantVO();
	  merchantVo.setMerchantId(merchantId);	  	  
	  merchantVo.setMerchantLoginName("测试");
	  merchantVo.setAntiPhishing(false);
	  merchantVo.setMerchantStatus(MerchantStatus.NORMAL.getValue());
	  merchantVo.setMerchantCompany("测试电子商务有限公司");
	  
	  ObjectMapper mapper = new ObjectMapper();  
    String json = mapper.writeValueAsString(merchantVo);
    JedisCluster jedisCluster=JedisClusterUtil.getJedisCluster();
    jedisCluster.del(Constants.RedisKey.MERCHANTVO_REDIS_KEY+merchantId);
    jedisCluster.set(Constants.RedisKey.MERCHANTVO_REDIS_KEY+merchantId, json);
    
    System.out.println("json:::::::::"+jedisCluster.get(Constants.RedisKey.MERCHANTVO_REDIS_KEY+"100399"));
    //产品基本信息
	  MerchantProductVO merchantProductVo1 = new MerchantProductVO();
	  merchantProductVo1.setProductCode(ProductType.QUICKPAYH5.getValue());
	  merchantProductVo1.setProductKey("112233");
	  merchantProductVo1.setMerchantId(merchantId);
	 
	  json = mapper.writeValueAsString(merchantProductVo1);
	  jedisCluster.del(Constants.RedisKey.MERCHANTPRODUCTVO_REDIS_KEY+merchantId+ProductType.QUICKPAYH5.getValue());
    jedisCluster.set(Constants.RedisKey.MERCHANTPRODUCTVO_REDIS_KEY+merchantId+ProductType.QUICKPAYH5.getValue(), json);
	  
    //产品基本信息
	  MerchantProductVO merchantProductVo2 = new MerchantProductVO();
    merchantProductVo2.setProductCode(ProductType.QUICKPAYPC.getValue());
    merchantProductVo2.setMerchantId(merchantId);
    merchantProductVo2.setProductKey("332211");
   
    json = mapper.writeValueAsString(merchantProductVo2);
    jedisCluster.del(Constants.RedisKey.MERCHANTPRODUCTVO_REDIS_KEY+merchantId+ProductType.QUICKPAYPC.getValue());
    jedisCluster.set(Constants.RedisKey.MERCHANTPRODUCTVO_REDIS_KEY+merchantId+ProductType.QUICKPAYPC.getValue(), json);
    
    //产品基本信息
    MerchantProductVO merchantProductVo3 = new MerchantProductVO();
    merchantProductVo3.setProductCode(ProductType.CHARGE.getValue());
    merchantProductVo3.setMerchantId(merchantId);
    merchantProductVo3.setProductKey("332211");
    
    json = mapper.writeValueAsString(merchantProductVo2);
    jedisCluster.del(Constants.RedisKey.MERCHANTPRODUCTVO_REDIS_KEY+merchantId+ProductType.CHARGE.getValue());
    jedisCluster.set(Constants.RedisKey.MERCHANTPRODUCTVO_REDIS_KEY+merchantId+ProductType.CHARGE.getValue(), json);
	
    //产品基本信息
    MerchantProductVO merchantProductVo4 = new MerchantProductVO();
    merchantProductVo4.setProductCode(ProductType.B2CEBANKPC.getValue());
    merchantProductVo4.setMerchantId(merchantId);
    merchantProductVo4.setProductKey("332211");
    
    json = mapper.writeValueAsString(merchantProductVo4);
    jedisCluster.del(Constants.RedisKey.MERCHANTPRODUCTVO_REDIS_KEY+merchantId+ProductType.B2CEBANKPC.getValue());
    jedisCluster.set(Constants.RedisKey.MERCHANTPRODUCTVO_REDIS_KEY+merchantId+ProductType.B2CEBANKPC.getValue(), json);
    
	  
	  
	  System.out.println("json:::::::::"+json);
	
	  //费率基本信息
	  ProductFeeVO  productFeeVO = new ProductFeeVO();
	  productFeeVO.setFeeRatio("10");
	  productFeeVO.setFeeType(CostType.COUNT.getValue());
	  productFeeVO.setMaxFee("10");
	  productFeeVO.setMinFee("20");
	  
	
    
    
	 // key=Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+productCode;
	  //       field=bankId+bankcardType或Constants.RedisKey.PRODUCT_FEE_NOBANK。
	  //商户绑定产品同时,当产品不需要按银行区分费率时
	  jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.QUICKPAYH5.getValue(),Constants.RedisKey.PRODUCT_FEE_NOBANK, mapper.writeValueAsString(productFeeVO));
	  jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.QUICKPAYPC.getValue(),Constants.RedisKey.PRODUCT_FEE_NOBANK, mapper.writeValueAsString(productFeeVO));
	  jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.CHARGE.getValue(),Constants.RedisKey.PRODUCT_FEE_NOBANK, mapper.writeValueAsString(productFeeVO));
	  //商户绑定产品同时指定一家银行的费率
	  jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.B2CEBANKPC.getValue(),"102"+BankcardType.SAVINGCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.B2CEBANKPC.getValue(),"102"+BankcardType.CREDITCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    //商户绑定产品同时指定一家银行的费率
    jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.B2CEBANKPC.getValue(),"103"+BankcardType.SAVINGCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.B2CEBANKPC.getValue(),"103"+BankcardType.CREDITCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    //商户绑定产品同时指定一家银行的费率
    jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.B2CEBANKPC.getValue(),"104"+BankcardType.SAVINGCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.B2CEBANKPC.getValue(),"104"+BankcardType.CREDITCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    //商户绑定产品同时指定一家银行的费率
    jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.B2CEBANKPC.getValue(),"105"+BankcardType.SAVINGCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.B2CEBANKPC.getValue(),"105"+BankcardType.CREDITCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    //商户绑定产品同时指定一家银行的费率
    jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.B2CEBANKPC.getValue(),"308"+BankcardType.SAVINGCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.B2CEBANKPC.getValue(),"308"+BankcardType.CREDITCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    //商户绑定产品同时指定一家银行的费率
    jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.QUICKPAYPC.getValue(),"308"+BankcardType.SAVINGCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.QUICKPAYPC.getValue(),"308"+BankcardType.CREDITCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    //商户绑定产品同时指定一家银行的费率
    jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.QUICKPAYPC.getValue(),"105"+BankcardType.SAVINGCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    jedisCluster.hset(Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+ProductType.QUICKPAYPC.getValue(),"105"+BankcardType.CREDITCARD.getValue(), mapper.writeValueAsString(productFeeVO));
    
    
    //产品基本信息
	  ProductVO productVO = new ProductVO();
	  productVO.setProductCode(ProductType.QUICKPAYH5.getValue());
	  productVO.setProductStatus(ProductStatus.NORMAL.getValue());
	  jedisCluster.del(Constants.RedisKey.PRODUCT_REDIS_KEY+ProductType.QUICKPAYH5.getValue());
	  jedisCluster.set(Constants.RedisKey.PRODUCT_REDIS_KEY+ProductType.QUICKPAYH5.getValue(),  mapper.writeValueAsString(productVO));
	  //产品基本信息
	  productVO = new ProductVO();
	  productVO.setProductCode(ProductType.QUICKPAYPC.getValue());
    productVO.setProductStatus(ProductStatus.NORMAL.getValue());
    jedisCluster.del(Constants.RedisKey.PRODUCT_REDIS_KEY+ProductType.QUICKPAYPC.getValue());
    jedisCluster.set(Constants.RedisKey.PRODUCT_REDIS_KEY+ProductType.QUICKPAYPC.getValue(),  mapper.writeValueAsString(productVO));
    //产品基本信息
    productVO = new ProductVO();
    productVO.setProductCode(ProductType.CHARGE.getValue());
    productVO.setProductStatus(ProductStatus.NORMAL.getValue());
    jedisCluster.del(Constants.RedisKey.PRODUCT_REDIS_KEY+ProductType.CHARGE.getValue());
    jedisCluster.set(Constants.RedisKey.PRODUCT_REDIS_KEY+ProductType.CHARGE.getValue(),  mapper.writeValueAsString(productVO));
    //产品基本信息
    productVO = new ProductVO();
    productVO.setProductCode(ProductType.BATCHPAY.getValue());
    productVO.setProductStatus(ProductStatus.NORMAL.getValue());
    jedisCluster.del(Constants.RedisKey.PRODUCT_REDIS_KEY+ProductType.BATCHPAY.getValue());
    jedisCluster.set(Constants.RedisKey.PRODUCT_REDIS_KEY+ProductType.BATCHPAY.getValue(),  mapper.writeValueAsString(productVO));
    
    //产品基本信息
    productVO = new ProductVO();
    productVO.setProductCode(ProductType.B2CEBANKPC.getValue());
    productVO.setProductStatus(ProductStatus.NORMAL.getValue());
    jedisCluster.del(Constants.RedisKey.PRODUCT_REDIS_KEY+ProductType.B2CEBANKPC.getValue());
    jedisCluster.set(Constants.RedisKey.PRODUCT_REDIS_KEY+ProductType.B2CEBANKPC.getValue(),  mapper.writeValueAsString(productVO));
    
    //产品基本信息
    productVO = new ProductVO();
    productVO.setProductCode(ProductType.WITHDRAW.getValue());
    productVO.setProductStatus(ProductStatus.NORMAL.getValue());
    jedisCluster.del(Constants.RedisKey.PRODUCT_REDIS_KEY+ProductType.WITHDRAW.getValue());
    jedisCluster.set(Constants.RedisKey.PRODUCT_REDIS_KEY+ProductType.WITHDRAW.getValue(),  mapper.writeValueAsString(productVO));
	  
	  

	  System.out.println("jsonMapper:::::::::"+json);
	  json= jedisCluster.get("123");
	  //merchantVo=jsonMapper.fromJson(json, MerchantVO.class);
	 // map = merchantVo.getMerchantProductMap();
	  System.out.println("merchantVo:::::::::"+merchantVo.getMerchantId());

	  
	
	}
	
	private void testSetString(Jedis redis){
		redis.append("hello", "12345");
		//redis.close();
	}
	private void testGetString(Jedis redis){
		System.out.println(redis.get("hello"));
		//redis.close();
	}
	private void testSet(){
		
	}
	private void testSetList(Jedis redis){
		Long r=redis.lpush("omorderinfo_14066", "{\"amount\":700,\"begintime\":1442834838849,\"hotelid\":1012241,\"src\":\"IRS\",\"type\":\"HONGBAO\",\"billid\":\"127678358\"}");
		System.out.println("testSetList re:"+r);
	}
	private void testGetList(Jedis redis){
		//String r=redis.lindex("omorderinfo_14066", 1);
		String s=redis.lpop("omorderinfo_14066");
		System.out.println("testSetList s:"+s);
		long r=redis.llen("omorderinfo_14066");
		System.out.println("testSetList re:"+r);
	}
	private void testHash(){
		
	}
}
