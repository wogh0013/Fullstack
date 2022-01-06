package 이차원배열;

/*
 * 시작값 + offset
 * 컴파일 타임 : 번역할 때 결정된다. 정적할당
 * 		int a; // 정해진 메모리 공간
 * 	실행시간
 * 배열
 * 
 * 정적할당 : 프로그램 실행 도중 메모리(위치)가 고정
 * 	main()		start:1000		주소
 * 	int a;		a: start		1000
 *  int b;		b: start+4		1004
 *  int c;		c: start+8		1008
 *  
 * 동적할당 : 프로그램 실행 후 시스템한테 메모리 요청
 * 			→ 힙에서 메모리 공간을 줌, 관리시스템(가비지 콜렉터)
 * int[] num = new int[10];
 * num : start + 12
 * 
 * new int[10]; 프로그램이 실행 -> 시스템이 힙에서 메모리 할당
 * 				-> 그 시작번지가 num의 데이터로 저장
 * 
 * 예전에 C언어 같은 경우에는 배열의 메모리가 컴파일 타입에 확정
 * -> 도중에 파기하고 다른 메모리 int a[10]; 확보 불가능
 * 
 * 자바는 배열의 성격 중에 연속된 공간에 메모리 확보
 * 손님이 100명인데 한 테이블에 앉아야 한다.
 * -> 배열은 반드시 연속된 공간이 있어야 사용 가능
 * 			중간에 끼워넣기 안됨
 * 			정해진 크기만 써야 해서 융통성 x
 * 			but 검색 속도가 빠름
 * 
 * LinkedList : 연결리스트 (구슬꿰기)
 * 		미리 확보
 * 	head -> ("A"|next) -> ("B"|next) -> ("C"|next) -> tail
 * 						("D"|next)
 * 	데이터가 insert 되면 그때 필요한 공간(노드)을 확보하고 노드끼리 연결고리만 바꿈.
 * 	자기의 다음 요소에 대한 요소값을 간직한다.
 * 	빈 공간을 잡아서 아무 데나 데이터를 넣을 수 있다.
 *  만들기 어렵고 느리다.
 *  장점은 융통성이 뛰어나서 연속공간이 필요가 없어 메모리를 효율적으로 사용o
 *  
 * 	자바의 배열은 동적할당이 된다.
 * 	int[] nums = new int[10];
 * 
 * 이차원 배열은 참조의 참조가 된다.
 * int[][] nums = new int[5][5];
 */


public class 이차원배열 {
	public static void main(String[] args) {
		int[][] nums = new int[5][4];
		int i, j, k;
		
		k=1;
		for(i=0; i<5; i++)
		{
			for(j=0; j<4; j++)
				nums[i][j] = k;
		}
		
		for(i=0; i<5; i++)
		{
			for(j=0; j<4; j++)
				System.out.print(nums[i][j] + " ");
			System.out.println();
		}
		
		//참조의 참조라서 각 배열의 방마다 새로운 배열을 다른 크기로 할당할 수 있음
		nums[0] = new int[] {1,2,3};
		nums[1] = new int[] {10,20,30,40,50};
		nums[2] = new int[] {2,4};
		nums[3] = new int[] {3,6,9,12};
		nums[4] = new int[] {1,2,3,4,5};
		
		for(i=0; i<nums.length; i++) 
		{
			for(j=0; j<nums[i].length; j++)
				System.out.print(nums[i][j]+ " ");
			System.out.println();
		}
	}
}











