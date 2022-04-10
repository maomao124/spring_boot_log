package mao.spring_boot_log;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：spring_boot_log
 * Package(包名): mao.spring_boot_log
 * Class(测试类名): Log1Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/10
 * Time(创建时间)： 19:37
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class Log1Test
{
    @Autowired
    Log1 log;

    @Test
    void print()
    {
        log.print();
    }
}