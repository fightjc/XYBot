package org.fightjc.xybot.startup;

import net.mamoe.mirai.event.ListenerHost;
import org.fightjc.xybot.bot.XYBot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.xml.bind.Unmarshaller;
import java.util.List;

@Component
public class XYBotLoader implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(XYBotLoader.class);

    @Value("${bot.account}")
    Long account;

    @Value("${bot.password}")
    String password;

    @Value("${device.fileName}")
    String deviceInfo;

    @Value("${logging.net.path}")
    String logNetPath;

    @Autowired
    @Qualifier("botEvents")
    List<ListenerHost> events;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        startupBot();
    }

    private void startupBot() {
        XYBot.startBot(account, password, deviceInfo, events, logNetPath);

        // 启动新线程跑bot不占用主线程
        new Thread(() -> XYBot.getBot().join()).start();

        logger.info("启动XYBot成功！");
    }
}
