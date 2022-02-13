
/*
 * class
 * com.kh.third.MyName
 * => callMyName 메소드 (출력문 이용해서 안녕하세요 xxx입니다.) 
 */

package com.kh.third;

public class MyName {

	public void callMyName() {
		System.out.println("안녕하세요 오상미입니다.");
	}
}


/*
* Workspace > Project > Package > Class > Method
* 폴더 안에 동일한 폴더명이 중복 불가
* => 한 workspace 안에 동일한 이름의 Project 들이 중복될 수 없다.
* => 한 Project 안에 동일한 이름의 package 들이 중복될 수 없다.
* => 한 package 안에 동일한 이름의 Class 들이 중복될 수 없다.
* => 한 Class 안에 동일한 이름의 Method 들이 중복 될 수 있다. (오버로딩이라는 개념에 의해 가능)
* => 한 Method 안에 동일한 이름의 대변할 이름 (일종의 변수 )들이 중복될 수 없다. 
*/



/*
 * 자바의 명명규칙 (개발자들 사이의 약속=코딩컨벤션)
 * 1.영어 사용
 * 2.띄어쓰기 불가
 * 3.의미 부여를 해서 여러 단어를 조합해서 짓는다. 
 * 4.Package 명은 소뭇자로 짓는다.
 * 5.Class 명은 첫글자가 대문자로 시작해야 한다. 
 * 6.Method 명은 첫글자가 소문자로 시작해야 한다. 
 * 7.변수명의 첫글자가  소문자로 시작해야 한다.
 * 8.공통 원칙 : 여러개의 단어를 조합해서 이름을 지을 때에는
 *            띄어쓰기 대신 각 단어별로 첫글자를 대문자로 적어서 가독성을 높여준다.
 *           => 낙타봉 표기법(Camel Case)
 * 예) 클래스명 Methodtest-> MethodTest
 *    메소드명  testprint -> testPrint
 *    
 */

/*
 * Quiz
 * 1.com.kh.first.MethodTest 클래스
 *   com.kh.second.MethodTest 클래스
 * 위의 두개의 클래스는 공존이 가능합니까?
 * 네 => 패키지 위치가 다르기 때문에 
 * 
 * 2.com.kh.member.MemberController 에서
 * 어디까지가 패키지고 어디까지가 클래스인가요?
 * 패키지: com.kh.member 까지
 * 클래스: MemberController
 */





