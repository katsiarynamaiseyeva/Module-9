package runner;

import config.BrowserType;
import config.GlobalConfig;
import listener.Listener;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Runner {

  public static void main(String[] args) {
    String browserType = args[0];
    String xmlSuiteName = "src/main/resources/testng_regression.xml";

    GlobalConfig.setBrowserType(BrowserType.fromString(browserType));

    TestNG testNG = new TestNG(false);
    XmlSuite suite = new XmlSuite();
    suite.setName("TestNG xml suite");

    List<String> files = new ArrayList<>();
    files.add(xmlSuiteName);

    suite.setSuiteFiles(files);

    List<XmlSuite> suites = new ArrayList<>();
    suites.add(suite);

    testNG.setXmlSuites(suites);

    testNG.addListener(new Listener());
    System.out.println(
        "Run with parameters: browser "
            + browserType
            + ", selenium server url "
            + GlobalConfig.getSeleniumServerUrl()
            + " in suite "
            + xmlSuiteName);
    testNG.run();
  }
}
