package org.demo.springcloud.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import org.demo.springcloud.auto.entity.BsBankInfo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * TODO 使用xStream 实现xml字符和对象之间的转换
 * <p>
 * <!-- https://mvnrepository.com/artifact/com.thoughtworks.xstream/xstream -->
 * <!-- xml字符串，对象之间互转 -->
 * <dependency>
 * <groupId>com.thoughtworks.xstream</groupId>
 * <artifactId>xstream</artifactId>
 * <version>${xstream.version}</version>
 * </dependency>
 *
 * @author: geekswg@qq.com
 * @since: 2020/8/1 10:31
 */
public class XmlUtils {

    private static final XStream xStreamHelper = new XStream(new StaxDriver());

    // 初始化配置
    static {
        XStream.setupDefaultSecurity(xStreamHelper);
        xStreamHelper.allowTypesByWildcard(new String[]{"org.demo.springcloud.**"});
        xStreamHelper.ignoreUnknownElements();//忽略未知节点
        xStreamHelper.autodetectAnnotations(true);
    }

    public static <T> T xmlToBean(String xmlStr, Class<?> clazz) {
        xStreamHelper.ignoreUnknownElements();//忽略未知节点
        xStreamHelper.autodetectAnnotations(true);
        xStreamHelper.processAnnotations(clazz);
        return (T) xStreamHelper.fromXML(xmlStr);
    }

    public static <T> T xmlToBean(File xmlFile, Class<?> clazz) {
        xStreamHelper.processAnnotations(clazz);
        return (T) xStreamHelper.fromXML(xmlFile);
    }

    public static <T> String beanToXmlStr(T t) {
        return xStreamHelper.toXML(t);
    }

    public static <T> boolean beanToXml(T t, String filePath) {
        boolean flag = true;
        try {
            FileWriter fileWriter = new FileWriter(new File(filePath));
            fileWriter.write(xStreamHelper.toXML(t));
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            flag = false;
            throw new IOException(e);
        } finally {
            System.out.println(filePath + "=>" + flag);
            return flag;
        }

    }

    public static void main(String[] args) {
        BsBankInfo bsBankInfo = new BsBankInfo();
        bsBankInfo.setBankName("中国建设银行");
        bsBankInfo.setBankNo("b10001");

        String xmlStr = beanToXmlStr(bsBankInfo);
        System.out.println("===>" + xmlStr);
        System.out.println(xmlToBean(xmlStr, BsBankInfo.class).toString());
        System.out.println(beanToXml(bsBankInfo, "d:/t.xml"));
    }
}
