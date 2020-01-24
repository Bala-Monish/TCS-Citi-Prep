import java.io.*;
import java.util.*;

public class Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] toys = new String[]{"elmo", "elsa", "legos", "drone", "tablet", "warcraft"};
		String[] quotes = new String[] {
		          "Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
		          "The new Elmo dolls are super high quality",
		          "Expect the Elsa dolls to be very popular this year, Elsa!",
		          "Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
		          "For parents of older kids, look into buying them a drone",
		          "Warcraft is slowly rising in popularity ahead of the holiday season"
		        };
		
		String[] topToys = topKToys(2, toys, quotes);
		
		System.out.print("done");
	}
	public static String[] topKToys(int K, String[] toys, String[] quotes) {
		HashMap<String, Integer> frequencies = new HashMap<String, Integer>();
		for(String toy : toys) {
			frequencies.put(toy.toLowerCase(), 0);
		}
		Arrays.stream(words).flatMap(word -> frequences.containsKey(word.toLowerCase()))
		for(String quote : quotes) {
			String[] words = quote.split(" ");
			Arrays.stream(words).filter(word -> frequencies.containsKey(word.toLowerCase()))
								.forEach(word -> frequencies.put(word.toLowerCase(), frequencies.get(word.toLowerCase()) + 1));
		}
		PriorityQueue<Map.Entry<String, Integer>> q = new PriorityQueue<Map.Entry<String, Integer>>((Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) -> {
				return e2.getValue() - e1.getValue();
			}
		);
		for(Map.Entry<String, Integer> entry : frequencies.entrySet()) {
			q.add(entry);
		}
		ArrayList<String> topToys = new ArrayList<String>();
		for(int i=1;i<=K;i++) {
			topToys.add(q.remove().getKey());
		}
		return topToys.toArray(new String[topToys.size()]);
	}

}

