import java.util.HashMap;

/**
 * Created by richd_000 on 2/12/2017.
 */
public class TrieDictionary extends TrieNode {

	//The top of the Trie is the root: containing a key:value pair for all the children
	private HashMap<Character, Node> rootMap = new HashMap<>();

	//this places the first letter of the word in the root
	void insert(String word) {
		if (!(rootMap.containsKey(word.charAt(0)))) {
			rootMap.put(word.charAt(0), new Node());
		}
		insertRecursive(word.substring(1), rootMap.get(word.charAt(0)));
	}

	private void insertRecursive(String substring, Node node) {
		final Node next;
		//if a node with the first letter of the word exists in the hashmap, get the child of that node
		if (node.child.containsKey(substring.charAt(0))) {
			next = node.child.get(substring.charAt(0));
		} else {
			//if the node doesn't exist, create one using the first letter a key
			next = new Node();
			node.child.put(substring.charAt(0), next);
		}

		//base case -> if only one letter left in the word, set the end of word marker to true
		if (substring.length() == 1) {
			next.isAWord = true;
			return;
		} else {
			insertRecursive(substring.substring(1), next);
		}
	}


}
