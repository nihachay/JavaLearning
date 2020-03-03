package Scripts1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		//comapre each Element but this is less priority
		//TODO Auto-generated method stub
		String val[] = { "java", "python", "ruby", "java" };
		for(int i=0;i<val.length;i++){
			for(int j=i+1;j<val.length;j++) {
				if(val[i].equals(val[j])) {
					System.out.println(val[i]);
			}
			}
		}
			//hasset - it stores unique values
		Set<String> store = new HashSet<String>();
		for(String name:val)
		{
			if(store.add(name)==false)
			{
				System.out.println(name);
			}
		}
		//hashmap : 
		Map<String,Integer> storev = new HashMap<String,Integer>();
		for(String store1:val) {
			Integer count = storev.get(store1);
			if(count==null)
				storev.put(store1,1);
			else{
				storev.put(store1,++count);
			}
		//to get the values from hasmap
			Set<Entry<String,Integer>> entryset = storev.entrySet(); 
			for(Entry<String,Integer>entry : entryset ){
				if(entry.getValue()>1)
					{
					System.out.println(entry.getKey());
					}}
			}
			
			
		{
			
		}
		
			}
	}
