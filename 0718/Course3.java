import java.util.Arrays;
public class Course3{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binarySearch(a,99));
        //swap(a[0],a[3]);//错误的
		//swap(a,0,3);		
		//System.out.println(indexOf(a,3));
		//int[] b=copyOf(a,7);
		// for(int i=0;i<b.length;i++){
			// System.out.print(b[i]+" ");
		// }
	}
	//二分查找,前提是数组必须是有序的
	public static int binarySearch(int[] a,int v){
		int left = 0;
		int right = a.length-1;
		int mid = 0;		
		//左闭右闭
		    while(left <= right ){
			     mid = left + (right - left)/2;
			     if(a[mid] == v){
				    return mid;
			     }else if(a[mid] > v){
				    right = mid - 1;
			     }else{
				     left = mid + 1;
			 }
		}		
		//左开右闭
		    // while(left <= right ){
			     // mid = left + (right - left)/2;
			     // if(a[mid] == v){
				    // return mid;
			     // }else if(a[mid] > v){
				    // right = mid - 1;
			     // }else{
				     // left = mid ;
			 // }
		// }
		//左闭右开
		// while(left < right ){
			// mid = left + (right - left)/2;
			// if(a[mid] == v){
				// return mid;
			// }else if(a[mid] > v){
				// right = mid;
			// }else{
				// left = mid + 1;
			// }
		// }
		return -1;
	}
	//fill(int[] a,int val)给定知道值val将数组每个元素置为val
	public static void fill(int[] a,int v){
		for(int i=0;i<a.length;i++){
			a[i]=v;
		}
	}
	//copyOf(int[] a,int newlength)复制数组，如果原数组比新长度长，截断原数组；
	public static int[] copyOf(int[] original,int newlength){
		int[] newarray = new int[newlength];
		int len = original.length <= newlength ? original.length : newlength;
		for(int i = 0;i < len;i++){
			newarray[i] = original[i];
		}
		// if(newlength >= original.length){
			// for(int i = 0;i < original.length;i++){
				// newarray[i] = original[i];
			// }
		// }else{
			// for(int j = 0;j < newlength;j++){
				// newarray[j] = original[j];
			// }
		// }
		return newarray;
	}
	//v第一次出现在a中的位置，没有找到返回-1
	public static int indexOf(int[] a,int v){
		for(int i=0;i<a.length;i++){
			if(a[i] == v){
				return i;
			}
		}
		return -1;
	}
	//交换数组的值
	public static void swap(int[] a,int i,int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}