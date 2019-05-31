package org.scalawebtest.integration.browser

import org.scalawebtest.core.browser.SeleniumChrome
import org.scalawebtest.integration.ScalaWebTestBaseSpec
import org.scalawebtest.integration.browser.behaviors.BrowserBehaviors

class SeleniumChromeSpec extends ScalaWebTestBaseSpec with SeleniumChrome with BrowserBehaviors {
  path = "/"

  "SeleniumChrome" should behave like aWebBrowserWithElementLookup()
  it should behave like anHtmlGauge
  it should behave like aJsonGauge
}