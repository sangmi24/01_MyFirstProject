/*
 * com.kh.third.run.Run
 * => main �޼ҵ�
 * (callMyName �޼ҵ带 ȣ��)
 */
package com.kh.third.run;

import com.kh.third.MyName;

public class Run {

	public static void main(String[] args) {
		
		//1�ܰ�: �뺯�� �̸��� ����(new)
		MyName myName = new MyName();
		
		//2�ܰ� : import���� �߰�
		
		//3�ܰ�: �޼ҵ带 ȣ�� 
		myName.callMyName();
	}
}
