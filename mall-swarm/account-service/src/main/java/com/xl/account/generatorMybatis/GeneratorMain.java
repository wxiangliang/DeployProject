/*
package com.xl.account.generatorMybatis;

import java.util.Collections;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

public class GeneratorMain {
    public static void main(String[] args) {
        FastAutoGenerator.create(
            "jdbc:mysql://127.0.0.1:3306/mall_user?allowMultiQueries=true&tinyInt1isBit=false&zeroDateTimeBehavior=convertToNull&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8",
            "root", "Abc@1234560").globalConfig(builder -> {
                builder.author("martin") // 设置作者
                    .outputDir("D://"); // 指定输出目录
            }).packageConfig(builder -> {
                builder.parent("com.xl.account") // 设置父包名
                    // .moduleName("system") // 设置父包模块名
                    .pathInfo(Collections.singletonMap(OutputFile.xml, "D://")); // 设置mapperXml生成路径
            }).strategyConfig(builder -> {
                builder.addInclude("user"); // 设置需要生成的表名
                // .addTablePrefix("t_", "c_"); // 设置过滤表前缀
            })
            // .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
            .execute();
    }
}
*/
