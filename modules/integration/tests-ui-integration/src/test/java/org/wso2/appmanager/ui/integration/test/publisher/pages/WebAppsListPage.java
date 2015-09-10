/*
*Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*WSO2 Inc. licenses this file to you under the Apache License,
*Version 2.0 (the "License"); you may not use this file except
*in compliance with the License.
*You may obtain a copy of the License at
*
*http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing,
*software distributed under the License is distributed on an
*"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*KIND, either express or implied.  See the License for the
*specific language governing permissions and limitations
*under the License.
*/

package org.wso2.appmanager.ui.integration.test.publisher.pages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class WebAppsListPage {

    private static final Log log = LogFactory.getLog(WebAppsListPage.class);
    private WebDriver driver;
    private boolean isCloudEnvironment = false;


    public WebAppsListPage(WebDriver driver) throws IOException {
        this.driver = driver;

        //check that we are on the correct page
        if (!(driver.getCurrentUrl().contains("/assets/webapp"))) {
            throw new IllegalStateException("This is not the web app list page");
        }
    }

    public WebAppsListPage(WebDriver driver, boolean isCloudEnvironment) throws IOException {
        this.driver = driver;
        this.isCloudEnvironment = isCloudEnvironment;
    }


}