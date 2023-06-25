package codilitytask1;

import java.util.HashMap;
import java.util.Map;

public class Main
{

	public static String solution(String S) {
		Map<Character, Integer> map = new HashMap<>(  );
		for(char c : S.toCharArray()) {
			if(map.containsKey( c )) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 2) {
				return entry.getKey().toString();
			}
		}

		return "";
	}

	public static void main( String[] args )
	{
//		System.out.println(solution(new int[]{}));
//		System.out.println(solution(new int[]{-3}));
//		System.out.println(solution(new int[]{-1, 1, -2, -3}));
//		System.out.println(solution(new int[]{-3, -1, 1, -2, 2}));

		System.out.println( solution("codility") );
		System.out.println( solution("xyzzx") );
		System.out.println( solution("abc") );
	}
}
