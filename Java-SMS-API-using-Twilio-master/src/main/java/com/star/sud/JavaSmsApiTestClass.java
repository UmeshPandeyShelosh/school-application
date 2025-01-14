package com.star.sud;

import java.util.List;

import com.star.sud.bean.MessageDetails;
import com.star.sud.twilio.SMSSenderUtil;

public class JavaSmsApiTestClass {

	public static void main(String[] args) {

		try {

			testMessage();
			testAllMessageDetails();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void testMessage() throws Exception {
		String phoneNumberTo = "+15005550009";// To Number
		String content = "Welcome";// Message
		SMSSenderUtil.sendMessage(phoneNumberTo, content);
	}

	private static void testAllMessageDetails() throws Exception {
		List<MessageDetails> allMessageDetails = SMSSenderUtil.getAllMessageDetails();
		allMessageDetails.stream().forEach(details -> {
			System.out.println(details.getSid() + " " + details.getStatus());
		});
	}
}