package problem;

import java.awt.Point;
import java.util.Scanner;

public class q11650 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		Point p[] = new Point[n];

		for(int i = 0; i < n; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			p[i] = new Point(x, y);
		}

		quickSortX(p, 0, p.length - 1);
		insertionSort(p);
		
		for(int i = 0; i < p.length; i++) {
			System.out.println((int)p[i].getX() + " " + (int)p[i].getY());
		}

	}

	// quick sort를 활용한 X좌표 정렬
	public static void quickSortX(Point[] p, int start, int end) {
		// 원소가 한 개인 경우
		if(start >= end) {
			return;
		}

		int pivot = start;
		int left = start + 1;
		int right = end;
		Point tmp;
		
		while(left <= right) {
			while(left <= end && p[left].getX() <= p[pivot].getX()) {
				left++;
			}
			while(right > start && p[right].getX() >= p[pivot].getX()) {
				right--;
			}
			
			if(left > right) {
				tmp = p[right];
				p[right] = p[pivot];
				p[pivot] = tmp;
			}
			else {
				tmp = p[left];
				p[left] = p[right];
				p[right] = tmp;
			}
		}
		
		quickSortX(p, start, right - 1);
		quickSortX(p, right + 1, end);
	}
	
	// insertion sort를 활용한 Y좌표 정렬
	public static void insertionSort(Point[] p) {
		Point key;

		for(int i = 1; i < p.length; i++) {
			key = p[i];
			int j = i - 1;
			while(j >= 0 && key.getX() == p[j].getX() && key.getY() < p[j].getY()) {
				p[j + 1] = p[j];
				j--;
			}
			p[j + 1] = key;
		}
	}
	
}
