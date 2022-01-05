# XYBot
a mirai-base bot written in Java

## Development Environment
| tools | version |
| :---: | :---: |
| java | 1.8.0_291 |
| springboot| 2.4.1 |
| mybatis | 2.0.1 |
| mirai-core-jvm | 2.9.0 |
| sqlite-jdbc | 3.32.3.3 |

## Feature
1. Auto check the version of database when first run the application, update it if is not match the latest version
2. Use annotation module to clarify commands and(or) switches
3. We can enable or disable the command of multiple groups in real time
4. Set scheduled tasks by using cron job

## How to run
1. Complete setting file `/src/main/resources/application.properties`
2. Compile the java application
3. Run the jar `java -jar XYBot.jar`
4. Have fun

## Current Command
###### - 开关/列表
群内 bot 管理员使用，在群内发送“开关”可以管理当前群内所有指令运行状态
###### - 每日抽签
群内所有成员使用，在群内发送“抽签”即可收到签内容，一天只能抽签一次，每天4时重置
###### - 每日素材
游戏原神相关，群内所有成员使用，在群内发送“每日素材”即可获取当天原神可刷取角色天赋升级材料和武器升级材料图片
###### - 数据更新
游戏原神相关，bot 管理员私信机器人“数据更新”，即可后台自动更新每日素材命令所需要的图片
###### - 原神查询
游戏原神相关，发送“查询”和需要查询物品的名称，可以对应物品说明，支持模糊搜索
###### - 原神日历
游戏原神相关，发送“原神日历”可获取游戏内公告内容和开始结束时间，并且可以设置是否每日推送
###### - b站订阅
群内bot管理员使用，发送“b站”可以查询并订阅指定b站用户动态，每5分钟推送一次最新动态

## Reference & Thanks
- [mirai](https://github.com/mamoe/mirai) 是一个在全平台下运行，提供 QQ Android 协议支持的高效率机器人库
- [wizardbot](https://gitee.com/davidzhe/wizardbot.git) QQ 群机器人，基于 mirai，使用 springboot + okhttp + jsoup + redis 框架
- [WMagicBotR](https://github.com/WhiteMagic2014/WMagicBotR) qq 机器人，基于 mirai，集成spring + mybatis + sqlite
- [genshin-db](https://github.com/theBowja/genshin-db/) is Genshin Impact JSON data with a robust searching API
- [paimon-moe](https://github.com/MadeBaruna/paimon-moe) is your best Genshin Impact companion! Help you plan what to farm with ascension calculator and database