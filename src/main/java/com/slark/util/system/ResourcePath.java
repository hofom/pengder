package com.slark.util.system;

import java.io.*;
import java.util.Properties;

/**
 * Created by fengwei on 16/7/1.
 */
public class ResourcePath {
    /**
     *
     */
    private final static Properties booterProps = new Properties();

    /**
     * @return 返回一个最后不带路径分隔符的资源路径
     * @Description 得到资源 路劲
     */
    public static String getResourcePath() {
        String rs = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        if (rs.endsWith(File.separator)) {
            rs = rs.substring(0, rs.lastIndexOf(File.separator));
        }
        return rs;
    }

    static {
        String slarkPropFile = "config/props/slark.properties";
        InputStreamReader reader = null;
        try {
            slarkPropFile  = ResourcePath.getSlarkConfigureFile(slarkPropFile);
            if(ResourcePath.checkFileExist(slarkPropFile)) {
                reader = new InputStreamReader(new FileInputStream(slarkPropFile));
                booterProps.load(reader);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @description
     * @param path
     * @return
     */
    public static boolean checkFileExist(String path){
        File file = new File(path);

        if(file.exists()){
            return true;
        }

        return false;
    }

    /**
     * @param key
     * @param defaultValue
     * @return
     * @description 得到启动的参数配置
     */
    public static String getBootProperties(String key, String defaultValue) {
        String retVal = booterProps.getProperty(key);
        if (retVal == null) {
            retVal = defaultValue;
        }
        return retVal;
    }

    /**
     * 得到一个资源文件的路径，并检查该文件是否村子啊
     *
     * @return
     */
    public static String getResourceFile(String fileName) {
        if (fileName == null) return null;
        String rs = ResourcePath.getResourcePath() + File.separator + fileName;
        File f = new File(rs);
        if (f.exists()) {
            return rs;
        }
        return null;
    }

    public static String getWorkHome() {
        return System.getProperty("user.dir");
    }

    public static String getSystemProp(String key) {
        return System.getProperty(key);
    }

    /**
     * @param file
     * @return
     * @description 得到当前的spring的上下文xml文件
     */
    public static String getSlarkContextFile(String file) {
        if (file == null) {
            return slark_context_file;
        } else {
            return file;
        }
    }

    /**
     * 得到slark框架的上下文
     * 配置文件的路径
     *
     * @return
     */
    public static final String slark_context_file = "config/slark-context.xml";

    /**
     * @return
     */
    public static String getSlarkContextFile() {
        String whome = ResourcePath.getSlarkHome();
        whome = whome + File.separator + slark_context_file;
        return whome;
    }

    /**
     * @return
     */
    public static String getSlarkHome() {
        String slark_home = ResourcePath.getWorkHome();
        if (slark_home.endsWith(File.separator)) {
            slark_home = slark_home.substring(0, slark_home.lastIndexOf(File.separator));
        }
        return slark_home;
    }

    /**
     * @param file
     * @return
     */
    public static String getSlarkConfigureFile(String file) {
        String cfgFile = ResourcePath.getSlarkHome();
        cfgFile = cfgFile + File.separator + file;
        return cfgFile;
    }

}
