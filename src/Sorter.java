import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sorter {

	public static void main(String[] args) 
	{

		List<String> list = new ArrayList<String>();
		list.add("development");
		list.add("Development");
		list.add("aa");
		list.add("AA");
		list.add("Aa");
		
		//SortList sorter = new SortList();
		SortList.sort(list);
		
		System.out.println(list);
	}

}
