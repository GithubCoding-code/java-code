package com.project.javacodeunderstanding;

public class AllBasicCode {
	
	
		public static int factorial(int num)
		{
			int fact = 1;
			for(int i=1;i<=num;i++) fact = fact * i;
			return fact;
		}
		
		public static int reverse(int num)
		{
			int rev = 0;
			for(;num>0;num/=10) rev = rev * 10 + num % 10;
			return rev;
			
		}
		
		public static int power(int base,int exp)
		{
			int res = 1;
			for(int i=1;i<=exp;i++) res = res * base;
			return res;
		}
		
		public static int length(int num)
		{
			int len = 0;
			for(;num>0;num/=10) len++;
			return len;
		}
		
		public static int summation(int num)
		{
			int sum = 0;
			for(;num>0;num/=10) sum += num % 10;
			return sum;
		}
		
		public static int armStrong(int num)
		{
			int len = length(num);
			int res = 0;
			for(;num>0;num/=10) res += power(num%10,len);
			return res;
		}
		
		public static int strong(int num)
		{
			int res = 0;
			for(;num>0;num/=10) res += factorial(num%10);
			return res;
		}

	}


