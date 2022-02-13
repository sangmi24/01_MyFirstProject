/*
 * com.kh.third.run.Run
 * => main 메소드
 * (callMyName 메소드를 호출)
 */
package com.kh.third.run;

import com.kh.third.MyName;

public class Run {

	public static void main(String[] args) {
		
		//1단계: 대변할 이름을 생성(new)
		MyName myName = new MyName();
		
		//2단계 : import문을 추가
		
		//3단계: 메소드를 호출 
		myName.callMyName();
	}
}
