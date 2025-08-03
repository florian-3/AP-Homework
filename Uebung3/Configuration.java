package Uebung3;

import java.util.ArrayList;
import java.util.List;

public class Configuration {
    public final String appName;
    public final List<String> modules;

    public Configuration(String appName, List<String> modules) {
        this.appName = appName;
        this.modules = modules;
    }



    public final void describe() {
        System.out.println("App: " + appName);
        System.out.println("Module: " + modules);
    }
}
