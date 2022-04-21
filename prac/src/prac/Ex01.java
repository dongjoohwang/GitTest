package prac;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		
		// �迭(Array)
		// 1. ũ�⸦ �̸� �˰� �־�� �Ѵ�. ũ�Ⱑ �����Ǿ� �ִ�.
		// 2. �߰��� �ִ� ���� ������ ����ִ� ä�� �����ȴ�.
		// 3. index ������� ������ �����ϴ�.
		// 4. �⺻�ڷ���(primitive type), Ŭ���� Ÿ�Ե� ���� �� �ִ�.

		// List
		// 1. ũ�Ⱑ �����Ǿ� ���� �ʰ�, �������� �Ҵ�ȴ�.
		// 2. �߰��� �ִ� ���� ������ ������ �������. (�޸� ���� ����)
		// 3. ���� ������� �����͸� �ٷ� �� �ִ�.
		// 4. Ŭ���� Ÿ�Ը� ���� �� �ִ�.(�⺻�ڷ��� ���� �ȵ�)
		// 5. Ÿ�� �������� �����ϴ� generic�� �� �� �ִ�.
				
		// List Interface�� ���� ����ü�� ArrayList ���
		List<Integer> list1 = new ArrayList<Integer>();	// �ڿ��� ���� ����
		list1.add(5);
		list1.add(3);
		boolean isSuccess = list1.add(8);
		System.out.println(isSuccess);
		System.out.println(list1);
		System.out.println("list1 toString(): " + list1.toString());
		
		// List Interface�� ���� ����ü�� LinkedList ���
		List<Integer> list2 = new LinkedList<>();
		list2.addAll(list1);
		
		// ��� �����ϱ�
		// ����� ù��° ���� ���� 5->10���� ����
		System.out.println(list2.set(0, 10)); // ������ ��ġ(index), ������ �� , ���ϵ� ���� ������ ��
		System.out.println(list2);
		
		// ��� �����ϱ�
		Integer delete = list2.remove(2);	// index 1 ��ġ�� ��Ҹ� ����
		System.out.println(delete);
		System.out.println(list2);
		
		List<String> str1 = new ArrayList<>();
		str1.add("abc");
		str1.add("qwer");
		System.out.println(str1);
		System.out.println(str1.remove("abc"));		// true
		System.out.println(str1);
		
		// ��� ��� �����ϱ�
		list2.clear();
		System.out.println(list2);
	}

}













