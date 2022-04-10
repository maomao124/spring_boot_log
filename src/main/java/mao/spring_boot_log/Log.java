package mao.spring_boot_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Project name(项目名称)：spring_boot_log
 * Package(包名): mao.spring_boot_log
 * Class(类名): Log
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/10
 * Time(创建时间)： 19:24
 * Version(版本): 1.0
 * Description(描述)： 无
 */


@Component
public class Log
{
    private static final Logger log = LoggerFactory.getLogger(Log.class);

    public void print()
    {
        log.debug("hello");
        log.info("hello");
        log.warn("hello");
        log.error("hello");
        log.trace("hello");
    }
}
