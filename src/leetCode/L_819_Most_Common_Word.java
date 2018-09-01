package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L_819_Most_Common_Word {

	public static void main(String[] arg0) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = { "hit" };
		System.out.println(mostCommonWord(paragraph, banned));
	}

	public static String mostCommonWord(String paragraph, String[] banned) {
		HashMap<String, Integer> map = new HashMap<>();
		paragraph = paragraph.toLowerCase();

		List<String> paragraphList = Arrays.asList(paragraph.split("[ !?',;.]+"));

		for (String string : paragraphList) {
			if (map.containsKey(string)) {
				map.put(string, (Integer) map.get(string.toString()) + 1);
			} else {
				map.put(string.toString(), 1);
			}
		}

		String result = "";
		int sentinel = 0;
		for (int i = 0; i < banned.length; i++) {
			if (map.containsKey(banned[i])) {
				map.remove(banned[i]);
			}
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > sentinel) {
				sentinel = entry.getValue();
				result = entry.getKey();
			}
		}

		return result;
	}
	// 正则leetcode不让用
	// public static String mostCommonWord(String paragraph, String[] banned) {
	// HashMap<String, Integer> map = new HashMap<>();
	// paragraph = paragraph.toLowerCase();
	// String pattern = "\\w*";
	// Pattern r = Pattern.compile(pattern);
	// Matcher m = r.matcher(paragraph);
	// // System.out.println(m.matches());
	// while (m.find()) {
	// System.out.print(m.group() + " ");// 此处打印正则后的结果
	// // 获取 字符串
	// if (map.containsKey(m.group()) && !m.group().equals("")) {
	// map.put(m.group(), (Integer) map.get(m.group()) + 1);
	// continue;
	// }
	// map.put(m.group(), 1);
	// }
	// System.out.println();
	// for (int i = 0; i < banned.length; i++) {
	// if (map.containsKey(banned[i])) {
	// map.remove(banned[i]);
	// }
	// }
	//
	// List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
	// Collections.sort(list, (o1, o2) -> (o2.getValue() - o1.getValue()));
	//
	// return list.get(0).getKey();
	// }
}
