import java.util.HashMap;

/**
 * Created by richd_000 on 2/12/2017.
 */
public class TrieNode {

	public class Node {
		public boolean isAWord = false;
		public HashMap<Character, Node> child = new HashMap<Character, Node>();

	}


}
