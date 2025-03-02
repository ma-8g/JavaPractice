package code;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
	public static void main(String[] args) {
		// 1行でリストを作成して初期化
		List<String> list = new ArrayList<>(List.of("Apple", "Banana", "Cherry"));

		// リストの各要素を繰り返し処理して出力
		for (String fruit : list) {
			System.out.println(fruit);
		}

		// リストから特定の要素を取得
		String firstFruit = list.get(0);
		System.out.println("First fruit: " + firstFruit);

		// リストから要素を削除
		list.remove("Banana");

		// 削除後のリストを出力
		System.out.println("List after removal: " + list);

		// 条件に一致する要素を削除するためにremoveIfを使用
		list.removeIf(fruit -> fruit.startsWith("C"));

		// removeIf使用後のリストを出力
		System.out.println("List after removeIf: " + list);
	}
}
