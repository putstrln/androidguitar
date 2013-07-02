package edu.umd.cs.guitar.event;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.remote.*;
import org.openqa.selenium.WebElement;

import edu.umd.cs.guitar.model.GComponent;
import edu.umd.cs.guitar.model.GUITARConstants;
import edu.umd.cs.guitar.model.WebComponent;
import edu.umd.cs.guitar.model.WebConstants;

public class WebTextBox implements GEvent {

	@Override
	public boolean isSupportedBy(GComponent gComponent) {
		if (gComponent instanceof WebComponent) {
			WebComponent webComponent = (WebComponent) gComponent;
			if (webComponent.getElement() instanceof RemoteWebElement) {
				RemoteWebElement renderedWebElement = (RemoteWebElement) webComponent
						.getElement();
				if (renderedWebElement.isDisplayed()) {
					if ("input".equals(webComponent.getElement().getTagName()
							.toLowerCase())) {
						String type = webComponent.getElement()
								.getAttribute("type").toLowerCase();
						if ("text".equals(type) || "password".equals(type)) {
							return true;
						}
					}
					if ("textarea".equals(webComponent.getElement()
							.getTagName().toLowerCase())) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public void perform(GComponent gComponent, List<String> parameters,
			Hashtable<String, List<String>> optionalData) {
		if (gComponent instanceof WebComponent) {
			WebElement el = ((WebComponent) gComponent).getElement();

			// if(!(el instanceof RemoteWebElement)) {
			// return;
			// } else {
			// if(!((RemoteWebElement) el).isDisplayed())
			// return;
			// }
			//
			if (parameters == null || parameters.size() < 1)
				return;
			
			String keysToSend = parameters.get(0);
			// if (optionalData != null &&
			// optionalData.containsKey(GUITARConstants.INPUT_VALUE_PROPERTY_TYPE))
			// {
			// keysToSend =
			// optionalData.get(GUITARConstants.INPUT_VALUE_PROPERTY_TYPE).get(0);
			// }
			el.sendKeys(keysToSend);
		}
		// perform(gComponent, optionalData);
	}

	@Override
	public void perform(GComponent gComponent,
			Hashtable<String, List<String>> optionalData) {
		List<String> parameters = new ArrayList<String>();
		parameters.add(WebConstants.KEYS_TO_SEND);
		perform(gComponent, parameters, optionalData);
		// if(gComponent instanceof WebComponent) {
		// WebElement el = ((WebComponent) gComponent).getElement();
		//
		// if(!(el instanceof RemoteWebElement)) {
		// return;
		// } else {
		// if(!((RemoteWebElement) el).isDisplayed())
		// return;
		// }
		//
		// String keysToSend = WebConstants.KEYS_TO_SEND;
		// // if (optionalData != null &&
		// optionalData.containsKey(GUITARConstants.INPUT_VALUE_PROPERTY_TYPE))
		// {
		// // keysToSend =
		// optionalData.get(GUITARConstants.INPUT_VALUE_PROPERTY_TYPE).get(0);
		// // }
		// el.sendKeys(keysToSend);
		// }
	}

}
