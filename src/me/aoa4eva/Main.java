package me.aoa4eva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String browserName;
        String tabTitle;
        String tabUrl;
        String anotherTab="y";
	    Scanner keyboard = new Scanner(System.in);
        Browser aBrowser = new Browser();

        System.out.println("Enter a browser name");
        browserName = keyboard.nextLine();
        aBrowser.setName(browserName);

        if(!browserName.equalsIgnoreCase("Internet Explorer"))
        {

            do{
                System.out.println("Enter the tab title");
                tabTitle=keyboard.nextLine();
                System.out.println("Enter the tab title");
                tabUrl=keyboard.nextLine();
                aBrowser.addTab(new Tab(tabTitle,tabUrl));
               do{
                System.out.println("Do yo you want to enter another tab?");
                anotherTab=keyboard.nextLine();
                    if(!anotherTab.equalsIgnoreCase("y")&&!anotherTab.equalsIgnoreCase("n"))
                        System.out.println("Invalid option");

                }while(!anotherTab.equalsIgnoreCase("y")&&!anotherTab.equalsIgnoreCase("n"));

            }while(anotherTab.equalsIgnoreCase("y")&&!anotherTab.equalsIgnoreCase("n"));

            System.out.println("Browser: "+aBrowser.getName());
            System.out.println("Open Tabs:");
            System.out.println("===============================");

            for(Tab eachTab:aBrowser.getTabs())
            {
                System.out.println(eachTab.getTitle()+" URL:"+eachTab.getUrl());
            }

        }
        else
        {
            System.out.println("Use another browser!");
        }




    }
}
