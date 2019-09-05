#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
 

/*
N 줄인 삼각형을 출력한다. 단, 사용자로 부터 임의의 N 을 입력 받는다. 아래는 N = 3 일 때의 출력 예시 이다.

  *
 ***
*****
위와 동일한 형태를 취하되, 역 삼각형을 출력한다. 아래는 N = 3 일 때의 출력 예시 이다.

*****
 ***
  *
  */
void Triangle() {
	int n;
	printf("inser N : ");
	scanf("%d", &n);
	int temp = n;

	for (int i = 0; i < n; i++) {
		for (int j = i; j < n - 1; j++) {
			printf(" ");

			}
		for (int j = 0; j < 2 * i + 1; j++) {
			printf("*");
		}
		
		printf("\n");
	}

	for (int i = 0; i < n; i++) {
		for (int k = temp; k < n; k++) {
			printf(" ");
		}
		for (int j = temp * 2 - 1 ; j > 0 ; j--) {
			printf("*");
		}

		temp--;
		
		printf("\n");
	}
}


/*
1000 이하의 3 또는 5 의 배수인 자연수들의 합을 구한다.
*/
void SumOfMultfle3and5() {
	int sum=0;
	for (int i = 0 ; i <= 1000; i++) {
		if (i % 3 == 0 || i % 5 == 0) sum += i;
	}
	printf("%d", sum);
}


/*
1000000 이하의 피보나치 수열 ( N 번째 항이 N - 1 번째 항과 N - 2 번째 항으로 표현되는 수열, 시작은 1,1,2,3,5,8,...) 의 짝수 항들의 합을 구한다
*/
void Pibonacci() {
	int a = 1, b = 1, c = a + b, sum = 0;
	while (1) {
		a = b;
		b = c;
		c = a + b;
		printf("%d", c);
		if (c % 2 == 0)sum += c;
		if (c >= 1000000) break;
	}
	printf("%d", sum);

}


/*
문제 5 (난이도 : 下)
사용자로 부터 N 값을 입력 받고 1 부터 N 까지의 곱을 출력한다.
*/
void MultipleToN() {
	int n;
	printf("insert n : ");
	scanf("%d", &n);
	printf("n = %d\n", n);
	for (int i = 1; i <= n; i++) {
		printf("%d * %d = %d\n", i, n, i*n);
	}
}

/*
다음 식을 만족하는 자연수 a,b,c 의 개수를 구하여라

  i) a + b + c = 2000
  ii) a ＞ b > c, a,b,c 는 모두 자연수
 */
void FindAnswer() {
	int a, b, c, count = 0;
	for (a = 1; a < 2000; a++) {
		for (b = 1;b < 2000; b++) {
			for (c = 1; c < 2000; c++) {
				if (a + b + c == 2000 && a>b && b>c) count++;
			}
		}
	}
	printf("%d", count);
}

// 소인수분해
void insu() {
	int num = 0;
	int pnum = 2;
	int findNum = 0;
	int cntCheck = 0;

	printf("자연수 n을 입력해주세요 : ");
	scanf("%d", &num);

	printf("%d = ", num);
	for (;;)
	{
		if (num > 1)
		{
			if (num % pnum == 0)
			{
				num = num / pnum;
				findNum = pnum;
				pnum = 1;

				if (cntCheck == 0)
				{
					printf("%d", findNum);
					cntCheck = 1;
				}
				else
					printf("*%d", findNum);
			}
		}
		else if (num == 1)
			break;
		pnum++;
	}
	printf("\n");
}


void main() {
	//Triangle();
	//SumOfMultfle3and5();
	//Pibonacci();
	//MultipleToN();
	//FindAnswer();
	//insu();
}
