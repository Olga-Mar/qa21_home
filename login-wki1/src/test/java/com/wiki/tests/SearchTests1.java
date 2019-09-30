package com.wiki.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests1 extends TestBase {


    @Test(priority = 2)
    public void searchWikiTestJava() {
        TestBase.app.getArticle().typeRequest("java");
        TestBase.app.getArticle().clickGoButton();
        Assert.assertEquals(TestBase.app.getArticle().getArticleTitle().toLowerCase(), "java".toLowerCase());
        //pause
    }

    @Test(priority = 1)
    public void searchWikiTestQA() {
        TestBase.app.getArticle().typeRequest("QA");
        TestBase.app.getArticle().clickGoButton();
        Assert.assertEquals(TestBase.app.getArticle().getArticleTitle().toLowerCase(), "QA".toLowerCase());
        //pause
    }
}
//alt+enter- podgrugaet import, esli est krasnoe
// ctr+spas stavim posle to4ki-avtoprodoljaem
//ctr+d= dubliruet stroku