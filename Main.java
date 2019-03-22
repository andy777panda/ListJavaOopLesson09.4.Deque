package net.ukr.andy777;

/*
 Lesson09
 4. Шелдон, Леонард, Воловиц, Кутрапалли и Пенни стоят в очереди за «двойной колой». 
 Как только человек выпьет такой колы, он раздваивается и оба становятся в конец очереди, чтобы выпить еще стаканчик. 
 Напишите программу, которая выведет на экран состояние очереди в зависимости от того, сколько стаканов колы выдал аппарат с чудесным напитком. 
 Например, если было выдано только два стакана, то очередь выглядит как: 
 [Volovitc, Kutrapalli, Penny, Sheldon, Sheldon, Leonard, Leonard].
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {

		// створення черги та її наповнення елементами
		Deque<Integer> dq = new ArrayDeque<Integer>();
		for (int i = 1; i < 6; i++) {
			dq.addLast(i);
		}
		System.out.println(dq);

		// задання кількості виданих/наповнених стаканів
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the number of filles glasses (over 0) - ");
		int g = sc.nextInt();

		for (int i = 0; i < g; i++) {
			if (g < 1)
				break;
			int a = dq.removeFirst();
			dq.addLast(a);
			dq.addLast(a);
		}
		System.out.println(dq);
	}
}