package mao.spring_boot_log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Project name(项目名称)：spring_boot_log
 * Package(包名): mao.spring_boot_log
 * Class(类名): Log1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/10
 * Time(创建时间)： 19:36
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Slf4j
@Component
public class Log1
{
    public void print()
    {
        log.debug("hello1");
        log.info("hello1");
        log.warn("hello1");
        log.error("hello1");
        log.trace("hello1");
    }
}
