package JUNIT.INTERMEDIATE;

public class Question2 {

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Question2(String str) {
		super();
		this.str = str;
	}

	public char getCharAt(Integer index) {
		if (index > getLength() - 1) {
			return '~';
		} else {
			return str.toCharArray()[index];
		}
	}

	public int getLength() {
		for (int i = 0; true; i++) {
			try {
				str.charAt(i);
			} catch (StringIndexOutOfBoundsException e) {
				return i;
			}
		}
	}

	public Boolean getEndsWith(String s) {
		for (Integer i = s.length() - 1, j = str.length() - 1; i >= 0; i--, j--) {
			if (s.charAt(i) != str.charAt(j)) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

	public Boolean getStartsWith(String s) {
		for (Integer i = 0, j = 0; i > s.length(); i++, j++) {
			if (s.charAt(i) != str.charAt(j)) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

	public Boolean checkEqualsIgnoreCase(String s) {
		Integer sch = null;
		Integer strch = null;
		if (s.length() == str.length()) {
			for (int i = 0; i < s.length() - 1; i++) {
				System.out.println(s.charAt(i));
				sch = (int) s.charAt(i);
				strch = (int) str.charAt(i);
				if (sch > strch) {
					if (strch + 32 != sch && sch < 123 && sch > 96) {
						return Boolean.FALSE;
					}
				} else if (strch > sch) {
					if ((sch + 32) != strch && strch < 123 && strch > 96) {
						return Boolean.FALSE;
					}
				}
			}
			return Boolean.TRUE;

		}
		return Boolean.FALSE;
	}

	public int getIndexOf(Character ch) {
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				return i;
			}
		}
		return -1;
	}

	public int getLastIndexOf(Character ch) {
		for (int i = str.length() - 1; i >= 0; i--) {
			if (ch == str.charAt(i)) {
				return i;
			}
		}
		return -1;
	}

	public Boolean checkEquals(String s) {
		if (s.length() == str.length()) {
			for (int i = 0; i < str.length(); i++) {
				if (s.charAt(i) != str.charAt(i)) {
					return Boolean.FALSE;
				}
			}
			return Boolean.TRUE;
		}

		return Boolean.FALSE;
	}

	public Boolean checkContains(String substr) {
		int n1 = str.length();
		int n2 = substr.length();
		for (int i = 0; i <= n1 - n2; i++) {
			int j;
			for (j = 0; j < n2; j++) {
				if (str.charAt(i + j) != substr.charAt(j))
					break;
			}
			if (j == n2) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

	public String changeToUpperCase() {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			Integer chi = (int) str.charAt(i);
			if (chi > 96 && chi < 123) {
				sb.append((char) (chi - 32));
			} else {
				sb.append(str.charAt(i));
			}
		}
		return new String(sb);
	}

	public String changeToLowerCase() {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			Integer chi = (int) str.charAt(i);
			if (chi > 64 && chi < 91) {
				sb.append((char) (chi + 32));
			} else {
				sb.append(str.charAt(i));
			}
		}

		return new String(sb);
	}

	public String doTrim() {
		StringBuilder sb = new StringBuilder("");
		Boolean flag = Boolean.TRUE;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && flag) {
				continue;
			} else {
				flag = Boolean.FALSE;
				sb.append(str.charAt(i));
			}
		}
		flag = Boolean.TRUE;
		String finalStr = new String(sb);
		StringBuilder finalTrimmed = new StringBuilder("");

		for (int i = finalStr.length() - 1; i >= 0; i--) {
			if (finalStr.charAt(i) == ' ' && flag) {
				continue;
			} else {
				flag = Boolean.FALSE;
				finalTrimmed.append(finalStr.charAt(i));
			}
		}
		return new String(finalTrimmed.reverse());
	}

	public String doConcat(String s) {
		StringBuilder sb = new StringBuilder(str);
		sb.append(s);
		return new String(sb);
	}
}
