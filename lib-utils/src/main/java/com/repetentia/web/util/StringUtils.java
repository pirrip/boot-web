package com.repetentia.web.util;

public class StringUtils {
	public static String underscoreToCamel(final String str) {
		StringBuilder result = new StringBuilder();
		boolean nextIsUpper = false;
		if (str != null && str.length() > 0) {
			if (str.length() > 1 && str.charAt(1) == '_') {
				result.append(Character.toUpperCase(str.charAt(0)));
			} else {
				result.append(Character.toLowerCase(str.charAt(0)));
			}
			for (int i = 1; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c == '_') {
					nextIsUpper = true;
				} else {
					if (nextIsUpper) {
						result.append(Character.toUpperCase(c));
						nextIsUpper = false;
					} else {
						result.append(Character.toLowerCase(c));
					}
				}
			}
		}
		return result.toString();
	}

	public static String camelToUnderscore(final String str) {
		if (hasLength(str)) {
			final String regex = "([a-z])([A-Z]+)";
			final String replacement = "$1_$2";
			return str.replaceAll(regex, replacement).toLowerCase();
		}
		return str;
	}

	public static boolean isEmpty(final Object str) {
		return (str == null || "".equals(str));
	}

	public static boolean hasLength(final String str) {
		return (str != null && !str.isEmpty());
	}

	public static String trimWhitespace(final String str) {
		if (!hasLength(str)) {
			return str;
		}

		int beginIndex = 0;
		int endIndex = str.length() - 1;

		while (beginIndex <= endIndex && Character.isWhitespace(str.charAt(beginIndex))) {
			beginIndex++;
		}

		while (endIndex > beginIndex && Character.isWhitespace(str.charAt(endIndex))) {
			endIndex--;
		}

		return str.substring(beginIndex, endIndex + 1);
	}
}
