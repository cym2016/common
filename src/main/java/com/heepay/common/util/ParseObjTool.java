package com.heepay.common.util;


public class ParseObjTool
{
  public static boolean toBool(Object obj)
  {
    try
    {
      return Boolean.getBoolean(obj.toString());
    } catch (Exception e) {
    }
    return false;
  }

  public static long toLong(Object obj)
  {
    try
    {
      return Long.parseLong(obj.toString());
    } catch (Exception e) {
    }
    return 0L;
  }

  public static double toDouble(Object obj)
  {
    try
    {
      return Double.parseDouble(obj.toString());
    } catch (Exception e) {
    }
    return 0.0D;
  }

  public static int toInt(Object obj)
  {
    try
    {
      return Integer.parseInt(obj.toString());
    } catch (Exception e) {
    }
    return 0;
  }

  public static float toFloat(Object obj)
  {
    try
    {
      return Float.parseFloat(obj.toString());
    } catch (Exception e) {
    }
    return 0.0F;
  }
  
  public static String toString(Object obj)
  {
    return checkEmpty(obj) ? "" : obj.toString();
  }
  
  public static boolean checkEmpty(Object obj)
  {
    return (checkNull(obj)) || (obj.toString().isEmpty());
  }
  
  public static boolean checkNull(Object obj)
  {
    return obj == null;
  }
}