package readable.code.playground;

import org.apache.commons.lang3.StringUtils;

public final class Strings {

	// TODO1: refactor this method after you read Readable Code 7.5
	public static String capitalizeInitialCharcter(String str) {

		if (StringUtils.isEmpty(str)) {
			return str;
		};

		String initialChar = str.substring(0, 1).toUpperCase();
		String resultStr = (str.length() == 0) ? initialChar : initialChar + str.substring(1);

		return resultStr;
	}

}