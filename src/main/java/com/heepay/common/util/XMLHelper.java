package com.heepay.common.util;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;

public class XMLHelper {
    /**
     * 将Sting转成Document
     * @param recMsg
     * @return
     * @throws DocumentException
     */
    public static Document readXML(String recMsg) throws DocumentException {
        Document document = DocumentHelper.parseText(recMsg);
        return document;
    }
    /**
     * 样式
     * <attribute name="name">value</attribute>
     * @param name
     * @param node
     * @return 返回XML单个节点值
     */
    public static String getElementValue(String name, Node node) {
        String elementValue = "";
        Node singleNode = null;
        if (node != null) {
            singleNode = node.selectSingleNode("attribute[@name='" + name + "']");
        }
        if (singleNode != null) {
            elementValue = singleNode.getText();
        }
        return elementValue;
    }
    /**
     * 样式
     * <FILE_HEAD>
     *   <BANK_NO>601</BANK_NO>
     *  <AC_NO>0012100775313</AC_NO>
     *  <HB_DATE>20140724</HB_DATE>
     *  <TOTAL_COUNT>1</TOTAL_COUNT>
     *  <TOTAL_AMT>178191.48</TOTAL_AMT>
     *  <DZJK_NO>DZJK6012014072301</DZJK_NO>
     * </FILE_HEAD>
     * 传入 fileHeadElement,BANK_NO
     * 返回601
     * @param parentElement
     * @param subElementName
     * @return 
     */
    public static String  getElementValue(Element parentElement,String subElementName){
        Element subElement = parentElement.element(subElementName);
        if(subElement==null){
            return "";
        }
        String elementValue=subElement.getText();
        if(elementValue==null){
            elementValue="";
        }
        return elementValue.trim();
    }
    /**
     * 判断元素是否为空元素
     * @param parentElement
     * @param childElementName
     * @return 
     */
    public static boolean isElementEmpty(Element parentElement,String childElementName){
        Element element = parentElement.element(childElementName);
 /*       if(element==null){
            return true;
        }*/
 /*       List<?> elements = element.elements();
        *//**
         * 如果没有子元素 则证明为空元素返回true
         *//*
        return elements==null || elements.isEmpty();*/
        
        return element==null;
    }
    
    /**
     * 样式
     * <attribute name="name" value="">value</attribute>
     * @param name
     * @param node
     * @return 返回XML单个节点值
     */
    public static String getAttributeValue(String name, Node node) {
        String elementValue = "";
        Node singleNode = null;
        if (node != null) {
            singleNode = node.selectSingleNode("attribute[@name='" + name + "']");
        }
        if (singleNode != null) {
            Element element=(Element)singleNode;
            elementValue = element.attributeValue("value");
        }
        return elementValue.trim();
    }
}

