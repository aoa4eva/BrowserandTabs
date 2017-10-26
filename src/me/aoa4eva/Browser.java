package me.aoa4eva;

import me.aoa4eva.Tab;

import java.util.ArrayList;

public class Browser {
    private String name;
    private ArrayList<Tab> tabs;


    public Browser(){
        tabs = new ArrayList<Tab>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Tab> getTabs() {
        return tabs;
    }

    public void setTabs(ArrayList<Tab> tabs) {
        this.tabs = tabs;
    }

    public void addTab(Tab t)
    {
        tabs.add(t);
    }
}
