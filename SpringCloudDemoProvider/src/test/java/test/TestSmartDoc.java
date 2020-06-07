package test;

import com.power.common.enums.HttpCodeEnum;
import com.power.common.util.DateTimeUtil;
import com.power.doc.builder.ApiDocBuilder;
import com.power.doc.builder.HtmlApiDocBuilder;
import com.power.doc.constants.DocGlobalConstants;
import com.power.doc.constants.DocLanguage;
import com.power.doc.model.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSmartDoc {


    @Test
    public void testBuilderControllersApi() {
        ApiConfig config = new ApiConfig();
        //当把AllInOne设置为true时，Smart-doc将会把所有接口生成到一个Markdown、HHTML或者AsciiDoc中
        config.setAllInOne(true);
        config.setLanguage(DocLanguage.CHINESE);
        //Set the api document output path.
        config.setOutPath("d:/smart-doc/");
        //生成Markdown文件
        ApiDocBuilder.buildApiDoc(config);
    }

    @Test
    public void testBuilderControllersApiHtml() {
        String OUTPUT_PATH = "smart-doc/html/";
        ApiConfig config = new ApiConfig();
        config.setServerUrl("http://127.0.0.1:8080");
        //设置为严格模式，Smart-doc将降至要求每个Controller暴露的接口写上标准文档注释
//        config.setStrict(true);
        //当把AllInOne设置为true时，Smart-doc将会把所有接口生成到一个Markdown、HHTML或者AsciiDoc中
        config.setAllInOne(true);
        config.setLanguage(DocLanguage.CHINESE);
        //HTML5文档，建议直接放到src/main/resources/static/doc下，Smart-doc提供一个配置常量HTML_DOC_OUT_PATH
        config.setOutPath(DocGlobalConstants.HTML_DOC_OUT_PATH);
        config.setOutPath(OUTPUT_PATH);
        // 设置接口包扫描路径过滤，如果不配置则Smart-doc默认扫描所有的接口类
        // 配置多个报名有英文逗号隔开
//        config.setPackageFilters("com.power.doc.controller");
        //设置公共请求头.如果不需要请求头，则无需设置
//        config.setRequestHeaders(
//                ApiReqHeader.header().setName("access_token").setType("string")
//                        .setDesc("Basic auth credentials").setRequired(true).setSince("v1.1.0"),
//                ApiReqHeader.header().setName("user_uuid").setType("string").setDesc("User Uuid key")
//        );

        //设置错误错列表，遍历自己的错误码设置给Smart-doc即可
        List<ApiErrorCode> errorCodeList = new ArrayList<>();
        for (HttpCodeEnum codeEnum : HttpCodeEnum.values()) {
            ApiErrorCode errorCode = new ApiErrorCode();
            errorCode.setValue(codeEnum.getCode()).setDesc(codeEnum.getMessage());
            errorCodeList.add(errorCode);
        }
        //不需要显示错误码,则可以不用设置错误码。
        config.setErrorCodes(errorCodeList);
        //1.7.9 优化了错误码处理，用于下面替代遍历枚举设置错误码
        //不需在文档中展示错误码则可以不设置。
//        config.setErrorCodeDictionaries(
//                ApiErrorCodeDictionary.dict().setEnumClass(HttpCodeEnum.class)
//                        .setCodeField("code") //错误码值字段名
//                        .setDescField("desc")//错误码描述
//        );


        //设置文档变更记录，没有需要可以不设置
//        config.setRevisionLogs(
//                RevisionLog.getLog().setRevisionTime("2018/12/15").setAuthor("chen").setRemarks("test").setStatus("create").setVersion("V1.0"),
//                RevisionLog.getLog().setRevisionTime("2018/12/16").setAuthor("chen2").setRemarks("test2").setStatus("update").setVersion("V2.0")
//        );

        long start = System.currentTimeMillis();
        //since 1.8.1版本开始入口方法有变更
        HtmlApiDocBuilder.buildApiDoc(config);
        long end = System.currentTimeMillis();
        DateTimeUtil.printRunTime(end, start);
    }


}
