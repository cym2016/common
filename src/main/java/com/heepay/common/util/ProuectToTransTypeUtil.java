package com.heepay.common.util;

import com.heepay.enums.BalanceDirection;
import com.heepay.enums.ProductType;
import com.heepay.enums.TransType;

/**
 * 描    述：
 *
 * 创 建 者： 张俊新
 * 创建时间： 2016年8月19日 下午3:30:28
 * 创建描述：2016/9/26 14:46
 *
 * 修 改 者：
 * 修改时间：
 * 修改描述：
 *
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 */
public class ProuectToTransTypeUtil {

    /**
     *
     * @param productCode
     * @return
     */
    public static String getTransTypeByProductCode(String productCode){
        if(ProductType.QUICKPAYAPI.getValue().equals(productCode)
                || ProductType.QUICKPAYH5.getValue().equals(productCode)
                || ProductType.QUICKPAYPC.getValue().equals(productCode)
                || ProductType.QUICKPAYH5.getValue().equals(productCode)
                || ProductType.QUICKPAYSDK.getValue().equals(productCode)
                || ProductType.B2CEBANKAPI.getValue().equals(productCode)
                || ProductType.B2CEBANKH5.getValue().equals(productCode)
                || ProductType.B2CEBANKPC.getValue().equals(productCode)
                || ProductType.B2CEBANKSDK.getValue().equals(productCode)){
            return TransType.PAY.getValue();
        }
        if(ProductType.INNERTRANSFER.getValue().equals(productCode)){
            return TransType.TRANSFER.getValue();
        }
        if(ProductType.CHARGE.getValue().equals(productCode)){
            return TransType.CHARGE.getValue();
        }
        if(ProductType.BATCHPAY.getValue().equals(productCode)){
            return TransType.BATCHPAY.getValue();
        }
        if(ProductType.BATCHCOLLECTION.getValue().equals(productCode)){
            return TransType.BATCHCOLLECTION.getValue();
        }
        if(ProductType.REFUND.getValue().equals(productCode)){
            return TransType.REFUND.getValue();
        }
        if(ProductType.WITHDRAW.getValue().equals(productCode)){
            return TransType.WITHDRAW.getValue();
        }
        return null;
    }


    /**
     *
     * @param transType
     * @return
     */
    public static String getBanlanceDirectionTypeByTransType(String transType){
        if(TransType.CHARGE.getValue().equals(transType)
                || TransType.REFUND.getValue().equals(transType)
                || TransType.PAY.getValue().equals(transType)
                || TransType.BATCHCOLLECTION.getValue().equals(transType)){
            return BalanceDirection.CREBIT.getValue();
        }
        return BalanceDirection.DEBIT.getValue();
    }


}
