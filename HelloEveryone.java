package com.kh.first; // 패키지 선언부: 현재 내 클래스의 위치(패키지)를 알려주는 구문, 삭제하면 안됨 
                      // 단, 만약에 기본 패키지에 클래스를 만들게 된다면 패키지 선언부가 없음.

// 클래스 선언부 
// 클래스의 풀 네임: com.kh.first.HelloEveryone  
// 참고 => 패키지명은 항상 소문자인 이유(대소문자를 구분하기 위해 패키지명은 항상 소문자,클래스명의 앞글자는 항상 대문자)
public class HelloEveryone { // HelloEveryone 클래스 영역이 시작
	//클래스에 작성할 내용물들 
	//단, 소스코드를 그냥 작성은 불가하고, 메소드라는 영역에 작성을 해줘야 한다.
	
	/*
	 * *Method: 사전적으로 "기능"을 의미함!
	 *          즉, 하나의 역할, 기능 단위...
	 *          
	 *- 메소드는 main 메소드와 이름이 main이 아닌 일반 메소드로 나뉜다.
	 *  main 메소드의 경우는 프로그램이 실행되면 스스로 실행되는 메소드
	 *  일반 메소드의 경우는 스스로 실행되지 못하는 메소드  
	 *  => 다른 메소드에서 호출을 해주면 됨
	 *  => 메소드를 실행하는 것을 "호출" (call) 한다라고 부른다.          
	 */
	//main 메소드: 일종의 고유명사, 프로그램의 시작점을 담당하는 메소드
	//           프로그램 당 최소 1개씩은 갖고있어야 함 
	public static void main(String[]args) { //main 메소드 영역 시작
		
		//소스코드를 작성
		
		//출력문 :해당 내용물을 출력하는 역할
		System.out.println("Hello Everyone!!");  
		
		//System.out.println(내용물); : 해당 내용물을 출력 후 "한 줄 띄어주는"역할 (=Enter 키를 쳤다=줄바꿈=개행)
		System.out.println("안녕하세요"); // ln: line의 약자 
		
		//System.out.print(내용물);  : 해당 내용물을 출력 해주는 역할
		System.out.print("여\n러\n분~!\n"); // \n : 개행문자.(Enter키를 한번 쳐준 효과.)
		
		System.out.print("반가워요^^");
		
		// System.out.printf(내용물); 
		           
		
	} //main 메소드 영역 끝
} //HelloEveryone 클래스 영역 끝
