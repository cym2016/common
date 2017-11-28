package com.heepay.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CommonConfiguration
{
  private Logger log = LoggerFactory.getLogger(getClass());
  private Properties properties;

  public CommonConfiguration()
  {
    this.properties = new Properties();
    InputStream inStream = null;
    try
    {
      if (inStream == null) {
        inStream = new FileInputStream(new File("config/application.properties"));
      }
    }
    catch (IOException e)
    {
      this.log.error("load commonconfig from conf/application.properties error : {}", e.getMessage());
    }
    try {
      if (inStream == null)
        inStream = getClass().getResourceAsStream("/application.properties");
      if (inStream != null) {
        this.properties.load(inStream);
        inStream.close();
      }
    }
    catch (Exception e) {
      this.log.error("load commonconfig from application.properties in class path , error : {}", e.getMessage());
    }
  }

  protected Properties getProperties()
  {
    return this.properties;
  }
}
