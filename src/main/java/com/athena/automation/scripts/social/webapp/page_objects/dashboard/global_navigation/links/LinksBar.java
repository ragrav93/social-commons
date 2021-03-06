package com.athena.automation.scripts.social.webapp.page_objects.dashboard.global_navigation.links;

import com.athena.automation.framework.Driver;
import com.athena.automation.scripts.social.webapp.page_objects.dashboard.global_navigation.links.profile.ProfilePopup;

import ru.yandex.qatools.allure.annotations.Step;

public class LinksBar {
	public LinksBar_Objects webElements;
	private Driver driver;

	public LinksBar(Driver driver) {
		this.driver = driver;
		this.webElements = new LinksBar_Objects(driver);
	}
	
	@Step
	public ProfilePopup openProfilePopup() throws Exception {
		webElements.profile_dropdown().click();
		return new ProfilePopup(driver);
	}
}