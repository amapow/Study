#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

//별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력
void PrintSquare() {
	int a, b;
	printf("Insert square's vertical and horizon size : ");
	scanf("%d %d", &a, &b);
	for (int i = 0; i < b; i++) {
		for (int j = 0; j < a; j++) {
			printf("*");
		}
		printf("\n");
	}
}

/*
소수 만들기
문제 설명
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
*/

// nums_len은 배열 nums의 길이입니다.
int MakePrime(int nums[], size_t nums_len) {
	int answer = 0;
	int count = 0;
	int check;
	for (int i = 0; i < nums_len; i++) {
		for (int j = i + 1; j < nums_len; j++) {
			for (int k = j + 1; k < nums_len; k++) {
				check = nums[i] + nums[j] + nums[k];
				for (int l = 1; l <= check; l++) {
					if (check % l == 0)	count++;
				}
				if (count == 2) answer++;
				count = 0;
			}
		}
	}
	return answer;
}

/*
N개의 최소공배수
문제 설명
두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
*/

int returnCheck(int arr, int n) {
	int check = n % arr;
	return check;
}

// arr_len은 배열 arr의 길이입니다.
int MultifleN(int arr[], size_t arr_len) {
	int answer = 0;
	int check = 1;
	int i, j;
	while (1) {
		j = 0;
		for (i = 0; i < arr_len; i++) {
			j = j + returnCheck(arr[i], check);
		}
		if (j == 0) {
			answer = check;
			break;
		}
		check++;
	}
	return answer;
}

/*
하샤드 수
문제 설명
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
*/
bool hashad(int x) {
	bool answer = true;
	int num;
	if (x < 100) {
		num = (x % 10) + (x / 10);
	}
	else if (x < 1000) {
		num = (x % 10) + ((x / 10) % 10) + (x / 100);
	}
	else if (x < 10000) {
		num = (x % 10) + ((x / 10) % 10) + ((x / 100) % 10) + (x / 1000);
	}
	else answer = true;
	if (x % num == 0) answer = true;
	else answer = false;
	return answer;
}

/*
문제 설명
피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.

예를들어

F(2) = F(0) + F(1) = 0 + 1 = 1
F(3) = F(1) + F(2) = 1 + 1 = 2
F(4) = F(2) + F(3) = 1 + 2 = 3
F(5) = F(3) + F(4) = 2 + 3 = 5
와 같이 이어집니다.

2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
*/
#define ARRAY_MAX 100000

int pibonacci(int n) {
	int answer = 0;
	int pibo[ARRAY_MAX];
	pibo[0] = 0;
	pibo[1] = 1;
	int i;
	if (n >= 2) {
		for (i = 2; i <= n; i++) {
			pibo[i] = pibo[i - 2] + pibo[i - 1];
			pibo[i] = pibo[i] % 1234567;
		}
	}
	answer = pibo[n];
	return answer;
}

/*
평균 구하기
문제 설명
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
*/
double average(int arr[], size_t arr_len) {
    double answer = 0;
    for(int i = 0 ; i < arr_len ; i++) {
        answer += arr[i];
    }
    answer /= arr_len;
    return answer;
}

/*
콜라츠 추측
문제 설명
1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.

1-1. 입력된 수가 짝수라면 2로 나눕니다. 
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요. 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
*/
int colach(long num) {
    int answer = 0;
    while(num != 1) {
        if (num % 2 != 0) {
            num = (long)num * 3 + 1;
            answer++;
        }
        else {
            num = (long)num / 2;
            answer++;
        }
        if (answer == 500) {
            answer = -1;
            break;
        }
    }
    return answer;
}

/*
짝수와 홀수
문제 설명
정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
*/
char* EvenOdd(int num) {
	// 리턴할 값은 메모리를 동적 할당해주세요
	char* answer = (char*)malloc;
	if (num % 2 == 0) answer = "Even";
	else answer = "Odd";
	return answer;
}

/*
약수의 합
문제 설명
자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

제한 사항
n은 0 이상 3000이하인 자연수입니다.
*/
int sumofyaksu(int n) {
    int answer = 0;
    for(int i = 1 ; i <= n ; i++) {
        if(n % i == 0) {
            answer = answer+i;
        }
    }
    return answer;
}

/*
두 정수 사이의 합
문제 설명
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
*/
long long sumoftwo(int a, int b) {
	long long answer = 0;
	if (a < b) {
		for (int i = a; i <= b; i++) {
			answer = answer + i;
		}
	}
	else if (a > b) {
		for (int i = b; i <= a; i++) {
			answer = answer + i;
		}
	}
	else
		answer = a;
	return answer;
}


