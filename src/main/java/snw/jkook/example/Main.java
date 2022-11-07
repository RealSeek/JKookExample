package snw.jkook.example;

import snw.jkook.plugin.BasePlugin;

public class Main extends BasePlugin {
    @Override
    public void onLoad() {
        // 重写 onLoad 并不是必须的，但是您可以在此阶段做一些初始化工作，比如解压默认的配置文件 (saveDefaultConfig)
        // 三个方法内的日志记录也不是必须的，但是善用日志记录有助于描述 Bot 的运行状态！
        getLogger().info("PingBot loaded successfully"); // getLogger() 返回的是一个 org.slf4j.Logger 的实例对象，为日志记录器
    }

    @Override
    public void onEnable() {
        getLogger().info("PingBot enabled successfully");
    }

    @Override
    public void onDisable() {
        getLogger().info("PingBot stopped");
    }
}