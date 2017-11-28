package com.heepay.zookeeper.configuration;

import java.util.concurrent.TimeUnit;

import org.apache.curator.test.TestingServer;
import org.junit.Test;

import com.heepay.zookeeper.configuration.BasicServerMetaManager;
import com.heepay.zookeeper.configuration.IServerMetaManager;

public class BasicServerMetaManagerTest {

    //@Test
    public void testRegister() throws Exception {
        TestingServer zkServer = new TestingServer(2181);
 
        IServerMetaManager serverMetaManager = BasicServerMetaManager.getInstance();
        serverMetaManager.init("192.168.162.50:2181,192.168.162.51:2181,192.168.162.52:2181");
        System.out.println(serverMetaManager.getServerByRandom("payment_rpc"));
        serverMetaManager.register("payment-web", "192.168.4.101", 8000);
        serverMetaManager.register("payment-web", "192.168.4.102", 8000);
        System.out.println(serverMetaManager.getServerByHash("payment-web", "0"));

        TimeUnit.SECONDS.sleep(3);

        System.out.println(serverMetaManager.getServerByHash("payment-web", "0"));

 
        TimeUnit.SECONDS.sleep(3);

        System.out.println(serverMetaManager.getServerByHash("payment-web", "0"));
        TimeUnit.SECONDS.sleep(3);

        System.out.println(serverMetaManager.getServerByRandom("payment-web"));
        TimeUnit.SECONDS.sleep(3);

        System.out.println(serverMetaManager.getServerByHash("payment-web", "0"));
 

        zkServer.stop();
    }
    @Test
    public void testServerByRandom() throws Exception {
        IServerMetaManager serverMetaManager = BasicServerMetaManager.getInstance();
        serverMetaManager.init("192.168.162.50:2181");
   /*     while(true){
            System.out.println(serverMetaManager.getServerByRandom("payment_rpc"));
            TimeUnit.SECONDS.sleep(3);
        }*/

        
    }
}