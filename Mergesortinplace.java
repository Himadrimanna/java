import java.util.Arrays;

public class Mergesortinplace {
	public static void main(String[] args) {
		int[] arr ={8,6,7,5,3,4,1,2};
		mergesortInplace(arr , 0 , arr.length);
		System.out.println(Arrays.toString(arr));
	}

	static void mergesortInplace(int[] arr , int s , int e){
		if(e-s == 1){
			return;
		}
		int mid = (s+e) /2;
		mergesortInplace(arr, s, mid);
		mergesortInplace(arr, mid, e);

	    mergeInplace(arr , s, e, mid);
	}

	private static void mergeInplace(int[] arr, int s, int e , int mid) {
		int[] mix = new int[e-s];

		int i=s;
		int j =mid;
		int k= 0;
		while (i<mid && j<e) {
			if(arr[i]<arr[j]){
				mix[k] = arr[i];
				i++;
			}else{
				mix[k]=arr[j];
				j++;
			}k++;
		}

		while (i<mid) {
			mix[k] = arr[i];
			i++;
			k++;
		}

		while (j< e) {
			mix[k]=arr[j];
			j++;
			k++;
		}
		for(int l = 0;l<mix.length;l++){
			arr[s+l] = mix[l];
		}
	}

}
