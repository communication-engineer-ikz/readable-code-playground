package readable.code.playground;

public final class Strings {

	// TODO1: refactor this method after you read Readable Code 7.5
	public static String capitalize(String str) {
		String ret = str;
		if (str == null) {
			return str;
		};
		if (str.length() == 0) {
			return str;
		};
		if (str.length() == 1) {
			return str.toUpperCase();
		};

		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

}