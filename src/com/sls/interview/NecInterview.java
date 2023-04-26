import java.util.HashMap;
import java.util.Map;

public class NecInterview {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		Java Program to Count the Occurrences of Each Character
		   input : "Pneumonoultramicroscopicsilicovolcanoconiosis"*/
		
		
		String str="Pneumonoultramicroscopicsilicovolcanoconiosis";
		Map<String, Integer> count=new HashMap<>();
		char[] cs=str.toCharArray();
		
		for(char c:cs){
			
			count.put(String.valueOf(c),count.get(String.valueOf(c))==null?1:count.get(String.valueOf(c))+1);
		}
		
		System.out.println(count);
		
		/*
		Find leaders in an array.
		We need to print all the leaders present in the array. Element is the leader if it is greater than right side of elements.
		arr[]={14, 12, 70, 15, 99, 65, 21, 90}
		Here 99 and 90 are leader elements*/
		
		int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
		int leader = 0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				if(arr[i]>=leader){
				leader=arr[i];
				}
			}
		}
		System.out.println(leader);

		
		
		

		
	}

}
