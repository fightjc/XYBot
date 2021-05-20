package org.fightjc.xybot.events;

import net.mamoe.mirai.event.ListenerHost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class EventsConfig {

    @Autowired
    GroupEvents groupEvents;

    @Bean(name = "botEvents")
    public List<ListenerHost> getBotEvents() {
        List<ListenerHost> events = new ArrayList<>();
        // 指令事件需要等待自定义注解扫描，所以启动bot前需要手动实例化，其余事件自动加入
        events.add(groupEvents);

        return events;
    }
}
