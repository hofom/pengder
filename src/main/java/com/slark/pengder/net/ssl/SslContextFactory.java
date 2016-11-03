package com.slark.pengder.net.ssl;

import com.slark.SlarkContext;
import com.slark.util.system.ResourcePath;
import org.apache.log4j.Logger;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.io.FileInputStream;
import java.security.KeyStore;
/**
 * Created by fengwei on 16/7/6.
 */
public class SslContextFactory {
    private static final Logger     logger              = Logger.getLogger(SslContextFactory.class);
    private static final String		PROTOCOL	        = "SSLv3";	// TODO: which protocols will be adopted?
    private static final String     propsKeyServer      = "pengder.commServer.keyServer";
    private static final String     propsTrustServer    = "pengder.commServer.trustServer";
    private static final String     propsKeyClient      = "pengder.commServer.keyClient";
    private static final String     propsTrustClient    = "pengder.commServer.trustClient";
    private static final String     keyStorPassword     = "123456";

    private static  SSLContext  SERVER_CONTEXT = null;


    private static  SSLContext	CLIENT_CONTEXT = null;
/*
String key1 = PropertyManager.getProtery("KeyServer", "./kserver.keystore");
		String key2 = PropertyManager.getProtery("KeyClient", "./tserver.keystore");

		char keyStorePass[] = "123456".toCharArray();
		char keyPassword[] = "123456".toCharArray();

		KeyStore ks = KeyStore.getInstance("JKS");
		KeyStore tks = KeyStore.getInstance("JKS");

		ks.load(new FileInputStream(key1), keyStorePass);
		tks.load(new FileInputStream(key2), keyStorePass);

		KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
		TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");

		kmf.init(ks, keyPassword);
		tmf.init(tks);

		SSLContext sslContext = SSLContext.getInstance("SSLv3");
		sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
 */

    protected static SSLContext newSSLServerContext(String keypwd) {
        SSLContext serverContext = null;
        try {
            String keyServer = ResourcePath.getSlarkConfigureFile(SlarkContext.getProperty(propsKeyServer, "config/kserver.keystore"));
            String keyClient = ResourcePath.getSlarkConfigureFile(SlarkContext.getProperty(propsTrustServer, "config/tserver.keystore"));
            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(new FileInputStream(keyServer),
                    keypwd.toCharArray());
            // truststore
            KeyStore ts = KeyStore.getInstance("JKS");
            ts.load(new FileInputStream(keyClient),
                    keypwd.toCharArray());

            // Set up key manager factory to use our key store
            KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
            // set up trust manager factory to use our trust store
            TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
            kmf.init(ks, keypwd.toCharArray());
            tmf.init(ts);

            // Initialize the SSLContext to work with our key managers.
            serverContext = SSLContext.getInstance(PROTOCOL);
            serverContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);

        } catch (Exception e) {
            logger.error("初始化SSL安全环境失败,错误信息: " + e.getMessage());
            return null;
        }

        logger.info("初始化SSL上下文成功");
        return serverContext;
    }

    protected static SSLContext  newSSLClientContext(String keypwd){
        SSLContext  clientContext = null;
        try
        {
            String keyServer = ResourcePath.getSlarkConfigureFile(SlarkContext.getProperty(propsKeyClient,"config/kclient.keystore"));
            String keyClient = ResourcePath.getSlarkConfigureFile(SlarkContext.getProperty(propsTrustClient,"config/tclient.keystore"));
            // keystore
            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(new FileInputStream(keyServer),
                    keypwd.toCharArray());
            // truststore
            KeyStore ts = KeyStore.getInstance("JKS");
            ts.load(new FileInputStream(keyClient),
                    keypwd.toCharArray());

            // Set up key manager factory to use our key store
            KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
            kmf.init(ks, keypwd.toCharArray());
            // set up trust manager factory to use our trust store
            TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
            tmf.init(ts);

            clientContext = SSLContext.getInstance(PROTOCOL);
            clientContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);

        } catch (Exception e) {
            logger.error("初始化SSL安全环境失败,错误信息: " + e.getMessage());
        }

        return clientContext;
    }

    /**
     * 设备密码得到Context
     * @return
     */
    public static SSLContext getServerContext(String keypwd) {
        synchronized (SslContextFactory.class){
            if(SERVER_CONTEXT ==  null){
                if(keypwd == null){
                    keypwd = keyStorPassword;
                }
                SERVER_CONTEXT = SslContextFactory.newSSLServerContext(keypwd);
            }
        }
        return SERVER_CONTEXT;
    }

    public static SSLContext getClientContext(String keypwd) {
        synchronized (SslContextFactory.class){
            if(CLIENT_CONTEXT == null){
                if(keypwd == null){
                    keypwd = keyStorPassword;
                }
                CLIENT_CONTEXT = SslContextFactory.newSSLClientContext(keyStorPassword);
            }
        }
        return CLIENT_CONTEXT;
    }


    private SslContextFactory(){

    }
}
