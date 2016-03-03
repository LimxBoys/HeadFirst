package com.limx.test;

public class MaoPao {
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,8,99,19};
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
			System.out.print("\t");
		}
	}
		
}
