package config;

import org.kohsuke.args4j.Option;

public class Settings {

  @Option(name = "--browserType", usage = "Set browser type", required = true)
  public String browserType;

  @Option(name = "--seleniumServerUrl", usage = "Set selenium server url", required = true)
  public String seleniumServerUrl;

  @Option(name = "--xmlSuiteName", usage = "Set xml suite name", required = true)
  public String xmlSuiteName;
}
